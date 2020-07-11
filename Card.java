package sample;

import java.util.Comparator;

public class Card implements Comparable<Card>{
    public static final Comparator<Card> BY_RANK = new ByRank();
    public static final Comparator<Card> BY_SUIT = new BySuit();
    private final int rank, suit;
    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }
    public int getSuit(){
        return suit;
    }
    public int getRank(){
        return rank;
    }
    public String rankToString(){
        switch(rank){
            case 1: return "Ace";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return Integer.toString(rank);
        }
    }
    public String suitToString(){
        switch(suit){
            case 1: return "Diamonds";
            case 2: return "Clubs";
            case 3: return "Hearts";
            case 4: return "Spades";
            default: return "";
        }
    }
    public int compareTo(Card c){
        if(this.rank < c.rank){
            return -1;
        }
        if(this.rank> c.rank){
            return 1;
        }
        if(this.suit < c.suit){
            return -1;
        }
        if(this.suit > c.suit){
            return 1;
        }
        return 0;
    }
    public String toString(){
        return rankToString() + " of " + suitToString();
    }


    private static class ByRank implements Comparator<Card> {
        public int compare(Card a, Card b) {
            if (a.rank > b.rank) {
                return 1;
            }
            if (a.rank < b.rank) {
                return -1;
            }
            return 0;
        }
    }
    private static class BySuit implements Comparator<Card> {
        public int compare(Card a, Card b) {
            if (a.suit > b.suit) {
                return 1;
            }
            if (a.suit < b.suit) {
                return -1;
            }
            return 0;
        }
    }
}
