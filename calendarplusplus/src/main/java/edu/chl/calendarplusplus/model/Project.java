package edu.chl.calendarplusplus.model;

/*
 * TODO: Remove, not used?
 * Maybe use this class to update the view, for example 
 * updateListView, changeCard method etc. from ProjectView should be here...
*/
public class Project {
	public static final String PROJECT_WINDOW_TEXT = "ProjectTemplate";
	public static final String PROJECT_BUTTON_TEXT = "Press me!";

	private int presses;

	public int getPresses() {
		return presses; 
	}

	public void incrementPresses() {
		this.presses++;
	}
}
