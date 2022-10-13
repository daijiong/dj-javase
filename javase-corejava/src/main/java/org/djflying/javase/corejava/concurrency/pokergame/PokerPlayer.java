package org.djflying.javase.corejava.concurrency.pokergame;

import java.util.ArrayList;
import java.util.List;

/**
 * the poker game player
 *
 * @author daijiong
 * @version : PokerPlayer.java, v 0.1 2020/3/28 14:19 daijiong Exp $$
 */
public class PokerPlayer implements Runnable {
    private List<PokerCard> pokerCards = new ArrayList<>();
    private PokerDeck       pokerDeck;
    private String          name;

    public PokerPlayer(String name) {
        this.name = name;
    }

    public PokerPlayer(PokerDeck pokerDeck, String name) {
        this.pokerDeck = pokerDeck;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PokerDeck getPokerDeck() {
        return pokerDeck;
    }

    public void setPokerDeck(PokerDeck pokerDeck) {
        this.pokerDeck = pokerDeck;
    }

    @Override
    public void run() {
//        synchronized (pokerDeck) {
//            int index = pokerDeck.getIndex();
//            pokerCards.add(PokerDeck.getPokerCards().get(index));
//            System.out.println(this.name + "摸了一张" + PokerDeck.getPokerCards().get(index));
//            pokerDeck.setIndex(index + 1);
//            if (pokerDeck.getPlayer() == 1) {
//                pokerDeck.setPlayer(2);
//            }
//            if (pokerDeck.getPlayer() == 2) {
//                pokerDeck.setPlayer(3);
//            }
//            if (pokerDeck.getPlayer() == 3) {
//                pokerDeck.setPlayer(1);
//            }
//        }
    }
}
