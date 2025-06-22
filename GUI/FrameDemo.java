import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.*;
class FrameDemo
{
	public static void main(String[] args) 
	{
		JFrame jf=new JFrame("game");// obj create
		jf.setLayout(new BorderLayout());//borderlayout->it's define how to put the componant(this layout use only 5)
		jf.setSize(500,500);
		Can c1=new Can();
		jf.add(c1);
		jf.setVisible(true);
}
static class Can extends Canvas implements Runnable
{
	int x=100,y=250, ct=0;
    Can()
{
 Thread t1=new Thread(this);
t1.start();
}
	public void paint(Graphics g)
	{
		//g.drawString("Wel-Come",100,100);
        g.drawRect(100,100,300,300);
		g.fillOval(x,y,30,30);
	}
	public void run()
	{
		while(true)
		{
			if( ct==0)
			{
              x=x+2;
              y=y-2;
        if(x==250)
     {
      ct=1;
       }
}
else
if(ct==1)
{
	x=x+2;
    y=y+2;
if(x==400)
{
ct=2;
}
}
else
if(ct==2)
{
x=x-2;
y=y+2;
if(x==250)
{
ct=3;
}
}
else {
	x=x-2;
     y=y-2;
   if(x==100)
{
	ct=0;
}
   
}
try{
	Thread.sleep(30);
	repaint();
}
catch(Exception tt)
	{}


}

}
}

}