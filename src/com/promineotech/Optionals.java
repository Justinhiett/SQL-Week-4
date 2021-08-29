package com.promineotech;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Optionals {

	//private static final Object Animal = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		methodb();
		
	}  
	
	 public static Animal methoda(Optional<Animal> optionalAnimal) {
			return optionalAnimal.orElseThrow(() -> new NoSuchElementException("It appears the Object cannot be found"));
				
			
		} 
	 
	 public static void methodb() {   
		 Optional<Animal> opt = Optional.of(Animal.animals.get(1)); 
		 System.out.println(methoda(opt)); 
		 
		try 
		{ 
			methoda(opt.empty());
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		
			

		 
	 } 
 }


	

		
		
		


