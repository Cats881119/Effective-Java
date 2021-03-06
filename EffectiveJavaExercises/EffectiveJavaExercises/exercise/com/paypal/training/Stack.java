package com.paypal.training;

import java.util.ArrayList;
import java.util.Collection;

public class Stack<E> {
	int topIndex = -1; 
	ArrayList<E> stack;
	
	public Stack() {
		stack =new ArrayList<E>();
	}

	public void push(E obj) {
		stack.add(obj);
	    topIndex++;	
	}

	public void pushAll(Collection<? extends E> src) {
	     for(E e:src){
	    	 push(e);
	     }
	}
	
	public E pop() {
		E value = stack.get(topIndex);
		stack.remove(topIndex);
		topIndex--;
		return value;
	}

	public void popAll(Collection<? super E> dst) {
		if(dst.size() == 0)
			return;
		if(isEmpty()){
			dst.add(pop());
		}
			
	}
	
	public boolean isEmpty() {
		return topIndex==-1;
	}

	public int size() {
		return topIndex+1;
	}

	@Override
	public String toString() {
		return stack.toString();
	}
}