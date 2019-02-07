package package1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyListener {
  public static void main(String[] argv) throws Exception {
    JTextField component = new JTextField();
    component.addKeyListener(new MyKeyListener());

    JFrame f = new JFrame();

    f.add(component);
    f.setSize(300, 300);
    f.setVisible(true);

  }
}

class MyKeyListener extends KeyAdapter {
  public void keyPressed(KeyEvent evt) {
	  int keyPressed = 0;
	  boolean isNumber = true;
    switch(evt.getKeyCode()) {
    	case KeyEvent.VK_0:
    		keyPressed = KeyEvent.VK_0;
    		break;
    	case KeyEvent.VK_1:
    		keyPressed = KeyEvent.VK_1;
    		break;
    	case KeyEvent.VK_2:
    		keyPressed = KeyEvent.VK_2;
    		break;
    	case KeyEvent.VK_3:
    		keyPressed = KeyEvent.VK_3;
    		break;
    	case KeyEvent.VK_4:
    		keyPressed = KeyEvent.VK_4;
    		break;
    	case KeyEvent.VK_5:
    		keyPressed = KeyEvent.VK_5;
    		break;
    	case KeyEvent.VK_6:
    		keyPressed = KeyEvent.VK_6;
    		break;
    	case KeyEvent.VK_7:
    		keyPressed = KeyEvent.VK_7;
    		break;
    	case KeyEvent.VK_8:
    		keyPressed = KeyEvent.VK_8;
    		break;
    	case KeyEvent.VK_9:
    		keyPressed = KeyEvent.VK_9;
    		break;
    	default:
    		isNumber = false;
    }
    if(isNumber) {
    	System.out.println(keyPressed - KeyEvent.VK_0 + " Pressed");
    }else {
    	System.out.println("Not Allowed");
    }
  }
}