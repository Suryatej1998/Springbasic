package com.Demo.itg;

import org.springframework.stereotype.Service;

@Service
public class DivisionService {
	public String division(Numbers numbers) {
		int a = numbers.getNumber1();
		int b = numbers.getNumber2();
		int c;
		String s = null;
		if(b == 0) {
			try {
				c = a/b;
			}catch(ArithmeticException e) {
				return e.getMessage()+" Denominator should not be zero";
			}
		}
		c = a/b;
		return("A= "+a+" B= "+b+" division= "+c);
	}
	public String divide(Numbers numbers) {
		int parameter1 = numbers.getNumber1();
		int parameter2 = numbers.getNumber2();
		int parameter3 = parameter1/parameter2;
		return("parameter1= "+parameter1+" parameter2= "+parameter2+" divison= "+parameter3);
	}
}
