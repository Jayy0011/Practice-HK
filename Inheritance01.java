import java.util.*;
class Inheritance01 
{
	//1. Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
	class Animal{
		public static void makeSound(){
			int a;
			Scanner sc=new Scanner(System.in);
				a=sc.nextInt();
				switch(a){
					case 1:
						System.out.println("Maaawwwnn");
						break;
					case 2:
						System.out.println("Meeowwnn");
						break;
					default:
						break;
				}
			
			}
	}
			class Cat extends Animal{
			}
			
	public static void main(String[] args) 
	{
	Cat.makeSound();
	}
}
