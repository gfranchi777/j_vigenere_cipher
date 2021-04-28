package com.franchiit.ciphertools.vigenerecipher.test;

import com.franchiit.ciphertools.vigenerecipher.encryption.*;
import com.franchiit.ciphertools.vigenerecipher.utils.*;

public class TestVigenereCipherEncryption
{
  public static void main(String[] args) 
  {
    VigenereCipher vigenereCipher = new VigenereCipher();
    Key key = new Key();
    Message clearText = new Message();
    Message cipherText = new Message();
    
    key.setKey("imperial");
    clearText.setMessage("The rebel base is located on hoth.");
    
    vigenereCipher.encrypt(key,clearText,cipherText);
    
    System.out.println("Vigenere Square:\n");
    vigenereCipher.getVigenereSquare().printVigenereSquare();
    System.out.println("Key        : " + key.getKey());
    System.out.println("Clear Text : " + clearText.getMessage());
    System.out.println("Cipher Text: " + cipherText.getMessage());
  }
}
