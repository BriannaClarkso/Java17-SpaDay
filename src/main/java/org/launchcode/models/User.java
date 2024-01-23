package org.launchcode.models;

//import org.launchcode.spaday.data.UserData;

public class User {
    private String username;
    private String email;
    private String password;
    private int ID;
//    UserData userData;

//    public User(String username, String email, String password) {
//        this.username = username;
//        this.email = email;
//        this.password = password;
//    }


    public User(String username, String email, String password, int ID) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

//    public UserData getUserData() {
//        return userData;
//    }
//
//    public void setUserData(UserData userData) {
//        this.userData = userData;
//    }
}
