public class Books implements java.io.Serializable {

  private int bookno;
  private String title;
  private String author;
  private String tba;
  private String na;

  
  public Books (String title, String author, String tba, String na, int bookno){
    this.author = author;
    this.title = title;
    this.tba = tba;
    this.na = na;
    this.bookno = bookno;
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
  
  public int getBookno(){
    return this.bookno;
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
  public void setBookno(int bookno){
  this.bookno = bookno;
  }

  
}
