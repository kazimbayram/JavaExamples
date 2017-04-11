/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _01.reverse.text.with.stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kazım Bayram <kazim.bayram@outlook.com>
 * @param <T>
 */
public class Stack<T> {

	private int size;
	private List<T> stack;
	private int top;

	public Stack() {
		this.stack = new LinkedList<>();
		top = -1;
	}

	public Stack(T[] array) {
		this();
		stack.addAll(Arrays.asList(array));
	}

	public void push(T element) {
		stack.add(++top, element);
	}

	public T pop() {
		T element = stack.get(top);
		stack.remove(top--);
		return element;
	}

	public T peek() {
		return stack.get(top);
	}

	public boolean isEmpty() {
		return (top == -1);
	}
	
	public int search(T element){
		return stack.indexOf(element);
	}

}
