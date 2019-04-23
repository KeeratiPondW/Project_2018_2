package Window;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ReturnPage extends VBox{
	
	private Button saveBtn;
	private Button backBtn;
//	private ComboBox book;
//	private ComboBox dvd;
	
	public ReturnPage(ComboBox book, int Nbook, ComboBox dvd, int Ndvd) {
		setAlignment(Pos.CENTER);
		setPadding(new Insets(5));
		setSpacing(10);
		
		saveBtn = new Button("Save");
		backBtn = new Button("Back");
		
		getChildren().addAll(createBook(book, Nbook), createDvd(dvd, Ndvd), saveBtn, backBtn);
		
	}
	
	private VBox createBook(ComboBox book, int Nbook) {
		VBox root = new VBox();
		root.setPadding(new Insets(5));
		root.setAlignment(Pos.CENTER_LEFT);
		root.setSpacing(10);
		Label label1 = new Label("list of the book");
		
		Label label2 = new Label("amount : " + Integer.toString(Nbook));
		
		root.getChildren().addAll(label1, book, label2);
		
		return root;
	}	
	
	private VBox createDvd(ComboBox dvd, int Ndvd) {
		VBox root = new VBox();
		root.setPadding(new Insets(5));
		root.setAlignment(Pos.CENTER_LEFT);
		root.setSpacing(10);
		Label label1 = new Label("list of the book");
		
		Label label2 = new Label("amount : " + Integer.toString(Ndvd));
		
		root.getChildren().addAll(label1, dvd, label2);
		
		return root;
		
	}

	public Button getSaveBtn() {
		return saveBtn;
	}

	public Button getBackBtn() {
		return backBtn;
	}

}
