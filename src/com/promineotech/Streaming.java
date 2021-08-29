package com.promineotech;

import java.util.stream.Collectors;

public class Streaming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stream = Animal.animals.stream().map(Animal::toString).sorted().collect(Collectors.joining(",")); 
		
		System.out.println(stream);
	}

}
