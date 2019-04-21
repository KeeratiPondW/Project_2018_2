package Window;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class SecondPage extends VBox{
	
	private Button returnBtn;
	private Button loanBtn;
	private Button logoutBtn;
	
    public SecondPage() throws FileNotFoundException {
    	
    	Image image = new Image(new FileInputStream("res\\images"));
    	ImageView imageView = new ImageView(image);
    	imageView.setFitHeight(50);
    	imageView.setFitWidth(50);
    	
    	returnBtn = new Button("RETURN");
    	loanBtn = new Button("HIRE");
    	logoutBtn = new Button("LOGOUT");
    	
    	getChildren().addAll(imageView, loanBtn, returnBtn, logoutBtn);
    	
    }

	public Button getReturnBtn() {
		return returnBtn;
	}

	public Button getLoanBtn() {
		return loanBtn;
	}
    
    
}
