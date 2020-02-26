package com.kite.mm.parts.domain;

public class WriteRequest {

	private int idx;
	private String type;
	private String title;
	private String content;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "WriteRequest [idx=" + idx + ", type=" + type + ", title=" + title + ", content=" + content +", price=" + price + "]";
	}

	
}
