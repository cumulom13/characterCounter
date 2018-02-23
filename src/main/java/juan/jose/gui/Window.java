package juan.jose.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import juan.jose.count.CharacterCount;

public class Window extends Application {

    private CharacterCount characterCount = new CharacterCount();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

        TextField input = new TextField();
        input.setPromptText("Enter a character:");
        Button btn = new Button();
        btn.setText("Calculate Number of Times");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println(characterCount.countHowManyTimesCharacterAppears("text", input.getCharacters().charAt(0)));
            }
        });

        Pane pane = new Pane();

        pane.getChildren().add(createOpenFileButton(primaryStage));

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.add(input, 0, 1);
        grid.add(btn, 0, 2);
        pane.getChildren().add(grid);
        //        grid.add(createOpenFileButton(primaryStage), 0, 3);

        primaryStage.setScene(new Scene(pane, 300, 250));
        primaryStage.show();

    }

    private Button createOpenFileButton(Stage stage) {
        Button openFile = new Button();
        openFile.setText("Open Resource File");
        openFile.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                openFiles(stage);
            }
        });

        return openFile;
    }

    private void openFiles(Stage stage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.showOpenDialog(stage);
    }
}
