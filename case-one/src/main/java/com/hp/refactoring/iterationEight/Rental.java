package com.hp.refactoring.iterationEight;

/**
 * @author haopeng lin
 * 2020年 10月 13日
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

    double getCharge(){
        return movie.getCharge(daysRented);
    }

    int getFrequentRentalPoints(){
        //add frequent renter points 增加常客积分,如果是新上映的电影，则额外增加一分
        return movie.getFrequentRenterPoints(daysRented);
    }
}
