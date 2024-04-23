package basicSyntax;


public class MethodPractice {

	 public static void main(String[] args) {
		 int a = 20;
         int b = 5;
        
         int sum = sumA(a,b);
         int sub = subB(a,b);
         int mul = mulC(a,b);
         int div = divD(a,b);

         int[] formulas = {sum,sub,mul,div};
         for(int formula: formulas) {
         formulaA(formula);
        
	 }
 }
        
     public static int sumA(int num1,int num2) {
    	 
    	 int sum = num1 + num2;
    	 return sum;
     }
     
     public static int subB(int num1,int num2) {
    	 
    	 int sub = num1 - num2;
    	 return sub;
     }
     
     public static int mulC(int num1,int num2) {
    	 
    	 int mul = num1 * num2;
    	 return mul;
     }
     public static int divD(int num1,int num2) {
    	 
    	 int div = num1 / num2;
    	 return div;
     }
     public static void  formulaA(int formula) {
    	 System.out.println("計算結果は"+formula+"です。");
    	 
     }
}

