package example;

import java.util.Scanner;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int width;
		int height;
		
		cglgame g=new cglgame();
		
		System.out.println("Enter the width");
		g.setWidth(width=read.nextInt());
		System.out.println("Enter the height");
		g.setHeight(height=read.nextInt());
		
		System.out.println("The value width:"+width);
		System.out.println("The value height:"+height);

	}

}
