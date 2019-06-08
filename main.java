/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

public class Mpg_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double miles, gallons;
        Scanner scan = new Scanner(System.in);
        miles = scan.nextDouble();
        gallons = scan.nextDouble();
        if(gallons == 0){
            System.out.println("Can not calculate.");
        } else {
            double result = miles / gallons;
            System.out.println(result);
        }
    }
    
}
