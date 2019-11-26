package com.thanhhanh.dgv.entity;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "avatar")
    private String userAvatar;

    @Column(name = "fullname")
    private String userFullname;

    @Column(name = "birthday")
    private String userBirthday;

    @Column(name = "gender")
    private int userGender;

    @Column(name = "email")
    private String userEmail;

    @Column(name = "city")
    private int userCity;

    @Column(name = "phone")
    private String userPhone;

    @Column(name = "point")
    private int userPoint;

    public User() {
    }

    public User(String username, String password, String userAvatar, String userFullname, String userBirthday, int userGender, String userEmail, int userCity, String userPhone, int userPoint) {
        this.username = username;
        this.password = password;
        this.userAvatar = userAvatar;
        this.userFullname = userFullname;
        this.userBirthday = userBirthday;
        this.userGender = userGender;
        this.userEmail = userEmail;
        this.userCity = userCity;
        this.userPhone = userPhone;
        this.userPoint = userPoint;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserFullname() {
        return userFullname;
    }

    public void setUserFullname(String userFullname) {
        this.userFullname = userFullname;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public int getUserGender() {
        return userGender;
    }

    public void setUserGender(int userGender) {
        this.userGender = userGender;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getUserCity() {
        return userCity;
    }

    public void setUserCity(int userCity) {
        this.userCity = userCity;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public int getUserPoint() {
        return userPoint;
    }

    public void setUserPoint(int userPoint) {
        this.userPoint = userPoint;
    }
}
