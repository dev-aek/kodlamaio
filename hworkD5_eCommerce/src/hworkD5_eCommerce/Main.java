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

		
		User user1 = new User("Abdullah Enes", "Kocabu�a", "enesrandom@hotmail.com","do�ru1"); //Do�ru bilgi - �ifre 6 karakter		
		User user2 = new User("Abdullah", "Kocabu�a", "enesrandom@gmail.com","artikDogruSifre"); //Do�ru bilgi		
		User user3 = new User("Aek", "Kocabu�a", "enes1random@hotmail.com","false"); //�ifreden dolay� kabul etmeyecek				
		User user4 = new User("Enes", "Kocabu�a", "enesrandom.com","yanl��MailT�r�");  //Mailden dolay� kabul etmeyecek	
		User user5 = new User("A Enes", "Kocabu�a", "enesrandom@gmail.com","yanl��MailT�r�");  //Mail daha �nce kullan�ld��� i�in hata veriyor.
		User user6 = new User("A", "Kocabu�a", "enesra54ndom@gmail.com","yanl��MailT�r�");  //isim tek karakter hata veriyor
		User user7 = new User("enes", "ko", "enesra45ndom@gmail.com","yanl��MailT�r�");  //soy issim en az 2 karakter hata vermiyor.


		
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
		
		userServise.login("enesrandom@hotmail.com", "do�ru1");
		userServise.login("enesrandom@gmail.com", "artikDogruSifre");
		userServise.login("enesrandom@gmail.com", "yanl��MailT�r�"); // user5 kay�d� ba�ar�s�z oldu�u i�in sistemde kabul etmiyor. 

		
		IUserServise userService2 = new UserManager(new JGoogleVerificationServiceAdapter(),new HibernateUserDao(), new ConfirmatoryEmailManager());
		// bu sayede ek olarak google gibi d�� servislerle de �al��abiliriz..
		System.out.println("\n**-----------**\n");

        System.out.println("Google d�� servisi ile kay�t alma!");
        
		System.out.println("\n**-----------**\n");


		userService2.register(user1);
	}

}
