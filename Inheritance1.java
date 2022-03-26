class Animal {
	

	public void eat()
	{
     System.out.println("Animal is eat: ");
	}

    public void sleep()
	{
        System.out.println("Animal is sleep: ");
	}
	
}
class Bird extends Animal{
	
	public void eat()
	{
		// super.eat();
      System.out.println("Bird is eat : ");
	}
	public void sleep()
	{
		 //super.sleep();
        System.out.println("Bird is sleep :");
	}
	public void fly()
	{
      System.out.println("Bird is fly : ");
	}
	
}

class Inheritance1{
	
	public static void main(String args[]){
  
     Animal a = new Animal();
     a.eat();
     a.sleep();   
     Bird b1 = new Bird();
     b1.eat();
     b1.sleep();
     b1.fly();

	}
}