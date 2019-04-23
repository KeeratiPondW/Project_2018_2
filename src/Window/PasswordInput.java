package Window;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;



public class PasswordInput extends HBox{
	
	private PasswordField password;
	
	public PasswordInput(String labelText, String promtText) {
		setAlignment(Pos.CENTER);
		setPadding(new Insets(5));
		setSpacing(10);
		
		password = new PasswordField();
		password.setPromptText(promtText);
		
		Label label = new Label(labelText);
		
		getChildren().addAll(label, password);
		
	}
	
	public String getPasswordField() {
		return password.getText().trim();
	}

}
