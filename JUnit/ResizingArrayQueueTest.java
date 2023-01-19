import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ResizingArrayQueueTest {

	ResizingArrayQueue<String> queue = new ResizingArrayQueue<String>();
	
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
		fail("Not yet implemented");
	}
	
	@Test
	public void testDequeue() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testIterator() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
