package com.solvd.lab1.lecture1;

public class JavaBasics {

		
	public static void main(String[] args) {
		task2();
		task3();
	}
	
	public static void task2() {
		int[] task2 = {3, 7, 6, 13, 33, 9, -100, 25};
		int biggest = 0;
		int smallest = 0;
		int i = 0;
		
		System.out.println("Task 2: ");
		while(i< task2.length) {
			System.out.println(task2[i]);	
			if(biggest < task2[i])	
				biggest = task2[i];
			
			if(smallest > task2[i])
				smallest = task2[i];
			
			i++;
		}
		System.out.println("The biggest number of the array is: "+biggest);
		System.out.println("The smallest number of the array is: "+smallest);
	}
	
	public static void task3() {
		int[] task3 = {3, 7, 6, 13, 33, 9, -100, 25};	
		int i =1;
		int smallest =0;
		int aux =0;
		System.out.println("-----------------");
		System.out.println("Selection sort:");
		
		for(int j=0; j< task3.length;j++) {
			smallest =j;
			
			//i'm looking for the smallest index
			for(i=j+1; i< task3.length; i++){
				if(task3[i] < task3[smallest])
					smallest = i;
				
			}
		//i swap the smallest with the first item and then i reduce the array 1 index.
		aux=task3[smallest];
		task3[smallest]=task3[j];
		task3[j]=aux;
		}

		
		//print the array
		for(i=0;i < task3.length;i++) {
			System.out.println(task3[i]);
		}
	}


}






