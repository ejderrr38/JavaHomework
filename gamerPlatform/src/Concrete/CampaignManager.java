package Concrete;

import Abstract.CampaingService;
import Entities.Campaign;

public class CampaignManager implements CampaingService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " isimli kampanya %" + campaign.getDisCount() + " indirimli kampanya  eklenmi�tir!");
	}

	@Override
	public void removeCampaign(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " isimli kampanyam�z silinmi�tir.");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " isimli kampanyam�z g�ncellenmi�tir." ); 
	}

}
