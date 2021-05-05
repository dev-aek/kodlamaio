package homeworkD4_2;

public class Campaign {
	
	private int id;
	private String campaingName;
	private int discountRate;
	
	public Campaign(int id, String campaingName, int discountRate) {
		super();
		this.id = id;
		this.campaingName = campaingName;
		this.discountRate = discountRate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaingName() {
		return campaingName;
	}
	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
}
