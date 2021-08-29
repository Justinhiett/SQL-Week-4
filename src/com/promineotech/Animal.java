package com.promineotech;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	private String name;   
	
	
	public Animal(String name) {
		this.name = name; 
	}


	@Override
	public String toString() {
		return name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}   
	
	
	public static int compare(Animal a1, Animal a2) { 
		return a1.name.compareTo(a2.name);
				
	} 
	
	public static List<Animal> animals = new ArrayList<>(List.of(new Animal("Elephant"), 
			new Animal("Kangaroo"), 
			new Animal("Donkey"), 
			new Animal("Sloth"))); 
	
	
	public List<Animal> getAnimal() {
		return animals;
	}
	
	
	
	
	
	
	
}
