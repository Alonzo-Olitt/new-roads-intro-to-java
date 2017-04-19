//allows all classes to access this
public class RiddlePlayer {
 
  private String name;
  
  
  public RiddlePlayer(){
    
  }
//Asks for new name   
  public RiddlePlayer(String newName){
    
    name = newName;
    
  }
//Returns the string value of the players name 
  public String getName(){
    return name;
  }
//sets the name of the player  
  public void setName(String newName){
    name = newName;
  }
//prints out the name  
  public String toString(){
    return name + " ";
  }
  
   
}