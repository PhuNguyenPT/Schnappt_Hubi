package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Image stageIcon = new Image("Schnappt_Hubi_icon.png");
			Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
			
			Scene scene = new Scene(root, 1280, 720);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.getIcons().add(stageIcon);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Schnappt Hubi");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
