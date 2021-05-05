package homeworkD4_2;

public class GameManager implements IGameService {
	
	public void gameInfo(Game game) {
		System.out.println(" \n --Oyun bigileri-- \n Oyunun ismi: " + game.getGameName() + "\n Oyunun net �creti: " + game.getGamePrice());
	}

	@Override
	public void buyGame(Game game, User user) {
		System.out.println(game.getGameName() + " oyunu sat�n al�nd�." + "Fatura bilgisi \n ------ \n Oyun �creti: " +
	                       game.getGamePrice() + "tl \n M��teri bilgisi: " + user.getFirstName() + " "+ user.getLastName());
	}

	@Override
	public void updateGame(Game game, SaleManager saleManager) {
		double afterPrice = saleManager.getAfterPrice();
		game.setGamePrice((int) afterPrice);
		
		System.out.println(game.getGameName() + " oyunu g�ncellemesi tamamland�. Yeni fiyat: " + game.getGamePrice());
	}

	@Override
	public void refundGame(Game game, User user) {
		System.out.println(game.getGameName() + " oyunu iadesi yap�ld�" + "�ade makbuzu \n ------ \n �ade �creti: " +
                game.getGamePrice() + "tl \n M��teri bilgisi: " + user.getFirstName() + " "+ user.getLastName());
	}

}
