package dairy;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiaryContents extends JFrame{
	private JTextField textField;
	
	public DiaryContents() {
		setTitle("일기장 내용");
		setSize(600, 600);
		
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		JLabel lblNo = new JLabel("번호");
		getContentPane().add(lblNo);
		
		textField = new JTextField();
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton save = new JButton("일기저장");
		getContentPane().add(save);
		
		JButton read = new JButton("일기읽기");
		getContentPane().add(read);
		
		JButton btnNewButton = new JButton("Save");
	
		});
		getContentPane().add(btnNewButton);
		
		JButton btnRead = new JButton("read");
		getContentPane().add(btnRead);
		
		
		setVisible(true);
		
		
	}
	
	
	
	public static void main(String[] args) {

	}

}
