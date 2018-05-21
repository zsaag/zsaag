package testEvent2;

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
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.JList;

public class StudentMangement extends JFrame implements KeyListener, Serializable {
	
	private static final long serialVersionUID = 1L;
	ObjectOutputStream oos=null;
	ObjectInputStream ois =null;	
	Vector<Student> sList;
	Student s = new Student();
	private JButton btnDetail;
	private JButton btnInsertButton;
	private JButton btnDeleteButton;
	private JButton btnSearchButton;
	private JButton btnNewOut; 
	private JTextField DeletedField;
	private JTextField SearchField;
	private JList list;
	private JButton btnLoadButton;
	
	
	//학생리스트 보여주고 선택하여 기본정보를 보여주는 화면
	//데이터: 학생리스트
	public StudentMangement() {
		
		
		this.setTitle("학생관리");
		this.setSize(489,354);
		
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		btnDetail = new JButton("상세보기");
		btnDetail.setBounds(254, 38, 207, 23);
		panel.add(btnDetail);
		
		btnDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}	
		});
		btnLoadButton = new JButton("불러오기");
		btnLoadButton.setBounds(12, 282, 97, 23);
		panel.add(btnLoadButton);
		btnLoadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input();
				list.setListData(sList);
			}
		});
		
		
		btnInsertButton = new JButton("삽입");
		btnInsertButton.setBounds(254, 71, 207, 23);
		panel.add(btnInsertButton);
		btnInsertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Add(sList);	
			}
		});
		
		
		btnDeleteButton = new JButton("삭제");
		btnDeleteButton.setBounds(254, 141, 207, 23);
		panel.add(btnDeleteButton);
		btnDeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove();
			}
		});
		
		
		btnSearchButton = new JButton("이름검색");
		btnSearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				searchStudent();
			}
		});
		btnSearchButton.setBounds(254, 207, 207, 30);
		panel.add(btnSearchButton);
		
		btnNewOut = new JButton("종료");
		btnNewOut.setBounds(254, 282, 207, 23);
		panel.add(btnNewOut);
		btnNewOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				Output();
				dispose();	
			}
		});
		
		DeletedField = new JTextField();
		DeletedField.setBounds(254, 104, 207, 23);
		panel.add(DeletedField);
		DeletedField.setColumns(10);
		
		SearchField = new JTextField();
		SearchField.setBounds(254, 174, 207, 23);
		panel.add(SearchField);
		SearchField.setColumns(10);
		
		list = new JList();
		list.setBounds(12, 10, 230, 251);
		panel.add(list);
			
		Input();
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		StudentMangement mainFrame = new StudentMangement();
	}
	
	//임의의 데이터를 만들어주는 메서드작성
	

	public void Input() {
		
		try {//데이터를 가져오는 기능
			ois = new ObjectInputStream(
					new BufferedInputStream( 
						new FileInputStream("st.txt")));
			sList = (Vector<Student>)ois.readObject();
			System.out.println(sList.get(0).toString());
			for(int i=0;i<sList.size();i++) {
				//textArea.append(sList.get(0).toString());
			System.out.println(sList.get(i));
		}

	}catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			sList = new Vector<Student>();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		

	public void Output(){ 
		
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("st.txt")));
			Vector<Student> tmp = sList;
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
	

	public void searchStudent() {
		
		String keyword = SearchField.getText();
		for (int i = 0; i < sList.size(); i++) {
		
			String name = sList.get(i).getName();
			if (name.contains(keyword)) {			
				
				}
			}
	}
	 public void remove() {
		String name = DeletedField.getText();
			//이름을 입력받아서 인덱스를 찾고, 인덱스를 studentlist.remove()
			//파라비터로 넘겨줌
			
			//인덱스 찾아서 파라미더로 넘겨줌,반복종료
			for(int i=0;i<sList.size();i++) {
				
				Student tmpStudent = sList.get(i);
				String studentName = tmpStudent.getName();
				if(studentName.equals(name)) {
					sList.remove(i);
					break;
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
	
	

