package Window;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class CustomerCodePage extends VBox{
	
	private Button nextBtn;
	
	public CustomerCodePage() {
		
		setAlignment(Pos.CENTER);
		setPadding(new Insets(5));
		setSpacing(10);
		
		nextBtn = new Button("Next");
		
		TextField text = new TextField();
		text.setPromptText("Please Fill Customer Code");
		
		getChildren().addAll(text, nextBtn);
	}
	
	public Button getNextBtn() {
		return nextBtn;
	}

}
