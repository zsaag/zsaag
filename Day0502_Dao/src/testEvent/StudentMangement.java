package testEvent;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;




public class StudentMangement extends JFrame implements KeyListener, Serializable {

	private static final long serialVersionUID = 1L;
	ObjectOutputStream oos = null; 
	ObjectInputStream ois = null;
	private JList<Student> studentJList;
	private StudentDao dao;
	Student s = new Student();
	private JButton btnDetail;
	private JButton btnInsertButton;
	private JButton btnDeleteButton;
	private JButton btnSearchButton;
	private JButton btnNewOut;
	private JTextField tfName;
	private JTextField tfGrade;
	private JTextField tfSkor;
	private JTextField tfSEng;
	private JTextField tfSMath;
	private JTextField DeletedField;
	private JTextField SearchField;
	private JButton btnLoadbutton;
	private Vector<Student> sList;
	JTextArea textArea;
	private JTextField textField;
	private JTextField textField_1;
	

	// 학생리스트 보여주고 선택하여 기본정보를 보여주는 화면
	// 데이터: 학생리스트
	public StudentMangement() {//StudentMangement 생성자
		
		//학생관리 title
		this.setTitle("학생관리");
		this.setSize(816, 443);
		Input();
		
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		//상세보기 버튼
		studentJList = new JList<Student>(sList); //sList에 ArrayList 객체 선언
		btnDetail = new JButton("상세보기");
		btnDetail.setBounds(552, 41, 207, 23);
		panel.add(btnDetail);
		btnDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				studentJList.setListData(sList);
				
			}
		});
		//삽입버튼
		btnInsertButton = new JButton("삽입");
		btnInsertButton.setBounds(552, 74, 207, 23);
		panel.add(btnInsertButton);
		btnInsertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Add(sList);//Add클래스 출력
				
			}
		});
		//삭제버튼
		btnDeleteButton = new JButton("삭제");
		btnDeleteButton.setBounds(552, 141, 207, 23);
		panel.add(btnDeleteButton);
		//삭제필드
		DeletedField = new JTextField();
		DeletedField.setBounds(552, 108, 207, 23);
		panel.add(DeletedField);
		DeletedField.setColumns(10);
		btnDeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(); //지우는 메서드
			}
		});
		//이름검색 버튼
		btnSearchButton = new JButton("이름검색");
		btnSearchButton.setBounds(552, 204, 207, 30);
		panel.add(btnSearchButton);
		//이름찾기 필드
		SearchField = new JTextField();
		SearchField.setBounds(552, 173, 207, 23);
		panel.add(SearchField);
		SearchField.setColumns(10);
		btnSearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				searchStudent(); //파일찾는 메서드
			}
		});		
		//종료 버튼
		btnNewOut = new JButton("종료");
		btnNewOut.setBounds(552, 275, 207, 23);
		panel.add(btnNewOut);
		btnNewOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				dispose(); //종료
			}
		});
		tfName = new JTextField();
		tfName.setBounds(319, 73, 116, 21);
		panel.add(tfName);
		tfName.setColumns(10);
		
		tfGrade = new JTextField();
		tfGrade.setBounds(319, 123, 116, 21);
		panel.add(tfGrade);
		tfGrade.setColumns(10);
		
		tfSkor = new JTextField();
		tfSkor.setBounds(319, 173, 116, 21);
		panel.add(tfSkor);
		tfSkor.setColumns(10);
		
		tfSEng = new JTextField();
		tfSEng.setBounds(319, 173, 116, 21);
		panel.add(tfSEng);
		tfSEng.setColumns(10);
		
		tfSMath = new JTextField();
		tfSMath.setBounds(319, 173, 116, 21);
		panel.add(tfSMath);
		tfSMath.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(250, 76, 57, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("학년");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(250, 126, 57, 15);
		panel.add(lblNewLabel_1);
		this.setVisible(true);
		this.setVisible(true);
		
		JLabel lblNewLabel_2 = new JLabel("국어");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(250, 177, 57, 15);
		panel.add(lblNewLabel_2);
		this.setVisible(true);
		
		//textarea 화면 출력 부분
		studentJList =new JList<Student>(sList);
		studentJList.setBounds(33, 29, 187, 234);
		//기본 선택값 주기
		studentJList.setSelectedIndex(0);
	
		panel.add(studentJList);
		
		JLabel lblNewLabel_3 = new JLabel("영어");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(250, 212, 57, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("수학");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(250, 248, 57, 15);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(319, 213, 116, 21);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(319, 242, 116, 21);
		panel.add(textField_1);
		this.setVisible(true);
		studentJList.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				Student student = studentJList.getSelectedValue();
				
				
			}
		});

	}

	public static void main(String[] args) {
		StudentMangement mainFrame = new StudentMangement();

	}

	
	//파일을 불러오는 메서드
	public void Input() {

		dao = new StudentDao();
		//DB에서 데이터 읽어오기
		List<Student> studentList = dao.selectAll();
		
		//DB에서 읽어온 데이터로 Vector 만들기
		sList = new Vector<Student>(studentList);
	}
	//파일을 저장해서 내보내는 메서드
	

	

	
	public void searchStudent() { // 해당 인덱스의 학생정보를 출력


		String keyword = SearchField.getText(); //searchField에서 입력 
		studentJList.setListData(sList);
		
		for (int i = 0; i < sList.size(); i++) { //반복문을 이용 sList에 저장되어 있는 내용중에서 이름으로 검색

			String name = sList.get(i).getSname();
			if (name.equals(keyword)) {//equals문으로 SearchField 같다면이라는 if 조건문 선언
				studentJList.setListData(sList);//textArea에 찾은 내용을 출력
			}
		}
//		printStudent2();
	}

	public void remove() { //삭제기능
		String name = DeletedField.getText();//DeletedField에서 입력 
	

		// 인덱스 찾아서 파라미더로 넘겨줌,반복종료
		for (int i = 0; i < sList.size(); i++) {

			Student tmpStudent = sList.get(i);
			String studentName = tmpStudent.getSname();
			if (studentName.equals(name)) {//equals문으로 DeletedField 같다면이라는 if 조건문 선언
				sList.remove(i);//조건을 만족하면 sList에 있는 인덱스 삭제
				break;//textArea에 찾은 내용을 출력
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
