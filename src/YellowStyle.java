
import java.awt.Color;

/**
 * Concrete strategy. Strategy implementation for initial view - changes color
 * of the board to yellow.
 */
public class YellowStyle extends BoardStyle
{
    public YellowStyle()
    {
        super.setColor(Color.ORANGE);
    }
}
