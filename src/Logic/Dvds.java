package Logic;

import java.util.ArrayList;

public class Dvds extends Item implements Calculatable{
	
	private ArrayList<String> dvds ;
	private ArrayList<String> loanedDvds;
	private double price;
	
	public Dvds() {
		dvds = new ArrayList<>();
		loanedDvds = new ArrayList<>();
	}
	
	public void addloanedDvds(String name) {
		loanedDvds.add(name);
	}
	
	public void clearloanedDvds() {
		loanedDvds.clear();
	}

	@Override
	public double calculatePrice(String name) {
		// TODO Auto-generated method stub
		if(name.equals("Lady Bird") || 
				name.equals("The Wizard of Oz") ||
				name.equals("Citizen Kane")) {
			price += 200;
		}else {
			price += 250;
		}
		return price;
	}

	@Override
	public double calculatedTotalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	"Lady Bird", "The Wizard of Oz", "Citizen Kane",
//	"Get Out", "BlackkKlansman", "The Third Man"



}
