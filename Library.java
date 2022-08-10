/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package library;

import java.util.Scanner;

public class Library {


public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("********************Welcome to the Student Library!********************");
    System.out.println("              Please Select From The Following Options:               ");
System.out.println("**********************************************************************");
    books ob = new books();
    students obStudent = new students();
    int choice;
    int searchChoice;

    do{

        ob.dispMenu();
        choice = input.nextInt();

        switch(choice){

            case 1 -> {
                book b = new book();
                ob.addBook(b);
            }

            case 2 -> ob.upgradeBookQty();

            case 3 -> {
                System.out.println("Enter 1 to Search with Serial No.");
                System.out.println("Enter 2 to Search with Author Name(Full Name).");
                searchChoice = input.nextInt();

                switch(searchChoice){

                    case 1 -> ob.searchBySno();
                    case 2 -> ob.searchByAuthorName();

                }
            }

            case 4 -> ob.showAllBooks();
            case 5 -> {
                student s = new student();
                obStudent.addStudent(s);
            }
            case 6 -> obStudent.showAllStudents();
            case 7 -> obStudent.checkOutBook(ob);
            case 8 -> obStudent.checkInBook(ob);
            default -> System.out.println("CHOICE SHOULD BE BETWEEN 0 TO 8.");

        }

    }
    while (choice!=0);




}

}