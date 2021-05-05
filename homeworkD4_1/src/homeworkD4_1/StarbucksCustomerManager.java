package homeworkD4_1;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager  {

	private ICustomerCheckService customerService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerService) {
		this.customerService = customerService;
	}

	@Override
	public void Save(Customer customer) throws RemoteException {
		
		if (customerService.IsRealPerson(customer)) {
			
			super.Save(customer);
			
		}
		else {
			System.out.println("Not a valid person");	
		}
		
}


}
