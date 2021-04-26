package ciphertools.vigenerecipher.utils;

/**
 * 
 */
public class Key
{
  //Instance Variable(s)
  private String key;
  
  //Constuctor(s)
  /**
   * 
   */
  public Key()
  {
    
  }//End Method
  
  /**
   *
   * @param key
   */
  public Key(String key) 
  {
    setKey(key);
  }//End Method
  
  /**
   *
   * @return
   */
  public String getKey() 
  {
    return key;
  }//End Method
  
  /**
   *
   * @param key
   */
  public void setKey(String key) 
  {
    if(isValidKey(key))
    {
      this.key = key.toUpperCase();
    }//End If
  }//End Method
  
  /**
   *
   * @return
   */
  public char[] toCharArray() 
  {
    return key.toCharArray();
  }//End Method
  
  /**
   * 
   */
  public void toUpperCase() 
  {
    key.toUpperCase();
  }//End Method
  
  /**
   *
   * @return
   */
  public int length() 
  {
    return key.length();
  }//End Method
  
  /**
   *
   * @param index
   * @return
   */
  public char charAt(int index) 
  {
    return key.charAt(index);
  }//End Method
  
  /**
   *
   * @param key
   * @return
   */
  public boolean isValidKey(String key) 
  {
    boolean isValidKey = true;
    
    //ToDo
    
    return isValidKey;
  }//End Method
}//End Class
