package com.java.patterns;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class HeartPattern extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("LOVE YOU");

        Group root = new Group();
        Scene scene = new Scene(root, 400, 400, Color.WHITE);

        double scale = 20.0;

        for (int i = 0; i < 10000; i++) {
            double t = i / 10000.0;
            double x = scale * (15 * Math.pow(Math.sin(t), 3));
            double y = scale * (12 * Math.cos(t) - 5 * Math.cos(2 * t) - 2 * Math.cos(3 * t) - Math.cos(4 * t));

            Line line = new Line(x, y, 0, 0);
            line.setStroke(Color.web("#FF4433"));
            root.getChildren().add(line);
        }

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

