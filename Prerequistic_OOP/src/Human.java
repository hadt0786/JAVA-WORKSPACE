
public class Human {
	//instance variable
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	//constructor always have same class signature no return
//	public Human() {
//
//		//hard core values
//		//		this.age = 5;
////		this.eyeColor="brown";
////		this.heightInInches = 72;
////		this.name = "tom zasbo";
//		
//		
//	}
	

	
	//Accecor methods
	public void speak() {
		System.out.println("Hello my name is "+name);
		System.out.println("Hello my age is "+age);
		System.out.println("Hello my height is "+heightInInches);
		System.out.println("Hello my eye is "+eyeColor);
	}
	
	public Human(String name, int age, int heightInInches, String eyeColor) {
		//this keyword or a human1 is a instance variable this is variable reference to particular instance human1, human2
		
		
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}

	public void eat() {
		System.out.println("eating...");
	}
	public void work() {
		System.out.println("Working..");
	}

}
