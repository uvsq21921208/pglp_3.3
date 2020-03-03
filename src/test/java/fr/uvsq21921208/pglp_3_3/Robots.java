package fr.uvsq21921208.pglp_3_3;

import java.util.ArrayList;

public class Robots {
    /**
     * List of robots.
     */
    private ArrayList<Robot> listOfRobots;
	public Robots() {
	}
	/**
	 * 
	 * @param robot robot to be added to robots list.
	 */
	public void addARobot(Robot robot) {
		this.listOfRobots.add(robot);
	}
    public void avanceTout() {
    	for (Robot robot: listOfRobots) {
    		robot.avance();
    	}
    }
}
