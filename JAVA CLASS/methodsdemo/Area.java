package com.voya.methodsdemo;

public class Area {
	
	public static double areaOfCircle(int r) 
	{
		double area = 3.14 * r * r;
		return area;
	}
	
	public static int areaOfRectangle(int length,int width)
	{
		int area=length*width;
		return area;
	}
	
	//areaOfSquare
	public static int areaOfSquare(int side)
	{
		return side*side;
	}
	
	//areaOfTriangle
	public static double areaOfTriangle(double base,double height) 
	{
		return (base*height)/2;
	}
	
	
	//areaOfTrapezium

}
