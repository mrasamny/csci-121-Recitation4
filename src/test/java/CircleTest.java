import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

class CircleTest {
    private static Random rand;

    @BeforeAll
    static void beforeAll() {
        rand = new Random();
    }

    @Test
    void testDefaultConstructor() {
        Circle c = new Circle();
        String expected = "(0.0,0.0;1.0)";
        String actual = c.toString();
        assertEquals(expected,actual,"Expecting "+expected+" and got "+actual);
    }

    @Test
    void testSecondConstructor(){
        for(int count=0; count < 3; count++) {
            double radius = rand.nextInt(50);
            Circle c = new Circle(radius);
            String expected = "(0.0,0.0;" + radius + ")";
            String actual = c.toString();
            assertEquals(expected, actual, "Expecting " + expected + " and got " + actual);
        }
    }

    @Test
    void testThirdConstructor(){
        for(int count=0; count < 3; count++) {
            double x = rand.nextInt(100);
            double y = rand.nextInt(100);
            double radius = rand.nextInt(50);
            Circle c = new Circle(x, y, radius);
            String expected = "(" + x + "," + y + ";" + radius + ")";
            String actual = c.toString();
            assertEquals(expected, actual, "Expecting " + expected + " and got " + actual);
        }
    }

    @Test
    void testGetRadius(){
        for(int count=0; count < 3; count++) {
            double x = rand.nextInt(100);
            double y = rand.nextInt(100);
            double radius = rand.nextInt(50);
            Circle c = new Circle(x, y, radius);
            double expected = radius;
            double actual = c.getRadius();
            assertEquals(expected, actual, 1e-6, "Expecting " + expected + " and got " + actual);
        }
    }

    @Test
    void testGetX(){
        for(int count=0; count < 3; count++) {
            double x = rand.nextInt(100);
            double y = rand.nextInt(100);
            double radius = rand.nextInt(50);
            Circle c = new Circle(x, y, radius);
            double expected = x;
            double actual = c.getX();
            assertEquals(expected, actual, 1e-6, "Expecting " + expected + " and got " + actual);
        }
    }

    @Test
    void testGetY(){
        for(int count=0; count < 3; count++) {
            double x = rand.nextInt(100);
            double y = rand.nextInt(100);
            double radius = rand.nextInt(50);
            Circle c = new Circle(x, y, radius);
            double expected = y;
            double actual = c.getY();
            assertEquals(expected, actual, 1e-6, "Expecting " + expected + " and got " + actual);
        }
    }

    @Test
    void testSetRadius(){
        for(int count=0; count < 3; count++) {
            double radius = rand.nextInt(50);
            Circle c = new Circle();
            double expected = radius;
            c.setRadius(radius);
            double actual = c.getRadius();
            assertEquals(expected, actual, 1e-6, "Expecting " + expected + " and got " + actual);
        }
    }

    @Test
    void testSetX(){
        for(int count=0; count < 3; count++) {
            double x = rand.nextInt(100);
            Circle c = new Circle();
            double expected = x;
            c.setX(x);
            double actual = c.getX();
            assertEquals(expected, actual, 1e-6, "Expecting " + expected + " and got " + actual);
        }
    }

    @Test
    void testSetY(){
        for(int count=0; count < 3; count++) {
            double y = rand.nextInt(100);
            Circle c = new Circle();
            double expected = y;
            c.setY(y);
            double actual = c.getY();
            assertEquals(expected, actual, 1e-6, "Expecting " + expected + " and got " + actual);
        }
    }
}

