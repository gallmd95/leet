package com.company.LongestPrefix;

import com.company.LongestPrefix.Trie.TriePrefix;
import com.company.Problem.Problem;


class LongestPrefix implements Problem{
	public void run(){
		String[] cs = {"for", "fde", "fours"};
	}
	private String longestPrefix(String[] strs) {
		TriePrefix tree = new TriePrefix();
		for (String s : strs){
			tree.add(s);
		}
		return tree.prefix;
	}

}
