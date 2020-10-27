package com.hp.refactoring.iterationTen;

/**
 * @author haopeng lin
 * 2020年 10月 15日
 */
public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    double getCharge(int daysRented){
        return daysRented * 3;
    }
}
