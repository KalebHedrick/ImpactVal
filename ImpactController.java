import javafx.animation.FillTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class ImpactController {
    @FXML
    private Button stats;
    @FXML
    private ImageView logo;
    @FXML
    private TextField username;
    @FXML
    private TextField tag;
    @FXML
    private Label KDRatio;

    public void display() {
        KDRatio.setText(getUser());
    }

    public String getUser() {
        return username.getText();
    }

    public String getTag() {
        return tag.getText();
    }
}
