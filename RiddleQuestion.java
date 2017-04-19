//Declares a member's access as public 
public class RiddleQuestion{
//Allows objects to be accessed by the same class  
  private String question;
  private String answer;
  private boolean used = false;
  
  public RiddleQuestion(){
    
  }
 //Creating question and answer
  public RiddleQuestion(String newQuestion, String newAnswer){
    
    question = newQuestion;
    answer = newAnswer;
  }
//Gets question from the array  
  public String getQuestion(){
    return question;
  }
//posts question  
  public void setQuestion(String newQuestion){
    question = newQuestion;
  }
//gets answer from the array  
  public String getAnswer(){
    return answer;
  }
//posts the answer  
  public void setAnswer(String newAnswer){
    answer = newAnswer;
  }
//Marks riddles as used  
  public boolean getUsed(){
    return used;
  }
//marks riddles as used  
  public void setUsed(boolean newUsed){
    used = newUsed;
  }
  
//posts question and answer  
  public String toString(){
    return question + " " + answer + " ";
  }
    
  
}
  
  