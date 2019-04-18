package Algorithim1;

import java.util.HashMap;
import java.util.Map;

public class Tire {
    private class TireNode {
	Map<Character, TireNode> children;
	boolean endOfWord;

	public TireNode() {
	    children = new HashMap<>();
	    endOfWord = false;
	}
    }

    public final TireNode root;

    public Tire() {
	root = new TireNode();
    }

    public void insert(String word) {
	TireNode current = root;
	for (int i = 0; i < word.length(); i++) {
	    Character ch = word.charAt(i);
	    TireNode node = current.children.get(i);
	    if (node == null) {
		node = new TireNode();
		current.children.put(ch, node);
	    }
	    current = node;
	}
	current.endOfWord = true;
    }

    public boolean search(String word) {
	TireNode current = root;
	for (int i = 0; i < word.length(); i++) {
	    TireNode node = current.children.get(word.charAt(i));
	    if (node == null) {
		return false;
	    }
	    current = node;
	}
	return current.endOfWord;
    }

    public void delete(String word) {
	delete(root, word, 0);
    }

    private boolean delete(TireNode current, String word, int index) {
	if (word.length() == index) {
	    if (!current.endOfWord) {
		return false;
		}
	    current.endOfWord = false;
	    return current.children.size() == 0;
	}
	Character ch = word.charAt(index);
	TireNode node = current.children.get(ch);
	if (node == null) {
	    return false;
	}
	boolean shouldDeleteCurrentNode = delete(current, word, index + 1);
	if (shouldDeleteCurrentNode) {
	    current.children.remove(ch);
	    return current.children.size() == 0;
	}
	return false;
    }
}
