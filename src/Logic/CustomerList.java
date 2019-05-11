package Logic;

import java.util.ArrayList;

public class CustomerList {
	
	private ArrayList<String> customers = new ArrayList<>();
	
	public CustomerList() {
		
	}
	
	public void addData(String code) {
		customers.add(code);
	}
	
	public void deleteData(String code) {
		for(int i=0 ; i< customers.size() ; ++i) {
			if(code.equals(customers.get(i))) {
				customers.remove(i);
			}
		}
	}

	public ArrayList<String> getCustomers() {
		return customers;
	}



	
	

}
