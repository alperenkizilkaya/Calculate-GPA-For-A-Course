package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {

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
