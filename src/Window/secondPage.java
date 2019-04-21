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
	
    public SecondPage() throws FileNotFoundException {
    	
    	Image image = new Image(new FileInputStream("res\\images"));
    	ImageView imageView = new ImageView(image);
    	imageView.setFitHeight(50);
    	imageView.setFitWidth(50);
    	
    	returnBtn = new Button("RETURN");
    	loanBtn = new Button("HIRE");
    	
    	getChildren().addAll(imageView, loanBtn, returnBtn);
    	
    }

	public Button getReturnBtn() {
		return returnBtn;
	}

	public Button getLoanBtn() {
		return loanBtn;
	}
    
    
}
