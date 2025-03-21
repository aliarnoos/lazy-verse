package handlers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener
{
    public boolean UP_PRESSED; 

    public boolean DOWN_PRESSED; 

    public boolean LEFT_PRESSED;

    public boolean RIGHT_PRESSED;

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) 
    {
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_W | KeyEvent.VK_UP:
                UP_PRESSED = true;
                break;
            case KeyEvent.VK_A | KeyEvent.VK_LEFT:
                LEFT_PRESSED = true;
                break;
            case KeyEvent.VK_S | KeyEvent.VK_DOWN:
                DOWN_PRESSED = true;
                break;
            case KeyEvent.VK_D | KeyEvent.VK_RIGHT:
                RIGHT_PRESSED = true;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_W | KeyEvent.VK_UP:
                UP_PRESSED = false;
                break;
            case KeyEvent.VK_A | KeyEvent.VK_LEFT:
                LEFT_PRESSED = false;
                break;
            case KeyEvent.VK_S | KeyEvent.VK_DOWN:
                DOWN_PRESSED = false;
                break;
            case KeyEvent.VK_D | KeyEvent.VK_RIGHT:
                RIGHT_PRESSED = false;
                break;
        }
    }
    
}