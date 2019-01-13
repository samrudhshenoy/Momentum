/*This class greets the user and explains the program briefly.
 * 
 * 
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.*;

/**
   Coded by Ayush Satyavarpu
 */
public class PokemonIntro extends JPanel implements MouseListener, ActionListener, AdjustmentListener
{
  // TODO Your Instance Variables Here
  
  
  private JButton oapi;
  private JLabel title, first, second, intropara, empty;
  public JScrollPane jdd;
//  private final Color lb, back, dgrn, orn, db, y;
  
  //private final int width, height;

  public PokemonIntro () {
	  super();
	  setBackground(Color.white);
	  //colors
	  JTextArea j = new JTextArea("m\n\nm\nm\nm\nm\nm\nm\nm\nm\nm\nm\n");
	  this.add(j);
	  JScrollPane s = new JScrollPane(this);
	  jdd = s;
	  jdd.setBounds(30,30,3,3);
	  
	 
	  
	  

	  //this.add(first);
;
	 
	  
	  
	  //add(to1);
  }
  
  
  
  
  

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method to paint the background

    int width = getWidth();
    int height = getHeight();
    
    
    Graphics2D g2 = (Graphics2D)g;
   
    
    
   
    
    
  }

    public void actionPerformed(ActionEvent e) {

    	if(e.getSource() == oapi) {
    		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
    			
    		    try {
					Desktop.getDesktop().browse(new URI("https://eylamtagor.github.io/MomentumCode-API-Documentation/"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		}
    	}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
			
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void adjustmentValueChanged(AdjustmentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

