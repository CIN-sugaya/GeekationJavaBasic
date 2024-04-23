package objectPractice;

public class Apartment extends Property {
	private String floorplan;
	
	Apartment(String propertyname, String name, String kinds, int price, String floorplan){
		super(propertyname, name, kinds, price);
		this.floorplan = floorplan;
	}
	// ApartmentクラスでPropertyクラスのinformationメソッドを上書きします。
	public void information() {
		  
		  // jobフィールドを使って、出力処理を追加する
		super.information();
	    System.out.println("間取り：" + this.floorplan);	  
	  }
	
	//ゲッター
	public String getfloorplan() {
	    return this.floorplan;
		}
	// セッター
	public void setfloorplan(String floorplan) {
	    this.floorplan = floorplan;
		}
}	