import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ToyStore extends JFrame implements ActionListener
{
	JLabel l1;
	JCheckBox c1,c2,c3,c4;
	JButton b;
	ToyStore(){
	l1=new JLabel("Order Toys Here!!");
	l1.setBounds(50,50,300,20);
	c1=	new JCheckBox("Remote Car @Rs.200");
	c1.setBounds(100,100,150,20);
	c2=	new JCheckBox("Doll @Rs.100");
	c2.setBounds(100,150,150,20);
	c3=	new JCheckBox("Bat And Ball @Rs.80");
	c3.setBounds(100,200,150,20);
	c4=	new JCheckBox("Puzzles @Rs.50");
	c4.setBounds(100,250,150,20);
	b=new JButton("Order");
	b.setBounds(100,300,80,30);
	b.addActionListener(this);
	add(l1);add(c1);add(c2);add(c3);add(c4);add(b);
	setSize(400,400);
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
	}
		public void action_performed (ActionEvent e){
		float amt=0;
		String msg="";
		if(c1.isSelected()){
			amt+=200;
			msg="Remote Car : Rs.200\n";
		}
		if(c2.isSelected()){
			amt+=100;
			msg+="Doll : Rs.100\n";
		}
		if(c3.isSelected()){
			amt+=80;
			msg+="Bat And Ball : Rs.80\n";
		}
		if(c4.isSelected()){
			amt+=50;
			msg+="Puzzles : Rs.50\n";	
		}
		msg+="----------\n";
		JOptionPane.showMessageDialog(this,msg+"Total :"+amt);
		
}
		public static void main(String[] args){
			new ToyStore();
		}
}