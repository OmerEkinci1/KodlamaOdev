package Concrete;

import java.util.ArrayList;
import java.util.List;

import Abstract.SellService;
import Entities.Sell;

public class SellManager implements SellService {
	
	List<Sell> gameSales = new ArrayList<Sell>();
	
	public SellManager() {}

	
	@Override
	public void add(Sell sell) {
		this.gameSales.add(sell);
		System.out.println(sell.getPrice() + " Its done!");
	}
	
	public void add(Sell sell,double discountRate) {
		
		double discountPrice = sell.getPrice()-(sell.getPrice()*(discountRate/100));
		Sell newGameSale=new Sell(sell.getId(), sell.getUserId(), sell.getGameId(), discountPrice);
		this.gameSales.add(newGameSale);
		System.out.println(sell.getPrice() + " Discount " + newGameSale.getPrice() + " It's done with this price.!");
	}

	@Override
	public void getAll() {
		for (Sell sell : sells) {
			System.out.println(sell.getGameId() + " Game " + sell.getUserId() + " to user "  + sell.getPrice() + " cannot sell this count.");
		}
		
	}


	public void getall() {
		// TODO Auto-generated method stub
		
	}
}
