package lab1;

public class Triangle {
	public static String triangleKind(int a, int b, int c){
		if (a <= 0 && b <= 0 && c <= 0){
			return "Non-triangle";
		}
		if((a + b <= c)||(a + c <= b)||(b + c <= a)){
			return "Non-triangle";
		}
		if((a - b >= c)||(a - c >= b)||(b - c >= a)){
			return "Non-triangle";
		}
		if(a == b && b == c){
			return "equilateral"; 
		}else if((a == b)||(b == c)){
			return "isosceles";
		}
		return "scalene";
	}

	public static void mian(String args[]){
		Triangle triangle = new Triangle();
		
		System.out.print(triangle.triangleKind(3, 4, 5));
		System.out.print(triangle.triangleKind(6, 6, 6));
		System.out.print(triangle.triangleKind(7, 14, 3));
	}
}

