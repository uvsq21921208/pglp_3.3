package fr.uvsq21921208.pglp_3_3;

public class RobotStatique extends Robot {
    /**
     * 
     * @param pos initial position.
     * @param dict initial direction.
     */
	public RobotStatique(Position pos, Direction dict) {
		super(pos, dict);
	}
	@Override
    /**
	*Overriding avance method from super class (static robots do not move)
    */
	public void avance()  {
		throw new UnsupportedOperationException();
	}
}
