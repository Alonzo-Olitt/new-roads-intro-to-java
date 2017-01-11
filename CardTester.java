//this class is to test the Card object
public class CardTester{
  
  //main method for testing
  public static void main(String[] args){
    
   // Card card = new Card("red", "diamonds", '8');
    //System.out.println(card);
    
   /* RedCard rCard = new RedCard();
    rCard.setSuit("diamonds");
    rCard.setRank('8');
    System.out.println(rCard);
    */
    
    BlackCard bCard = new BlackCard();
    bCard.setSuit("diamonds");
    bCard.setRank('8');
    System.out.println(bCard);
   
  }
  
}//end of class

