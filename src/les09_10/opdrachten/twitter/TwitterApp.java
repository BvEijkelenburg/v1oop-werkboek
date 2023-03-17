package les09_10.opdrachten.twitter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import les09_10.opdrachten.twitter.model.Tweet;
import les09_10.opdrachten.twitter.model.TwitterAccount;

public class TwitterApp extends Application {
    public static void main(String[] args) throws Exception {
        String naam = "Piet van Vliet", account = "@pietvanvliet98";
        TwitterAccount nieuwAccount = new TwitterAccount(naam, account);
        TwitterAccount.setHuidigeUser(nieuwAccount);

        nieuwAccount.addVolger(new TwitterAccount("@realDonaldTrump", "Donald J. Trump"));
        nieuwAccount.addVriend(new TwitterAccount("@TijsvandenBrink", "Tijs van den Brink"));
        nieuwAccount.tweet(new Tweet("Eerste tweet..."));

        nieuwAccount.addVolger(new TwitterAccount("@realDonaldTrump", "Donald J. Trump"));
        nieuwAccount.addVolger(new TwitterAccount("@BarackObama", "Barack Obama"));
        nieuwAccount.addVriend(new TwitterAccount("@TijsvandenBrink", "Tijs van den Brink"));
        nieuwAccount.addVriend(new TwitterAccount("@Jinek_RTL", "Eva Jinek"));
        nieuwAccount.addVriend(new TwitterAccount("@helgavanleur", "Helga van Leur"));

        nieuwAccount.tweet(new Tweet("Eerste tweet..."));
        nieuwAccount.tweet(new Tweet("Nog niet veel te melden!"));
        nieuwAccount.tweet(new Tweet("Vandaag naar school geweest!"));
        nieuwAccount.tweet(new Tweet("Vandaag niet naar school geweest!"));
        nieuwAccount.tweet(new Tweet("De oma van een kennis van m'n zwager heeft last van haar teen #verdrietig"));
        nieuwAccount.tweet(new Tweet("Nu heeft m'n zwager ook last van zijn teen #zwaar"));

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        TwitterAccount account = TwitterAccount.getHuidigeUser();
        String fxmlPagina = "userinterface/Account.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPagina));
        Parent root = loader.load();

        String title = account.getNaam() + "(" + account.getAccount() + ")";
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.show();
    }
}
