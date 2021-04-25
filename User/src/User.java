import java.util.*;
import java.lang.*;
import java.io.*;

public class User {
    String name;
    String surname;
    char plec;
    int wiek;
    String mail;

    public User(String name, String surname, char plec, int wiek, String mail) {
        this.name = name;
        this.surname = surname;
        this.plec = plec;
        this.wiek = wiek;
        this.mail = mail;
    }

    public void loginIn() {

    }

    public void deleteAnAccount() {

    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public char getPlec() {
        return this.plec;
    }
    public int getWiek() {
        return this.wiek;
    }
    public String getMail() {
        return this.mail;
    }
}
class ForumUser extends User {
    private String userName;
    private int amoutOfPosts;
    private boolean loggedIn;
    public ForumUser(String userName, int amoutOfPosts, boolean loggedIn, String name, String surname, char plec, int wiek, String mail) {
        super(name, surname, plec, wiek, mail);
        this.userName = userName;
        this.amoutOfPosts = amoutOfPosts;
        this.loggedIn = loggedIn;
    }
    public void postPublication() {

    }
    public void commentPost() {

    }
    public void welcome() {
        System.out.println("Witaj użytkowniku");
    }
}
class Application {
    public static void main (String[] args) {
        ForumUser forumUser = new ForumUser("Codemaker" , 23 , true , "Rafal" , "Mazurek" , 'M' , "commandos2@wp.pl");
        System.out.println(forumUser);
    }
}