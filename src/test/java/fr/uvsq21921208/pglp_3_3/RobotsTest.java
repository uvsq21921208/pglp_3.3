package fr.uvsq21921208.pglp_3_3;

import org.junit.Test;

public class RobotsTest {

	
	/**
	 * avanceTout test case.
	 * 
	 */
	@Test(expected = UnsupportedOperationException.class)
	
	public void avanceToutTest() {
         Robots myRobots = new Robots();
         Robot r1 = new Robot(new Position(0,0),Direction.South);
         RobotStatique r2 = new RobotStatique(new Position(5,2),Direction.North);
         myRobots.addARobot(r1);
         myRobots.addARobot(r2);
         myRobots.avanceTout();

}
}
