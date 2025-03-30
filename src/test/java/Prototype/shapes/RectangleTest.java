package Prototype.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testClone() {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.x = 10;
        rectangle1.y = 20;
        rectangle1.width = 30;
        rectangle1.height = 40;
        rectangle1.color = "red";

        Rectangle rectangle2 = (Rectangle) rectangle1.clone();

        assertNotSame(rectangle1, rectangle2, "The cloned object should be a different instance.");
        assertEquals(rectangle1, rectangle2, "The cloned object should be equal to the original.");
    }

    @Test
    void testEquals() {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.x = 10;
        rectangle1.y = 20;
        rectangle1.width = 30;
        rectangle1.height = 40;
        rectangle1.color = "red";

        Rectangle rectangle2 = new Rectangle();
        rectangle2.x = 10;
        rectangle2.y = 20;
        rectangle2.width = 30;
        rectangle2.height = 40;
        rectangle2.color = "red";

        assertEquals(rectangle1, rectangle2, "Two rectangles with the same properties should be equal.");
    }

    @Test
    void testNotEquals() {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.x = 10;
        rectangle1.y = 20;
        rectangle1.width = 30;
        rectangle1.height = 40;
        rectangle1.color = "red";

        Rectangle rectangle2 = new Rectangle();
        rectangle2.x = 15;
        rectangle2.y = 25;
        rectangle2.width = 35;
        rectangle2.height = 45;
        rectangle2.color = "blue";

        assertNotEquals(rectangle1, rectangle2, "Rectangles with different properties should not be equal.");
    }
}