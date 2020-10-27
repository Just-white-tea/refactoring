package com.hp.refactoring.iterationTen;

/**
 * @author haopeng lin
 * 2020年 10月 15日
 */
public class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    double getCharge(int daysRented){
        double result = 2;
        if (daysRented > 2){
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }
}
