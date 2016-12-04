package finalProject.version1;

import java.awt.*;
import javax.swing.*;
import intel.rssdk.*;
import org.opencv.core.*;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

class DrawFrame extends Component { 
    public BufferedImage image; 

    public DrawFrame(int width, int height) { 
       image=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
    } 
  
    public void paint(Graphics g) { 
        ((Graphics2D)g).drawImage(image,0,0,null); 
    }
}

class Listener extends WindowAdapter {
    public boolean exit = false;
	@Override public void windowClosing(WindowEvent e) {
		exit=true;
	}
}

class DrawingComponent extends Component{
	public Rectangle rect;
	
	public DrawingComponent( int x,int y, int w, int h) { 
		rect = new Rectangle(x,y,w,h);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 =	((Graphics2D)g);
		g2.draw(rect); 
    }
	
}

