package com.hp.refactoring.iterationTen;

/**
 * @author haopeng lin
 * 2020年 10月 15日
 */
public abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);
}
