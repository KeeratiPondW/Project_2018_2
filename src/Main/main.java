package Main;

import java.io.FileNotFoundException;

import Window.loginPage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class main extends Application {

	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {
		StackPane root = new StackPane();
		
		
		
		root.getChildren().add(new loginPage());
		Scene scene = new Scene(root,400,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Progmeth Project");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
