package com.hadx;

import com.aquafx_project.AquaFx;
import javafx.application.Application;
import javafx.stage.Stage;

public class SerialPortApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        AquaFx.style();
        primaryStage.show();
    }
}
