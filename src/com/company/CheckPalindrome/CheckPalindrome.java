package com.company.CheckPalindrome;

import com.company.Problem.Problem;

class CheckPalindrome implements Problem {

	public void run(){
		int cs = 12344321;
		System.out.println(checkPalindrome(cs));
	};

	private int d(int num, int ind){
		if(ind == 1){
			return num%10;
		}
		else{
			return d((num-(num%10))/10,ind-1);
		}
	}

	private boolean checkPalindrome( int num){
		int rev = 0;
		for(int i=1; i<=(int) Math.log10((double)num) + 1; i++){
			rev+= d(num,i)*Math.pow(10,(int) Math.log10((double)num) + 1-i);
		}
		System.out.println(rev);
		return num == rev;
	}
}
