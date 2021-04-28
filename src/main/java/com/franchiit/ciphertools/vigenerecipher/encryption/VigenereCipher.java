package com.franchiit.ciphertools.vigenerecipher.encryption;

import com.franchiit.ciphertools.vigenerecipher.utils.Alphabet;
import com.franchiit.ciphertools.vigenerecipher.utils.Key;
import com.franchiit.ciphertools.vigenerecipher.utils.Message;
import com.franchiit.ciphertools.vigenerecipher.utils.VigenereSquare;

/**
 * 
 * @author wpnx777
 *
 */
public class VigenereCipher
{
  //Instance Variable(s)
  private VigenereSquare vigenereSquare = new VigenereSquare();
  //Constructor(s)

  /**
   * Default Constructor
   */
  public VigenereCipher()
  {
  } //End Method

  /**
   * Parameterized Constructor
   *
   * @param key
   * @param clearText
   * @param cipherText
   */
  public VigenereCipher(Key key, Message clearText, Message cipherText)
  {
    encrypt(key, clearText, cipherText);
  } //End Method
  //Accessor Method(s)

  /**
   * Returns the vigenereSquare object.
   *
   * @return The vigenereSquare instance variable
   */
  public VigenereSquare getVigenereSquare()
  {
    return vigenereSquare;
  } //End Method

  /**
   *
   * @param key The key used to encrypt the clearText.
   * @param clearText The non encrypted text which we will encrypt.
   * @param cipherText 
   */
  public void encrypt(Key key, Message clearText, Message cipherText)
  {
    vigenereSquare.createSquareFromKey(key);
    
    for(int i = -1; i < clearText.length(); )
    {
      for(int j = 0; j < key.length(); j++)
      {
        i++;
        if(i < clearText.length())
        {
          if((int)clearText.charAt(i) < Alphabet.ASCII_UPPER_CASE_LETTER_START ||
             (int)clearText.charAt(i) > Alphabet.ASCII_UPPER_CASE_LETTER_END)
          {
            cipherText.setMessage(cipherText.getMessage() +
                clearText.charAt(i));
          } //End If
          else
          {
            cipherText.setMessage(cipherText.getMessage() +
                                  vigenereSquare.charAt(j, 
                                  (clearText.charAt(i) - Alphabet.ASCII_UPPER_CASE_LETTER_START)));
          } //End Else
        } //End If
      } //End For
    } //End For
  } //End Method
}//End Class
