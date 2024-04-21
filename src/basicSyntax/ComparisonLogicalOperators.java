package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		boolean isLessA = (a > b);
		
		System.out.println(isLessA);
		
		boolean isSunny= true;
		boolean isWarm = true;
		
		boolean isGoout = (isSunny && isWarm);
		
		System.out.println(isGoout);
		
		int x = 1;
		int y = 2;
		boolean andResul = (x > 0 && y % 2 == 0);
		
		System.out.println(andResul);
		
		boolean hasPeermission = false;
		
		boolean noPeermission = (hasPeermission == false);
		
		System.out.println(noPeermission);
		
		
				

	}

}
