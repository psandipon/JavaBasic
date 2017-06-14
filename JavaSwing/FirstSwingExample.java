import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstSwingExample {
	public static void main(String[] args) {
		JFrame f = new JFrame();// creating instance of JFrame

		JButton b = new JButton("Click");// creating instance of JButton
		b.setBounds(150, 130, 100, 100);// x axis, y axis, width, height

		f.add(b);// adding button in JFrame

		f.setSize(400, 400);// 400 width and 400 height
		f.setLayout(null);// using no layout managers
		f.setVisible(true);// making the frame visible
	}
}
