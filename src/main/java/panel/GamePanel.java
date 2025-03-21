package panel;

import java.awt.*;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable
{
    // TILE SETTINGS
    private final int ORIGINAL_TILE_SIZE = 16;
    private final int SCALE = 3;
    private final int TILE_SIZE = ORIGINAL_TILE_SIZE * SCALE;

    //  SCREEN SETTINGS
    private final int COLS = 16;
    private final int ROW = 12;
    private final int SCREEN_WIDTH =  TILE_SIZE * COLS;
    private final int SCREEN_HEIGHT = TILE_SIZE * ROW;

    // WORLD SETTINGS
    public final int MAX_WORLD_COL = 50;
    public final int MAX_WORLD_ROW = 50;
    public final int WORLD_WIDTH = TILE_SIZE * MAX_WORLD_COL;
    public final int WORLD_HEIGHT = TILE_SIZE * MAX_WORLD_ROW;

    // GAME SETTINGS
    private final int FPS = 60;

    Thread GAME_THREAD;

    public GamePanel()
    {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        // this.addKeyListener(keyHandler);
        this.setFocusable(true);
    }

    public void setGameObjects(){

    }

    public void setGameThread()
    {
        GAME_THREAD = new Thread(this);
        GAME_THREAD.start();
    }

    @Override
    public void run()
    {
        double DRAW_INTERVAL = (double) 1000000000 / FPS;
        double DELTA = 0;
        long LAST_TIME = System.nanoTime();
        long CURRENT_TIME;

        while(GAME_THREAD != null) {
            CURRENT_TIME = System.nanoTime();

            DELTA += (CURRENT_TIME - LAST_TIME) / DRAW_INTERVAL;
            LAST_TIME = CURRENT_TIME;

            if(DELTA >= 1) {
                update();
                repaint();
                DELTA--;
            }
        }
    }

    public void update()
    {
        
    }
    
    @Override
    public void paintComponent(Graphics G)
    {
        super.paintComponent(G);
        Graphics2D G2 = (Graphics2D) G;
        G2.dispose();
    }
}
