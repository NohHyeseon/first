package com.green.day13.ch6;

class Card {
    String pattern; //Spade, Heart
    String denomination; //A, 2~10, J, Q, K

    void printYourSelf() {
        System.out.printf("%s-%s\n", pattern, denomination);
    }
}
public class CardTest3 {
    public static void main(String[] args) {
        Card[] cards = CardTest3.makeCards();
        System.out.println(cards.length);
        for(Card c : cards) {
            c.printYourSelf();
        }
    }

    public static Card[] makeCards() {
        Card[] cArr = new Card[52];
        String[] patterns = { "Spade", "Heart", "Diamond", "Club" };

        for(int i=0; i< cArr.length; i++) {
            String pattern = patterns[i / 13];
            String denomination = getNumberFromInt(i % 13);
//            cArr[i] = new Card();
//            Card c = cArr[i];
            //c.pattern = pattern;
//            cArr[i].pattern = pattern;
//            cArr[i].denomination = denomination;
            Card c = new Card();
            cArr[i] = c;
            c.denomination = denomination;
            cArr[i].denomination = denomination;
            c.pattern = pattern;
        }
        return cArr;
    }
    public static String getNumberFromInt(int num) {
        switch(num) {
            case 0: return "K";
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
        }
        return String.valueOf(num);
    }
}
