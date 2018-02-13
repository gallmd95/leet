package com.company;

import com.company.CheckPalindrome.CheckPalindromeFactory;
import com.company.LongestPrefix.LongestPrefixFactory;
import com.company.Problem.Problem;
import com.company.Problem.ProblemFactory;

public class Main {

    public static void main(String[] args) {
	    ProblemFactory a = new LongestPrefixFactory();
	    Problem b = a.makeProblem();
	    b.run();
    }
}
