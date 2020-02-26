package com.kite.mm.guest.domain;

import java.sql.Date;

public class gArticleVo {

	private int idx;
	private String type;
	private String assembleno;
	private int price;
	/**
	 * @return the idx
	 */
	public int getIdx() {
		return idx;
	}
	/**
	 * @param idx the idx to set
	 */
	public void setIdx(int idx) {
		this.idx = idx;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the assembleno
	 */
	public String getAssembleno() {
		return assembleno;
	}
	/**
	 * @param assembleno the assembleno to set
	 */
	public void setAssembleno(String assembleno) {
		this.assembleno = assembleno;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "GuestArticleVo [idx=" + idx + ", type=" + type + ", assembleno=" + assembleno + ", price=" + price
				+  "]";
	}
	
	
	
	
	
	
	
	
}
