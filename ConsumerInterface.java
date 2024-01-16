package com.java8;

import java.util.function.Consumer;

public class ConsumerInterface implements Consumer<String> {
	
	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		
	} 
	
	
	
	
	public static void usingAnonymous() {
		
		
		Consumer <String >c = new Consumer<String>() {

			@Override
			public void accept(String input) {
				
				System.out.println(input);
				
			}
			
		};
		
		c.accept("Vanakkam da mapla");
		
	}
	
	
	public static void usingLamda() {
		
		
		
		Consumer<String> c = input->System.out.println(input);
		
		c.accept("Vanakam da mapla");
	}
	
	public static void main(String[] args) {
		
		
		
		ConsumerInterface.usingLamda();
		ConsumerInterface.usingAnonymous();

		
	}


	

}

