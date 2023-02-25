package aplikacja;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		Group root = new Group();

		Scene scene = new Scene(root, Color.YELLOW);

	     Image icon = new Image("icon.jpg");
	    stage.getIcons().add(icon);
	   stage.setTitle("Prezentacja sceny");

		stage.setWidth(300);
		stage.setHeight(300);
		stage.setResizable(false);

		stage.setX(50);
		stage.setY(50);

		stage.setFullScreen(true);
		stage.setFullScreenExitHint("Naciśniej q aby wyjść");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

		stage.setScene(scene);
		stage.show();
	}
}
