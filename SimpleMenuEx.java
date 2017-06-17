

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SimpleMenuEx extends JFrame {


	private static final long serialVersionUID = 1L;

	public SimpleMenuEx() {

		initUI();
	}

	private void initUI() {

		createMenuBar();

		setTitle("Simple menu");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void createMenuBar() {

		JMenuBar menubar = new JMenuBar();


		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);

		JMenuItem eMenuItem = new JMenuItem("Exit");
		eMenuItem.setMnemonic(KeyEvent.VK_E);
		eMenuItem.setToolTipText("Exit application");
		eMenuItem.addActionListener((ActionEvent event) -> {
			System.exit(0);
		});

		file.add(eMenuItem);

		menubar.add(file);
		menubar.add(new JMenu("WhatEver...")) ;

		JMenu SubMenuDemo = new JMenu("SubMenuDemo");

		JMenu SubMenuDemoItem01 = new JMenu("SubMenuDemoItem01") ;
		JMenuItem SubMenuDemoItem02 = new JMenuItem("SubMenuDemoItem02") ;
		JMenuItem SubMenuDemoItem03 = new JMenuItem("SubMenuDemoItem03") ;

		JMenuItem item01 = new JMenuItem("01") ;
		JMenuItem item02 = new JMenuItem("02") ;
		JMenuItem item03 = new JMenuItem("03") ;

		SubMenuDemoItem01.add(item01) ;
		SubMenuDemoItem01.add(item02) ;
		SubMenuDemoItem01.add(item03) ;

		SubMenuDemo.addSeparator();
		SubMenuDemo.add(SubMenuDemoItem01) ;
		SubMenuDemo.addSeparator();
		SubMenuDemo.add(SubMenuDemoItem02) ;
		SubMenuDemo.add(SubMenuDemoItem03) ;

		SubMenuDemo.setMnemonic(KeyEvent.VK_F);

		menubar.add(SubMenuDemo);



		setJMenuBar(menubar);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			SimpleMenuEx ex = new SimpleMenuEx();
			ex.setVisible(true);
		});
	}
}