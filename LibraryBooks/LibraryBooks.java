
import java.util.ArrayList;
import java.util.List;

public class LibraryBooks{
  
  
  static ArrayList<Books> book = new ArrayList<Books>();
  
  public  static void main (String[] args){
    
    
    
    book.add(new Books("Author1", "Vista", "Fountain", "Oxford Blue", 250));
    book.add(new Books("Author2", "Vista", "Fountain", "Cambridge Blue", 350));
    listAllBook(book);
    addBooks("Author3","Safari","Fountain", "Sapphire Blue", 26);
    addBooks("Aithor4","IM Premium", "Ballpoint","Black",80);
    listAllBooksDetails(book);
    
    System.out.println("List only the Parker Books \n");
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



private int quantity;
    
    List<Books> books = new ArrayList<>();
    
    public LibraryBooks(int quantity) {
        this.quantity = quantity;
        for(int i = 0; i < quantity; i++) {
            books.add(new Books());
        }
    }

    public void addBook() {
        books.add(new Books());
    }
    
    public boolean borrowBook() {
        for(Books b : books) {
            if(!b.isBorrowed()) {
                b.setToBorrowed();
                return true;
            }
            else {
                continue;
            }
        }
        System.out.println("All books are borrowed, sorry");
        return false;
    }
    
    public boolean returnBook() {
        for(Books b : books) {
            if(b.isBorrowed()) {
                b.setToReturned();
                return true;
            }
            else {
                continue;
            }
        }
        System.out.println("Cannot return book at this time, sorry!");
        return false;
    }
    
    public void printBooks() {
        for(Books b : books) {
            System.out.println("Borrowed? " + b.isBorrowed());
        }
    }
    
    public int getQuantity() {
        return this.quantity;
    }



}
