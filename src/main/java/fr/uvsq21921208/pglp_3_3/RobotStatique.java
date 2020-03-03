package fr.uvsq21921208.pglp_3_3;
/**
 *
 * A static robot.
 *
 */
public class RobotStatique {
    /**
    * Robot position.
    */
    private Position position;
    /**
    * Robot Direction.
    */
    private Direction direction;
    /**
     *
     * @param pos initial position.
     * @param dict initial direction.
     */
    public RobotStatique(final Position pos, final Direction dict) {
           this.position = new Position(pos.getX(), pos.getY());
           this.direction = dict;
    }
    /**
     * avance method.
     */
    public void avance() { }
/**
 *@return current position.
 */
    public Position getPosition() {
       return position;
}
/**
 *@return current Direction.
 */
    public Direction getDirection() {
     return direction;
   }
/**
 *
 * @param dict set new direction.
 */
public void setDirection(final Direction dict) {
    this.direction = dict;
}
}
