package homeworkD4_1;

import java.rmi.RemoteException;

public class Test {

	public static void main(String[] args) throws RemoteException {
		
		
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdaptor());
		customerManager.Save(new Customer(19,"Abdullah Enes","Kocabu�a",2001,"455646456")); //Yanl�s TC 
		System.out.println("Sturbucks System \n --------");
		

	}
}
