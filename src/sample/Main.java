package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Hello JavaFx!");
        primaryStage.setScene(new Scene(root, 800, 500));

//        primaryStage.setFullScreen(true);
//        primaryStage.setMaximized(true);
//        primaryStage.resizableProperty().setValue(Boolean.FALSE);
//        primaryStage.initStyle(StageStyle.UTILITY);
//        primaryStage.initStyle(StageStyle.UNDECORATED);


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
