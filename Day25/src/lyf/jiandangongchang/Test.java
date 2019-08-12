package lyf.jiandangongchang;

public class Test {
	public static void main(String[] args) {
		/*
		 * Dog dog=AnimalFactory.createDog(); System.out.println(dog);
		 */
		Dog dog = (Dog) AnimalFactory.createAnima("dog");
		dog.eat();

		Cat cat = (Cat) AnimalFactory.createAnima("cat");
		cat.eat();
	}
}
