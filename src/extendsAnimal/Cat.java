package extendsAnimal;

public class Cat implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫猫喜欢吃鱼");
	}
	
	public void work() {
		System.out.println("猫猫可以抓老鼠");
	}

}
