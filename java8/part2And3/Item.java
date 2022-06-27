package part2And3;

import java.time.LocalDate;

public class Item {
  private int itemid;	
  private String name;
  private int price;
  private LocalDate dateOfManufacturing;
  private LocalDate dateOfExpiring;
  private String itemDesc;
  private Category category;
@Override
public String toString() {
	return "Item [itemid=" + itemid + ", name=" + name + ", price=" + price + ", dateOfManufacturing="
			+ dateOfManufacturing + ", dateOfExpiring=" + dateOfExpiring + ", itemDesc=" + itemDesc + ", category="
			+ category + "]";
}
public int getItemid() {
	return itemid;
}
public void setItemid(int itemid) {
	this.itemid = itemid;
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
public LocalDate getDateOfManufacturing() {
	return dateOfManufacturing;
}
public void setDateOfManufacturing(LocalDate dateOfManufacturing) {
	this.dateOfManufacturing = dateOfManufacturing;
}
public LocalDate getDateOfExpiring() {
	return dateOfExpiring;
}
public void setDateOfExpiring(LocalDate dateOfExpiring) {
	this.dateOfExpiring = dateOfExpiring;
}
public String getItemDesc() {
	return itemDesc;
}
public void setItemDesc(String itemDesc) {
	this.itemDesc = itemDesc;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public Item(int itemid, String name, int price, LocalDate dateOfManufacturing, LocalDate dateOfExpiring,
		String itemDesc, Category category) {
	super();
	this.itemid = itemid;
	this.name = name;
	this.price = price;
	this.dateOfManufacturing = dateOfManufacturing;
	this.dateOfExpiring = dateOfExpiring;
	this.itemDesc = itemDesc;
	this.category = category;
}
 

  
}
