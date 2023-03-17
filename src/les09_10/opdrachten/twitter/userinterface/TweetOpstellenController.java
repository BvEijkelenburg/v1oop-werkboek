package les09_10.opdrachten.twitter.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import les09_10.opdrachten.twitter.model.Tweet;
import les09_10.opdrachten.twitter.model.TwitterAccount;

public class TweetOpstellenController {
    @FXML private TextArea tweetTextArea;
    @FXML private Label tweetMeldingLabel;

    public void handleButtonTweet(ActionEvent actionEvent) {
        try {
            TwitterAccount huidigAccount = TwitterAccount.getHuidigeUser();
            String bericht = tweetTextArea.getText();
            Tweet nieuweTweet = new Tweet(bericht);

            huidigAccount.tweet(nieuweTweet);
            sluitScherm(actionEvent);
        } catch (Exception e) {
            tweetMeldingLabel.setText("Leeg bericht niet toegestaan!");
            tweetMeldingLabel.setTextFill(Color.RED);
        }
    }

    public void handleButtonAnnuleren(ActionEvent actionEvent) {
        sluitScherm(actionEvent);
    }

    private void sluitScherm(ActionEvent actionEvent) {
        Button source = (Button)actionEvent.getSource();
        Stage stage = (Stage)source.getScene().getWindow();
        stage.close();
    }
}
