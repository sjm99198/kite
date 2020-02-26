package com.kite.mm.parts.domain;

public class SearchParam {

	private String searchtype;
	private String keyword;
	
	
	public String getSearchtype() {
		return searchtype;
	}
	public void setSearchtype(String searchtype) {
		this.searchtype = searchtype;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PartsListView [searchType=" + searchtype + ", keyword=" + keyword + ", totalPageCount="
				+"]";
	}
	
}
