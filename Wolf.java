public class Wolf implements Critter {
    @Override
    public char getChar() {
        return 'W';
    }

    @Override
    public int getMove(CritterInfo info) {
        int frogDir = directionOfCritter(new Frog(), info);
        if(frogDir != 0) {
            return frogDir;
        }
        return Critter.CENTER;
    }
    private int directionOfCritter(Critter c, CritterInfo info) {

        int[] directions = {Critter.NORTH, Critter.SOUTH, Critter.EAST, Critter.WEST};

        for(int i = 0; i < directions.length; i++) {
            if(info.getNeighbor(directions[i]) == c.getChar()) return directions[i];
        }
        return 0;
    }
}
