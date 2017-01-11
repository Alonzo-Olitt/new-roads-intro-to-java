public class BlackCard extends Card{
  
  private String color;
  
  //default constructor
  public BlackCard(){
    color = "black";
}
  
  public String toString(){
   return super.toString() + " " + color;
  }
  
}//end of class
 