package panel;

import javax.swing.JFrame;

public class GamePanelFactory extends JFrame
{
    private static final GamePanel GAME_PANEL = new GamePanel();

    private static final JFrame GAME_FRAME = new JFrame();

    private static final boolean IS_RESIZABLE = false;

    private static final String FRAME_NAME = "Lazy Verse";

    public GamePanelFactory(){}

    public static void generateInstance()
    {
        GAME_FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GAME_FRAME.setResizable(IS_RESIZABLE);

        GAME_FRAME.setTitle(FRAME_NAME);

        GAME_FRAME.add(GAME_PANEL);

        GAME_FRAME.pack();

        GAME_FRAME.setVisible(true);

        GAME_PANEL.setGameObjects();

        GAME_PANEL.setGameThread();
    }
}
