package homeworkD4_1;

import java.rmi.RemoteException;

public interface ICustomerCheckService {
	
	 boolean IsRealPerson(Customer customer) throws RemoteException;
	
	/*public boolean IsRealPerson(Customer customer) {
		return true;
	}*/
		
}
