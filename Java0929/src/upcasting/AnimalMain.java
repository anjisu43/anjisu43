package upcasting;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println(dog.leg);
		dog.bark();
		
		Animal animal = dog; // ��ĳ����! -->����Ŭ������ Ÿ���� ���� Ŭ���� Ÿ������ �ٲ� �ִ°�
		
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
