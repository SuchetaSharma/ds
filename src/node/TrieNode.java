package node;

import java.util.HashMap;
import java.util.Map;

public class TrieNode{
	boolean isEndofWord ;
	Map<Character,TrieNode> children = null;
	public TrieNode() {
		isEndofWord = false;
		children = new HashMap<>();
	}
}
