package miniProjectEcommerce2Part;

import java.util.Scanner;

public class MyntraManProduct  {
	
	void myntraManProductInput()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("i enter man product okk");
		
		System.out.println("How many product do you want to purchase:");
		int count=sc.nextInt();
		
		System.out.println("How much amount to purchase: ");
		int amount=sc.nextInt();
		
		System.out.println("Do you want to discount Y/N: ");
		String dis=sc.nextLine();
		
		sc.next();
		
		System.out.println("If you want to discount,your purchase amount above of 2000 !! OK/Not: ");
		String cond=sc.nextLine();
		
//		if(cond=(ok && not))
//		{
//			System.out.println();
//		}
		
	}

}
