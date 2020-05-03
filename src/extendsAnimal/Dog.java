package extendsAnimal;

public class Dog implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗狗喜欢吃骨头");
	}
	public void work() {
		System.out.println("狗狗可以看家");
	}
}
