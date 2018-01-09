
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUI {
	private Panel p;

	private Button b0;
	private Button b1;
	private Button b2;
	private Button b3;
	private Button b4;
	private Button b5;
	private Button b6;
	private Button b7;
	private Button b8;
	private Button b9;
	private Button a0;
	private Button a1;
	private Button a2;
	private Button a3;
	private Button a4;
	private Button a5;
	private Button a7;
	private Button a8;
	private Button a9;

	private TextArea t;
	private Label label1;

	private String thenum;
	private int gg = -1;
	char num[] = new char[100];
	private int wq = 0;
	private StringBuffer ff;

	public Panel tt() {
		p = new Panel();
		p.setLayout(null);

		b0 = new Button("0");
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		a0 = new Button("+");
		a1 = new Button("-");
		a2 = new Button("*");
		a3 = new Button("/");
		a4 = new Button("=");
		a5 = new Button("sqrt");
		a7 = new Button("^");
		a8 = new Button(".");
		a9 = new Button("restart");

		b1.setBounds(0, 200, 80, 100);
		b2.setBounds(80, 200, 80, 100);
		b3.setBounds(160, 200, 80, 100);
		b4.setBounds(0, 300, 80, 100);
		b5.setBounds(80, 300, 80, 100);
		b6.setBounds(160, 300, 80, 100);
		b7.setBounds(0, 400, 80, 100);
		b8.setBounds(80, 400, 80, 100);
		b9.setBounds(160, 400, 80, 100);
		b0.setBounds(80, 500, 80, 100);
		a0.setBounds(240, 200, 80, 100);
		a1.setBounds(320, 200, 80, 100);
		a2.setBounds(240, 300, 80, 100);
		a3.setBounds(320, 300, 80, 100);
		a4.setBounds(160, 500, 80, 100);
		a5.setBounds(240, 400, 80, 100);
		a7.setBounds(320, 400, 80, 100);
		a8.setBounds(0, 500, 80, 100);
		a9.setBounds(240, 500, 160, 100);

		b0.setFont(new Font("Colinas", Font.BOLD, 40));
		b1.setFont(new Font("Colinas", Font.BOLD, 40));
		b2.setFont(new Font("Colinas", Font.BOLD, 40));
		b3.setFont(new Font("Colinas", Font.BOLD, 40));
		b4.setFont(new Font("Colinas", Font.BOLD, 40));
		b5.setFont(new Font("Colinas", Font.BOLD, 40));
		b6.setFont(new Font("Colinas", Font.BOLD, 40));
		b7.setFont(new Font("Colinas", Font.BOLD, 40));
		b8.setFont(new Font("Colinas", Font.BOLD, 40));
		b9.setFont(new Font("Colinas", Font.BOLD, 40));
		a0.setFont(new Font("Colinas", Font.BOLD, 40));
		a1.setFont(new Font("Colinas", Font.BOLD, 40));
		a2.setFont(new Font("Colinas", Font.BOLD, 40));
		a3.setFont(new Font("Colinas", Font.BOLD, 40));
		a4.setFont(new Font("Colinas", Font.BOLD, 40));
		a5.setFont(new Font("Colinas", Font.BOLD, 40));
		a7.setFont(new Font("Colinas", Font.BOLD, 40));
		a8.setFont(new Font("Colinas", Font.BOLD, 40));
		a9.setFont(new Font("Colinas", Font.BOLD, 20));

		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b0);
		p.add(a0);
		p.add(a1);
		p.add(a2);
		p.add(a3);
		p.add(a4);
		p.add(a5);
		p.add(a7);
		p.add(a8);
		p.add(a9);

		label1 = new Label("Error please restart");
		label1.setBounds(0, 0, 400, 100);
		label1.setFont(new Font("Colinas", Font.BOLD, 40));
		label1.setVisible(false);
		p.add(label1);

		thehandler handler = new thehandler();
		thehandler1 handler1 = new thehandler1();
		thehandler2 handler2 = new thehandler2();
		thehandler3 handler3 = new thehandler3();
		thekeyhandler keys = new thekeyhandler();

		b0.addActionListener(handler);
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);
		b5.addActionListener(handler);
		b6.addActionListener(handler);
		b7.addActionListener(handler);
		b8.addActionListener(handler);
		b9.addActionListener(handler);
		a0.addActionListener(handler1);
		a1.addActionListener(handler1);
		a2.addActionListener(handler1);
		a3.addActionListener(handler1);
		a5.addActionListener(handler1);
		a7.addActionListener(handler1);
		a8.addActionListener(handler1);
		a9.addActionListener(handler2);
		a4.addActionListener(handler3);

		t = new TextArea();

		t.addKeyListener(keys);

		t.setBounds(0, 25, 400, 150);
		t.setBackground(Color.GRAY);
		t.setFont(new Font("Colinas", Font.BOLD, 50));
		t.setForeground(Color.WHITE);
		p.setBackground(Color.BLUE);
		p.add(t);
		return p;
	}

	private class thehandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			gg++;
			num[gg] = e.getActionCommand().charAt(0);

			thenum = new String(num);
			ff = new StringBuffer(thenum);

			if (wq >= 2) {
				System.out.println("you made a mistake");
				t.setText(" ");
				t.setVisible(false);
				label1.setVisible(true);
				ff.delete(0, ff.length());

				wq = 0;
				for (int i = 0; i <= num.length - 1; i++) {
					num[i] = ' ';
				}
				gg = -1;
			}
			wq = 0;
			thenum = new String(ff);

			t.setText(thenum);
		}
	}

	private class thehandler1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			wq++;
			gg++;
			num[gg] = e.getActionCommand().charAt(0);
			thenum = new String(num);
			ff = new StringBuffer(thenum);

			if (wq >= 2) {

				t.setText(" ");
				t.setVisible(false);
				label1.setVisible(true);
				ff.delete(0, ff.length());

				wq = 0;
				for (int i = 0; i <= num.length - 1; i++) {
					num[i] = ' ';
				}
				gg = -1;
			}

			thenum = new String(ff);

			t.setText(thenum);

		}
	}

	private class thehandler2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			label1.setVisible(false);
			t.setVisible(true);

			ff = new StringBuffer(thenum);
			wq = 0;
			if (wq == 0) {
				ff.delete(0, ff.length());

				t.setText(" ");
				for (int i = 0; i <= num.length - 1; i++) {
					num[i] = ' ';
				}
				gg = -1;
			}
			t.setText("");
			thenum = new String(ff);
			t.setText(thenum);

		}
	}

	private class thehandler3 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			wq++;
			gg++;
			num[gg] = e.getActionCommand().charAt(0);
			thenum = new String(num);
			ff = new StringBuffer(thenum);

			if (wq >= 2) {

				t.setText(" ");
				t.setVisible(false);
				label1.setVisible(true);
				ff.delete(0, ff.length());

				wq = 0;
				for (int i = 0; i <= num.length - 1; i++) {
					num[i] = ' ';
				}
				gg = -1;
			}

			thenum = new String(ff);
			if (thenum.charAt(0) == 's') {
				String beforsquare = 0 + thenum + 0;
				String[] square = thenum.split("s");
				String square1 = square[1];
				String[] square2 = square1.split("=");

				double number1 = Double.parseDouble(square2[0]);
				double to_be = Math.sqrt(number1);
				String the_last_string = "" + to_be;
				t.setText(the_last_string);
				thenum = the_last_string;
				

			} else {

				String idk = thenum + "0";
				String p[] = idk.split("=");
				String hululu = calcul(p[0], p[0], p[0], p[0], p[0], p[0]);
				t.setText(hululu);
				thenum = hululu;
				
			}
		}

	}

	public String calcul(String str, String str1, String str2, String str3, String str5, String str6) {
		String[] parts_minus = str.split("-");
		String[] parts_plus = str1.split("\\+");
		String[] parts_multi = str2.split("\\*");
		String[] parts_division = str3.split("\\/");

		String[] parts_power = str5.split("\\^");
		String[] parts_square = str6.split("s");

		float dd = 0;

		float array[] = new float[50];

		if (parts_minus.length > 1) {
			for (int i = 0; i <= parts_minus.length - 1; i++) {

				try {
					array[i] = Float.parseFloat(parts_minus[i]);

				} catch (NumberFormatException nfe) {

				}
			}

			dd = array[0] - array[1] - array[2] - array[3] - array[4] - array[5];

		}

		if (parts_plus.length > 1) {
			for (int i = 0; i <= parts_plus.length - 1; i++) {
				try {
					array[i] = Float.parseFloat(parts_plus[i]);

				} catch (NumberFormatException nfe) {

				}

			}
for(int i=0;i<=parts_plus.length - 1;i++) {
			dd =dd+array[i];
}
		}
		if (parts_multi.length > 1) {
			for (int i = 0; i < array.length; i++) {
				array[i] = 1;
			}
			for (int i = 0; i <= parts_multi.length - 1; i++) {

				try {
					array[i] = Float.parseFloat(parts_multi[i]);

				} catch (NumberFormatException nfe) {

				}

			}
			dd=1;
			for(int i=0;i<=parts_multi.length - 1;i++) {
				dd =dd*array[i];
	}
		}

		if (parts_division.length > 1) {
			for (int i = 0; i < array.length; i++) {
				array[i] = 1;
			}
			for (int i = 0; i <= parts_division.length - 1; i++) {

				try {
					array[i] = Float.parseFloat(parts_division[i]);
				} catch (NumberFormatException nfe) {

				}
			}

			dd = array[0] / array[1] / array[2] / array[3] / array[4] / array[5];

		}

		if (parts_power.length > 1) {
			for (int i = 0; i <= parts_power.length - 1; i++) {
				array[i] = Float.parseFloat(parts_power[i]);

				try {
					array[i] = Float.parseFloat(parts_power[i]);
				} catch (NumberFormatException nfe) {

				}
			}
			double q = (double) array[0];
			double e = (double) array[1];

			double qqqq = Math.pow(q, e);
			String thelast = qqqq + "";

			return thelast;
		}
		if (parts_square.length > 1) {
		}

		String thelast = dd + "";

		return thelast;
	}

	private class thekeyhandler extends KeyAdapter {

		@Override
		public void keyReleased(KeyEvent k) {
			String water = t.getText();

			for (int i = 0; i < water.length(); i++) {
				num[i] = water.charAt(i);
			}

			thenum = new String(num);
			if (num[water.length() - 1] == '=') {
				wq++;

				thenum = new String(num);
				ff = new StringBuffer(thenum);

				if (wq >= 2) {

					t.setText(" ");
					t.setVisible(false);
					label1.setVisible(true);
					ff.delete(0, ff.length());

					wq = 0;
					for (int i = 0; i <= num.length - 1; i++) {
						num[i] = ' ';
					}
					gg = -1;
				}

				thenum = new String(ff);
				String idk = thenum + "2";
				String p[] = idk.split("=");
				String hululu = calcul(p[0], p[0], p[0], p[0], p[0], p[0]);

				t.setText(hululu);
				thenum = hululu;
			}

		}

	}

	public String getthenum() {
		return thenum;

	}
	public void pasteee(String jk)
	{
	
		thenum=thenum+jk;

	
		t.setText(thenum);
	}
}