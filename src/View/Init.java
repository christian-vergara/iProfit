package View;

import com.sun.glass.ui.Menu;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Created by Studio on 9/22/2017.
 */
public class Init extends Application {

    private Stage primaryStage;
    private Scene homeScene;

    public static void main(String args[]) {

        launch(args);

    }

    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;

        primaryStage.setTitle("iProfit");

        BorderPane root = new BorderPane();
        homeScene = new Scene(root, 1280, 720);

        root.getStylesheets().add("View/initstyle.css");


        //SHOW STAGE
        primaryStage.setScene(homeScene);
        primaryStage.show();

    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }


}
