package homeworkD4_1;

import java.rmi.RemoteException;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void Save(Customer customer) throws RemoteException {

		System.out.println("Saved to db : " + customer.firstName);
	}
	

}
