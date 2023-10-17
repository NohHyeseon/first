package com.green.day14.ch6;

public class CardDeck {
    Card[] cards;

    public CardDeck() {
        init();
    }

    private void init() {
        cards = new Card[52];

        String[] patterns = { "Spade", "Heart", "Diamond", "Club" };
        int idx = 0;
        for(int i=0; i<patterns.length; i++) {
            String pattern = patterns[i];
            for(int z=1; z<=13; z++) {
                String denomination = this.getNumberFromInt(z);
                cards[idx++] = new Card(pattern, denomination);
            }
        }
    }

    private String getNumberFromInt(int num) {
        switch(num) {
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
        }
        return String.valueOf(num);
    }

    public void printAll() {
        for(Card c : cards) {
            c.printMySelf();
        }
    }
}
