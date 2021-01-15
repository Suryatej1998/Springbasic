package com.Demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
		@RequestMapping("/add")
		public String add(int a, int b) {
			int c=a+b;
			return ("A="+a+" B= " + b + " Sum = :"+c);
		}
		@RequestMapping("/sub")
		public String sub(int a, int b) {
			int c=a-b;
			return ("A="+a+" B= " + b + " Difference = :"+c);
		}
		@RequestMapping("/multiply")
		public String product(int a, int b) {
			int c=a*b;
			return ("A="+a+" B= " + b + " multiply = :"+c);
		}
		@RequestMapping("/divide")
		public String divide(int a, int b) {
			if(b==0) return("Cannot divide by Zero");
			else
			{
				double c=(double)a/(double)b;
				return ("A="+a+" B= " + b + " Quotient = :"+c);
			}
		}
}
