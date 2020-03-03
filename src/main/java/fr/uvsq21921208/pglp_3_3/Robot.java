package fr.uvsq21921208.pglp_3_3;
/**
 *Classe robot.
 *
 */
public class Robot extends RobotStatique {
/**
 * Public constructor for a robot.
 * @param pos Initial position.
 * @param dict Initial direction.
 */
public Robot(final Position pos, final Direction dict) {
   super(pos, dict);
}
/**
 * Advance by one case according to the direction.
 */
@Override
public void avance() {
    switch (this.getDirection()) {
        case North:
            this.getPosition().moveY(1);
        case South:
            this.getPosition().moveY(-1);
        case East:
            this.getPosition().moveX(1);
        case West:
            this.getPosition().moveX(-1);
        default:

    }
}
/**
 * Make a 1/4 turn.
 */
public void tourne() {
    switch (this.getDirection()) {
    case North:
        this.setDirection(Direction.East);
    case South:
        this.setDirection(Direction.West);
    case East:
        this.setDirection(Direction.North);
    case West:
        this.setDirection(Direction.South);
    default:
}
}


}
