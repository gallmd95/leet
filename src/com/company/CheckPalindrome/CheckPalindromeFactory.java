package com.company.CheckPalindrome;

import com.company.Problem.Problem;
import com.company.Problem.ProblemFactory;

public class CheckPalindromeFactory implements ProblemFactory {
	public Problem makeProblem(){
		return new CheckPalindrome();
	}
}
