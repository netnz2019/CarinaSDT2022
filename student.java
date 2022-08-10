/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.util.Scanner;    
public class student {

String studentName;
String regNum;

book borrowedBooks[] = new book[3];
public int booksCount = 0;

Scanner input = new Scanner(System.in);

public student(){

    System.out.println("Enter Student Name:");
    this.studentName = input.nextLine();

    System.out.println("Enter Reg Number:");
    this.regNum = input.nextLine();

}
}