package com.kite.mm.guest.domain;

public class WriteRequest {

	private int idx;
	private String type;
	private String name;
	private int price;

	
	
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "typeequest [idx=" + idx + ", type=" + type + ", name=" + name + ", price=" + price + "]";
	}

	
}
