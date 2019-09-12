
package com.novi.positivenegative;
import javax.swing.JOptionPane;

public class Main {

    
    public static void main(String[] args) {
        
//        System.out.println("Input number: ");
        
       String firstNumber; //first string entered by user  // second string entered by user 

int number1;    // first number to add 
       //second number to add 
                   //sum of number1 and number2 

//read in the first number from user as a string 
firstNumber = 
        JOptionPane.showInputDialog ( "Input number" ); 


//convert numbers from type String to type int 
number1 = Integer.parseInt (firstNumber); 

// if else

if (number1 > 0) {
    System.out.println("This number is positive");
} else {
    System.out.println("This number is negative");
}
}
}

