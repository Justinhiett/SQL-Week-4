package com.promineotech;


import java.util.Collections;
import java.util.List; 


public class Sort { 
	
	public static void main(String[] args) {
		sortLambda(); 
		sortMethodReference();
		
		System.out.println(Animal.animals);
		
	}
	
	
	public static void sortLambda() {  
		Collections.sort(Animal.animals, (a1, a2) -> {return Animal.compare(a1, a2);});
		} 
	
	
	public static void sortMethodReference() {
		Collections.sort(Animal.animals, Animal::compare);
	}
}

	
	
	
	
	
	
	
	

 

