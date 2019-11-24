package com.thanhhanh.dgv.model;
import javax.persistence.*;

@Entity
@Table(name = "cinemas")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="movie_id")
    private int movieId;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "movie_description")
    private String movieDesc;

    @Column(name = "movie_cens")
    private String movieCens;

    @Column(name = "movie_genr")
    private int movieGenr;

    @Column(name = "movie_rele")
    private String movieRele;

    @Column(name = "movie_leng")
    private String movieLeng;

    @Column(name = "movie_form")
    private String movieFormat;

    @Column(name = "movie_poster")
    private String moviePoster;

    public Movie() {
    }

    public Movie(String movieName, String movieDesc, String movieCens, int movieGenr, String movieRele, String movieLeng, String movieFormat, String moviePoster) {
        this.movieName = movieName;
        this.movieDesc = movieDesc;
        this.movieCens = movieCens;
        this.movieGenr = movieGenr;
        this.movieRele = movieRele;
        this.movieLeng = movieLeng;
        this.movieFormat = movieFormat;
        this.moviePoster = moviePoster;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }

    public String getMovieCens() {
        return movieCens;
    }

    public void setMovieCens(String movieCens) {
        this.movieCens = movieCens;
    }

    public int getMovieGenr() {
        return movieGenr;
    }

    public void setMovieGenr(int movieGenr) {
        this.movieGenr = movieGenr;
    }

    public String getMovieRele() {
        return movieRele;
    }

    public void setMovieRele(String movieRele) {
        this.movieRele = movieRele;
    }

    public String getMovieLeng() {
        return movieLeng;
    }

    public void setMovieLeng(String movieLeng) {
        this.movieLeng = movieLeng;
    }

    public String getMovieFormat() {
        return movieFormat;
    }

    public void setMovieFormat(String movieFormat) {
        this.movieFormat = movieFormat;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {
        this.moviePoster = moviePoster;
    }
}
