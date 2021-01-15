package com.Demo.itg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArithmeticController {
	@Autowired
	public DivisionService ds;
	public AdditionService as;
	public SubtractionService ss;
	public MultiplicationService ms;
	
	@PostMapping(value="/division")
	public String division(@RequestBody Numbers n) {
		return ds.divide(n);
	}
	@PostMapping(value="/add")
	public String add(@RequestBody Numbers n) {
		return as.add(n);
	}
	@PostMapping(value="/sub")
	public String sub(@RequestBody Numbers n) {
		return ss.sub(n);
	}
	@PostMapping(value="/mul")
	public String mul(@RequestBody Numbers n) {
		return ms.mul(n);
	}
}
