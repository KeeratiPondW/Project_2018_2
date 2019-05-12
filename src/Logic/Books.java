package Logic;

import java.util.ArrayList;

public class Books extends Item implements Calculatable{
	
	private ArrayList<String> books;
	private ArrayList<String> loanedbooks;
	private double price;
	
	public Books() {
		books = new ArrayList<String>();
		loanedbooks = new ArrayList<String>();
		price = 0;
	}
	
	public void addloanedbooks(String book) {
		loanedbooks.add(book);
	}
	
	public void clearloanedbooks() {
		loanedbooks.clear();
	}

	@Override
	public double calculatePrice(String name) {
		// TODO Auto-generated method stub
		if(name.equals("Lord of the ring") ||
				name.equals("Harry Potter") ||
				name.equals("Twilight")) {
			price += 350;
		}else {
			price += 400;
		}
		return price;
	}

	@Override
	public double calculatedTotalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<String> getLoanedbooks() {
		return loanedbooks;
	}
	
	
}
