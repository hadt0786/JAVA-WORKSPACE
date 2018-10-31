
public class Zoo {

	public static void main(String[] args) {
		//objects exist during app runtime
		Animal animal1 = new Animal(12,"male",23);
		
		animal1.eat();
		
		Bird bird1 = new Bird();
		bird1.fly();

	}

}
