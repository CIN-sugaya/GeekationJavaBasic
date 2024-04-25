package objectPractice;

public class Land extends Property {
	private double breadth;
	
	Land(String propertyname, String name, String kinds, int price, double breadth){
		super(propertyname, name, kinds, price);
		this.breadth = breadth;
	}
	// LandクラスでPropertyクラスのinformationメソッドを上書きします。
	public void information() {
			  
			  // jobフィールドを使って、出力処理を追加する
		super.information();
		System.out.println("広さ：" + this.breadth + "㎡");	  
	}
	
	//ゲッター
	public double getbreadth() {
	    return this.breadth;
			}
	// セッター
	public void setbreadth(double breadth) {
	    this.breadth = breadth;
			}
}	