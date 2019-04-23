package Window;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class TextInput extends HBox{
	
	private TextField textField;
	
	public TextInput(String labelText, String promptText) {
		setAlignment(Pos.CENTER);
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
