package cs1;

//********************************************************************
//  Keyboard.java       Author: Lewis and Loftus
//
//  Facilitates keyboard input by abstracting details about input
//  parsing, conversions, and exception handling.
//********************************************************************

import java.io.*;
import java.util.*;

public class Keyboard 
{
   //*************  Error Handling Section  **************************

   private static boolean printErrors = true;
   private static int errorCount = 0;

   //-----------------------------------------------------------------
   //  Returns the current error count.
   //-----------------------------------------------------------------
   public static int getErrorCount()
   {
      return errorCount;
   }

   //-----------------------------------------------------------------
   //  Resets the current error count to zero.
   //-----------------------------------------------------------------
   public static void resetErrorCount (int count)
   {
      errorCount = 0;
   }

   //-----------------------------------------------------------------
   //  Returns a boolean indicating whether input errors are
   //  currently printed to standard output.
   //-----------------------------------------------------------------
   public static boolean getPrintErrors()
   {
      return printErrors;
   }

   //-----------------------------------------------------------------
   //  Sets a boolean indicating whether input errors are to be
   //  printed to standard output.
   //-----------------------------------------------------------------
   public static void setPrintErrors (boolean flag)
   {
      printErrors = flag;
   }

   //-----------------------------------------------------------------
   //  Increments the error count and prints the error message if
   //  appropriate.
   //-----------------------------------------------------------------
   private static void error (String str)
   {
      errorCount++;
      if (printErrors) 
         System.out.println (str);
   }

   //*************  Tokenized Input Stream Section  ******************

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
