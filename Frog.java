import java.util.Random;

public class Frog implements Critter {
    private Random r;


    public Frog() {
        r = new Random();
        moves = 3;
        currentMove = getMove(null);
    }


    @Override
    public char getChar() {
        return 'F';
    }

    int currentMove;
    int moves;

    @Override
    public int getMove(CritterInfo info) {
        if(moves < 3) {
            moves++;
//            System.out.println("moves: " + moves);
            return this.currentMove;
        }
        moves = 0;
        int move = r.nextInt(3);

        switch (move) {
            case 0:
                currentMove = Critter.NORTH;
                break;
            case 1:
                currentMove = Critter.SOUTH;
                break;
            case 2:
                currentMove = Critter.EAST;
                break;
            case 3:
                currentMove = Critter.WEST;
                break;
        }
//        System.err.println("new move:" + currentMove);
        return currentMove;
    }
}
