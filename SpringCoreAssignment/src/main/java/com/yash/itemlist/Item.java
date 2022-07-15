package com.yash.itemlist;

public class Item {
	
	private int iId;
	private String itemName;
	public int getItemId() {
		return  iId;
	}
	public void setItemId(int iId) {
		this.iId = iId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + iId + ", itemName=" + itemName + "]";
	}
	

}
