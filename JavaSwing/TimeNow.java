import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class TimeNow {
	public static void main(String[] args) {
		JFrame f=new JFrame("Clock");
		final JTextField tf=new JTextField();
		tf.setBounds(62,80, 70,20);
		JButton b=new JButton("GET TIME");
		b.setBounds(50,50,95,30);
		b.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				LocalTime time = LocalTime.now();
				int hour = time.getHour() ;
				int minute =  time.getMinute() ;
				String AMPM = "AM" ;
				if(hour>12){
					hour = hour - 12 ;
					AMPM="PM" ;
				}
				tf.setText(""+hour+":"+minute+" "+AMPM);
			}
		});
		f.add(b);f.add(tf);
		f.setSize(200,180);
		f.setLayout(null);
		f.setVisible(true);
	}
}