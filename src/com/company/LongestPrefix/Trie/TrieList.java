package com.company.LongestPrefix.Trie;

public class TrieList implements Trie{
	protected TrieListNode root = new TrieListNode();

	public void add(String str){
		TrieListNode temp = root;
		for (int i=0;i<str.length();i++){
			char c = str.charAt(i);
			int index = c-'a';
			if(temp.children[index] == null) {
				temp.children[index] = new TrieListNode();
				temp = temp.children[index];
			} else{
				temp = temp.children[index];
			}
		}
		temp.isLeaf = true;
	}

	public boolean check(String str){
		TrieListNode temp = root;
		for (int i=0; i<str.length();i++){
			int index = str.charAt(i) - 'a';
			if (temp.children[index] == null)
				return false;
			else{
				temp = temp.children[index];
			}
		}
		return true;
	}
}
