package sample;

public class RenjiePoker {
    Hand player, dealer;
    Deck mainDeck;
    Deck comparisonDeck;
    public boolean[] conditions;
    public RenjiePoker(String playerName){
        player = new Hand(playerName);
        dealer = new Hand("dealer");
        conditions = new boolean[52];
        comparisonDeck = new Deck();
        mainDeck = new Deck();
        //mainDeck.shuffle();
    }
    public void playTurn(){
        if(player.getSize() == 5){
            checkWinner();
        }
        boolean playerCardDrawn = false;
        while(!playerCardDrawn ){
            for(int i = 0; i < conditions.length; i++){
                if(conditions[i] && mainDeck.peek().compareTo(comparisonDeck.deck[i]) == 0){
                    draw(player);
                    playerCardDrawn = true;
                    break;
                }else{
                    draw(dealer);
                }
            }
        }
    }
    public void testTurn(){
        draw(player);
        draw(player);
        draw(player);
        draw(player);
        draw(player);
        System.out.println(player.toString());
        System.out.println("Is four of a kind?" +player.isFourOfAKind());
    }
    // value of false indicates dealer won. value of true indicated player won
    // ties go to the dealer
    public boolean checkWinner(){
        if(dealer.getValue() < player.getValue()){
            return true;
        }
        return false;
    }
    public void draw(Hand h){
        h.addCard(mainDeck.deal());
    }
}
