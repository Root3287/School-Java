
public class PlayingCard {
	public enum CardRank{
		SPADES,
		CLOVERS,
		HEARTS,
		DIAMONDS
	}
	public enum CardType{
		ACE(1),
		TWO(2),
		THREE(3),
		FOUR(4),
		FIVE(5),
		SIX(6),
		SEVEN(7),
		EIGHT(8),
		NINE(9),
		TEN(10),
		JACK(11),
		KING(12),
		QUEEN(13);
		
		private int rank;
		CardType(int rank){
			this.rank = rank;
		}
		public int getRank(){
			return rank;
		}
	}
	
	private CardType card;
	private CardRank rank;
	
	public PlayingCard() {
		this.card = CardType.ACE;
		this.rank = CardRank.SPADES;
	}
	
	public PlayingCard(PlayingCard c){
		this.card = c.card;
		this.rank = c.rank;
	}
	
	public PlayingCard(CardRank rank, CardType card){
		this.rank = rank;
		this.card = card;
	}
	
	public boolean beats(PlayingCard c){
		if(this.rank == c.rank){
			if(this.card.getRank() > c.card.getRank()){
				return true;
			}
		}
		return false;
	}
}
