package inherit;

public class Superman extends Man {//Man class에서 상속
	//정적특징-high
	int high;
	
	//동적특징-fly
	public void fly() {
			run();  
		System.out.println("날다.");
		
	}
}
