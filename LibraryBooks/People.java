
public class People{

  private int studentno;
  private String name;
  private String manaaki;
  private String tba;
  private String na;

  
  public People (String name, String manaaki, String tba, String na, int studentno){
    this.manaaki = manaaki;
    this.name = name;
    this.tba = tba;
    this.na = na;
    this.studentno = studentno;
  }

  
  public String getManaaki(){
    return this.manaaki;
  }
  
  public String getName(){
    return this.name;
  }
  
  public String getTba(){
    return this.tba;
  } 
  
  public String getNa(){
    return this.na;
  }  
  
  public int getStudentno(){
    return this.studentno;
  }
  
  
  public void setManaaki(String manaaki){
    this.manaaki = manaaki;
  }
  public void setName(String name){
    this.name = name;
  }  
  public void setTba(String tba){
    this.tba = tba;
  } 
  public void setNa(String na){
    this.na = na;
  }  
  public void setStudentno(int studentno){
  this.studentno = studentno;
  }
  
  
}
