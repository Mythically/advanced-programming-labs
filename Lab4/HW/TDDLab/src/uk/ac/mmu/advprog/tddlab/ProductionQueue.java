package uk.ac.mmu.advprog.tddlab;

public class ProductionQueue {
	
	//The machine's built-in memory could only hold 10 jobs...
	/**
	 * The maximum number of jobs that can be queued
	 */
	private static final int MAX_JOBS = 10;
	
	//The sheet metal rolls were 50m
	/**
	 * The maximum sheet length for all jobs in the queue
	 */
	private static final double SHEET_LENGTH = 50.0;
	
	//The machine needs to finish inside 10 hours
	/**
	 * The maximum length of time for all jobs, in minutes
	 */
	private static final double MAX_TIME = 600;
	
	//store the queued jobs in this array, and track how many you have in this int
	private Job[] _jobs = new Job[MAX_JOBS];
	private int _jobs_queued = 0;	
	
	/**
	 * Adds the specified Job to the ProductionQueue
	 * @param j The Job to add
	 * @throws OutOfMetalSheetException if there won't be enough metal sheet left for the Job
	 * @throws QueueFullException if the Queue is already at MAX_JOBS, and thus is full
	 */
	public void addJob(Job j) throws OutOfMetalSheetException, QueueFullException, JobsTooLongException {
		//You'll need to check the queue isn't full, and there's enough sheet left first...
	}
	
	/**
	 * Returns the total length of sheet metal required by all Jobs in the Queue
	 * @return The total length of sheet metal required by all Jobs in the Queue
	 */
	public double getTotalSheetLengthRequired() {
		//You'll need to loop through _jobs and total up the sheet required by each
		return 0.0;
	}
	
	public int getTotalRuntime() {
		//You'll need to loop through _jobs and total up the time taken by each
		return 0;
	}
	
	/**
	 * Returns the number of Jobs currently in the ProductionQueue
	 * @return The number of Jobs currently in the ProductionQueue
	 */
	public int getQueueSize() {
		return _jobs_queued;
	}
	

	
	/**
	 * Removes all Jobs from the ProductionQueue
	 */
	public void reset() {
		for(int i=0;i<_jobs_queued;i++) {
			_jobs[i] = null;
		}
		_jobs_queued = 0;
	}
	
}
