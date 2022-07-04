import java.io.*;
import java.util.ArrayList;


public class LibraryBooks  implements java.io.Serializable {
  static ArrayList<Books> book = new ArrayList<Books>();
  
  
  public  static void main (String[] args){
    menu();
    
  }
  
 
  public static void listAllBook(ArrayList<Books> listThese){
  System.out.println("LIST of books objects");
  for(Books books:listThese){
    System.out.println(books);
  }
  }
  
  public static void listAllBooksDetails(ArrayList<Books> listThese){
  System.out.println("LIST of details");
  for(Books books:listThese){
    System.out.println(books.getTitle());
    System.out.println(books.getAuthor());
    System.out.println(books.getTba());
    System.out.println(books.getNa());
    System.out.println(books.getBookno());
  }  
  }

  public static String readString(String prompt){   
   System.out.println(prompt);
   java.util.Scanner keyboard = new java.util.Scanner(System.in);   
   return keyboard.nextLine(); 
    }
  
 
  public static int readIntVal(String prompt){   
    System.out.println(prompt);
    boolean isAnInt = false;
    int userInput = 0;
    while (!isAnInt){
      try{
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        userInput = keyboard.nextInt();
        isAnInt = true;
        
      }catch(Exception e){
        System.out.println("Try again - not an integer");
        }
       
    }
    return userInput;
      
    }
  

  public static void addBooksMenu(){
    String title = readString("Please enter the Title of the book:");
    String author = readString("Please enter the Author of the book:");
    String tba = readString("Please enter TBA:");
    String na = readString("Please enter NA:");
    int bookno = readIntVal("Please enter the personal number of the book:");
    addBooks(title, author, tba, na, bookno);
    
    
    
  }
  

  public static void addBooks(String title, String author, String tba, String na, int bookno){
  Books books = new Books(title, author, tba, na, bookno);
  book.add(books);
  
}



  public static void findAuthor(String author){
  
  for (int index = 0; index < book.size(); index++){
    System.out.println(index);
    if (book.get(index).getTitle().equals(author)){
      System.out.println("found");
      
      System.out.println(book.get(index).getTitle());
      System.out.println(book.get(index).getAuthor());
      System.out.println(book.get(index).getTba());
      System.out.println(book.get(index).getNa());
      System.out.println(book.get(index).getBookno());
    
  }
  
  }
  }
  
 
  public static void saveAll(){
          try {
         FileOutputStream fileOut = new FileOutputStream("book.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(book);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in book.ser");
      }catch(IOException i) {
         i.printStackTrace();
      }
    
  }
  


  public static void loadSaved(){
  try
        {
            FileInputStream fileIn = new FileInputStream("book.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            book = (ArrayList) in.readObject();
            in.close();
            fileIn.close();
         }catch(IOException ioe){
             ioe.printStackTrace();
             return;
          }catch(ClassNotFoundException c){
             System.out.println("Class not found");
             c.printStackTrace();
             return;
          }
          
    
  }
 
  
  public static void menu(){
    boolean exit = false;
    while (exit == false){
      System.out.println("1. Add a book.");
      System.out.println("2. List all books");
      System.out.println("3. Save all.");
      System.out.println("4. Load saved books.");
      System.out.println("5. Exit. \n");
    
      int choice = readIntVal("Please enter your choice... \n");
   
      if (choice == 1) {addBooksMenu();}
      else if (choice == 2){listAllBooksDetails(book);}
      else if (choice == 3) {saveAll();}
      else if (choice == 4) {loadSaved();}
      else if (choice == 5){ System.exit(0);}
      else if (choice < 0 || choice > 5){System.out.println("\n Please choose a number between 1 and 5.\n");} 
    } 
  }
}
