package objectPractice;

public class Property {

	private String propertyname;
	private String name;
	private String kinds;
	private int price;
	
	Property(String propertyname, String name, String kinds, int price){
		this.propertyname = propertyname;
		this.name = name;
		this.kinds = kinds;
		this.price = price;
	}
	
	
	public void information() {
		System.out.println("物件名：" + this.propertyname);
		System.out.println("物件所有者名：" + this.name);
		System.out.println("物件種別：" + this.kinds);
		System.out.println("物件価格：" + this.price + "円");
	}
	public void frame() {
		System.out.println("=============================");
	}
	//ゲッター
	public String getpropertyname() {
	    return this.propertyname;
	}
	public String getname() {
	    return this.name;
	}
	public String getkinds() {
	    return this.kinds;
	}
	public int getprice() {
	    return this.price;
	}
	// セッター
	public void setpropertyname(String propertyname) {
	    this.propertyname = propertyname;
	}
	public void setname(String name) {
	    this.name = name;
	}
	public void setkinds(String kinds) {
	    this.kinds = kinds;
	}
	public void setprice(int price) {
	    this.price = price;
	}
}
