package homeworkD4_1;

import java.rmi.RemoteException;

public class NeroCustomerManager extends BaseCustomerManager{
	
	public class StarbucksCustomerManager extends BaseCustomerManager {

		@Override
		public void Save(Customer customer) throws RemoteException {
			CheckIfRealPerson(customer);
			super.Save(customer);
		}

		private void CheckIfRealPerson(Customer customer) {
			
		}

		

	}
	
	

}
