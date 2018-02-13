package com.company.LongestPrefix.Trie;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.IntStream;

public class CheapTrie implements Trie{
	private Map<Character, Object> nodes;

	public CheapTrie(){
		nodes = new HashMap<>();
	}

	public boolean check(String str){
		System.out.println(nodes.keySet());
		if (nodes.isEmpty())
			return false;
		Map<Character, Object> temp = nodes;
		for (char ch : str.toCharArray()) {
			if (temp.containsKey(ch))
				temp = (Map<Character, Object>) temp.get(ch);
			else
				return false;
		}
		return true;
	}

	private Object[] getMap(final char[] chars){
		Map<Character, Object> it = new HashMap<>();
		it.putAll(nodes);
		for (int i=0; i <chars.length;i++){
			if(it.containsKey(chars[i])){
				Map<Character, Object> temp = new HashMap<>();
				temp.putAll((Map<Character, Object>) it.get(chars[i]));
				it.clear();
				it.putAll(temp);
			}
			else{
				return new Object[]{it, i};
			}
		}
		return null;
	}

	public void add(String str){
		final char[] chars = str.toCharArray();
		Object[] mapLoc = getMap(chars);
		if(mapLoc == null)
			return;
		Map<Character, Object> head = new HashMap<>();
		head.putAll((Map<Character,Object>) mapLoc[0]);
		int index = (int) mapLoc[1];
		Map<Character, Object> tail = new HashMap<>();
		head.putAll(tail);
		for (int i = index; i<chars.length; i++){
			Map<Character, Object> temp = new HashMap<>();
			temp.put(chars[i], new HashMap<>());
			tail.clear();
			tail.putAll(temp);
		}
	}
}