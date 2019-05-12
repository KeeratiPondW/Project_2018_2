package Window;

import Logic.Books;
import Logic.Dvds;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ReturnPage extends VBox{
	
	private Button saveBtn;
	private Button cancelBtn;
	
	public ReturnPage(Books book, Dvds dvd) {
		setAlignment(Pos.CENTER);
		setPadding(new Insets(5));
		setSpacing(10);
		
		saveBtn = new Button("Save");
		cancelBtn = new Button("Back");
		
		//combobox book
		ComboBox comboBook = new ComboBox();
		for(String b : book.getLoanedbooks()) {
			comboBook.getItems().add(b);
		}
		
		//combobox dvd
		ComboBox comboDvd = new ComboBox<>();
		for(String d: dvd.getLoanedDvds()) {
			comboDvd.getItems().add(d);
		}
		
		
		getChildren().addAll(createBook(comboBook, book.getLoanedbooks().size()),
				createDvd(comboDvd, dvd.getLoanedDvds().size()), saveBtn, cancelBtn);
		
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

	public Button getCancelBtn() {
		return cancelBtn;
	}

}
