package part2And3;

import java.util.List;

public class Category {
  private int catid;
  private String catname;
  
  public Category(int catid, String catname) {
	super();
	this.catid = catid;
	this.catname = catname;
  }

public int getCatid() {
	return catid;
}

public void setCatid(int catid) {
	this.catid = catid;
}

public String getCatname() {
	return catname;
}

public void setCatname(String catname) {
	this.catname = catname;
}

@Override
public String toString() {
	return "Category [catid=" + catid + ", catname=" + catname + "]";
}
  
  
}
