package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if(x == 0 && y == 0)
        {
            System.out.println("zero");
            return;
        }
        boolean posX = x > 0, posY = y > 0;
        if(posX)
        {
            if(posY)
                System.out.println("first");
            else
                System.out.println("fourth");
        }
        else
        {
            if(posY)
                System.out.println("second");
            else
                System.out.println("third");
        }
    }
}
