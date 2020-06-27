/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

public class CalculateCourseGPA {

    public static void main(String[] args) {
        
        System.out.println("Please enter your midterm grade: ");
        Scanner s = new Scanner(System.in);
        float midterm = s.nextFloat();
        
        System.out.println("Please enter your final grade: ");
        float fnl = s.nextFloat();

        midterm = midterm*40/100;
        fnl = fnl*60/100;
        
        System.out.println("GPA for this course is " + (midterm+fnl));
    } 
}
