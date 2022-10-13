package org.djflying.javase.corejava.concurrency.pokergame;

/**
 * PokerCard
 *
 * @author daijiong
 * @version : PokerCard.java, v 0.1 2020/3/28 13:43 daijiong Exp $$
 */
public class PokerCard {
    private PokerType type;
    private String    name;
    private Integer   number;

    public PokerCard(PokerType type, Integer number) {
        this.type = type;
        this.number = number;
        if (number == 1) {
            this.name = "A";
        } else if (number == 11) {
            this.name = "J";
        } else if (number == 12) {
            this.name = "Q";
        } else if (number == 13) {
            this.name = "K";
        } else {
            this.name = number.toString();
        }
    }

    public PokerCard(PokerType type, String name, Integer number) {
        this.type = type;
        this.name = name;
        this.number = number;
    }

    public PokerType getType() {
        return type;
    }

    public void setType(PokerType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.type + this.name + this.number;
    }
}
