package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class Hand {
    private int value;
    private int size;
    private Card[] hand;
    private String name;
    public Hand(String name){
        this.size = 0;
        this.value = 0;
        this.name = name;
        this.hand = new Card[52];
    }
    public void addCard(Card c){
        hand[size] = c;
        size++;
    }
    public String toString(){
        String s = "";
        for(int i = 0; i < size; i++){
            s += hand[i].toString() + ", ";
        }
        return name + "'s hand is " + s;
    }
    public int getSize(){
        return size;
    }
    public int getValue(){
        return value;
    }
    /*private int calculateValue(){

    }
    private boolean isOnePair(){

    }
    private boolean isTwoPair(){

    }
    private boolean isThreeOfAKind(){

    }
    private boolean isFullHouse(){

    }*/
    public boolean isFourOfAKind(){
        boolean a = hand[0].getRank() == hand[1].getRank() && hand[1].getRank() == hand[2].getRank() && hand[2].getRank() == hand[3].getRank();
        boolean b = hand[1].getRank() == hand[2].getRank() && hand[2].getRank() == hand[3].getRank() && hand[3].getRank() == hand[4].getRank();
        return a || b;
    }
    public boolean isFlush(){
        for(int i = 0; i < hand.length-1; i++){
            if(Card.BY_SUIT.compare(hand[i], hand[i+1]) != 0){
                return false;
            }
        }
        return true;
    }
    private boolean isStraightFlush(){
        if(isStraight() && isFlush()){
            return true;
        }
        return false;
    }
    public boolean isStraight(){
        Arrays.sort(hand, Card.BY_RANK);
        for(int i = 0; i < size-1; i++){
            if(hand[i].getRank() != hand[i+1].getRank() -1){
                return false;
            }
        }
        return true;
    }
}
