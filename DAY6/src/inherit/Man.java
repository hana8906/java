package inherit;
public class Man extends Person { 
	//extends의 의미 = Man이 Person의 class를 상속받는 것임
	//정적특징 - speed
	int speed;
	
	//동적특징 - run
	public void run() {
		System.out.println("달리다.");
		
	}
}
