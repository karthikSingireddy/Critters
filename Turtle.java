public class Turtle implements Critter {
    @Override
    public char getChar() {
        return 'T';
    }

    private int currentMove;
    private int moves;

    public Turtle() {
        currentMove = Critter.SOUTH;
        moves = 0;
    }

    @Override
    public int getMove(CritterInfo info) {
        if(moves < 4) {
            moves++;
            return this.currentMove;
        }
        moves = 0;
        switch (this.currentMove) {
            case Critter.SOUTH:
                this.currentMove = Critter.WEST;
                break;
            case Critter.WEST:
                this.currentMove = Critter.NORTH;
                break;
            case Critter.NORTH:
                this.currentMove = Critter.EAST;
                break;
            case Critter.EAST:
                this.currentMove = Critter.SOUTH;
                break;
        }
        return this.currentMove;
    }
}
