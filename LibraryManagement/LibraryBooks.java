import java.util.ArrayList;

public class LibraryBooks{
  
  
  static ArrayList<Books> book = new ArrayList<Books>();
  
  public  static void main (String[] args){
    
    
    
    book.add(new Books("Author1", "Book1", "Tba", "Na", 123));
    book.add(new Books("Author2", "Book2", "Tba", "Na", 234));
    listAllBook(book);
    addBooks("Author3","Book3","Tba", "Na", 345);
    addBooks("Aithor4","Book4", "Tba","Na",456);
    listAllBooksDetails(book);
    
    System.out.println("List only Author4's Book \n");
    findAuthor("Author4");
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
    System.out.println(books.getIsbn());
  }  
}

public static void addBooks(String title, String author, String tba, String na, int isbn){
  Books books = new Books(title, author, tba, na, isbn);
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
      System.out.println(book.get(index).getIsbn());
    
  }
  
}
}

}
