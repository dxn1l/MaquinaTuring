package Prototype.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testClone() {
        Circle circle1 = new Circle();
        circle1.x = 10;
        circle1.y = 20;
        circle1.radius = 15;
        circle1.color = "red";

        Circle circle2 = (Circle) circle1.clone();

        assertNotSame(circle1, circle2, "The cloned object should be a different instance.");
        assertEquals(circle1, circle2, "The cloned object should be equal to the original.");
    }

    @Test
    void testEquals() {
        Circle circle1 = new Circle();
        circle1.x = 10;
        circle1.y = 20;
        circle1.radius = 15;
        circle1.color = "red";

        Circle circle2 = new Circle();
        circle2.x = 10;
        circle2.y = 20;
        circle2.radius = 15;
        circle2.color = "red";

        assertEquals(circle1, circle2, "Two circles with the same properties should be equal.");
    }

    @Test
    void testNotEquals() {
        Circle circle1 = new Circle();
        circle1.x = 10;
        circle1.y = 20;
        circle1.radius = 15;
        circle1.color = "red";

        Circle circle2 = new Circle();
        circle2.x = 15;
        circle2.y = 25;
        circle2.radius = 20;
        circle2.color = "blue";

        assertNotEquals(circle1, circle2, "Circles with different properties should not be equal.");
    }
}
