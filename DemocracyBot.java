
import kareltherobot.*; 


/**
 * @author :  A. Starr
 */
public class DemocracyBot extends Robot
{
    private int beepers;
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        for (int i=0; i<10; i++) {
            move();
            checkRoom();
            reposition();
        }
    }
    public void checkRoom() {
        if (nextToABeeper()) {
            fillRooms();
        }
        else {
            emptyRooms();
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
    public void checkBeeperYes() {
        if (!nextToABeeper()) {
            putBeeper();
        }
    }
    public void fillRooms() {
        faceNorth();
        move();
        checkBeeperYes();
        faceSouth();
        while (!frontIsClear()) {
            move();
        }
        checkBeeperYes();
    }
    public void emptyRooms() {
        faceNorth();
        move();
        checkBeeperNo();
        faceSouth();
        while (!frontIsClear()) {
            move();
        }
        checkBeeperNo();
    }
    public void checkBeeperNo() {
        if (nextToABeeper()) {
            pickBeeper();
        }
    }
    public void reposition() {
        faceNorth();
        move();
        faceEast();
        move();
    }
    public void faceEast() {
        while (!facingEast()) {
            turnLeft();
        }
    }
    
   
}

