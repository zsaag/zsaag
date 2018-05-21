package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class MyFrameTest {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}

class MyFrame extends JFrame{
	public MyFrame() {
		this.setTitle("내가 만든 프레임");
		this.setSize(500, 400);
		//패널 : 다른 컴퍼넌트들을 포함할 컴포넌트(컨테이너): JPanel
		
		JPanel panel = new JPanel();
		this.add(panel);
		
		
	}
}







