package br.com.erudio;

public class ShopKeeper {
	
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop xiaomi;

	public ShopKeeper() {
		iphone = new Iphone();
		samsung = new Samsung();
		xiaomi = new Xiaomi();
	}

	public void iphoneSale() {
		iphone.modelNo();
		iphone.price();
	}

	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}

	public void xiaomiSale() {
		xiaomi.modelNo();
		xiaomi.price();
	}
}