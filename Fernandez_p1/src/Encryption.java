import java.util.Scanner;

public class Encryption {
   public static void main(String[] args) {
	   Scanner keyboard = new Scanner(System.in);
	   
	 
	   int firstDigit;
	   int secondDigit;
	   int thirdDigit;
	   int fourthDigit;
	  
      //prompt the user to enter 4 digits (userInput)
      System.out.print("Enter 4 digits: \n");
      int userInput = keyboard.nextInt();
      
      //print integer (userInput)
      System.out.println("The number you entered is: " + userInput);
      
      //declare a string (userString) to begin conversion
      String userString = "";
      //convert integer (userInput) into a string (userString)      
      userString = Integer.toString(userInput);
      //print out string conversion (userString)
      System.out.println("This string is: " + userString);
      
      
      
      
//      //fill array with userInput
//    	  userInput[i] = keyboard.nextInt();
//      
//      //loop to print the array's userInput
//      System.out.print("You entered: ");
//      for(i = 0; i <userInput.length; ++i) {
//    	  System.out.print(userInput[i]);
//      }
//      
//      /*replace each userInput[i] with the result of adding 7 and 
//      getting the remainder after dividing the new userInput[i] by 10*/
//      for(i = 0; i <userInput.length; ++i) {
//    	  userInput[i] = ((userInput[i] + 7) / 10);
//      }
//      //print replaced digits
//      System.out.print("\nYour replaced values are:  ");
//      for(i = 0; i <userInput.length; ++i) {
//         System.out.print(userInput[i]);
//      }  
//      
//      // swap 1st with 3rd and 2nd with 4th
//      int firstDigit = userInput[0];
//      int secondDigit = userInput[1];
//      int thirdDigit = userInput[2];
//      int fourthDigit = userInput[3];
//      userInput[0] = thirdDigit;
//      userInput[1] = fourthDigit;
//      userInput[2] = firstDigit;      
//      userInput[3] = secondDigit;
//      
   }
}

