package homeworkD4_1;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements ICustomerCheckService {

	@Override
	public boolean IsRealPerson(Customer customer) throws RemoteException {
		
		KPSPublicSoapProxy clientKpsPublicSoapProxy = new KPSPublicSoapProxy();
		return clientKpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId), 
				customer.firstName.toUpperCase(),customer.lastName.toUpperCase(), customer.dateOfBirth);
		
		
	}

}
