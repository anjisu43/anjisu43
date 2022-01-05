package upcasting;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println(dog.leg);
		dog.bark();
		
		Animal animal = dog; // 업캐스팅! -->하위클래스의 타입을 상위 클래스 타입으로 바꿔 주는것
		
		animal.bark();
		System.out.println(animal.leg);
				
		cry(dog);
		cry(cat);
		// System.out.println(animal.color);

	}
	public static void cry(Animal animal) {
		animal.bark();
	}

}
