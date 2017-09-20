
import kareltherobot.*; 


/**
 * @author :  A. Starr
 */
public class TreasureBot extends Robot
{
    private int beepers;
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        while (nextToABeeper()) {
            testCorner();
            travel();
        }
    }
    public void testCorner() {
        beepers= 0;
        while (nextToABeeper()) {
             pickBeeper();
             beepers++;
            }
        if (beepers ==1) {
            faceNorth();
        }
        if (beepers ==2) {
            faceEast();
        }
        if (beepers ==3) {
            faceSouth();
        }
        if (beepers ==4) {
            faceWest();
        }
        if (beepers == 5) {
            turnOff();
        }
    }
    public void travel() {
        move();
        while (!nextToABeeper()) {
            move();
        }
    }
    public void faceEast() {
        while (!facingEast()) {
            turnLeft();
        }
    }
    public void faceNorth() {
        while (!facingNorth()) {
            turnLeft();
        }
    }
    public void faceSouth() {
        while (!facingSouth()) {
            turnLeft();
        }
    }
    public void faceWest() {
        while (!facingWest()) {
            turnLeft();
        }
    }
   
}

