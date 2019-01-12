package dairy;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiaryMain extends JFrame {
	private JTextField id;
	private JTextField pw;

	public DiaryMain() {
		getContentPane().setBackground(Color.ORANGE);
		// 컨트롤+쉬프트+f(자동 정리)
		setTitle("나의 일기장 시작화면");
		setSize(500,500);
		
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow); //어떤것을 디자인하던 순서대로 붙는다는 명령어
		
		ImageIcon icon = new ImageIcon("emong2.jpg");
		
		JLabel lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(icon);
		
		JLabel label = new JLabel("아이디:");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		getContentPane().add(label);
		
		id = new JTextField();
		getContentPane().add(id);
		id.setColumns(30);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드:");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		getContentPane().add(lblNewLabel_1);
		
		pw = new JTextField();
		getContentPane().add(pw);
		pw.setColumns(30);
		
		JButton button = new JButton("로그인");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String sID = "root";
			String sPW = "1234";
			//조건이 2개여서 ()() , 둘 다 동시충족해야하니 &&
			String gID = id.getText();
			String gPW = pw.getText();
			
			if ((sID.equals(gID)) && (sPW.equals(gPW))) {
				JOptionPane.showMessageDialog(null, "로그인 OK입니다.");				
			} else {
				JOptionPane.showMessageDialog(null, "로그인 NOT입니다. 재입력해주세요.");

			}		
			}
		});
		button.setFont(new Font("궁서", Font.BOLD, 33));
		button.setBackground(Color.MAGENTA);
		getContentPane().add(button);
		
		JButton btnNewButton = new JButton("초기화");
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				pw.setText("");
				
			}
		});
		btnNewButton.setFont(new Font("궁서체", Font.BOLD, 33));
		getContentPane().add(btnNewButton);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		DiaryMain name = new DiaryMain();

	}

}
