package Logic;

import Window.CustomerCodePage;
import Window.LoanPage;
import Window.LoginPage;
import Window.ReturnPage;
import Window.SecondPage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EventManager {

//	private LoginPage loginPage;
//	private SecondPage secondPage;
//	private LoanPage loanPage;
//	private CustomerCodePage customerCodePage;
//	private ReturnPage returnPage;
	private CustomerList customerList;

	public EventManager(
//			LoginPage loginPage, SecondPage secondPage, LoanPage loanPage,
//			CustomerCodePage customerCodePage, ReturnPage returnPage,
			CustomerList customerList) {
//		this.loginPage = loginPage;
//		this.secondPage = secondPage;
//		this.loanPage = loanPage;
//		this.customerCodePage = customerCodePage;
//		this.returnPage = returnPage;
		this.customerList = customerList;
	}

	// loginPage
	public void loginButton(Button b, Stage stage, Scene scene, String username, String password) {
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println(username.length() + 1);
				if (username.equals("t") && password.equals("t")) {
					stage.setScene(scene);
				} else {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setContentText("Incorrect username or password");
					alert.showAndWait();
					
				}
			}
		});
	}

	// SecondPage
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

	// LoanPage
	public void addBooksButton(Button b) {
		b.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

	public void addDvdsButton(Button b) {
		b.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

	public void calculatedButton(Button b) {
		b.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

	public void cancelButton(Button b, Stage stage, Scene scene) {
		b.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				stage.setScene(scene);
			}
		});
	}

	public void okButton(Button b, Stage stage, Scene scene) {
		b.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				stage.setScene(scene);
			}
		});
	}

	// customerCodePage
	public void nextButton(Button b, Stage stage, Scene scene, String code) {
		b.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				boolean found = false;
				for (int i = 0; i < customerList.getCustomers().size(); ++i) {
					if(code.equals(customerList.getCustomers().get(i))) {
						found = true;
						stage.setScene(scene);
					}
				}
				if(!found) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setContentText("Not found this code");
					alert.showAndWait();
				}
				
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
	
	//ReturnPage 
	public void saveButton(Button b, Stage stage, Scene scene, String code) {
		b.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				customerList.deleteData(code);
				stage.setScene(scene);
			}
		});
	}
	
	public void cancellButton(Button b, Stage stage, Scene scene) {
		b.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				stage.setScene(scene);
			}
		});
	}

}
