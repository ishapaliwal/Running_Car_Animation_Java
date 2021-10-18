import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Car extends Applet implements ActionListener
{
String msg="";
Button b1,b2,b3,b4;
int n=3,x=100,y=150,z=0,flag=0,r=30;
public void init()
{
b1=new Button("Run");
b2=new Button("Stop");
b3=new Button("Slow");
b4=new Button("Fast");
add(b1);
add(b2);
add(b3);
add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
setBackground(Color.black);
}
public void actionPerformed(ActionEvent ae)
{
msg=ae.getActionCommand();
if(msg.equals("Run"))
flag=1;
else if(msg.equals("Stop"))
flag=0;
else if(msg.equals("Slow"))
r+=5;
else if(msg.equals("Fast"))
r-=5;
}
public void paint(Graphics g)
{
int c[]={x+50,x+50,x+70};
int d[]={y,y-50,y-50};
int a[]={x+250,x+230,x+250};
int b[]={y,y-50,y-50};
g.setColor(Color.orange);
g.fillArc(x,y,100,100,90,90);
g.fillRect(x+50,y-50,200,100);
g.fillArc(x+200,y,100,100,0,90);
g.setColor(Color.black);
g.fillPolygon(c,d,n);
g.setColor(Color.black);
g.fillPolygon(a,b,n);
g.setColor(Color.white);
g.fillRect(x+100,y-40,40,40);
g.fillRect(x+160,y-40,40,40);
g.setColor(Color.orange);
g.fillRoundRect(x-20,y+50,340,20,15,15);
g.setColor(Color.black);
g.fillOval(x+30,y+20,80,80);
g.fillOval(x+190,y+20,80,80);
g.setColor(Color.blue);
g.fillArc(x+40,y+30,60,60,z,90);
g.setColor(Color.red);
g.fillArc(x+40,y+30,60,60,z+90,90);
g.setColor(Color.green);
g.fillArc(x+40,y+30,60,60,z+180,90);
g.setColor(Color.yellow);
g.fillArc(x+40,y+30,60,60,z+270,90);
g.setColor(Color.blue);
g.fillArc(x+200,y+30,60,60,z,90);
g.setColor(Color.red);
g.fillArc(x+200,y+30,60,60,z+90,90);
g.setColor(Color.green);
g.fillArc(x+200,y+30,60,60,z+180,90);
g.setColor(Color.yellow);
g.fillArc(x+200,y+30,60,60,z+270,90);
try
{
Thread.sleep(r);
}
catch(InterruptedException e)
{
System.out.println("ERRORRRRRRRR");
}
if(flag==1)
{
x+=7;
z-=7;
}
repaint();
}
}
/*<applet code="Car.java" width=1000 height=1200>
</applet>*/