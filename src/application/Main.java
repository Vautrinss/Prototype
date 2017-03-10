package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setTitle("WUP");
		Parent root = FXMLLoader.load(getClass().getResource("UILogin.fxml"));
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
