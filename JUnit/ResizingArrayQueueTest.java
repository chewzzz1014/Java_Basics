import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class ResizingArrayQueueTest {

	ResizingArrayQueue<String> queue = new ResizingArrayQueue<String>();
	String[] alpha = new String[] {"A", "B", "C", "D", "E", "F", "G", "H"};
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsEmpty() {
		assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testSize() {
		assertEquals(0, queue.size());
	}
	
	
	@Test
	public void testEnqueue() {
		queue.enqueue("A");
		queue.enqueue("A");
		queue.enqueue("A");
		queue.enqueue("A");
		queue.enqueue("A");
		
		assertEquals(5, queue.size());
	}
	
	@Test
	public void testDequeue() {
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
		
		assertEquals(6, queue.size());
	}
	
	@Test
	public void testIterator() {
		for(String a: alpha) {
			queue.enqueue(a);
		}
		
		Iterator<String> myIterator = new IteratorTest();
		Iterator<String> progIterator = queue.iterator();
		
		boolean same = true;
		while(progIterator.hasNext()) {
			if (!myIterator.hasNext() || !progIterator.next().equals(myIterator.next())) {
				same = false;
				break;
			}
		}
		
		assertTrue(same);
	}
	
	@Test
	public void testPeek() {
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		queue.enqueue("D");
		
		assertEquals("A", queue.peek());
	}
	
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
