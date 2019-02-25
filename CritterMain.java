// Stuart Reges
// 9/6/00
//
// CritterMain provides method main for a simple simulation program.

public class CritterMain {
    public static void main(String[] args) {
        CritterFrame frame = new CritterFrame(100, 50);

//        frame.add(25, "Stone");
        frame.add(25, "Bird");
        frame.add(2000, "Frog");
        frame.add(25, "OldTurtle");
        frame.add(25, "Turtle");
        frame.add(25, "Wolf");
        frame.add(500, "Stone");

        frame.start();
    }
}
