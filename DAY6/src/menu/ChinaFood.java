package menu;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//컨트롤+쉬프트+o(영문)을 누르면 위에 문장이 생김

public class ChinaFood  extends JFrame {
	private JTextField textField; //private는 상속을 받았을때, 위의 class안에서만 쓸수있다는(하위범위한정 개념, 지워도ok)
	private JTextField textField_1;
	int count = 0;
	final int price = 5000;
	JLabel lblNewLabel;
	
	//이미 JFrame을 상속받고 시작, JFram의 메서드 다 가져와서 쓸 수 있음
	
	public ChinaFood() {
		getContentPane().setBackground(Color.PINK);
	setSize(700, 500);
	setTitle("주문하세요...");
	
	ImageIcon icon = new ImageIcon("중국집.png");
	
	
	
	FlowLayout flow = new FlowLayout();
	getContentPane().setLayout(flow);
	
	JButton button = new JButton("짜장면");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			count++; //1씩 자동증가 시켜주는 문장
			textField.setText(count+""); //+연산을 할때 하나라도 문자가 들어가면 다 문자가 되버림
			textField_1.setText(count*price+""); //가격계산 결과 (금액) 나오게 하는 문장
			
			ImageIcon icon2 = new ImageIcon("짜장면.jpg"); // 짜장 눌렀을때 이미지 짜장으로 바꿔주는 문장
			lblNewLabel.setIcon(icon2);
		}
	});
	button.setBackground(Color.ORANGE);
	button.setForeground(Color.MAGENTA);
	button.setFont(new Font("돋움", Font.BOLD, 18));
	getContentPane().add(button);
	
	JButton btnNewButton = new JButton("우동");
	btnNewButton.setForeground(Color.RED);
	btnNewButton.setFont(new Font("돋움", Font.BOLD, 18));
	btnNewButton.setBackground(Color.YELLOW);
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		count++;
		textField.setText(count+"");//버튼 누를때마다 개수 1씩 UP
		textField_1.setText(count*price+"");//가격계산 결과 나오게 하는거
		//우동 눌렀을때 우동으로 이미지 바꾸는 명령어 (↓)
		ImageIcon icon3 = new ImageIcon("우동.png");
		lblNewLabel.setIcon(icon3);
		
		}
	});
	getContentPane().add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("짬뽕");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			count++;
			textField.setText(count+"");
			textField_1.setText(count*price+"");
			ImageIcon icon4 = new ImageIcon("짬뽕.jpg");
			lblNewLabel.setIcon(icon4);
		}
	});
	btnNewButton_1.setForeground(Color.BLUE);
	btnNewButton_1.setFont(new Font("돋움", Font.BOLD, 18));
	btnNewButton_1.setBackground(Color.GREEN);
	getContentPane().add(btnNewButton_1);
	
	JLabel label = new JLabel("개수");
	getContentPane().add(label);
	
	textField = new JTextField();
	getContentPane().add(textField);
	textField.setColumns(10);
	
	JLabel label_1 = new JLabel("금액");
	getContentPane().add(label_1);
	
	textField_1 = new JTextField();
	getContentPane().add(textField_1);
	textField_1.setColumns(10);
	
	
	
	lblNewLabel = new JLabel("");
	getContentPane().add(lblNewLabel);
	
	lblNewLabel.setIcon(icon);
	
	setVisible(true);
	}
	
	public static void main(String[] args) {
		ChinaFood china = new ChinaFood(); //이건 위에 public ChinaFood를 가져오는거임
		
		
	}

}
