package homeworkD4_2;

public class CampaignManager implements ICampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		
		System.out.println(campaign.getCampaingName() + " %" + campaign.getDiscountRate()+ " indirim oraný tanýmlandý");
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaingName() + " %" + campaign.getDiscountRate()+ " indirim silindi");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaingName() + " %" + campaign.getDiscountRate()+ " indirim oraný güncellendi");
		
	}

}
