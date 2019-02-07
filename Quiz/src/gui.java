import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class gui extends JFrame
{
	JLabel label;
	JRadioButton option[]=new JRadioButton[4];
	JButton b1,b2;
	ButtonGroup bg;
	int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	gui()
	{
		label=new JLabel();
		label.setText("Que1: Which one among these is not a datatype");
		add(label);
		bg=new ButtonGroup();
		for(int i=0;i<4;i++)
		{
			option[i]=new JRadioButton();	
			add(option[i]);
			bg.add(option[i]);
		}
		b1=new JButton("Next");

		add(b1);
		label.setBounds(30,40,450,20);
		option[0].setBounds(50,80,100,20);
		option[0].setText("int");option[1].setText("Float");option[2].setText("boolean");option[3].setText("char");	
		option[1].setBounds(50,110,100,20);
		option[2].setBounds(50,140,100,20);
		option[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);
	}
	
	
	public static void main(String s[])
	{
		
		new gui();
		
		String labelname[] = new String[10];
		labelname[0]="Que1: Which one among these is not a datatype";
		
		labelname[1]="Que2: Which class is available to all the class automatically";
		
		labelname[2]="Que3: Which package is directly available to our class without importing it";
		
		labelname[3]="Que4: String class is defined in which package";
		
		labelname[4]="Que5: Which institute is best for java coaching";
		
		labelname[5]="Que6: Which one among these is not a keyword";
		
		labelname[6]="Que7: Which one among these is not a class";
		
		labelname[7]="Que8: which one among these is not a function of Object class";
		
		labelname[8]="Que9: which function is not present in Applet class";
		
		labelname[9]="Que10: Which one among these is not a valid component";
		
		
		
	}


}