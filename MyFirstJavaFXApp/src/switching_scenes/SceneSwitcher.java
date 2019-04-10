package switching_scenes;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SceneSwitcher extends Application
{
    public static final int WIN_WIDTH = 400;
    public static final int WIN_HEIGHT = 300;
    private Stage stage;

    @Override
    public void start(Stage stage)
    {
        this.stage = stage;

        //set up our initial scene
        stage.setTitle("Scene Switching");
        stage.setScene(getLoading());
        stage.show();

        //wait three seconds and then load our next scene
        KeyFrame frame = new KeyFrame(Duration.millis(3000), event -> stage.setScene(getBody()));
        Timeline animation = new Timeline(frame);
        animation.play();
    }

    private Scene getLoading()
    {
        VBox panel = new VBox();

        //set some styles through css
        panel.setStyle("-fx-spacing: 10px; -fx-alignment: center");

        ProgressIndicator progress = new ProgressIndicator();
        Text message = new Text("Please wait...");
        message.setId("waiting-message");
        message.getStyleClass().add("highlight");

        panel.getChildren().addAll(progress, message);

        Scene scene = new Scene(panel, WIN_WIDTH, WIN_HEIGHT);
        scene.getStylesheets().add("styles.css");
        return scene;
    }

    private Scene getBody()
    {
        VBox panel = getMessagePanel();

        Button button = new Button("Continue!");
        panel.getChildren().add(button);

        button.setOnAction(event -> {
            stage.setScene(getEnding());
        });

        Scene scene = new Scene(panel, WIN_WIDTH, WIN_HEIGHT);
        scene.getStylesheets().add("styles.css");
        return scene;
    }

    private VBox getMessagePanel()
    {
        VBox panel = new VBox();
        panel.setSpacing(10);
        panel.setAlignment(Pos.CENTER);
        panel.setPadding(new Insets(10));

        Text message = new Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Vivamus fermentum ut enim sit amet mattis. Donec pulvinar tortor at felis " +
                "rhoncus, in aliquam nunc auctor. Pellentesque ut laoreet odio, nec " +
                "molestie nunc. Sed eget est sodales, mattis metus ut, efficitur nunc.");
        message.setWrappingWidth(WIN_WIDTH);

        panel.getChildren().add(message);

        return panel;
    }

    private Scene getEnding()
    {
        return new Scene(getMessagePanel(), WIN_WIDTH, WIN_HEIGHT);
    }
}
