public class OldTurtle implements Critter {
    @Override
    public char getChar() {
        return 'O';
    }
    private int currentMove;
    private int moves;
    private boolean moving;

//    init variables for movement.
    public OldTurtle() {
        currentMove = Critter.SOUTH;
        moves = 0;
        moving = true;
    }


    @Override
    public int getMove(CritterInfo info) {
//        sets moving to opposite so it alternates.
        moving = !moving;
//        stays in same position if it is not supposed to move
        if(!moving) return Critter.CENTER;
//        keeps it in the same direction for 5 moves.
        if(moves < 4 && moving) {
            moves++;
            return this.currentMove;
        }
        moves = 0;
//        Switch case for setting the correct direction after 5 moves.
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
