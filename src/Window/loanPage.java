package Window;


import Logic.Books;
import Logic.Dvds;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class LoanPage extends HBox{
	
	private ComboBox books;
	private ComboBox Dvds;
	private Button calculateBtn;
	private Button cancelBtn;
	private Button addBook;
	private Button addDvd;
	private Button okBtn;
	private ObservableList<Label> dataList = FXCollections.observableArrayList();
	private ListView<Label> listView;
	private int count = 1;
	
	public LoanPage(Books b, Dvds d) {
		setAlignment(Pos.CENTER);
		setPadding(new Insets(5));
		setSpacing(10);
		
		getChildren().addAll(createdLeftPage(),
				createdRightPage(b.calculatedTotalPrice() + d.calculatedTotalPrice()));
		
	}
	
	private VBox createdBooks() {
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(5));
		root.setSpacing(10);
		
		Label label1 = new Label("Choose the book");
		
		ObservableList<String> options = FXCollections.observableArrayList(
				"Lord of the ring", "Harry Potter", "Twilight",
				"Game of Throne", "Hunger Game", "Arabian Night");
		books = new ComboBox<>(options);
		
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.setPadding(new Insets(5));
		hbox.setSpacing(10);
		Label label2 = new Label("amount");
		TextField text = new TextField();
		text.setPromptText("Fill the Number");
		hbox.getChildren().addAll(label2, text);
		
		addBook = new Button("add");
		
		root.getChildren().addAll(label1, books, hbox, addBook);
		
		return root;
	}
	
	private VBox createdDvds() {
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(5));
		root.setSpacing(10);
		
		Label label1 = new Label("Choose the DVD");
		
		ObservableList<String> options = FXCollections.observableArrayList(
				"Lady Bird", "The Wizard of Oz", "Citizen Kane",
				"Get Out", "BlackkKlansman", "The Third Man");
		Dvds = new ComboBox<>(options);
		
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.setPadding(new Insets(5));
		hbox.setSpacing(10);
		Label label2 = new Label("amount");
		TextField text = new TextField();
		text.setPromptText("Fill the Number");
		hbox.getChildren().addAll(label2, text);
		
		addDvd = new Button("add");
		
		root.getChildren().addAll(label1, Dvds, hbox, addDvd);
		
		return root;
	}
	
	private VBox createdLeftPage() {
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(5));
		root.setSpacing(10);
		
		calculateBtn = new Button("Calculate");
		cancelBtn = new Button("Cancel");
		
		root.getChildren().addAll(createdBooks(), createdDvds(), calculateBtn, cancelBtn);
		
		return root;
	}
	
	private VBox createdRightPage(double price) { 
		VBox root = new VBox();
		root.setSpacing(10);
		root.setPadding(new Insets(5));
		root.setAlignment(Pos.CENTER);
		StackPane s = new StackPane();
		s.setBorder(new Border(new BorderStroke(Color.BLUE,  BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		listView = new ListView<>(dataList);
		listView.setPrefWidth(250);
		listView.setFocusTraversable(true);
		listView.setBackground(new Background(new BackgroundFill(Color.IVORY, null, null)));
		listView.setPlaceholder(new Label(""));
		s.getChildren().add(listView);
		
		Label label = new Label("total price : " + price);
		okBtn = new Button("OK");
		
		root.getChildren().addAll(s, label, okBtn);
		return root;
	}
	
	public void addData(String name, int number) {
		Label label = new Label(count++ + " : " + name + "  " + number + " .");
		dataList.add(label);
		listView.scrollTo(label);
	}
	
	public void clearData() {
		dataList.clear();
		count = 1;
	}

	public Button getCalculateBtn() {
		return calculateBtn;
	}

	public Button getCancelBtn() {
		return cancelBtn;
	}

	public Button getAddBook() {
		return addBook;
	}

	public Button getAddDvd() {
		return addDvd;
	}
	
	public Button getOkBtn() {
		return okBtn;
	}
	

	

}
