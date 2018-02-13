package com.company.LongestPrefix;

import com.company.Problem.Problem;
import com.company.Problem.ProblemFactory;

public class LongestPrefixFactory implements ProblemFactory {
	public Problem makeProblem(){
		return new LongestPrefix();
	}
}
