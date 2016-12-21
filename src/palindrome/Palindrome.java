/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author mahith
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        LargestPalindrome();
    }
    
    public static void LargestPalindrome(){
        int count=0;
        String s2="Not a palindrome";
        Scanner sc=new Scanner(System.in); 
        String s=sc.nextLine();
        int length=s.length();
        for(int i=0;i<length;i++){
           for(int j=(i+2);j<=length;j++){
         
              String s1=s.substring(i,j);
              //System.out.println(s1);
              StringBuffer sb=new StringBuffer(s1);
              sb.reverse();
              while(s1.equals(sb.toString())){
            
                   if(s1.length()>count){
                     // System.out.print("reached");
                     count=s1.length();
                     s2=s1;
                   }
                   break;
               } 
           }
      
        }
        System.out.print(s2);
    }
    
    
    public static void palindrome(){
    
      Scanner sc=new Scanner(System.in); 
      String s=sc.nextLine();
      StringBuffer sb=new StringBuffer(s);
      sb.reverse();
      String sb1=sb.toString();
      while(s.equals(sb1)){
         System.out.println("palindrome");
         break;
      }
      
    
    
    }
    
    
}
