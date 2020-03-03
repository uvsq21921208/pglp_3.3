package fr.uvsq21921208.pglp_3_3;
/**
 *Classe robot.
 *
 */
public class Robot {
/**
 * Robot position.
 */
private Position position;
/**
 * Move direction.
 */
private Direction direction;
/**
 * Public constructor for a robot.
 * @parm pos Initial position.
 * @param dict Initial direction.
 */
public Robot(final Position pos, final Direction dict) {
   this.position = new Position(pos.getX(), pos.getY());
   this.direction = dict;
}
/**
 * Advance by one case according to the direction.
 */
public void avance() {
	switch(direction) {
		case North:
			this.position.moveY(1);
		case South:
			this.position.moveY(-1);
		case East:
			this.position.moveX(1);
		case West:
			this.position.moveX(-1);
	}
}
/**
 * Make a 1/4 turn.
 */
public void tourne() {
	switch(direction) {
	case North:
		this.direction = Direction.East;
	case South:
		this.direction = Direction.West;
	case East:
		this.direction = Direction.North;
	case West:
		this.direction = Direction.South;
}
}


}
