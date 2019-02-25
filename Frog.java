import java.util.Random;

public class Frog implements Critter {
    private Random r;

//  init of random object
//    moves are set to 3 so that the getMove will return a random direction, and will set moves to 0
    public Frog() {
        r = new Random();
        moves = 3;
        currentMove = getMove(null);
    }


    @Override
    public char getChar() {
        return 'F';
    }

    private int currentMove;
    private int moves;


    @Override
    public int getMove(CritterInfo info) {
//        returns the same moves if the moves in the same direction are less than 3 moves
        if(moves < 3) {
            moves++;
            return this.currentMove;
        }
//        reset moves to 0
        moves = 0;
//        Random statement and switch case to set the move the corresponding random direction
        int move = r.nextInt(4);

        switch (move) {
            case 0:
                this.currentMove = Critter.NORTH;
                break;
            case 1:
                this.currentMove = Critter.SOUTH;
                break;
            case 2:
                this.currentMove = Critter.EAST;
                break;
            case 3:
                this.currentMove = Critter.WEST;
                break;
        }
//        System.err.println("new move:" + currentMove);
        return this.currentMove;
    }
}
