import org.junit.Test;
import static org.junit.Assert.assertEquals;

// Unit tests for the Rectangle class
public class RectangleTest {
  Rectangle myRectangle = new Rectangle(5, 6);

  @Test
  public void testGetArea() {
    assertEquals(myRectangle.getArea(), 30); // Test for area
  }

  @Test
  public void testGetPerimeter() {
    assertEquals(myRectangle.getPerimeter(), 22); // Test for perimeter
  }

  @Test
  public void testLength() {
    assertEquals(myRectangle.length, 5); // Test for length
  }

  @Test
  public void testWidth() {
    assertEquals(myRectangle.width, 6); // Test 
  }
}
