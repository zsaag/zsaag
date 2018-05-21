package testEvent2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;




public class Add extends JFrame {
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfMath;
	private JButton btnInsert;;
	private JList<Student> studentJList; // 목록을 화면에 보여주는 컴포넌트
	private Vector<Student> sList;
	private JTextField tfEng;
	Student s;


	
	public Add(Vector<Student> sList) {

		this.sList = sList; 
		this.setTitle("학생관리");
		this.setSize(313, 263);
		// 기본데이터 생성 및 sList에 데이터 넣기

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);



		btnInsert = new JButton("추가");
		btnInsert.setBounds(125, 175, 97, 23);
		panel.add(btnInsert);

		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s = new Student();
				s.setName(tfName.getText());
				s.setKor(Integer.parseInt(tfKor.getText()));
				s.setMath(Integer.parseInt(tfMath.getText()));
				s.setEng(Integer.parseInt(tfEng.getText()));
				
				sList.add(s);
				dispose();
			}
		});

		JLabel lblName = new JLabel("이름");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(22, 41, 67, 15);
		panel.add(lblName);

		tfName = new JTextField();
		tfName.setBounds(118, 38, 116, 21);
		panel.add(tfName);
		tfName.setColumns(10);

		JLabel lblKor = new JLabel("국어점수");
		lblKor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKor.setBounds(32, 72, 57, 15);
		panel.add(lblKor);

		tfKor = new JTextField();
		tfKor.setBounds(118, 69, 116, 21);
		panel.add(tfKor);
		tfKor.setColumns(10);

		JLabel lblMath = new JLabel("수학점수");
		lblMath.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMath.setBounds(22, 107, 67, 15);
		panel.add(lblMath);

		tfMath = new JTextField();
		tfMath.setBounds(118, 104, 116, 21);
		panel.add(tfMath);
		tfMath.setColumns(10);

		JLabel lblEng = new JLabel("영어점수");
		lblEng.setBounds(39, 138, 50, 15);
		panel.add(lblEng);
		this.setVisible(true);

		tfEng = new JTextField();
		tfEng.setBounds(118, 135, 116, 21);
		panel.add(tfEng);
		tfEng.setColumns(10);
		
		this.setVisible(true);
	}

}
