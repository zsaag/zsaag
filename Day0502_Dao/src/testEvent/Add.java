package testEvent;

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




public class Add extends JFrame { //Add 클래스는 jframe에 상속
	private JTextField tfName; //이름	
	private JTextField tfGrade;
	private JTextField tfKor; //국어
	private JTextField tfMath; //영어
	private JButton btnInsert; //추가 버튼
	private JList<Student> studentJList;
	private Vector<Student> sList; 	   //List<Student>선언
	private JTextField tfEng; //영어
	Student s;


	
	public Add(Vector<Student> sList) { //Add생성자 선언

		this.sList = sList; 
		this.setTitle("학생관리");
		this.setSize(313, 263);
		// 기본데이터 생성 및 sList에 데이터 넣기

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);


		//추가 버튼
		btnInsert = new JButton("추가");
		btnInsert.setBounds(125, 175, 97, 23);
		panel.add(btnInsert);
		//추가버튼 실행 ActionListener
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s = new Student(); //객체선언
				s.setSname(tfName.getText()); //Student의 setName을 불러옴
				s.setSgrade(Integer.parseInt(tfGrade.getText()));
				s.setSkor(Integer.parseInt(tfKor.getText())); //Student의 setName을 불러옴
				s.setSmath(Integer.parseInt(tfMath.getText())); //Student의 setName을 불러옴
				s.setSeng(Integer.parseInt(tfEng.getText())); //Student의 setName을 불러옴
			
				sList.add(s); //sList에 저장
				dispose(); //종료
			}
		});
		//이름 버튼
		JLabel lblName = new JLabel("이름");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(22, 41, 67, 15);
		panel.add(lblName);
		//이름 입력 필드
		tfName = new JTextField();
		tfName.setBounds(118, 38, 116, 21);
		panel.add(tfName);
		tfName.setColumns(10);
		//등급 입력 필드
		tfGrade = new JTextField();
		tfGrade.setBounds(118, 38, 116, 21);
		panel.add(tfGrade);
		tfGrade.setColumns(10);
		//국어점수 버튼
		JLabel lblKor = new JLabel("국어점수");
		lblKor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKor.setBounds(32, 72, 57, 15);
		panel.add(lblKor);
		//국어점수 입력 필드
		tfKor = new JTextField();
		tfKor.setBounds(118, 69, 116, 21);
		panel.add(tfKor);
		tfKor.setColumns(10);
		//수학점수 입력 버튼
		JLabel lblMath = new JLabel("수학점수");
		lblMath.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMath.setBounds(22, 107, 67, 15);
		panel.add(lblMath);
		//수학점수 입력 필드
		tfMath = new JTextField();
		tfMath.setBounds(118, 104, 116, 21);
		panel.add(tfMath);
		tfMath.setColumns(10);
		//영어점수 입력 버튼
		JLabel lblEng = new JLabel("영어점수");
		lblEng.setBounds(39, 138, 50, 15);
		panel.add(lblEng);
		this.setVisible(true);
		//영어점수 입력 필드
		tfEng = new JTextField();
		tfEng.setBounds(118, 135, 116, 21);
		panel.add(tfEng);
		tfEng.setColumns(10);
		
		this.setVisible(true);
	}

}
