package com;


public class Singleton {
	
	private static Singleton singleton_instance=null;
	Singleton()
	{
		connection();
	}
	public Singleton getInstance()
	{
		if(singleton_instance==null) {
			
		}
		return singleton_instance;
	}
	public void connection()
	{
		System.out.println("Connected to Database");
	}
}






