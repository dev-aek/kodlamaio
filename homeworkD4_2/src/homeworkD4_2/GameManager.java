package homeworkD4_2;

public class GameManager implements IGameService {
	
	public void gameInfo(Game game) {
		System.out.println(" \n --Oyun bigileri-- \n Oyunun ismi: " + game.getGameName() + "\n Oyunun net ücreti: " + game.getGamePrice());
	}

	@Override
	public void buyGame(Game game, User user) {
		System.out.println(game.getGameName() + " oyunu satýn alýndý." + "Fatura bilgisi \n ------ \n Oyun ücreti: " +
	                       game.getGamePrice() + "tl \n Müþteri bilgisi: " + user.getFirstName() + " "+ user.getLastName());
	}

	@Override
	public void updateGame(Game game, SaleManager saleManager) {
		double afterPrice = saleManager.getAfterPrice();
		game.setGamePrice((int) afterPrice);
		
		System.out.println(game.getGameName() + " oyunu güncellemesi tamamlandý. Yeni fiyat: " + game.getGamePrice());
	}

	@Override
	public void refundGame(Game game, User user) {
		System.out.println(game.getGameName() + " oyunu iadesi yapýldý" + "Ýade makbuzu \n ------ \n Ýade ücreti: " +
                game.getGamePrice() + "tl \n Müþteri bilgisi: " + user.getFirstName() + " "+ user.getLastName());
	}

}
