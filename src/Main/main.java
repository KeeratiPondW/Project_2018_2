package Main;

import java.io.FileNotFoundException;

import Logic.Books;
import Logic.CustomerList;
import Logic.Dvds;
import Logic.EventManager;
import Window.CustomerCodePage;
import Window.LoanPage;
import Window.LoginPage;
import Window.ReturnPage;
import Window.SecondPage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class main extends Application {

	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {
		StackPane root = new StackPane();

		//
		Books book = new Books();
		Dvds dvd = new Dvds();
		CustomerList customer = new CustomerList();

		// Scene1
		LoginPage loginPage = new LoginPage();
		root.getChildren().add(loginPage);
		Scene scene1 = new Scene(root, 400, 400);

		// Scene2
		SecondPage secondPage = new SecondPage();
		Scene scene2 = new Scene(secondPage, 400, 400);

		// Scene3 loan
		LoanPage loanPage = new LoanPage(book, dvd);
		Scene scene3 = new Scene(loanPage, 800, 400);

		// Scene4 return
		ReturnPage returnPage = new ReturnPage(book, dvd);
		Scene scene4 = new Scene(returnPage, 400, 400);

		// Scene5 customer
		CustomerCodePage customerCodePage = new CustomerCodePage();
		Scene scene5 = new Scene(customerCodePage, 400, 400);

		EventManager event = new EventManager(
//				loginPage, secondPage, loanPage, customerCodePage, returnPage,
				customer);
//		event.loginButton(loginPage.getLoginBtn(), primaryStage, scene2, loginPage.getText().getTextField(), loginPage.getPassword().getPasswordField());
		event.loginButton(loginPage.getLoginBtn(), primaryStage, scene2, "t", "t");
		event.loanButton(secondPage.getLoanBtn(), primaryStage, scene3);
		event.returnButton(secondPage.getReturnBtn(), primaryStage, scene5);
		event.logoutButton(secondPage.getLogoutBtn(), primaryStage, scene1);
		event.addBooksButton(loanPage.getAddBook());
		event.addDvdsButton(loanPage.getAddDvd());
		event.calculatedButton(loanPage.getCalculateBtn());
		event.cancelButton(loanPage.getCancelBtn(), primaryStage, scene2);
		event.okButton(loanPage.getOkBtn(), primaryStage, scene2);
		event.nextButton(customerCodePage.getNextBtn(), primaryStage, scene4, customerCodePage.getText());
		event.backButton(customerCodePage.getBackBtn(), primaryStage, scene2);
		event.saveButton(returnPage.getSaveBtn(), primaryStage, scene2, customerCodePage.getText());
		event.cancellButton(returnPage.getCancelBtn(), primaryStage, scene2);

		primaryStage.setScene(scene1);
		primaryStage.setTitle("Progmeth Project");
		primaryStage.setResizable(true);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
