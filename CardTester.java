//this class is to test the Card object
public class CardTester{
  
  //main method for testing
  public static void main(String[] args){
    
    //creating a Card object
    Card c = new Card();
    
    c.setColor("black");
    c.setSuit("clubs");
    c.setRank('k');
    
    //print out card
    System.out.println(c.toString());
    
    //second card in hand
    Card c2 = new Card ();
    
    c.setColor("red");
    c.setSuit("diamonds");
    c.setRank('Q');
    
    System.out.println(c.toString());
    
    //third card in hand
    Card c3 = new Card ();
    c.setColor("black");
    c.setSuit("spades");
    c.setRank('3');
    
    System.out.println(c.toString());
    
    //fourth card in hand
    Card c4 = new Card ();
    c.setColor("black");
    c.setSuit("clubs");
    c.setRank('9');
    
    System.out.println(c.toString());
    
    //fifth card in hand
    Card c5 = new Card ();
    c.setColor("red");
    c.setSuit("hearts");
    c.setRank('J');
    
    System.out.println(c.toString());
  }
  
}//end of class

