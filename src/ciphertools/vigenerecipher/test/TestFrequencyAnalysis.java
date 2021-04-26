package ciphertools.vigenerecipher.test;

import ciphertools.vigenerecipher.encryption.*;
import ciphertools.vigenerecipher.utils.*;
import ciphertools.vigenerecipher.decryption.*;

public class TestFrequencyAnalysis {
  public static void main(String[] args) {
    VigenereCipher vigenereCipher = new VigenereCipher();
    Key key = new Key();
    Message clearText = new Message();
    Message cipherText = new Message();

    key.setKey("IMPERIAL");
    clearText.setMessage("TTHE REBEL BASE IS LOCATED ON HOTH.");

    vigenereCipher.encrypt(key, clearText, cipherText);

    System.out.println("Vigenere Square:\n");
    vigenereCipher.getVigenereSquare().printVigenereSquare();;
    System.out.println("Key        : " + key.getKey());
    System.out.println("Clear Text : " + clearText.getMessage());
    System.out.println("Cipher Text: " + cipherText.getMessage());
    System.out.println("");

    FrequencyAnalysis freq = new FrequencyAnalysis();

    freq.analyzeText(clearText);
    System.out.println("Clear Text Frequency Analysis:\n");
    freq.printAnalysis();
    System.out.println();

    freq.analyzeText(cipherText);
    System.out.println("Cipher Text Frequency Analysis:\n");
    freq.printAnalysis();
  }//End Main
}//End Class