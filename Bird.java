import java.util.Random;

public class Bird implements Critter {

    public Bird() {
        r = new Random();
    }
    private Random r;

    @Override
    public char getChar() {
        return 'B';
    }

    @Override
    public int getMove(CritterInfo info) {
        int move = r.nextInt(4);
        switch (move) {
            case 0:
                return Critter.NORTH;
            case 1:
                return Critter.SOUTH;
            case 2:
                return Critter.EAST;
            default:
                return Critter.WEST;
        }
    }
}
