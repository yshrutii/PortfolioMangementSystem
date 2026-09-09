
package com.portfolio.app.model;

class Student1
{
	public Student1() //default constructor
	{
		System.out.println("Hi welcome to my class");
	}
	
	public Student1(int x) //para cont
	{
		System.out.println(x);
	}
}

public class demomethod 
{
	public static void main(String[] args)
	{
		Student1 s= new Student1();
		Student1 s1= new Student1(22);
	}

	}

