package fr.uvsq21921208.pglp_3_3;
/**
 *
 * Classe pour une position dans une case (x,y).
 */
public class Position {
/**
* x position.
*/
private int x;
/**
* y position.
*/
private int y;
/**
 * public constructor with an initial x,y.
 * @param initialX initial x position.
 * @param initialY initial y position.
 */
public Position(final int initialX, final int initialY) {
  this.x = initialX;
  this.y = initialY;
}

/**
 * public constructor which initialize position to 0,0.
 */
public Position() {
      this.x = 0;
      this.y = 0;
}
/**
 *
 * @param numberOfCases advances with n cases (x position).
 */
public void moveX(final int numberOfCases) {
      this.x += numberOfCases;
}
/**
 *
 * @param numberOfCases advances with n cases (y position).
 */
public void moveY(final int numberOfCases) {
      this.y += numberOfCases;
}
/**
 * @return x position.
 */
public int getX() {
      return this.x;
}
/**
 * @return y position.
 */
public int getY() {
      return this.y;
}

}
