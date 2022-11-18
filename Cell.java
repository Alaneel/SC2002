import java.awt.*;
/** 
 * The Cell class models each individual cell of the TTT 3x3 grid
*/
public class Cell { // save as "Cell.java"
    // Define named constants for drawing
    public static final int SIZE = 120;
    // Symbols (cross/nought) are displayed inside a cell, with padding from border
    public static final int PADDING = SIZE / 5;
    public static final int SEED_SIZE = SIZE - PADDING * 2;
    public static final int SEED_STROKE_WIDTH = 8; // pen's stroke width

    // Define properties (package-visible)
    /** Content of this cell (Seed.CROSS, Seed.NOUGHT, Seed.NO_SEED) */
    Seed content;
    /** Row and column of this cell, not used in this program */
    int row, col;

    /** Constructor to initialize this cell with the specified row and col*/
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        content = Seed.NO_SEED;
    }

    /** Reset the cell content to EMPTY, ready for a new game */
    public void newGame() {
        content = Seed.NO_SEED;
    }

    /** Paint itself on the graphics vancas, give nthe Graphics context */
    public void paint(Graphics g) {
        // Use Graphics@D which allows us to set the pen's stroke
        Graphics2D g2d = (Graphics2D)g;
        g2d.setStroke(new BasicStroke(SEED_STROKE_WIDTH, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        // Draw the Seed if it is not empty
        int x1 = col * SIZE + PADDING;
        int y1 = row * SIZE + PADDING;
        if (content == Seed.CROSS) {
            g2d.setColor(GameMain.COLOR_CROSS); // draw a 2_line cross
            int x2 = (col + 1) * SIZE - PADDING;
            int y2 = (row + 1) * SIZE - PADDING;
            g2d.drawLine(x1, y1, x2, y2);
            g2d.drawLine(x2, y1, x1, y2);
        } else if (content == Seed.NOUGHT) { // draw a circle
            g2d.setColor(GameMain.COLOR_NOUGHT);
            g2d.drawOval(x1, y1, SEED_SIZE, SEED_SIZE);
        }
    }
}
