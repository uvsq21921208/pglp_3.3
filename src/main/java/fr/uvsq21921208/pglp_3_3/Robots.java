package fr.uvsq21921208.pglp_3_3;

import java.util.ArrayList;

public class Robots {
    /**
     * List of robots.
     */
    private ArrayList<RobotStatique> listOfRobots;
	public Robots() {
		listOfRobots = new ArrayList<RobotStatique>();
	}
	/**
	 * 
	 * @param r2 robot to be added to robots list.
	 */
	public void addARobot(RobotStatique robot) {
		this.listOfRobots.add(robot);
	}
    public void avanceTout() throws UnsupportedOperationException {
    	for (RobotStatique robot: listOfRobots) {
    		robot.avance();
    	}
    }
}
