import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class ScrollBarExample {
	public static void main(String args[]) {
		new ScrollBarExample();
	}
	ScrollBarExample() {
		JFrame f= new JFrame("Scrollbar Example");
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(300,120);
		final JScrollBar s=new JScrollBar();
		s.setBounds(120,100, 50,110);
		f.add(s);
		f.add(label);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		s.addAdjustmentListener(new AdjustmentListener() {
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				label.setText("Vertical Scrollbar value is:"+ s.getValue());
			}
		});
	}


}