package hworkD5_eCommerce;

import hworkD5_eCommerce.business.abstracts.IUserServise;
import hworkD5_eCommerce.business.concretes.UserManager;
import hworkD5_eCommerce.core.ConfirmatoryEmailManager;
import hworkD5_eCommerce.core.JGoogleVerificationServiceAdapter;
import hworkD5_eCommerce.core.VerificationManager;
import hworkD5_eCommerce.dataAccess.concretes.HibernateUserDao;
import hworkD5_eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		
		User user1 = new User("Abdullah Enes", "Kocabuða", "enesrandom@hotmail.com","doðru1"); //Doðru bilgi - þifre 6 karakter		
		User user2 = new User("Abdullah", "Kocabuða", "enesrandom@gmail.com","artikDogruSifre"); //Doðru bilgi		
		User user3 = new User("Aek", "Kocabuða", "enes1random@hotmail.com","false"); //Þifreden dolayý kabul etmeyecek				
		User user4 = new User("Enes", "Kocabuða", "enesrandom.com","yanlýþMailTürü");  //Mailden dolayý kabul etmeyecek	
		User user5 = new User("A Enes", "Kocabuða", "enesrandom@gmail.com","yanlýþMailTürü");  //Mail daha önce kullanýldýðý için hata veriyor.
		User user6 = new User("A", "Kocabuða", "enesra54ndom@gmail.com","yanlýþMailTürü");  //isim tek karakter hata veriyor
		User user7 = new User("enes", "ko", "enesra45ndom@gmail.com","yanlýþMailTürü");  //soy issim en az 2 karakter hata vermiyor.


		
		IUserServise userServise = new UserManager(new VerificationManager(),new HibernateUserDao(), new ConfirmatoryEmailManager());
		
		userServise.register(user1);
		System.out.println("\n**-----------**\n");
		
		userServise.register(user2);
		System.out.println("\n**-----------**\n");
		
		userServise.register(user3);
		System.out.println("\n**-----------**\n");
		
		userServise.register(user4);
		System.out.println("\n**-----------**\n");
		
		userServise.register(user5);
		System.out.println("\n**-----------**\n");
		
		userServise.register(user6);
		System.out.println("\n**-----------**\n");
		
		userServise.register(user7);
		System.out.println("\n**-----------**\n");
		
		userServise.login("enesrandom@hotmail.com", "doðru1");
		userServise.login("enesrandom@gmail.com", "artikDogruSifre");
		userServise.login("enesrandom@gmail.com", "yanlýþMailTürü"); // user5 kayýdý baþarýsýz olduðu için sistemde kabul etmiyor. 

		
		IUserServise userService2 = new UserManager(new JGoogleVerificationServiceAdapter(),new HibernateUserDao(), new ConfirmatoryEmailManager());
		// bu sayede ek olarak google gibi dýþ servislerle de çalýþabiliriz..
		System.out.println("\n**-----------**\n");

        System.out.println("Google dýþ servisi ile kayýt alma!");
        
		System.out.println("\n**-----------**\n");


		userService2.register(user1);
	}

}
