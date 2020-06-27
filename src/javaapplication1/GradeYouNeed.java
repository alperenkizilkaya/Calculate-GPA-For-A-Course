/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
public class GradeYouNeed {

    public static void main(String[] args) {
        
        System.out.println("School rules: \n"+
                         "1) %40 of midterm + %60 of final must be 50 at least\n"+
                         "2) final grade must be 50 at least");
        System.out.println("Please enter your midterm grade: ");
        Scanner s = new Scanner(System.in);
        float midterm = s.nextFloat();
        if (midterm>100 || midterm<0){
            System.out.println("!!!your grade must be between 0-100 !!!");
        }else{
            midterm = midterm*40/100;
            float fnl = (50-midterm)*100/60; // %60 of final grade 
            System.out.println("____________________________________________________");

            if(fnl<=50){
                System.out.println("your final grade must be " + 50 +" to pass the course");
            }else if(fnl>50){
                if(fnl%2!=0){
                    int grade = (int)fnl;
                    grade++;
                    System.out.println("your final grade must be " + grade +" to pass the course");
                }else{
                    System.out.println("your final grade must be " + fnl +" to pass the course");
                }
            }
            System.out.println("____________________________________________________");
        }
        
    }
}
