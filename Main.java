package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        VideoPlayer videoplayer = new VideoPlayer("file:///Users/lilyayala/Desktop/Earth.mp4");
        Scene scene = new Scene(videoplayer, 1280, 720, Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
