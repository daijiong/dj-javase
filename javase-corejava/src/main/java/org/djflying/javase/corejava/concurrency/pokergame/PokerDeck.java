package org.djflying.javase.corejava.concurrency.pokergame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * a deck of poker
 *
 * @author daijiong
 * @version : PokerDeck.java, v 0.1 2020/3/28 14:08 daijiong Exp $$
 */
public class PokerDeck {
    private static List<PokerCard> pokerCards = new ArrayList<>();
//    private int                    player    = (int) (Math.random() * 3 + 1);
//    private int                    index     = 0;

    public PokerDeck() {
    }

    public static void initPokerCards() {
        PokerType[] pokerTypes = PokerType.values();
        for (PokerType pokerType : pokerTypes) {
            if (PokerType.GHOST.equals(pokerType)) {
                pokerCards.add(new PokerCard(pokerType, "black Joke", 20));
                pokerCards.add(new PokerCard(pokerType, "red Joke", 20));
            } else {
                for (int j = 1; j <= 13; j++) {
                    pokerCards.add(new PokerCard(pokerType, j));
                }
            }
        }
    }

    public static void shufflePokerCards() {
        Collections.shuffle(pokerCards);
    }

    public static List<PokerCard> getPokerCards() {
        return pokerCards;
    }

    public static void setPokerCards(List<PokerCard> pokerCards) {
        PokerDeck.pokerCards = pokerCards;
    }

//    public int getPlayer() {
//        return player;
//    }
//
//    public void setPlayer(int player) {
//        this.player = player;
//    }
//
//    public int getIndex() {
//        return index;
//    }
//
//    public void setIndex(int index) {
//        this.index = index;
//    }
}
