/* Jason Rudinsky
* September 1, 2024
* Leetcode Question - Reverse Integer

* This is a program that will take in the input of an integer and the program will
* reverse the integer and return the number to the user. If the reversed integer is
* above the bounds that a 32-bit integer can handle it will return 0 to the user.

* 9/1/2024 - Original Version
*/


public class ReverseInteger{                                                                       // Class Block
   public static void main(String[] args){                                                         // Method BLock
      
      int x = 213;                                                                                 // Defines x
      
      while(x != 0){                                                                               // While Loop
         
         System.out.printf("Looking at the value of x: %d\n", x % 10);                             // Prints out to the user
         
         x /= 10;                                                                                  // Reduces the value of x
      }
   }
}