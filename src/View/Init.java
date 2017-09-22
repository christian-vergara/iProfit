package View;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by Studio on 9/22/2017.
 */
public class Init extends Application {

    public static void Main(String args[]) {

        launch(args);

    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("iProfit");

        BorderPane root = new BorderPane();
        Scene homeScene = new Scene(root, 1280, 720);

        primaryStage.setScene(homeScene);
        primaryStage.show();
        primaryStage.close();
    }
}
