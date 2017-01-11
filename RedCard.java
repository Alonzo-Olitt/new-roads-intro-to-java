public class RedCard extends Card{
  
  private String color;
  
  //default constructor
  public RedCard(){
    color = "red";
}
  
  public String toString(){
   return super.toString() + " " + color;
  }
  
}//end of class