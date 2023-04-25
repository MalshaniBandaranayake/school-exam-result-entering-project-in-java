/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mystudyopedia.mavenproject2;

import java.util.Scanner;


/**
 *
 * @author MALSHANI
 */
public class Mavenproject2 {

    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("enter maths marks:");
    String maths_marks = myObj.nextLine();
    System.out.println("enter sinhala marks");
    String sinhala_marks = myObj.nextLine();
    System.out.println("enter tamil marks");
    String tamil_marks = myObj.nextLine();
    System.out.println("enter history marks");
    String history_marks = myObj.nextLine();
    System.out.println("enter english marks");
    String english_marks = myObj.nextLine();
    
    int imaths_marks = Integer.valueOf(maths_marks);
    int isinhala_marks = Integer.valueOf(sinhala_marks);
    int itamil_marks = Integer.valueOf(tamil_marks);
    int ihistory_marks = Integer.valueOf(history_marks);
    int ienglish_marks = Integer.valueOf(english_marks);
    int sum = imaths_marks+isinhala_marks + itamil_marks + ihistory_marks + ienglish_marks;
    
    System.out.println("final total marks is :" + sum);
    int average = sum / 5;
    System.out.println("average of marks is:" + average);
    if (average >=40 && average < 50){
    System.out.println("pass");
    }else if
    (average >= 50 && average < 60){
     System.out.println("merit");
        
    }else if
     (average >= 60 && average < 70) {
        System.out.println("distanction pass");
    } else if (average >= 70)  {
        System.out.println("higher distanction pass");
    }    else {
        System.out.println("fail");
    }
    }
}
