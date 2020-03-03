package fr.uvsq21921208.pglp_3_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobotsTest {

	
	/**
	 * avanceTout test case.
	 * 
	 */
	@Test
	
	public void avanceToutTest() {
         Robots myRobots = new Robots();
         Robot r1 = new Robot(new Position(0,0),Direction.South);
         RobotStatique r2 = new RobotStatique(new Position(5,2),Direction.North);
         myRobots.addARobot(r1);
         myRobots.addARobot(r2);
         myRobots.avanceTout();
         int expectedX  = 0;
         int expectedY  = -1;
         assertEquals(r1.getPosition().getX(), expectedX);
         assertEquals(r1.getPosition().getY(), expectedY);
         
         expectedX = 5;
         expectedY = 2;
         assertEquals(r2.getPosition().getX(), expectedX);
         assertEquals(r2.getPosition().getY(), expectedY);

}
}
