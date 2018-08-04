import java.awt.*;
import java.awt.event.*;

public class SCalc1 extends Frame implements ActionListener {
	
	Button add, sub, mul, div, equal, clear;
	TextField t1;
	String s1;
	double a, b, res;
	public SCalc1(){
	
		add = new Button("+");
		sub = new Button("-");
		mul = new Button("*");
		div = new Button("/");
		equal = new Button("=");
		clear = new Button("C");
		t1 = new TextField(10);
		
		setLayout(new FlowLayout());
		
		add(t1);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(equal);
		add(clear);
		
		setFont(new Font("Arial",12,0));
		
		setVisible(true);
		setSize(150,150);
			
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		
		add.addActionListener(this);
		equal.addActionListener(this);
		t1.addTextListener(new TextListener(){
			public void textValueChanged(TextEvent te){
				try{
					a = Double.parseDouble(t1.getText());
					//System.out.println(a);
				}
				catch(Exception e){}
			}
		});
		
		t1.requestFocus();
		}
		public void actionPerformed(ActionEvent ae){
	
			s1 = ae.getActionCommand();
			System.out.println(s1);
			if(s1 == "+"){
				b = a;
				t1.setText("");
				res = b + a;
			}
			else if(s1 == "-")
				res = b - a;
			else if(s1 == "*")
				res = b * a;
			else if(s1 == "/")
				res = b / a;
			else if(s1 == "=")
				t1.setText(res+"");
			t1.requestFocus();
		}
		public static void main(String[] args){
			new SCalc1();
		}
	}
