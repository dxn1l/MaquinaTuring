package Prototype.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    void testEquals() {
        Shape shape1 = new Shape() {
            @Override
            public Shape clone() {
                return this;
            }
        };
        shape1.x = 10;
        shape1.y = 20;
        shape1.color = "red";

        Shape shape2 = new Shape() {
            @Override
            public Shape clone() {
                return this;
            }
        };
        shape2.x = 10;
        shape2.y = 20;
        shape2.color = "red";

        assertEquals(shape1, shape2, "Two shapes with the same properties should be equal.");
    }

    @Test
    void testNotEquals() {
        Shape shape1 = new Shape() {
            @Override
            public Shape clone() {
                return this;
            }
        };
        shape1.x = 10;
        shape1.y = 20;
        shape1.color = "red";

        Shape shape2 = new Shape() {
            @Override
            public Shape clone() {
                return this;
            }
        };
        shape2.x = 15;
        shape2.y = 25;
        shape2.color = "blue";

        assertNotEquals(shape1, shape2, "Shapes with different properties should not be equal.");
    }
}
