package org.djflying.javase.designpattern.patterns.facade.demo;

/**
 * Created by Tom.
 */
public class FacadeServiceTest {
    public static void main(String[] args) {
        FacadeService facadeService = new FacadeService();
        GiftInfo giftInfo = new GiftInfo("《Spring 5核心原理》");
        facadeService.exchange(giftInfo);
    }
}
