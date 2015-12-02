
import java.awt.Color;

/**
 * Concrete strategy. Strategy implementation for initial view - changes color
 * of the board to green.
 */
public class GreenStyle extends BoardStyle
{
    public GreenStyle()
    {
        super.setColor(Color.GREEN);
    }
}
