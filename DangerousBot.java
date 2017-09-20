
import kareltherobot.*; 


/**
 * @author :  A. Starr
 */
public class DangerousBot extends Robot
{
    private int beepers;
    
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        testPile();
        enterRoom();
        pickUpAllBeepers();
    }
    public void testPile() {
        while (nextToABeeper()){
            pickBeeper();
            beepers++;
        }
        if (beepers %2 == 0) {
            faceEast();
        }
        else {
            faceWest();
        }
        for (int i=0; i< beepers; i++) {
            putBeeper();
        }
    }
    public void faceEast() {
        while (!facingEast()) {
            turnLeft();
        }
    }
    public void faceWest() {
        while (!facingWest()) {
            turnLeft();
        }
    }
    public void enterRoom(){
        move();
    }
    public void pickUpAllBeepers() {
        while (nextToABeeper()){
            pickBeeper();
        }
        turnOff();
    }
}

