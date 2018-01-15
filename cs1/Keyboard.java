package cs1;
import java.io.*;
import java.util.*;

public class Keyboard 
{


   private static String current_token = null;
   private static StringTokenizer reader;

   private static BufferedReader in = new BufferedReader 
      (new InputStreamReader(System.in));


   //-----------------------------------------------------------------
   //  Gets the next input token assuming it may be on subsequent
   //  input lines.
   //-----------------------------------------------------------------
   private static String getNextToken() 
   {
      return getNextToken (true);
   }

   //-----------------------------------------------------------------
   //  Gets the next input token, which may already have been read.
   //-----------------------------------------------------------------
   private static String getNextToken (boolean skip) 
   {
      String token;

      if (current_token == null)
         token = getNextInputToken (skip);
      else
      {
         token = current_token;
         current_token = null;
      }

      return token;
   }

   //-----------------------------------------------------------------
   //  Gets the next token from the input, which may come from the
   //  current input line or a subsequent one. The parameter
   //  determines if subsequent lines are used.
   //-----------------------------------------------------------------
   private static String getNextInputToken (boolean skip) 
   {
      final String delimiters = " \t\n\r\f";
      String token = null;

      try 
      {
         if (reader == null) 
            reader = new StringTokenizer 
               (in.readLine(), delimiters, true);

         while (token == null || 
                ((delimiters.indexOf (token) >= 0) && skip))
         {
            while (!reader.hasMoreTokens()) 
               reader = new StringTokenizer 
                  (in.readLine(), delimiters,true);
         
            token = reader.nextToken();
         }
      }
      catch (Exception exception) 
      {
         token = null;
      }

      return token;
   }

   //-----------------------------------------------------------------
   //  Returns true if there are no more tokens to read on the
   //  current input line.
   //-----------------------------------------------------------------
   public static boolean endOfLine() 
   {
      return !reader.hasMoreTokens();
   }


   public static String readString() 
   {
      String str;

      try 
      {
         str = getNextToken(false);
         while (! endOfLine())
         {
            str = str + getNextToken(false);
         }
      }
      catch (Exception exception) 
      {
         error ("Nope. You rebel.");
         str = null;
      }
      return str;
   }

   
 
 
   
   public static int readInt() 
   {
      String token = getNextToken();
      int value;
      try 
      {
         value = Integer.parseInt (token);
      } 
      catch (Exception exception) 
      {
         error ("Nope. You rebel.");
         value = Integer.MIN_VALUE;
      }
      return value;
   }

   


}
