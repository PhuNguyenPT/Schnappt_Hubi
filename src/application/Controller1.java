package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.beans.binding.Bindings;
import javafx.scene.paint.Color;

public class Controller1 {
	
	@FXML
	private Button myButton;
	
	public Controller1() {
		// TODO Auto-generated constructor stub
	}
	
    public void initialize() {
        myButton.textFillProperty().bind(
            Bindings.when(myButton.hoverProperty())
            .then(Color.web("#1d393b"))
            .otherwise(Color.GRAY));

    }
}
