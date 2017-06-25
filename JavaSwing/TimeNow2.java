import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TimeNow2 {
	public static void main(String[] args) {

		JFrame f = new JFrame("Clock");

		final JTextField TimeField = new JTextField();
		TimeField.setBounds(62, 80, 70, 20);

		JButton b2 = new JButton("GET TIME");
		b2.setBounds(50, 50, 95, 30);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				TimeField.setText(DateFormat.getTimeInstance().format(date));
			}
		});

		final JTextField DateField = new JTextField();
		DateField.setBounds(52, 150, 90, 20);

		JButton b1 = new JButton("GET DATE");
		b1.setBounds(50, 120, 95, 30);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				DateField.setText(DateFormat.getDateInstance().format(date));
			}
		});

		f.add(DateField);
		f.add(TimeField);
		f.add(b1);
		f.add(b2);

		f.setSize(200, 250);
		f.setLayout(null);
		f.setVisible(true);
	}
}