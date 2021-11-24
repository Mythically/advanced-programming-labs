package uk.ac.mmu.advprog.ttdlab.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import uk.ac.mmu.advprog.tddlab.*;

class ProductionQueueTests {

	/**
	 * Tests the Job class's Constructors
	 */
	@Test
	void testJobConstructors() {
		Job j = new Job();
		
		assertEquals("", j.get_jobID());
		assertEquals("", j.get_clientID());
		
		Job jj = new Job("jobid","clientid");
		assertEquals("jobid",jj.get_jobID());
		assertEquals("clientid",jj.get_clientID());
	}
	
	/**
	 * Tests the Job class's basic setters (and getters)
	 */
	@Test
	void testJobSetters() {
		Job j = new Job();
		
		j.set_jobID("jobid");
		assertEquals("jobid",j.get_jobID());
		
		j.set_clientID("clientid");
		assertEquals("clientid",j.get_clientID());
		
		j.setMetalSheetLengthUsed(2.2);
		assertEquals(2.2,j.getMetalSheetLengthUsed());
	}
	
	/**
	 * Tests that a valid rectangle doesn't get wrongly rejected for not fitting
	 */
	@Test
	void testValidRectangle() {
		Job j = new Job();
		
		j.setMetalSheetLengthUsed(2.0);		
		try {
			//this is OK, remember, its in mm and the sheet length is in m!
			j.addRectangle(50, 50, 200, 100);
		}
		catch (ShapeWontFitException swfe) {
			fail("ShapeWontFitException thrown on valid rectangle");
		}		
	}
	
	/**
	 * Tests that a rectangle can't be placed outside of the job's area to the left
	 */
	@Test
	void testInvalidRectangleLeft() {
		Job j = new Job();
		
		j.setMetalSheetLengthUsed(2.0);
		try {
			j.addRectangle(-50, 50, 100, 200);
			fail("ShapeWontFitException not thrown on off-axis (left) rectangle");
		}
		catch(ShapeWontFitException swfe) {
			//Test passes
		}
	}
	
	/**
	 * Tests that a rectangle can't be placed outside of the job's area to the right
	 */
	@Test
	void testInvalidRectangleRight() {
		Job j = new Job();
		
		j.setMetalSheetLengthUsed(6.0);
		try {
			j.addRectangle(5550, 50, 100, 200);
			fail("ShapeWontFitException not thrown on off-axis (right) rectangle");
		}
		catch(ShapeWontFitException swfe) {
			//Test passes
		}
	}
	
	/**
	 * Tests that a rectangle can't be placed outside of the job's area to the top
	 */
	@Test
	void testInvalidRectangleTop() {
		Job j = new Job();
		
		j.setMetalSheetLengthUsed(1.0);
		try {
			j.addRectangle(50, 50, -100, 200);
			fail("ShapeWontFitException not thrown on off-axis (top) rectangle");
		}
		catch(ShapeWontFitException swfe) {
			//Test passes
		}
	}
	
	/**
	 * Tests that a rectangle can't be placed outside of the job's area to the bottom
	 */
	@Test
	void testInvalidRectangleBottom() {
		Job j = new Job();
		
		j.setMetalSheetLengthUsed(1.0);
		try {
			j.addRectangle(50, 1050, 100, 200);
			fail("ShapeWontFitException not thrown on off-axis (bottom) rectangle");
		}
		catch(ShapeWontFitException swfe) {
			//Test passes
		}
	}
	
	/**
	 * Tests that a valid circle doesn't get wrongly rejected for not fitting
	 */	
	@Test
	void testValidCircle() {
		Job j = new Job();
		
		j.setMetalSheetLengthUsed(5.0);
		try {
			j.addCircle(2500, 2500, 500);
		}
		catch(ShapeWontFitException swfe) {
			fail("ShapeWontFitException on valid circle");
		}
	}
	
	
	/**
	 * Tests that a circle can't be placed outside of the job's area to the left
	 */	
	@Test
	void testInvalidCircleLeft() {
		Job j = new Job();
		
		j.setMetalSheetLengthUsed(5.0);
		try {
			j.addCircle(-200, 2500, 500);
			fail("ShapeWontFitException not thrown on off-axis (left) circle");
		}
		catch(ShapeWontFitException swfe) {
			//Test passes
		}
	}
	
	/**
	 * Tests that a circle can't be placed outside of the job's area to the right
	 */	
	@Test
	void testInvalidCircleRight() {
		Job j = new Job();
		
		j.setMetalSheetLengthUsed(8.0);
		try {
			j.addCircle(5100, 500, 100);
			fail("ShapeWontFitException not thrown on off-axis (right) circle");
		}
		catch(ShapeWontFitException swfe) {
			//Test passes
		}
	}
	
	/**
	 * Tests that a circle can't be placed outside of the job's area to the top
	 */	
	@Test
	void testInvalidCircleTop() {
		Job j = new Job();
		
		j.setMetalSheetLengthUsed(1.0);
		try {
			j.addCircle(500, -100, 500);
			fail("ShapeWontFitException not thrown on off-axis (top) circle");
		}
		catch(ShapeWontFitException swfe) {
			//Test passes
		}
	}

	/**
	 * Tests that a circle can't be placed outside of the job's area to the bottom
	 */	
	@Test
	void testInvalidCircleBottom() {
		Job j = new Job();
		
		j.setMetalSheetLengthUsed(1.0);
		try {
			j.addCircle(500, 1100, 500);
			fail("ShapeWontFitException not thrown on off-axis (top) circle");
		}
		catch(ShapeWontFitException swfe) {
			//Test passes
		}
	}
	
	/**
	 * Tests whether the total etched area of rectangles is being calculated correctly
	 */
	@Test
	void testEtchedAreaRectangle() {
		Job j = new Job();
		
		j.setMetalSheetLengthUsed(5.0);
		
		try {
			j.addRectangle(50, 50, 400, 200); //400mm x 200mm = 0.08 sq m
			assertEquals(0.08,j.getTotalEtchedArea(),0.0001); //results can be off by a fraction. Floating point maths
			
			j.addRectangle(1000, 1000, 2000, 50); //2000mm x 50mm = 0.1 sq m
			assertEquals(0.18,j.getTotalEtchedArea(),0.0001); //results can be off by a fraction. Floating point maths
		}
		catch (ShapeWontFitException swfe) {
			fail("ShapeWontFitException thrown while setting up rectangles for testing total etched area method");
		}	
	}
	
	/**
	 * Tests whether the total etched area of circles is being calculated correctly
	 */
	@Test
	void testEtchedAreaCircle() {
		Job j = new Job();
		
		j.setMetalSheetLengthUsed(5.0);
		
		try {
			j.addCircle(500, 500, 500);
			assertEquals(1.27324,j.getTotalEtchedArea(),0.0001); //results can be off by a fraction. Floating point maths
			
			j.addCircle(500, 500, 500);
			assertEquals(1.54648,j.getTotalEtchedArea(),0.0001);
		}
		catch (ShapeWontFitException swfe) {
			fail("ShapeWontFitException thrown while setting up circles for testing total etched area method");
		}			
	}
	
	/**
	 * Tests whether an empty Job has a run time of zero minutes
	 */
	@Test
	void testRunTimeEmpty() {
		Job j = new Job();
		j.setMetalSheetLengthUsed(1.0);
		
		assertEquals(0,j.getRunTime());
	}
	
	/**
	 * Tests whether Job run times are being estimated correctly
	 */
	@Test
	void testRunTime() {
		Job j = new Job();
		j.setMetalSheetLengthUsed(5.0);
		
		try { 
			j.addRectangle(50, 50, 400, 200); //0.08 sq m, on a machine that does 0.008 sq m per minute = 10 minutes
			assertEquals(10,j.getRunTime());						
		}
		catch (ShapeWontFitException swfe) {
			fail("ShapeWontFitException thrown while setting up shapes for testing run time  method");
		}
	}
	
	/**
	 * Tests that the ProductionQueue's queue size starts empty
	 */
	@Test
	void testEmptyProductionQueue() {
		ProductionQueue p = new ProductionQueue();
		assertEquals(0,p.getQueueSize());
	}
	
	/**
	 * Tests that the ProductionQueue's queue size increases as jobs are added
	 */
	@Test
	void testProductionQueueSize() {
		ProductionQueue p = new ProductionQueue();
		Job j = new Job();
		j.setMetalSheetLengthUsed(2.0);
		
		try {
			p.addJob(j);
			assertEquals(1,p.getQueueSize());
			
			p.addJob(j);
			assertEquals(2,p.getQueueSize());
		}
		catch (QueueFullException | OutOfMetalSheetException | JobsTooLongException e) {
			fail("Exception thrown when adding jobs for ProductionQueue queue size test");
		}		
	}
	
	/**
	 * Tests that the ProductionQueue's queue overflows at 10
	 */
	@Test
	void testProductionQueueFull() {
		ProductionQueue p = new ProductionQueue();
		Job j = new Job();
		j.setMetalSheetLengthUsed(1.0);
		
		//10 jobs should work...
		for (int i=0;i<10;i++) {
			try {
				p.addJob(j);
				assertEquals(1,p.getQueueSize());
				
				p.addJob(j);
				assertEquals(2,p.getQueueSize());
			}
			catch (QueueFullException | OutOfMetalSheetException | JobsTooLongException e) {
				fail("Exception thrown when adding jobs for ProductionQueue queue size test");
			}	
		}
		
		//the 11th should fail
		try {
			p.addJob(j);
			fail("ProductionQueue didn't throw QueueFullException when queue was full");
		}
		catch (QueueFullException e) {
			//Test Passes
		}
		catch (OutOfMetalSheetException | JobsTooLongException e) {
			fail("ProductionQueue threw Exception when testing queue fullness");
		}	
	}
	
	/**
	 * Tests that the ProductionQueue is calculating total run times correctly
	 */
	@Test
	void testTotalRunTime() {
		Job j = new Job();
		ProductionQueue p = new ProductionQueue();
		j.setMetalSheetLengthUsed(5.0);
		
		try { 
			j.addRectangle(50, 50, 400, 200); //0.08 sq m, on a machine that does 0.008 sq m per minute = 10 minutes
			assertEquals(10,j.getRunTime());
			
			p.addJob(j);
			assertEquals(p.getTotalRuntime(),10);
			
			p.addJob(j);
			assertEquals(p.getTotalRuntime(),20);
		}
		catch (ShapeWontFitException swfe) {
			fail("ShapeWontFitException thrown while setting up shapes for testing run time  method");
		}
		catch (QueueFullException | OutOfMetalSheetException | JobsTooLongException e) {
			fail("Exception thrown when adding jobs for ProductionQueue queue total run time test");
		}
	}

}
