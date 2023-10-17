import java.util.*;

public class Main {
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
        ballMove.setHeightTown(100);
        ballMove.calculation(ballMove.getHeightTown(), BallMove.GRAVITY);
    }
}