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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StudentMangement extends JFrame implements KeyListener, Serializable {

	private static final long serialVersionUID = 1L;
	ObjectOutputStream oos = null; 
	ObjectInputStream ois = null;
	List<Student> sList;
	Student s = new Student();
	private JButton btnDetail;
	private JButton btnInsertButton;
	private JButton btnDeleteButton;
	private JButton btnSearchButton;
	private JButton btnNewOut;
	private JTextField DeletedField;
	private JTextField SearchField;
	private JButton btnLoadbutton;
	JTextArea textArea;

	// 학생리스트 보여주고 선택하여 기본정보를 보여주는 화면
	// 데이터: 학생리스트
	public StudentMangement() {//StudentMangement 생성자
		sList = new ArrayList<Student>(); //sList에 ArrayList 객체 선언
		//학생관리 title
		this.setTitle("학생관리");
		this.setSize(489, 354);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		//상세보기 버튼
		btnDetail = new JButton("상세보기");
		btnDetail.setBounds(254, 38, 207, 23);
		panel.add(btnDetail);
		btnDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				textArea.setText("");//화면refresh
				printStudent2(); //상세보기 클리식 나타남
				
			}
		});
		//삽입버튼
		btnInsertButton = new JButton("삽입");
		btnInsertButton.setBounds(254, 71, 207, 23);
		panel.add(btnInsertButton);
		btnInsertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Add(sList);//Add클래스 출력
				
			}
		});
		//삭제버튼
		btnDeleteButton = new JButton("삭제");
		btnDeleteButton.setBounds(254, 141, 207, 23);
		panel.add(btnDeleteButton);
		//삭제필드
		DeletedField = new JTextField();
		DeletedField.setBounds(254, 104, 207, 23);
		panel.add(DeletedField);
		DeletedField.setColumns(10);
		btnDeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(); //지우는 메서드
			}
		});
		//이름검색 버튼
		btnSearchButton = new JButton("이름검색");
		btnSearchButton.setBounds(254, 207, 207, 30);
		panel.add(btnSearchButton);
		//이름찾기 필드
		SearchField = new JTextField();
		SearchField.setBounds(254, 174, 207, 23);
		panel.add(SearchField);
		SearchField.setColumns(10);
		btnSearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				searchStudent(); //파일찾는 메서드
			}
		});		
		//종료 버튼
		btnNewOut = new JButton("종료");
		btnNewOut.setBounds(254, 282, 207, 23);
		panel.add(btnNewOut);
		btnNewOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Output(); //파일저장
				dispose(); //종료
			}
		});
		//불러오기 버튼
		JButton btnLoadbutton = new JButton("불러오기");
		btnLoadbutton.setBounds(12, 282, 97, 23);
		panel.add(btnLoadbutton);
		btnLoadbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Input(); //파일 불러오는 메서드
				textArea.setText(""); //화면refresh 
				printStudent(); //화면 출력 메서드
			}
		});
	

		
		//textarea 화면 출력 부분
		textArea = new JTextArea();
		textArea.setBounds(12, 10, 225, 258);
		panel.add(textArea);
		Input(); //파일 불러오는 메서드
		this.setVisible(true);

	}

	public static void main(String[] args) {
		StudentMangement mainFrame = new StudentMangement();

	}

	
	//파일을 불러오는 메서드
	public void Input() {

		try {// 데이터를 가져오는 기능
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("management.txt")));
			sList = (List<Student>) ois.readObject();
			for (int i = 0; i < sList.size(); i++) {
				// textArea.append(sList.get(0).toString());
				System.out.println(sList.get(i));
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일이없습니다");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//파일을 저장해서 내보내는 메서드
	public void Output() {
		
		try { //데이터를 저장하는 기능
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("management.txt")));
			List<Student> tmp = sList;
			oos.writeObject(tmp);
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void printStudent() { //파일 불러오기 출력 화면
		// Student s = sList.get(index);
        
		for (Student s : sList) {// for반복문 이용
			textArea.append("이름 : " + s.getName() + "\n");
			textArea.append("------------------------------------\n");
		}
	}
 
	public void printStudent2() { //상세보기 클릭 시 출력 화면
		// Student s = sList.get(index);

		for (Student s : sList) {// for반복문 이용
			textArea.append("이름 : " + s.getName() + "\n");
			textArea.append("학년 : " + s.getGrade() + "\n");
			textArea.append("평균 : " + s.getAverage() + "\n");
			textArea.append("총점: " + s.getTotal() + "\n");
			textArea.append("------------------------------------\n");
		}
	}

	
	public void searchStudent() { // 해당 인덱스의 학생정보를 출력


		String keyword = SearchField.getText(); //searchField에서 입력 
		textArea.setText(""); //화면 refresh
		
		for (int i = 0; i < sList.size(); i++) { //반복문을 이용 sList에 저장되어 있는 내용중에서 이름으로 검색

			String name = sList.get(i).getName();
			if (name.equals(keyword)) {//equals문으로 SearchField 같다면이라는 if 조건문 선언
				textArea.append(sList.get(i)+"");//textArea에 찾은 내용을 출력
			}
		}
//		printStudent2();
	}

	public void remove() { //삭제기능
		String name = DeletedField.getText();//DeletedField에서 입력 
	

		// 인덱스 찾아서 파라미더로 넘겨줌,반복종료
		for (int i = 0; i < sList.size(); i++) {

			Student tmpStudent = sList.get(i);
			String studentName = tmpStudent.getName();
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
