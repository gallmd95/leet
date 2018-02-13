package com.company.LongestPrefix.Trie;

public class TriePrefix implements Trie {
	private TrieListNode root = new TrieListNode();
	public String prefix = "";
	private int prefixLength = 0;

	public void add(String str){
		boolean isPrefix = true;
		TrieListNode temp = root;
		for (int i=0;i<str.length();i++){
			char c = str.charAt(i);
			int index = c-'a';
			if(temp.children[index] == null) {
				if(isPrefix) {
					if (i + 1 > prefixLength) {
						prefixLength = i + 1;
						prefix = str.substring(0, i);
					}
					isPrefix = false;
				}
				temp.children[index] = new TrieListNode();
				temp = temp.children[index];
			} else{
				temp = temp.children[index];
				if (temp.isLeaf && i + 1 > prefixLength) {
					prefixLength = str.length();
					prefix = str;
				}

			}
		}
		temp.isLeaf = true;
	}

	public void collectLongestPrefix(String str){
		boolean isPrefix = true;
		TrieListNode temp = root;
		for (int i=0;i<str.length();i++){
			char c = str.charAt(i);
			int index = c-'a';
			if(temp.children[index] == null) {
				if(isPrefix)
					prefix = prefix.length() > i ? prefix : str.substring(0,i);
					isPrefix = false;
				temp.children[index] = new TrieListNode();
				temp = temp.children[index];
			} else{
				temp = temp.children[index];
			}
		}
		temp.isLeaf = true;
	}

}
