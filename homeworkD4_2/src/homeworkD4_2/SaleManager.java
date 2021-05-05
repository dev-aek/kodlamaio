package homeworkD4_2;

public class SaleManager {
	
	double afterPrice;
	public void sale(Game game,Campaign campaign) {
		
		afterPrice=game.getGamePrice()-(game.getGamePrice()*campaign.getDiscountRate()/100);
		System.out.println(game.getGameName() +" oyununun "+ campaign.getCampaingName() +" sonucu indirimli fiyatý: "+afterPrice);
		
	}
	public double getAfterPrice() {
		return afterPrice;
	}
	public void setAfterPrice(double afterPrice) {
		this.afterPrice = afterPrice;
	}

}
