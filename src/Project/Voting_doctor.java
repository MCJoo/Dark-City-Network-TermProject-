package Project;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextPane;

public class Voting_doctor extends JFrame {

	private JPanel contentPane;
	static JFrame frame;
	static JButton button, button_1, button_2, button_3, button_4, button_5, button_6, button_7, btnNewButton;
	static JTextPane textPane;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Voting start = new Voting();
	}

	public Voting_doctor() {

		frame = new JFrame("Voting");
		contentPane = new JPanel();
		contentPane.setLayout(null);

		frame.setContentPane(contentPane);

		button = new JButton("");
		button.setBounds(43, 110, 140, 46);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if (obj.equals(button)) {
					textPane.setText(button.getText());
				}
			}
		});

		button_1 = new JButton("");
		button_1.setBounds(43, 168, 140, 46);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if (obj.equals(button_1)) {
					textPane.setText(button_1.getText());
				}
			}
		});

		button_2 = new JButton("");
		button_2.setBounds(43, 226, 140, 46);
		contentPane.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if (obj.equals(button_2)) {
					textPane.setText(button_2.getText());
				}
			}
		});

		button_3 = new JButton("");
		button_3.setBounds(43, 296, 140, 46);
		contentPane.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if (obj.equals(button_3)) {
					textPane.setText(button_3.getText());
				}
			}
		});

		button_4 = new JButton("");
		button_4.setBounds(283, 110, 140, 46);
		contentPane.add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if (obj.equals(button_4)) {
					textPane.setText(button_4.getText());
				}
			}
		});

		button_5 = new JButton("");
		button_5.setBounds(283, 168, 140, 46);
		contentPane.add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if (obj.equals(button_5)) {
					textPane.setText(button_5.getText());
				}
			}
		});

		button_6 = new JButton("");
		button_6.setBounds(283, 226, 140, 46);
		contentPane.add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if (obj.equals(button_6)) {
					textPane.setText(button_6.getText());
				}
			}
		});

		button_7 = new JButton("");
		button_7.setBounds(283, 296, 140, 46);
		contentPane.add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if (obj.equals(button_7)) {
					textPane.setText(button_7.getText());
				}
			}
		});

		textPane = new JTextPane();
		textPane.setBounds(110, 12, 257, 56);
		contentPane.add(textPane);

		btnNewButton = new JButton("��ǥ�ϱ�");
		btnNewButton.setBounds(43, 369, 375, 56);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if (obj.equals(btnNewButton)) {
					Login.out.println("[Result]"+textPane.getText());
					System.out.println("[Result]"+textPane.getText());
					frame.setVisible(false);
				}
			}
		});

		frame.setBounds(200, 50, 500, 500);
		frame.setVisible(true);
	}
}
