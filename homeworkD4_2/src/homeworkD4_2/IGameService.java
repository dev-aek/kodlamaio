package homeworkD4_2;

public interface IGameService {
	
	void buyGame(Game game, User user);
	void updateGame(Game game, SaleManager saleManager);
	void refundGame(Game game, User user);

}
