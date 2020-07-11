package sample;

public class Deck {
    Card[] deck;
    int size;
    public Deck(){
        size = 52;
        deck = new Card[size];
        int index = 0;
        for(int i = 1; i <= 13; i++){
            for(int j = 1; j <= 4; j++){
                deck[index] = new Card(i, j);
                index++;
            }
        }
    }
    public void shuffle(){
        for(int i = 0; i < size; i++){
            int x = (int)(((size-i)*Math.random())+i);
            swap(i, x);
        }
    }
    private void swap(int a, int b){
        Card temp = deck[a];
        deck[a] = deck[b];
        deck[b] = temp;
    }
    public Card peek(){
        return deck[size-1];
    }
    public Card deal(){
        return deck[--size];
    }
}
