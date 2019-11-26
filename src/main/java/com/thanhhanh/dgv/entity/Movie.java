package com.thanhhanh.dgv.entity;
import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="movie_id")
    private int movieId;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "movie_description")
    private String movieDesc;

    @Column(name = "movie_trailer")
    private String movieTrailer;

    @Column(name = "movie_cens")
    private String movieCens;

    @Column(name = "movie_genres")
    private int movieGenres;

    @Column(name = "movie_release")
    private String movieRelease;

    @Column(name = "movie_lenght")
    private String movieLeng;

    @Column(name = "movie_format")
    private String movieFormat;

    @Column(name = "movie_poster")
    private String moviePoster;

    public Movie() {
    }

    public Movie(String movieName, String movieDesc, String movieTrailer, String movieCens, int movieGenres, String movieRelease, String movieLeng, String movieFormat, String moviePoster) {
        this.movieName = movieName;
        this.movieDesc = movieDesc;
        this.movieTrailer = movieTrailer;
        this.movieCens = movieCens;
        this.movieGenres = movieGenres;
        this.movieRelease = movieRelease;
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

    public String getMovieTrailer() {
        return movieTrailer;
    }

    public void setMovieTrailer(String movieTrailer) {
        this.movieTrailer = movieTrailer;
    }

    public String getMovieCens() {
        return movieCens;
    }

    public void setMovieCens(String movieCens) {
        this.movieCens = movieCens;
    }

    public int getMovieGenres() {
        return movieGenres;
    }

    public void setMovieGenres(int movieGenres) {
        this.movieGenres = movieGenres;
    }

    public String getMovieRelease() {
        return movieRelease;
    }

    public void setMovieRelease(String movieRelease) {
        this.movieRelease = movieRelease;
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
