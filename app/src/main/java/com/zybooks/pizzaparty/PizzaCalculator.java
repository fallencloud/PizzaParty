package com.zybooks.pizzaparty;

public class PizzaCalculator {
    public enum HungerLevel {
        LIGHT, MEDIUM, RAVENOUS
    }

    public final static  int SLICES_PER_PIZZA = 8;

    private  HungerLevel mHungerLevel;
    private int mPartySize;

    public PizzaCalculator(int partySize, HungerLevel level) {
        setHungerLevel(level);
        setPartySize(partySize);
    }

    public HungerLevel getHungerLevel() {
        return mHungerLevel;
    }

    public void setHungerLevel(HungerLevel level) {
        mHungerLevel = level;
    }

    private int getPartySize() {
        return mPartySize;
    }

    public void setPartySize(int partySize) {
        if (partySize >= 0) {
            mPartySize = partySize;
        }
    }

    public int getTotalPizzas() {
        int slicePerPerson;
        if (mHungerLevel == HungerLevel.LIGHT) {
            slicePerPerson = 2;
        } else if (mHungerLevel == HungerLevel.MEDIUM) {
            slicePerPerson = 3;
        } else {
            slicePerPerson = 4;
        }

        return (int) Math.ceil(mPartySize * slicePerPerson/(double) SLICES_PER_PIZZA);
    }
}
