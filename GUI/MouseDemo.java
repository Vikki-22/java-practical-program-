
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class  MouseDemo
{
	public static void main (String []args)
{ 
        JFrame jf = new JFrame("MouseDemo");
		jf.setLayout(new BorderLayout());
		jf.setSize(500,500);
        Can c1= new Can();
		jf.add(c1);
        jf.setVisible(true);
      
}
static class Can extends Canvas
{
int x1,y1;
Can()
{
	addMouseMotionListener(new XYZ());
    
}
     public void paint(Graphics g){
    g.fillOval(x1,y1,30,30);
		
     }
class XYZ extends MouseMotionAdapter{
public void MousePressed(MouseEvent me){
x1=me.getX();
y1=me.getY();
}
	
}
public void MouseDragged(MouseEvent me)
{
	x1=me.getX();
    y1=me.getY();
     repaint();
}
   
}

}
