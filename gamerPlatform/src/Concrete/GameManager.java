package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService{

	
	@Override
	public void sellGame(Gamer gamer, Game game,Campaign campaign) {
			System.out.println(gamer.getFirstName() + " isimli gamer" +" " + game.getGameName() + " isimli oyunun fiyat�"+  " " 
					+ game.getPrice() + " Tl iken " + campaign.getCampaignName() + " kampanyas� ile %" +
					campaign.getDisCount() + " indirim tutar� ile" + game.getPriceAfterDiscount(campaign) + "TL'ye oyun sat�n al�nm��t�r.Ba�ar�lar...");
			
		
	}

	@Override
	public void sellGame(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " isimli gamer" +" " + game.getGameName() + " oyunu"+ " " 
				+ game.getPrice() +  " Tl' ye sat�n al�nm��t�r.iyi oyunlar");

		
	}

}
