package fr.uvsq21921208.pglp_3_3;
/**
 * 
 * A static robot.
 *
 */
public class RobotStatique{
	/**
	 * Robot position.
	 */
	protected Position position;
	/**
	 * Robot Direction
	 */
	protected Direction direction;
    /**
     * 
     * @param pos initial position.
     * @param dict initial direction.
     */
	public RobotStatique(Position pos, Direction dict) {
           this.position = new Position(pos.getX(), pos.getY());
           this.direction = dict;
	}
	/**
	 * avance method.
	 */
	public void avance()  {
		
	}
}
