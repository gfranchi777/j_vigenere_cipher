package ciphertools.vigenerecipher.test;

import ciphertools.vigenerecipher.utils.*;

public class TestVigenereSquareCreation
{
  public static void main(String[] args) 
  {
    VigenereSquare vigenereSquare = new VigenereSquare();
    Key key = new Key("SHORTKEY");
    
    vigenereSquare.createFullSquare();
    System.out.println("Full Vigenere Square:\n");
    vigenereSquare.printVigenereSquare();
    
    System.out.println("Condenced Vigenere Square Based On Key (" + key.getKey() + "):\n");    
    vigenereSquare.createSquareFromKey(key);
    vigenereSquare.printVigenereSquare();
  }
}
