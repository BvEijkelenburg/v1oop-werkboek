package les09_10.opdrachten.twitter.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwitterAccount {
    private static TwitterAccount huidigeUser;

    public static void setHuidigeUser(TwitterAccount account) {
        huidigeUser = account;
    }

    public static TwitterAccount getHuidigeUser() {
        return huidigeUser;
    }

    private String naam;
    private String account;
    private ArrayList<TwitterAccount> volgers;
    private ArrayList<TwitterAccount> vrienden;
    private ArrayList<Tweet> tweets;

    public TwitterAccount(String account, String naam) {
        this.account = account;
        this.naam = naam;

        volgers = new ArrayList<>();
        vrienden = new ArrayList<>();
        tweets = new ArrayList<>();
    }

    public String getNaam() {
        return naam;
    }

    public String getAccount() {
        return account;
    }

    public void addVolger(TwitterAccount volger) {
        if (!volgers.contains(volger)) {
            volgers.add(volger);
        }
    }

    public List<TwitterAccount> getVolgers() {
        return Collections.unmodifiableList(volgers);
    }

    public void addVriend(TwitterAccount vriend) {
        if (!vrienden.contains(vriend)) {
            vrienden.add(vriend);
        }
    }

    public List<TwitterAccount> getVrienden() {
        return Collections.unmodifiableList(vrienden);
    }

    public boolean ontvolgVriend(TwitterAccount exVriend) {
        return vrienden.remove(exVriend);
    }

    public List<Tweet> getTweets() {
        return Collections.unmodifiableList(tweets);
    }

    public void tweet(Tweet nieuweTweet) {
        tweets.add(nieuweTweet);
    }

    public String toString() {
        return naam;
    }
}
