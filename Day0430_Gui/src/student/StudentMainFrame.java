package student;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class StudentMainFrame extends JFrame{
	private JTextField tfName;
	private JTextField tfTotal;
	private JTextField tfAverage;
	private JButton btnDetail;
	private JButton btnSelect;
	private JList<Student> studentJList; //목록을 화면에 보여주는 컴포넌트
	//화면에 뿌려줄때 List가 아니라.... Vector를 이용
	
	//학생리스트 보여주고 선택하여 기본정보를 보여주는 화면
	//데이터 : 학생리스트>>실제 학생 정보를 가지고 있는 리스트 객체
	private Vector<Student> sList;
	
	//학생리스트 보여주고 선택하여 기본정보를 보여주는 화면
	//데이터: 학생리스트
	public StudentMainFrame() {
		this.setTitle("학생관리");
		this.setSize(489,354);
		//기본데이터 생성 및 sList에 데이터 넣기
		setDefaultData();
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//학생 목록을 화면에 보여줄 컴포넌트
		studentJList = new JList<Student>(sList);
		studentJList.setBounds(33, 29, 187, 234);
		//기본 선택값 주기
		studentJList.setSelectedIndex(0);
		panel.add(studentJList);
		
		btnDetail = new JButton("상세보기");
		btnDetail.setBounds(243, 240, 97, 23);
		panel.add(btnDetail);
		
		btnSelect = new JButton("점수보기");
		btnSelect.setBounds(352, 240, 97, 23);
		panel.add(btnSelect);
		
		
		
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student student=studentJList.getSelectedValue();
				
				tfName.setText(student.getName());
				tfTotal.setText(student.getTotal()+"");//숫자+"">> 문자열로 
				tfAverage.setText(student.getAverage()+"");
			}
		});
		
		tfName = new JTextField();
		tfName.setBounds(319, 73, 116, 21);
		panel.add(tfName);
		tfName.setColumns(10);
		
		tfTotal = new JTextField();
		tfTotal.setBounds(319, 123, 116, 21);
		panel.add(tfTotal);
		tfTotal.setColumns(10);
		
		tfAverage = new JTextField();
		tfAverage.setBounds(319, 173, 116, 21);
		panel.add(tfAverage);
		tfAverage.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(250, 76, 57, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("총점");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(250, 126, 57, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("평균");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(250, 176, 57, 15);
		panel.add(lblNewLabel_2);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		StudentMainFrame mainFrame = new StudentMainFrame();
	}
	
	//임의의 데이터를 만들어주는 메서드작성
	
	public void setDefaultData() {
		sList = new Vector<Student>();		
		sList.add(new Student("홍길동",3,100,100,100));
		sList.add(new Student("이순신",2,80,90,100));
		sList.add(new Student("신사임당",1,100,50,80));
		sList.add(new Student("김장금",3,50,100,90));		
	}
}
