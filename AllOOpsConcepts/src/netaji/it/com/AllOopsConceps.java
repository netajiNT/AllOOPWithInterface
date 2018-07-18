package netaji.it.com;

interface Animal {
	void eat();
	void sleep();
}
class Zoo {
	public static void sendAnimal(Animal a) {
		a.eat();
		a.sleep();
	}
}
class Lion implements Animal{

	@Override
	public void eat() {
		System.out.println("LION IS EATING GRESS");
	}

	@Override
	public void sleep() {
		System.out.println("LION SLEEP IN HOME");
	}
	
}
class Rabbit implements Animal{

	@Override
	public void eat() {
		System.out.println("RABBIT EAT");
	}

	@Override
	public void sleep() {
		System.out.println("RABBIT IS SLEEPING");
	}
}
class AnimalUser{
	public static void main(String[] args) {
		Zoo.sendAnimal(new Lion());
		Zoo.sendAnimal(new Rabbit());
	}

}

