
public class Earth {
	public static void main(String[] args) {
		
//		Human tom ; //tom is a instance variable 
//		//tom is a reference variable
//		tom = new Human();//tom is assigned by human object
//		
//		tom.age = 5;
//		tom.eyeColor="brown";
//		tom.heightInInches = 72;
//		tom.name = "tom zasbo";
//		
//		tom.speak();
//		
//		Human joe = new Human();
//		
//		joe.age = 67;
//		joe.eyeColor = "test";
//		joe.heightInInches = 98;
//		joe.name = "joe test";
//		
//		joe.speak();
		
		Human human1 = new Human("tom",25,35,"brown");
		Human human2 = new Human("akash",76,68,"black");
		Human human3 = new Human("second",78,98,"test");
		//3 independent objects does not have the same value
		
		human1.speak();
		human2.speak();
		human2.speak();
		
		
		
		
		
		
		
		
	}
}
