package Main;

import java.io.FileNotFoundException;

import Logic.EventManager;
import Window.CustomerCodePage;
import Window.LoanPage;
import Window.LoginPage;
import Window.ReturnPage;
import Window.SecondPage;
import Window.SigninPage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class main extends Application {

	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {
		StackPane root = new StackPane();
		
		//Scene1
		LoginPage loginPage = new LoginPage();
		root.getChildren().add(loginPage);
//		
//		//Scene2
//		SecondPage secondPage = new SecondPage();
//		
//		//Scene signin
//		SigninPage signinPage = new SigninPage();
//		
//		//Scene3 loan
//	    LoanPage loanPage = new LoanPage();
//	    
//	    //Scene4 return
//		ReturnPage returnPage = new ReturnPage();
//		
//		//Scene5 customer
//		CustomerCodePage customerCodePage = new CustomerCodePage();
//		
//	    EventManager event = new EventManager(loginPage, secondPage, loanPage,
//	    		returnPage, signinPage, customerCodePage);
//	    
		
		Scene scene = new Scene(root,400,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Progmeth Project");
		primaryStage.setResizable(true);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
