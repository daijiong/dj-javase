package org.djflying.javase.corejava.concurrency.pokergame;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description
 *
 * @author daijiong
 * @version : PokerGame.java, v 0.1 2020/3/28 14:06 daijiong Exp $$
 */
public class PokerGame {
    public static void main(String[] args) {

//        // 1.create a deck of poker card
//        PokerDeck.initPokerCards();
//        // 2.shuffle
//        PokerDeck.shufflePokerCards();
//        // 3.play
//        PokerDeck pokerDeck = new PokerDeck();
//        PokerPlayer pokerPlayer1 = new PokerPlayer(pokerDeck, "Player1");
//        PokerPlayer pokerPlayer2 = new PokerPlayer(pokerDeck, "Player2");
//        PokerPlayer pokerPlayer3 = new PokerPlayer(pokerDeck, "Player3");
//        new Thread(pokerPlayer1).start();
//        new Thread(pokerPlayer2).start();
//        new Thread(pokerPlayer3).start();

        //用线程池来实现 ，3个线程加入线程池
        ExecutorService pool = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            pool.submit(()-> System.out.println("AAAAAA"));
            pool.submit(()-> System.out.println("BBBBBB"));
            pool.submit(()-> System.out.println("CCCCCC"));
        }
        pool.shutdown();
    }
}
