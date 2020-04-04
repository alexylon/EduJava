package me.alexandroff.crazyeights;

public class Play {
    public static void main(String[] args) {
        Card[] cards = new Card[52];

        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(rank, suit);
                index++;
            }
        }

        // Card.printDeck(cards);
    }
}
