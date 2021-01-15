package com.Demo.itg;

import org.springframework.stereotype.Service;

@Service
public class MultiplicationService {
	public String mul(Numbers numbers) {
		int a = numbers.getNumber1();
		int b = numbers.getNumber2();
		int c;
		String s = null;
		c = a*b;
		return("A= "+a+" B= "+b+" product= "+c);
	}
	public String multiplication(Numbers numbers) {
		int parameter1 = numbers.getNumber1();
		int parameter2 = numbers.getNumber2();
		int parameter3 = parameter1*parameter2;
		return("parameter1= "+parameter1+" parameter2= "+parameter2+" Product= "+parameter3);
	}
}
