package hworkD5_eCommerce.core;

import java.util.regex.Pattern;

import hworkD5_eCommerce.entities.concretes.User;

public class VerificationManager implements IVerificationService  {

	

	public boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern patt = Pattern.compile(emailRegex);
        //email yerine emailRexez olabilir
        if (email == null)
            return false;
        return patt.matcher(email).matches();
    }


    public boolean isValidPassword(String password) {
        if (password == null || password.length() < 6) {
            return false;
        }

        return true;
    }


    public boolean isValidString(String name) {

        if (name == null || name.length() < 2) {
            return false;
        }
        for (char harf : name.toCharArray()) {
            if (Character.isDigit(harf)) {
                return false;
            }
        }
        return true;
    }


    @Override
    public boolean isValid(User user) {
         	
    	if(!isValidEmail(user.getEmail())){
            System.out.println("Email geçersiz. Geçerli bir email adresi girin");
            return false;

        }

        if(!isValidString(user.getFirstName())){
            System.out.println("Ýsminiz en az 2 karaktere sahip olmalý.");
            return false;

        }
        if(!isValidString(user.getLastName())){
            System.out.println("Soyadýnýz en az 2 karaktere sahip olmalý..");
            return false;

        }
        if(!isValidPassword(user.getPassword())){
            System.out.println("Parola en az 6 karakterden oluþmalýdýr.");
            return false;

        }return true;

    }


}
