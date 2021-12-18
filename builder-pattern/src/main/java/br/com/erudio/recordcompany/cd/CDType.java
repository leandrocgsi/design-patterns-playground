package br.com.erudio.recordcompany.cd;

import java.util.ArrayList;
import java.util.List;

import br.com.erudio.recordcompany.Packing;

public class CDType {

	private List<Packing> items = new ArrayList<Packing>();

	public void addItem(Packing packs) {
		items.add(packs);
	}

	public void getCost() {
		for (Packing packs : items) {
			packs.price();
		}
	}

	public void showItems() {
		for (Packing packing : items) {
			System.out.print("CD name : " + packing.pack());
			System.out.println(", Price : " + packing.price());
		}
	}
}
