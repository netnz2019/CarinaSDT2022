
public class Books{

    private boolean borrowed;
    
    public Books() {
        this.borrowed = false;
    }
    
    public void setToBorrowed() {
        this.borrowed = true;
    }
    
    public void setToReturned() {
        this.borrowed = false;
    }
    
    public boolean isBorrowed() {
        return this.borrowed;
    }
    
    
  private int isbn;
  private String title;
  private String author;
  private String tba;
  private String na;

  
  public Books (String title, String author, String tba, String na, int isbn){
    this.author = author;
    this.title = title;
    this.tba = tba;
    this.na = na;
    this.isbn = isbn;
  }

  
  public String getAuthor(){
    return this.author;
  }
  
  public String getTitle(){
    return this.title;
  }
  
  public String getTba(){
    return this.tba;
  } 
  
  public String getNa(){
    return this.na;
  }  
  
  public int getIsbn(){
    return this.isbn;
  }
  
  
  public void setAuthor(String author){
    this.author = author;
  }
  public void setTitle(String title){
    this.title = title;
  }  
  public void setTba(String tba){
    this.tba = tba;
  } 
  public void setNa(String na){
    this.na = na;
  }  
  public void setIsbn(int isbn){
  this.isbn = isbn;
  }
  
  
}
