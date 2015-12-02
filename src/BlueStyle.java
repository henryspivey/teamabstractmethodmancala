
import java.awt.Color;

/**
 * Concrete strategy. Strategy implementation for initial view - changes color
 * of the board to blue.
 */
public class BlueStyle extends BoardStyle
{
    public BlueStyle()
    {
        super.setColor(Color.BLUE);
    }
}
