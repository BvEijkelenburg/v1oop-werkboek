package les09_10.opdrachten.twitter.userinterface;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import les09_10.opdrachten.twitter.model.TwitterAccount;

import java.util.List;

public class VriendenController {
    @FXML private ComboBox<TwitterAccount> vriendenComboBox;
    @FXML private Label vriendNaamLabel;
    @FXML private Label vriendAccountLabel;
    @FXML private Label vriendOntvolgenLabel;

    private TwitterAccount account = TwitterAccount.getHuidigeUser();

    public void initialize() {
        List<TwitterAccount> vrienden = account.getVrienden();
        vriendenComboBox.setItems(FXCollections.observableList(vrienden));

        if (vrienden.isEmpty()) {
            vriendNaamLabel.setText("");
            vriendAccountLabel.setText("");
            vriendOntvolgenLabel.setVisible(false);

        } else {
            vriendenComboBox.getSelectionModel().select(0);
            vriendNaamLabel.setText(vrienden.get(0).getNaam());
            vriendAccountLabel.setText(vrienden.get(0).getAccount());
        }
    }

    public void handleClickOntvolgen(MouseEvent mouseEvent) {
        TwitterAccount geselecteerdAccount = vriendenComboBox.getSelectionModel().getSelectedItem();

        account.ontvolgVriend(geselecteerdAccount);
        initialize();
    }

    public void handleComboBoxWijziging(ActionEvent actionEvent) {
        TwitterAccount geselecteerdAccount = vriendenComboBox.getSelectionModel().getSelectedItem();

        if (geselecteerdAccount != null) {
            vriendNaamLabel.setText(geselecteerdAccount.getNaam());
            vriendAccountLabel.setText(geselecteerdAccount.getAccount());
        }
    }

    public void handleButtonSluiten(ActionEvent actionEvent) {
        Button source = (Button)actionEvent.getSource();
        Stage stage = (Stage)source.getScene().getWindow();
        stage.close();
    }
}
