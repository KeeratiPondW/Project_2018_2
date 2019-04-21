package Window;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class SigninPage extends VBox{
	
	private Button saveBtn;
	private ComboBox questions;
	private Button backBtn;

	
	public SigninPage() {
		
		setAlignment(Pos.CENTER);
		setPadding(new Insets(5));
		setSpacing(10);
		
		saveBtn = new Button("Save");
		
		backBtn = new Button("Back");
		
		ObservableList<String> options = FXCollections.observableArrayList(
				"what is your father's name",
				"What is your favourite animal",
				"What day is your birthday",
				"What is your favorite sport");
		questions = new ComboBox(options);
		
		getChildren().addAll(new TextInput("Name", ""), new TextInput("Surname", ""),
				new TextInput("Username", ""), new TextInput("Password", ""),
				questions, new TextInput("Answer", ""), saveBtn, backBtn);
	}


	public Button getSaveBtn() {
		return saveBtn;
	}


	public String getQuestions() {
		return (String) questions.getValue();
	}


	public Button getBackBtn() {
		return backBtn;
	}
	
	
}
