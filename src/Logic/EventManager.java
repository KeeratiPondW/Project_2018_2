package Logic;

import Window.CustomerCodePage;
import Window.LoanPage;
import Window.LoginPage;
import Window.ReturnPage;
import Window.SecondPage;
import Window.SigninPage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EventManager {

	private LoginPage loginPage;
	private SecondPage secondPage;
	private LoanPage loanPage;
	private ReturnPage returnPage;
    private SigninPage signinPage;
    private CustomerCodePage customerCodePage;
    
	public EventManager(LoginPage loginPage, SecondPage secondPage, 
			LoanPage loanPage, ReturnPage returnPage, SigninPage signinPage,
			CustomerCodePage customerCodePage) {
		this.loginPage = loginPage;
		this.secondPage = secondPage;
		this.loanPage = loanPage;
		this.returnPage = returnPage;
		this.signinPage = signinPage;
		this.customerCodePage = customerCodePage;
	} 
	
	public void loginButton(Button b, Stage stage, Scene scene) {
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				stage.setScene(scene);
			}
		});
	}
	
	public void signinButton(Button b, Stage stage, Scene scene) {
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				stage.setScene(scene);
			}
		});
	}
	
	public void loanButton(Button b, Stage stage, Scene scene) {
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				stage.setScene(scene);
			}
		});
	}
	
	public void returnButton(Button b, Stage stage, Scene scene) {
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				stage.setScene(scene);
			}
		});
	}
	
	public void logoutButton(Button b, Stage stage, Scene scene) {
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				stage.setScene(scene);
			}
		});
	}
	
	public void saveButton(Button b, Stage stage, Scene scene) {
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				stage.setScene(scene);
			}
		});
	}
	
	public void backButton(Button b, Stage stage, Scene scene) {
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				stage.setScene(scene);
			}
		});
	}
	
	

}
