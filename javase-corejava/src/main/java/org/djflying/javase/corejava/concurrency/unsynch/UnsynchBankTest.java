package org.djflying.javase.corejava.concurrency.unsynch;

/**
 * This program shows data corruption when multiple threads access a data structure.
 * @version 1.31 2015-06-21
 * @author Cay Horstmann
 */
public class UnsynchBankTest {
    public static final int    NACCOUNTS       = 10;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT      = 1000;
    public static final int    DELAY           = 10;

    public static void main(String[] args) {
        // 创建拥有10个账户，每个账户初始金额为1000的银行
        Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
        for (int i = 0; i < NACCOUNTS; i++) {
            int fromAccount = i;
            Runnable r = () -> {
                try {
//                    while (true) {
                        // 从银行账户中随机选择一个账户作为转入账户
                        int toAccount = (int) (bank.size() * Math.random());
                        // 转入金额
                        double amount = MAX_AMOUNT * Math.random();
                        // 从固定账户转入到随机账户
                        bank.transfer(fromAccount, toAccount, amount);
                        Thread.sleep((int) (DELAY * Math.random()));
//                    }
                } catch (InterruptedException e) {
                }
            };
            Thread t = new Thread(r);
            t.start();
        }
    }
}
