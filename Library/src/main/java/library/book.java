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
public class Book {

public int sNo;
public String bookName;
public String authorName;
public int bookQty;
public int bookQtyCopy;

Scanner input = new Scanner(System.in);

public Book(){

    System.out.println("Enter Serial No of Book:");
    this.sNo = input.nextInt();
    input.nextLine();
    System.out.println("Enter Book Name:");
    this.bookName = input.nextLine();
    System.out.println("Enter Author Name:");
    this.authorName = input.nextLine();
    System.out.println("Enter Quantity of Books:");
    this.bookQty = input.nextInt();
    bookQtyCopy = this.bookQty;

}

}