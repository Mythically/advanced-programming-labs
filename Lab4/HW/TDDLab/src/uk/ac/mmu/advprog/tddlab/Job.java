package uk.ac.mmu.advprog.tddlab;

public class Job {
	
	//the sheet metal rolls were 5m wide
	/**
	 * The width of the metal sheet roll used by the machine for the job
	 */
	private static final double SHEET_WIDTH = 5.0;
	
	//the machine could etch about 8 sq cm per minute
	/**
	 * The etching speed of the machine, used to estimate a total job length, in sq meters/minute
	 */
	private static final double ETCHING_SPEED = 0.008;
	
	//These are some fairly normal properties, with getters & setters below
	private String _jobID = "";
	private String _clientID = "";
	private double _metalSheetLengthUsed = 0.0;
	
	//This one's a pain, and is where you come in :)
	//total etched area on this job, in square meters
	private double _totalEtchedArea = 0.0;

	/**
	 * Creates a new, blank, instance of the Job class
	 */
	public Job() { }
	
	/**
	 * Creates a Job for with the specified ID, and for the specified client
	 * @param jobID The ID of the Job to create
	 * @param clientID The ID of the client for whom the job is for
	 */
	public Job(String jobID,String clientID) {
		_jobID = jobID;
		_clientID = clientID;
	}
	/**
	 * Returns the ID of the Job
	 * @return the ID of the Job
	 */
	public String get_jobID() {
		return _jobID;
	}
	/**
	 * Sets the ID of the Job
	 * @param jobID The ID of the job that is to be set
	 */
	public void set_jobID(String jobID) {
		_jobID = jobID;
	}
	
	/**
	 * Returns the ID of the client for whom this Job is for
	 * @return The client ID of the Job
	 */
	public String get_clientID() {
		return _clientID;
	}
	/*
	 * Sets the ID of the client for whom this job is for
	 * @param clientID The client ID of the Job to set
	 */
	public void set_clientID(String clientID) {
		_clientID = clientID;
	}

	/**
	 * Sets the length of sheet required for the Job, in meters.
	 * This is NOT dependent on the shapes etched onto the sheet. No need to change it. 
	 * @param metalSheetLengthUsed
	 */
	public void setMetalSheetLengthUsed(double metalSheetLengthUsed) {
		_metalSheetLengthUsed = metalSheetLengthUsed;
	}
	
	/**
	 * Returns the length of sheet required for the job, in meters
	 * This is NOT dependent on the shapes etched onto the sheet. No need to change it.
	 * @return The length of metal sheet required for the Job, in meters
	 */
	public double getMetalSheetLengthUsed() {
		return _metalSheetLengthUsed;
	}
	
	/**
	 * Adds a rectangular etching to the Job. You don't actually have to store the shapes anywhere.
	 * You need to check if the shape goes off the edges of the metal sheet, throwing the exception if so.
	 * You also need to keep a total of the area of etched shapes, to be able to calculate the job's run time
	 * @param x the x coordinate of the top-left of the rectangle, in millimeters, from the left-hand edge of the sheet
	 * @param y the y coordinate of the top-left of the rectangle, in millimeters, from the top edge of the sheet
	 * @param width the width of the rectangle to be etched, in millimeters
	 * @param height the height of the rectangle to be etched, in millimeters
	 * @throws ShapeWontFitException if the position and/or size of the rectangle means it won't fit on the metal sheet
	 */
	public void addRectangle(int x, int y, int width, int height) throws ShapeWontFitException {
		//be careful! The total etched area is in meters, not in mm!
	}
	
	/**
	 * Adds a circular etching to the Job. You don't actually have to store the shapes anywhere.
	 * You need to check if the shape goes off the edges of the metal sheet, throwing the exception if so.
	 * You also need to keep a total of the area of etched shapes, to be able to calculate the job's run time
	 * @param x the x coordinate of the center of the circle, in millimeters, from the left-hand edge of the sheet
	 * @param y the y coordinate of the center of the circle, in millimeters, from the top edge of the sheet
	 * @param radius the raidus of the circle, in millimeters
	 * @throws ShapeWontFitException if the position and/or size of the circle means it won't fit on the metal sheet
	 */
	public void addCircle(int x, int y, int radius) throws ShapeWontFitException {
		//be careful! The total etched area is in meters, not in mm!
	}
	
	/**
	 * Calculates the total etched area of all the shapes added to the job, in meters
	 * @return The total etched area of all the shapes added to the job, in meters
	 */
	public double getTotalEtchedArea() {
		return _totalEtchedArea;
	}
	
	/**
	 * Calculates an estimate of the total time to complete the Job, in minutes, rounded up to the nearest minute.
	 * @return The estimated number of minutes to complete this Job
	 */
	public int getRunTime() {
		//Don't forget to round up!
		return 0;
	}

}
