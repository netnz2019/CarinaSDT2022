public class People{

  private int studentno;
  private String firstname;
  private String manaaki;
  private String lastname;
  private int dateofbirth;

  
  public People (String firstname, String manaaki, String lastname, int dateofbirth, int studentno){
    this.manaaki = manaaki;
    this.firstname = firstname;
    this.lastname = lastname;
    this.dateofbirth = dateofbirth;
    this.studentno = studentno;
  }

  
  public String getManaaki(){
    return this.manaaki;
  }
  
  public String getFirstname(){
    return this.firstname;
  }
  
  public String getLastname(){
    return this.lastname;
  } 
  
  public int getDateofbirth(){
    return this.dateofbirth;
  }  
  
  public int getStudentno(){
    return this.studentno;
  }
  
  
  public void setManaaki(String manaaki){
    this.manaaki = manaaki;
  }
  public void setFirstname(String firstname){
    this.firstname = firstname;
  }  
  public void setLastname(String lastname){
    this.lastname = lastname;
  } 
  public void setDateofbirth(int dateofbirth){
    this.dateofbirth = dateofbirth;
  }  
  public void setStudentno(int studentno){
  this.studentno = studentno;
  }
  
  
}
