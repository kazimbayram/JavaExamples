/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _01.reverse.text.with.stack;

/**
 *
 * @author Kazım Bayram <kazim.bayram@outlook.com>
 */
public class StackClient {

	public static void main(String[] args) {
		String text = "This text will be reversed";

		Stack<Character> stack = new Stack<>();

		for (char arg : text.toCharArray()) {
			stack.push(arg);
		}

		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		
	}

}
