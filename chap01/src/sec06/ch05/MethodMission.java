package sec06.ch05;

public class MethodMission {

	public static void main(String[] args) {
		
	 whoIsBig(10, 30); //이때는 콘솔에 > 30이 가장큽니다 출력
	 whoIsBig(10, 9); // 콘솔 > 10이 가장 큽니다
	 whoIsBig(11, 25); // 콘솔 > 25이 가장큽니다
	 
	 int big = getBigNum(10, 30);
	 System.out.println("big : " + big); //big : 30
	 
	 
	 big = getBigNum(10, 9);
	 System.out.println("big : " + big); //big : 10
	 
	 int a=5;
	 int b=3;
	 
	 int small = small1(a, b);
	 System.out.println("small : " + small);

	}
	
	
	
	
	
	
	public static void whoIsBig(int n1, int n2) {
		int big = n1;
		if(n1 < n2) {
			big = n2;
		}
		System.out.printf("%d이 가장큽니다\n", big);
		
	}
	
	public static int getBigNum(int n1, int n2) {
		if(n1 > n2) {
			return n1;
		}
		return n2;
	}
	
	public static int small1(int n1, int n2) {
		if(n1 > n2) {
			return n2;
		}
		return n1;
	}
	
	
	
	
}
