package ciphertools.vigenerecipher.decryption;

import ciphertools.vigenerecipher.utils.*;

public class FrequencyAnalysis {
  private int[] letterFrequency = new int[Alphabet.NUM_LETTERS_IN_ALPHABET];

  public FrequencyAnalysis() {
  }//End Method

  public FrequencyAnalysis(Message text) {
    analyzeText(text);
  }//End Method

  public void analyzeText(Message text) {
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) >= Alphabet.ASCII_UPPER_CASE_LETTER_START &&
          text.charAt(i) <= Alphabet.ASCII_UPPER_CASE_LETTER_END) {
        letterFrequency[(text.charAt(i))
            - Alphabet.ASCII_UPPER_CASE_LETTER_START]++;
      }//End if
    }//End for
  }//End Method

  public void printAnalysis() {
    for (int i = 0; i < Alphabet.NUM_LETTERS_IN_ALPHABET; i++) {
      System.out.print((char) (Alphabet.ASCII_UPPER_CASE_LETTER_START + i)
          + ":" + letterFrequency[i] + " ");
    }//End for
    System.out.println();
  }//End Method
}//End Class