package sec06.ch06;

public class InstanceExam4 {
	public static void main(String[] args) {
		//Car 객체화 2개
		//첫번째 차는 name은 "소나타", cc는 2000
		//두번째 차는 name은 "911", cc는 5000
		//첫번째 차량 drive한다
		//첫번째 차량 stop한다
		
		Car car1 = new Car();
		car1.name = "소나타";
		car1.cc = 2000;
		
		Car car2 = new Car();
		car2.name = "911";
		car2.cc = 5000;
		
		
		//car1 = car2; // car2의 주소값과 car1의 주소값을 같게한다는 뜻
		
		car1.drive();
		car1.stop();
		
		car2.drive();
		car2.stop();
	}
	
	
}

class Car{
	String name;
	int cc;
	
	void drive() {
		System.out.printf("%s는 달린다.\n", name);
	}
	void stop() {
		System.out.printf("%s는 멈춘다.\n", name);
	}
}
