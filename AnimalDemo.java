class Animal {
	public void animalsound()
	{
		System.out.println("The animal makes a sound");
	}
}
	class pig extends Animal {
		public void animalsound() 
	{
		System.out.println("The pig says : wee wee");
	}
}
	class Dog extends Animal {
		public void animalsound() 
	{
		System.out.println("The dog says: bow wow");
	}
}
	class AnimalDemo {
		public static void main(String [] args)
		{
			Animal myAnimal = new Animal();//
			Animal mypig = new pig();//create a pig object
			Animal myDog = new Dog();//create a Dog object
			myAnimal.animalsound();
			mypig.animalsound();
			myDog.animalsound();
		}
}



		