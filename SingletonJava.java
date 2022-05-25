package com;

public class SingletonJava {
	   
	   private static SingletonJava objInstance = new SingletonJava();
	   
	   SingletonJava() {  //PrivateConstructor
	   }
	   public static SingletonJava getInstance()  {
		   
		   return objInstance;
	   }
	   public void printMsg()  {
		   System.out.println("Welcome to Java Coding");
	   }
}
		   