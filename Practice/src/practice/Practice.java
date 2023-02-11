/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package practice;
import java.util.Scanner;
/**
 *
 * @author $ Dwiti Patel
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=in.nextInt();
        System.out.print("Enter a Number1: ");
        int n1=in.nextInt();
   
        String word = in.next();
         
        char[] reverse = new char[word.length()];
        for(int i=0;i<=word.length();i++)
        {
         reverse[i] = word.charAt(i);
    }
        for(int i=reverse.length-1;i>=0;i--)
        {
         System.out.print(reverse[i]);
    
}
        // TODO code application logic here
        //pull it 
    }

}
