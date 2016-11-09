/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictnumber;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author albertton
 */

class RandomNumber {
 

   public int GetANumber(int lo, int hi) {
 

       int randomNumber; 
       randomNumber = lo + (int) ( Math.random() * hi);
       return randomNumber;
   }
   
}
public class PredictNumber {
 

   public static void main(String[] args) {
  
   int round = 0; 
   int continueRunning; 
   int loss = 0; 
   int win = 0; 
   int predictionNumber; 
   int correctNumber;  
   String prediction;
   String replay;
   boolean yes;
   
    Scanner input = new Scanner(System.in);
    RandomNumber correct = new RandomNumber();
    
    correctNumber = correct.GetANumber(1, 10);
 

do{          
   prediction = (JOptionPane.showInputDialog("Guess the number between 1 and 10."));
   predictionNumber  = Integer.parseInt(prediction); // scanner for the guess
 
   if(predictionNumber == correctNumber)
                 JOptionPane.showMessageDialog(null, "Your guess is correct!");
   else if (predictionNumber > correctNumber) 
                 JOptionPane.showMessageDialog(null, "Your guess is incorrect. Guess lower.");
   else 
                 JOptionPane.showMessageDialog(null, "Your guess is incorrect. Guess higher.");
                 
   if(predictionNumber == correctNumber)
                 win++;  
   else if (predictionNumber > correctNumber) 
                 loss++;
   else if (predictionNumber < correctNumber)
                 loss++;
   
   round++;
           
   JOptionPane.showMessageDialog(null, "Wins: " + (win));
   JOptionPane.showMessageDialog(null, "Loss: " + (loss));
   
   JOptionPane.showMessageDialog(null, "Win percentage: " + (win/round)*100 + " %");
   JOptionPane.showMessageDialog(null, "Rounds played: " + (round));
   
  
   replay = JOptionPane.showInputDialog(null, "Enter 0 to quit, any number to play.");
   continueRunning  = Integer.parseInt(replay); 
   
   }       
   while (continueRunning != 0);}     
}

// Is this for an older lab, Albert?
    
    

