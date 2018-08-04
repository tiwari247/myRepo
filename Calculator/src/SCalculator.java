import java.awt.*;
import java.awt.event.*;

public class SCalculator extends Frame {
	Button add, sub, mul, div, equal, clear;
	TextField t1;
	String s1;
	double a, b, res;
	public SCalculator(){
		
		add = new Button("+");
		sub = new Button("-");
		mul = new Button("*");
		div = new Button("/");
		equal = new Button("=");
		clear = new Button("C");
		t1 = new TextField(10);
		
		setLayout(new FlowLayout());
		setBackground(Color.BLUE);
		add(t1);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(equal);
		add(clear);
		
		setFont(new Font("Cambria",1,14));
		setTitle("Calculator");
		setVisible(true);
		setSize(150,150);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		
		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				s1 = add.getActionCommand();
				t1.setText("");
				b = a;
				System.out.println(b);
				t1.requestFocus();
			}
		});
		
		sub.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				s1 = sub.getActionCommand();
				t1.setText("");
				b = a;
				System.out.println(b);
				t1.requestFocus();
			}
		});
		
		mul.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				s1 = mul.getActionCommand();
				t1.setText("");
				b = a;
				System.out.println(b);
				t1.requestFocus();
			}
		});
		
		div.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				s1 = div.getActionCommand();
				t1.setText("");
				b = a;
				System.out.println(b);
				t1.requestFocus();
			}
		});
		
		clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				a = 0.0;
				b = 0.0;
				t1.setText("");
				t1.requestFocus();
			}
		});
		
		equal.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(s1 == "+")
					res = b + a;
				else if(s1 == "-")
					res = b - a;
				else if(s1 == "*")
					res = b * a;
				else if(s1 == "/")
					res = b / a;
				t1.setText(res+"");
				t1.requestFocus();
			}
		});
		
		t1.addTextListener(new TextListener(){
			public void textValueChanged(TextEvent te){
				try{
					a = Double.parseDouble(t1.getText());
					System.out.println(a);
				}
				catch(Exception e){}
			}
		});
		
		t1.requestFocus();
	}
	public static void main(String[] args){
		new SCalculator();
	}
}
