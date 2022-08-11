/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.util.Scanner;    

/**
 *
 * @author gamer
 */
public class Student {

String studentName;
String regNum;

Book borrowedBooks[] = new Book[3];
public int booksCount = 0;

Scanner input = new Scanner(System.in);

public Student(){

    System.out.println("Enter Student Name:");
    this.studentName = input.nextLine();

    System.out.println("Enter Reg Number:");
    this.regNum = input.nextLine();

}
}