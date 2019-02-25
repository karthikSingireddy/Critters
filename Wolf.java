/*
The Critter Wolf mimics a hunting animal, it stays in the same spot until
an animal is in one of the moveable directions, then it starts to follow it.
 */

public class Wolf implements Critter {
    @Override
    public char getChar() {
        return 'W';
    }

    @Override
    public int getMove(CritterInfo info) {
//        tries to find the direction of a frog
        int frogDir = directionOfCritter(new Frog(), info);
//        if the value returns a directional value, the getMove() method returns that value
        if(frogDir != 0) {
            return frogDir;
        }
//        else returns Critter.CENTER to not move.
        return Critter.CENTER;
    }
//    finds the direction of any given critter given the critterInfo.
    private int directionOfCritter(Critter c, CritterInfo info) {

//        int[] with the direction of all movable directions
        int[] directions = {Critter.NORTH, Critter.SOUTH, Critter.EAST, Critter.WEST};
//        for loop that goes through all the directions to see if the given critter is in any of those directions
        for(int i = 0; i < directions.length; i++) {
            if(info.getNeighbor(directions[i]) == c.getChar()) return directions[i];
        }
//        returns 0 if it is not in any of the directions
        return 0;
    }
}
