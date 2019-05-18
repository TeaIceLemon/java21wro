package com.gitHub;

public enum Nominal {

    Five_HUNDRED(500),TWO_HUNDRED(200), ONE_HUNDRED(100),FIFTY(50),TWENTY(20), TEM(10);
    private int value;

    Nominal(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.name() + " " + this.value;
    }
}
