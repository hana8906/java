package inherit;

public class MyHome {

	public static void main(String[] args) {
		Superman superMan = new Superman();
		superMan.name = "클라크"; // person
		superMan.age = 100; //person
		
		superMan.speed = 100; //man
		superMan.high = 1000; //superMan
	
		superMan.smile();
		superMan.run();
		superMan.fly();
	}
	

}
