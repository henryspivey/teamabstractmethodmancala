
import javax.swing.JComponent;

public class Styler
{
    JComponent[] components;
    private Board board;

    public Styler()
    {
    }

    /**
     * Tracks components to be colored
     */
    public void setComponents(JComponent[] colorThese)
    {
        components = colorThese;
    }

    /**
     * Change the style of the board according to the BoardStyle passed in
     * @param style the style the board is going to be changed to
     */
    public void changeStyle(BoardStyle style)
    {
        // Apply new color scheme
        for (JComponent jc : components)
            style.colorComponent(jc);

        Pit[] pits = board.getPits();
        for (Pit p : pits)
            style.colorComponent(p);
    }

    /**
     * Specifies the board to color
     * @param myBoard
     */
    public void setBoard(Board myBoard)
    {
        this.board = myBoard;
    }

}
