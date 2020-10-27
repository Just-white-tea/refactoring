package com.hp.refactoring.iterationNine;

/**
 * @author haopeng lin
 * 2020年 10月 15日
 */
public class RegularPrice extends Price{
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }
}
