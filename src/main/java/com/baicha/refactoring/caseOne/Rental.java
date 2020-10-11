package com.baicha.refactoring.caseOne;

/**
 * @Author HaoPeng Lin
 * @Date 2020-10-11 14:30
 * @Version 1.0
 * @function
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
}
