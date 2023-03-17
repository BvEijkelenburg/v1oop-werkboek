package les09_10.opdrachten.twitter.userinterface;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import les09_10.opdrachten.twitter.model.Tweet;
import les09_10.opdrachten.twitter.model.TwitterAccount;

import java.util.ArrayList;
import java.util.Collections;

public class AccountController {
    @FXML private ListView tweetlist;
    @FXML private Label tweetsLabel;
    @FXML private Label volgersLabel;
    @FXML private Label vriendenLabel;

    private TwitterAccount account = TwitterAccount.getHuidigeUser();

    public void initialize() {
        tweetsLabel.setText("" + account.getTweets().size());
        vriendenLabel.setText("" + account.getVrienden().size());
        volgersLabel.setText("" + account.getVolgers().size());

        ArrayList<Label> labels = new ArrayList<>();
        for (Tweet tweet : account.getTweets()) {
            Label label = new Label(tweet.getBericht());
            label.setFont(new Font("Calibri", 18));
            label.setPadding(new Insets(10, 10, 10, 10));
            labels.add(label);
        }
        Collections.reverse(labels);

        tweetlist.setItems(FXCollections.observableArrayList(labels));
    }

    public void handleButtonToonVrienden(ActionEvent actionEvent) throws Exception {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Vrienden.fxml"));
            Parent root = loader.load();
            VriendenController controller = loader.getController();

//            controller.setMethodeInVriendenController();

            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.showAndWait();
            initialize();

//            controller.getMethodeInVriendenController();
    }

    public void handleButtonTweetOpstellen(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TweetOpstellen.fxml"));
            Parent root = loader.load();
            TweetOpstellenController controller = loader.getController();

            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.showAndWait();

            initialize();
        } catch (Exception e) {
            String melding = "Dit scherm kan helaas niet geopend worden!";
            Alert alert = new Alert(Alert.AlertType.ERROR, melding);
            alert.showAndWait();
        }
    }
}
