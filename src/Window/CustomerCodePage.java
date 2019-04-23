package Window;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class CustomerCodePage extends VBox{
	
	private Button nextBtn;
	private Button backBtn;
	
	public CustomerCodePage() {
		
		setAlignment(Pos.CENTER);
		setPadding(new Insets(5));
		setSpacing(10);
		
		nextBtn = new Button("Next");
		backBtn = new Button("Back");
		
		TextField text = new TextField();
		text.setPromptText("Please Fill Customer Code");
		
		getChildren().addAll(text, nextBtn, backBtn);
	}
	
	public Button getNextBtn() {
		return nextBtn;
	}
	
	public Button getBackBtn() {
		return backBtn;
	}

}
