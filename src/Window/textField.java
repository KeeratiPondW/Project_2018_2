package Window;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class textField extends VBox{
	
	private TextField textField;
	
	public textField(String labelText, String promptText) {
		setAlignment(Pos.CENTER_LEFT);
		setPadding(new Insets(5));
		setSpacing(10);

		textField = new TextField();
		textField.setPromptText(promptText);
		
		Label label = new Label(labelText);
		
		getChildren().addAll(label, textField);
	}
	
	public String getTextField() {
		return textField.getText().trim();
	}
	

}
