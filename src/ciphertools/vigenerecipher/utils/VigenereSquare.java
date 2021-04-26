package ciphertools.vigenerecipher.utils;

public class VigenereSquare
{
  private Alphabet[] vigenereSquare;
  private ShiftDegree shiftDegree = new ShiftDegree();
  
  public VigenereSquare()
  {
  }
  
  public char charAt(int row, int column) 
  {
    return vigenereSquare[row].charAt(column);
  }
  
  public void createFullSquare() 
  {
    vigenereSquare = new Alphabet[Alphabet.NUM_LETTERS_IN_ALPHABET];
    
    for(byte i = 0; i < vigenereSquare.length; i++)
    {
      shiftDegree.setShiftDegree((byte)(1+i));
      vigenereSquare[i] = new Alphabet();
      vigenereSquare[i].generateAlphabetWithShift(shiftDegree);
    }
  }
    
  public void createSquareFromKey(Key key) 
  {
    vigenereSquare = new Alphabet[key.length()];
    
    for(byte i = 0; i < vigenereSquare.length; i++)
    {
      shiftDegree.setShiftDegree((byte)((byte)key.charAt(i) - Alphabet.ASCII_UPPER_CASE_LETTER_START));
      vigenereSquare[i] = new Alphabet();
      vigenereSquare[i].generateAlphabetWithShift(shiftDegree);
    }
  }
  
  public void printVigenereSquare() 
  {    
    for(int i = 0; i < vigenereSquare.length; i++)
    {
      if (i < 9)
      {
        System.out.print("0" + (i + 1) + ": ");
      }
      else
      {
        System.out.print((i + 1) + ": ");
      }

      vigenereSquare[i].printAlphabet();
    }
    System.out.print("\n");
  }
}
