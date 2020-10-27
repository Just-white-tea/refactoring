package com.hp.refactoring.iterationNine;

/**
 * @author haopeng lin
 * 2020年 10月 15日
 */
public class NewReleasePrice extends Price{
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
