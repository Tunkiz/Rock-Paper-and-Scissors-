/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsp;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mabunda Tunkis
 */
public class RSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner me = new Scanner(System.in);
        Random rand = new Random();
        String RSP[] = {"r", "s", "p"};
        int myPoint = 0;
        int coPoint = 0;
        boolean play = true;
        while (play) {       
            System.out.println("Rock, Papers and Scissors. You "+myPoint+":"+coPoint+" Computer");
            String myPlay = me.nextLine();
            String coPlay = RSP[rand.nextInt(3)];
            if (myPlay.equalsIgnoreCase(coPlay)) {
                System.out.println(coPlay);
            } 
            else if(myPlay.equalsIgnoreCase("r") && coPlay.equalsIgnoreCase("s")){
                System.out.println(coPlay);
                myPoint++;
            }
            else if(myPlay.equalsIgnoreCase("s") && coPlay.equalsIgnoreCase("p")){
                System.out.println(coPlay);
                myPoint++;
                
            }
            else if(myPlay.equalsIgnoreCase("p") && coPlay.equalsIgnoreCase("r")){
                System.out.println(coPlay);
                myPoint++;
            }
            else {
                System.out.println(coPlay);
                coPoint++;
            }
            if (myPoint == 5 || coPoint == 5) {
                play = false;
            }
        }
        if (coPoint > myPoint) {
                System.out.println("Computer Won "+coPoint+" to "+myPoint);
            } else {
                System.out.println("You won "+myPoint+" to "+coPoint);
            }
    }
    
}
