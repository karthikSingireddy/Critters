public class OldTurtle implements Critter {
    @Override
    public char getChar() {
        return 'O';
    }
    private int currentMove;
    private int moves;
    private boolean moving;

    public OldTurtle() {
        currentMove = Critter.SOUTH;
        moves = 0;
        moving = true;
    }


    @Override
    public int getMove(CritterInfo info) {
        moving = !moving;
        if(!moving) {
            return Critter.CENTER;
        }
        if(moves < 4 && moving) {
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
