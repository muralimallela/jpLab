package jplab;
//
//import java.applet.Applet;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Fact extends Applet implements ActionListener {
//	Label l1, l2, l3;
//	TextField tf1, tf2;
//	Button b1;
//
//	public void init() {
//		setSize(400, 200);
//		FlowLayout g = new FlowLayout();
//		setLayout(g);
//		l1 = new Label("Enter Value");
//		l1.setForeground(Color.BLUE);
//		add(l1);
//		tf1 = new TextField(5);
//		tf1.setText("0");
//		add(tf1);
//		b1 = new Button("Compute");
//		b1.addActionListener(this);
//		add(b1);
//		l3 = new Label();
//		add(l3);
//		l2 = new Label("factorial: ");
//		l2.setForeground(Color.BLUE);
//		add(l2);
//		tf2 = new TextField(5);
//		add(tf2);
//	}
//
//	public void actionPerformed(ActionEvent ae) {
//		long n = Integer.parseInt(tf1.getText());
//		long f = 1;
//		while (n != 0) {
//			f = f * n;
//			n--;
//		}
//		tf2.setText(String.valueOf(f));
//	}
//}
//
//Applet code:<html><body><applet code="Fact"width=45 height=54></applet></body></html
//>