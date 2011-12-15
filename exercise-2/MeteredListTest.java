package uiowa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MeteredListTest extends Assert {
	
   @Test
   public void testBasicFunctionality() {
	  // This could test the mark, and total count functionality.
   }
	
   @Test
   public void testEventCounts() {
	  // This should test the 1m, 5m, and 15m event counts
   }	

   @Test
   public void testEventsPerMinuteStreams() {
	  // This should test the ability to output streams of data 
	  // showing activity over the past 1h, 4h, and 24h
   }

   @Test
   public void testMultiThreaded() {
	  // This should ensure that you can record data accurately
	  // from multiple concurrent threads
   }
	
}
