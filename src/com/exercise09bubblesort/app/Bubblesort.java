package com.exercise09bubblesort.app;
import java.util.Random;
public class Bubblesort {

	public static void main(String[] args) 
	{
		//constant declaration
		final int ELEMENTS_ARRAY=100;
		//variable declaration
		int temp=0;
		
		//arrays
		int[]disonderedArray = new int[ELEMENTS_ARRAY];
		int[]orderedArray = new int[ELEMENTS_ARRAY];
		
		Random randomNumbers =new Random(System.nanoTime());
		
		//create the vector with the ramdom values
		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{
			disonderedArray[i]=randomNumbers.nextInt(101);
		}
		
		//display the disordered vector
		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{
			System.out.print(disonderedArray[i]+" ");
		}
		
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			for(int j=0;j<ELEMENTS_ARRAY-1;j++)
			{
				if(disonderedArray[j]>disonderedArray[j+1])
				{
					temp=disonderedArray[j+1];
					disonderedArray[j+1]= disonderedArray[j];
					disonderedArray[j]=temp;
				}
			}
		}
		
		System.out.println(" ");
		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{
			System.out.print(disonderedArray[i]+" ");
		}
		
	}

}
