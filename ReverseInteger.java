/* Jason Rudinsky
* September 1, 2024
* Leetcode Question - Reverse Integer

* This is a program that will take in the input of an integer and the program will
* reverse the integer and return the number to the user. If the reversed integer is
* above the bounds that a 32-bit integer can handle it will return 0 to the user.

* 9/1/2024 - Original Version
*/


import java.util.ArrayList;                                                                        // Imports the ArrayList Libraries

public class ReverseInteger{                                                                       // Class Block
   public static void main(String[] args){                                                         // Method BLock
      
                                                                                                   // VARIABLE DEFINITION
      int x = 1534236469;                                                                          // Defines x
      
      System.out.printf("Input: %d\t\tOutput: %d\n", x, reverse(x));                               // Prints out to the user
   }
   
   public static int reverse(int theNum){                                                          // Method Block
      
                                                                                                   // VARIABLE DEFINITIONS
      int reversedNum = 0;                                                                         // Defines reversedNum
      int LCV = 0;                                                                                 // Defines LCV
      
      boolean negativeNum = false;                                                                 // Defines negativeNum
      
      ArrayList<Integer> myQueue = new ArrayList<Integer>();                                       // Initializes the arrayList myQueue
      
      if(theNum == 0){                                                                             // Sanity check
         return theNum;                                                                            // If the number passed is 0
      }      
      
      if(theNum < 0){                                                                              // If the number to be reversed is negative
         negativeNum = true;                                                                       // Sets the value of negativeNum
         theNum *= -1;                                                                             // Converts theNum to a positive number
      }
      
      while(theNum != 0){                                                                          // While Loop
         
         //System.out.printf("Looking at the value of x: %d\n", theNum % 10);                      // Debug Statement

         myQueue.add(theNum % 10);                                                                 // Adds to myQueue
         
         theNum /= 10;                                                                             // Reduces the value of theNum
      }
      
      /*
         * Remove any leading zero's at the front of myQueue
         * Ex: If the input of theNum is 120 what's in myQueue before this is: 0 2 1
            * After the removal in myQueue it should be 2 1
      */
      while(myQueue.get(0) == 0){                                                                  // While Loop
         myQueue.remove(0);                                                                        // Removes the first item in myQueue
      }
      
      if(myQueue.size() >= 10 && myQueue.get(0) > 2){                                              // If the number is bigger than 32-bits
         return 0;                                                                                 // Returns 0 to the user
      }
      //System.out.printf("Size of myQueue is: %d\n", myQueue.get(0));                             // Debug statement
      
      for(LCV = 0; LCV < myQueue.size(); LCV++){                                                   // For Loop
                                                                                                   
                                                                                                   // Debug Statement
         //System.out.printf("Current value being observed: %d\n", (myQueue.get(LCV) * (int)(Math.pow(10, myQueue.size() - LCV - 1))));               
         
         reversedNum += (myQueue.get(LCV) * (int)(Math.pow(10, myQueue.size() - LCV - 1)));        // Adds to the value of reversedNum
      }
      
      if(negativeNum){                                                                             // If the value of theNum was originally negative
         return reversedNum * -1;                                                                  // Returns the value to the user
      }
      return reversedNum;                                                                          // Returns the value of reversedNum
      
   }
}