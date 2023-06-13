import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ImpactVal extends Application implements EventHandler<ActionEvent> {
    Button btn;
    TextField username;
    TextField tag;
    StackPane layout;
    Pane root;

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        /* Setup the basic window */
        Parent root = FXMLLoader.load(getClass().getResource("ImpactVal.fxml"));
        Font font = Font.loadFont("file:resources/fonts/Valorant Font.ttf", 45);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        // btn.setPrefWidth(500);
        primaryStage.show();
    }
    /*
     * primaryStage.setTitle("ImpactVal");
     * layout = new StackPane();
     * root = new Pane();
     * Scene scene = new Scene(layout, 900, 500);
     * primaryStage.setScene(scene);
     * primaryStage.setResizable(false);
     * /* Add all components
     * setwindowBackground();
     * setRunButton();
     * setTextFields();
     * // setReadText();
     * 
     * primaryStage.show();
     * }
     * 
     * @Override
     * public void handle(ActionEvent event) {
     * 
     * }
     * 
     * public void setRunButton() {
     * btn = new Button();
     * 
     * btn.setLayoutX(250);
     * btn.setLayoutY(220);
     * root.getChildren().add(btn);
     * 
     * btn.setText("View Stats");
     * btn.setLayoutX(200);
     * layout.getChildren().add(root);
     * 
     * }
     * 
     * public void setwindowBackground() {
     * Rectangle rectangle = new Rectangle();
     * rectangle.setX(50);
     * rectangle.setY(50);
     * rectangle.setWidth(900);
     * rectangle.setHeight(500);
     * LinearGradient cycleGrad = new LinearGradient(
     * 0, 0, 1, 1, true, // sizing
     * CycleMethod.NO_CYCLE, // cycling
     * new Stop(0, Color.web("#81c483")), // colors
     * new Stop(1, Color.web("#fcc200")));
     * rectangle.setFill(cycleGrad);
     * layout.getChildren().add(rectangle);
     * }
     * 
     * public void setTextFields() {
     * username = new TextField();
     * tag = new TextField();
     * layout.getChildren().add(username);
     * layout.getChildren().add(tag);
     * }
     * 
     * public void setReadText() {
     * Label text1 = new
     * Label("Enter your full valorant tag and click \"view stats\" to see your results."
     * );
     * layout.getChildren().add(text1);
     * }
     */

    @Override
    public void handle(ActionEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handle'");
    }
}
