package cardgameweek4;
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * @author dancye, 2019
 */
public class Card {
    	
	// 01-29-2020
	
        public enum Suit {HEARTS, CLUBS,SPADES,DIAMONDS};
        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
        private final Suit suit;
        private final Value value;
        private String Joker;
        
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}

        
	public Suit getSuit() {
		return this.suit;
        }
        
        public String getJoker(){
            
            return this.Joker;
            
        }
        
        public void setJoker(String joker){
            
            this.Joker = Joker;
            
        }
        
}
