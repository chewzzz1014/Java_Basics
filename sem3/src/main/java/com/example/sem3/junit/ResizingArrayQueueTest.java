package com.example.sem3.junit;// Chew Zi Qing 212360
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

// JUnit test for ResizingArrayQueue class
public class ResizingArrayQueueTest {

	// ResizingArrayQueue instance
	ResizingArrayQueue<String> queue = new ResizingArrayQueue<String>();
	// data
	String[] alpha = new String[] {"A", "B", "C", "D", "E", "F", "G", "H"};
	
	// set up test
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsEmpty() {
		// test for isEmpty method
		// isEmpty will return boolean based on whether the queue is empty
		assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testSize() {
		// test for size method
		// size will return the current size of queue
		assertEquals(0, queue.size());
	}
	
	
	@Test
	public void testEnqueue() {
		// test for enqueue method
		// enqueue will append new item to the end of queue
		queue.enqueue("A");
		queue.enqueue("A");
		queue.enqueue("A");
		queue.enqueue("A");
		queue.enqueue("A");
		
		// there'll be 5 items if all items are enqueued successfully
		assertEquals(5, queue.size());
	}
	
	@Test
	public void testDequeue() {
		// test for dequeue method
		// enqueue will remove item from the front of queue
		queue.enqueue("A");
		queue.enqueue("A");
		
		queue.dequeue();
		
		queue.enqueue("A");
		queue.enqueue("A");
		queue.enqueue("A");
		queue.enqueue("A");
		queue.enqueue("A");
		queue.enqueue("A");
		
		queue.dequeue();
		
		// there'll be 6 items if all items are dequeued and enqueued successfully
		assertEquals(6, queue.size());
	}
	
	@Test
	public void testIterator() {
		// test for iterator method
		// iterator will return the Iterator<String> of the queue
		for(String a: alpha) {
			queue.enqueue(a);
		}
		
		// iterator from our IteratorTest class
		Iterator<String> myIterator = new IteratorTest();
		// iterator returned from iterator method of ResizingArrayQueueTest class
		Iterator<String> progIterator = queue.iterator();
		
		// comparing all items of the 2 iterators
		// make sure that all items from both iterators are always same
		boolean same = true;
		while(progIterator.hasNext()) {
			// check if the item returned by both iterator is same
			if (!myIterator.hasNext() || !progIterator.next().equals(myIterator.next())) {
				same = false;
				break;
			}
		}
		
		assertTrue(same);
	}
	
	@Test
	public void testPeek() {
		// test for peek method
		// peek will return the item at the front of the queue
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		queue.enqueue("D");
		
		assertEquals("A", queue.peek());
	}
	
	
	// create an iterator that consists the same items as in the queue to be tested
	// using items in alpha array as data
	private class IteratorTest implements Iterator<String>{
		private int i = 0;
        public boolean hasNext()  { 
        	return i < alpha.length;                               
        }
        public void remove(){ 
        	throw new UnsupportedOperationException();  
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            String item = alpha[(i + 0) % queue.size()];
            i++;
            return item;
        }
	}

}
