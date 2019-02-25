public class Turtle implements Critter {
    @Override
    public char getChar() {
        return 'T';
    }

//    
    private int currentMove;
    private int moves;

//    initializes variables to move Critter.SOUTH and sets moves to 0
    public Turtle() {
        currentMove = Critter.SOUTH;
        moves = 0;
    }

    @Override
    public int getMove(CritterInfo info) {
//        keeps moving in the same direction if the number of moves is less than 4
        if(moves < 4) {
            moves++;
            return this.currentMove;
        }
        
//        Switch case to change the direction to the corresponding direction
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
