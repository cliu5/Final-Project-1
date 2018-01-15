package cs1;

import java.io.*;
import java.util.*;

public class Keyboard 
{


   private static String current_token = null;

   
   private static String getNextToken() 
   {
      return getNextToken (true);
   }

   
   private static String getNextToken (boolean skip) 
   {
      String token;

      
         token = current_token;
         current_token = null;
      

      return token;
   }

   
  

  
   

   public static String readString() 
   {
      String str;

      
         str = getNextToken(false);
        
      
      return str;
   }

   public static int readInt() 
   {
      String token = getNextToken();
      int value;
         value = Integer.parseInt (token);
   }


}
