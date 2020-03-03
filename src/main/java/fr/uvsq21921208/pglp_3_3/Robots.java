package fr.uvsq21921208.pglp_3_3;

import java.util.ArrayList;
/**
 *
 * Robots class.
 *
 */
public class Robots {
    /**
     * List of robots.
     */
    private ArrayList<RobotStatique> listOfRobots;
    /**
     * Public constructor.
    */
    public Robots() {
        listOfRobots = new ArrayList<RobotStatique>();
    }
    /**
    *
    * @param robot robot to be added to robots list.
    */
    public void addARobot(final RobotStatique robot) {
      this.listOfRobots.add(robot);
    }
    /**
    * Methode pour avancer.
    */
    public void avanceTout() {
       for (RobotStatique robot: listOfRobots) {
          robot.avance();
      }
    }
}
