package homeworkD4_2;

public class Test {

	public static void main(String[] args) {

		User user1 = new User(0, "Abdullah Enes", "Kocabuða", 2001, "789456123", "userEnes", "enesPassword");
		User user2 = new User(0, "Enes", "Kocabuða", 2001, "1234516", "userEnes", "enesPassword");

		
		Game game1 = new Game(87478, "The Witcher3", 50);
		Game game2 = new Game(4568, "Pubg", 80);
		
		Campaign campaign1 = new Campaign(1, "Arkadaþ davet indirimi", 20);
		Campaign campaign2 = new Campaign(1, "Yaz indirimleri", 30);
		
		System.out.println("TRTeam Satýþ Maðazasýna hoþgeldiniz. \n");
		
		UserManager userManager = new UserManager(new MernisManager());
		SaleManager sale1 = new SaleManager();
		SaleManager sale2 = new SaleManager();

		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		
		
		userManager.addUser(user1);
		userManager.addUser(user2);

		
		System.out.println(" \n------ Loading ------ \n");

		gameManager.gameInfo(game1);
		gameManager.gameInfo(game2);
		
		System.out.println(" \n------ Loading ------ \n");

		
		campaignManager.addCampaign(campaign1);
		campaignManager.addCampaign(campaign2);
		
		System.out.println(" \n------ Loading ------ \n");

		
		sale2.sale(game2, campaign2);
		sale1.sale(game1, campaign1);
		System.out.println(" \n------ Loading ------ \n");

		gameManager.updateGame(game2, sale2);
		gameManager.updateGame(game1, sale1);

		
		System.out.println(" \n------ Loading ------ \n");

		gameManager.gameInfo(game1);
		gameManager.gameInfo(game2);
		
		System.out.println(" \n------ Loading ------ \n");

		gameManager.buyGame(game2, user1);
		gameManager.buyGame(game1, user2);
		
		
		System.out.println(" \n------ Loading ------ \n");

		gameManager.refundGame(game2, user1);
		gameManager.refundGame(game1, user2);
		
		System.out.println(" \n------ Loading ------ \n");

		campaignManager.deleteCampaign(campaign1);
		campaignManager.deleteCampaign(campaign2);
		
		System.out.println(" \n------ Loading ------ \n");

		userManager.deleteUser(user1);
		userManager.deleteUser(user2);
	}

}
