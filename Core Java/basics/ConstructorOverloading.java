package com.onebill.corejava.basics;

import java.util.Scanner;

class Volume {
	int length;
	int breadth;
	int height;
	int radius;
	double vol;
	Volume(){
		this.length=0;
		this.breadth=0;
		this.height=0;
		this.radius=0;
		this.vol=0;
	}
	Volume(int length,int breadth, int height){
		this();
		this.length=length;
		this.breadth=breadth;
		this.height=height;
		this.vol=calc(this.length,this.breadth,this.height);
	}
	Volume(int radius)
	{
		this();
		this.radius=radius;
		this.vol=calc(this.radius);
	}
	double calc(int length, int breadth, int height)
	{
		return length*breadth*height;
	}
	double calc(int radius)
	{
		return 4/3*3.14*radius;
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuboid:\nEnter Length:");
		int length= sc.nextInt();
		System.out.println("Enter Breadth:");
		int breadth= sc.nextInt();
		System.out.println("Enter Height:");
		int height= sc.nextInt();
		Volume cuboid = new Volume(length,breadth,height);
		System.out.println("Sphere:\nEnter Radius:");
		int radius= sc.nextInt();
		Volume sphere = new Volume(radius);
		System.out.println("Volume of Cuboid:" + cuboid.vol);
		System.out.println("Volume of Sphere:" + sphere.vol);
		sc.close();
	}

}
