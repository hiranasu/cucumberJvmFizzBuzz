package org.hiranasu.cucumber;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.ja.ならば;
import cucumber.api.java.ja.もし;
import cucumber.api.java.ja.前提;


public class FizzBuzzSteps {
	
	private FizzBuzz target;
	private String result;
	
	@前提("^FizzBuzzのテスト$")
	public void FizzBuzzのテスト() {
		target = new FizzBuzz();
	}
	
	@もし("\"([^\"]*)\"を入力した$") 
	public void を入力すると(int input) {
		result = target.fizzbuzz(input);
	}	

	@ならば("\"([^\"]*)\"が返ってくること$")
	public void が返ってくること(String output) {
		assertEquals(output, result);
	}
}
