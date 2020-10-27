package com.hp.refactoring.iterationEight;

/**
 * @author haopeng lin
 * 2020年 10月 13日
 */
public class Movie {
    public static final int CHILDRENS = 2; //孩子
    public static final int REGULAR = 0;  //定期
    public static final int NEW_RELEASE = 1; //新租片

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    double getCharge(int daysRented){
        double result = 0;
        switch (getPriceCode()){
            case Movie.REGULAR:
                result += 2;
                if (daysRented > 2){
                    result += (daysRented -2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (daysRented > 3){
                    result += (daysRented - 3) * 1.5;
                }
                break;
            default:
                break;
        }
        return result;
    }

    int getFrequentRenterPoints(int daysRented){
        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1){
            return 2;
        }else {
            return 1;
        }
    }
}
