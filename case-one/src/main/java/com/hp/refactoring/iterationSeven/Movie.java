package com.hp.refactoring.iterationSeven;

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
}
