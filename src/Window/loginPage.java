package Window;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class LoginPage extends VBox {

	private Button loginBtn;
	private TextInput text;
	private PasswordInput password;

	public LoginPage() throws FileNotFoundException {
		setAlignment(Pos.CENTER);
		setPadding(new Insets(5));
		setSpacing(20);

		Image image = new Image(new FileInputStream("res\\image\\Dogs.jpg"));
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(55);
		imageView.setFitWidth(50);

		loginBtn = new Button("Log IN");

		text = new TextInput("Username", "Fill your username");
		password = new PasswordInput("Password", "Fill yout password");

		getChildren().addAll(imageView, text, password, loginBtn);

	}

	public Button getLoginBtn() {
		return loginBtn;
	}
	
	public TextInput getText() {
		return text;
	}
	
	public PasswordInput getPassword() {
		return password;
	}

}
