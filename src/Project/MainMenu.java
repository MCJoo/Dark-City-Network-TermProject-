package Project;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MainMenu extends JFrame {
	public static MainMenu main;
	private JPanel contentPane;
	ImageIcon Start = new ImageIcon("Image/png/menu/gamestart.png");
	ImageIcon Ranking = new ImageIcon("Image/png/menu/ranking.png");
	ImageIcon Personal = new ImageIcon("Image/png/menu/mypage.png");
	ImageIcon Title = new ImageIcon("Image/png/menu/mainmeun.png");
	ImageIcon MainMenu_back = new ImageIcon("Image/png/menu/mainmeunback.png");
	ImageIcon gamestart = new ImageIcon("Image/gamestart_p.png");
	ImageIcon ranking = new ImageIcon("Image/ranking_p.png");
	ImageIcon mypage = new ImageIcon("Image/mypage_p.png");
	JPanel panel2; 
	JPanel panel3; 
	JPanel panel4; 
	public MainMenu() {
		contentPane = new JPanel() {
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				g.drawImage(MainMenu_back.getImage(), 0, 0, 1200, 800, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		contentPane.setLayout(null);
		setContentPane(contentPane);
		Image originImg = Start.getImage();
		Image changedImg = originImg.getScaledInstance(400, 80, Image.SCALE_SMOOTH);
		ImageIcon Icon = new ImageIcon(changedImg);

		JButton button1 = new JButton(Icon);
		button1.setBounds(92, 187, 456, 139);
		contentPane.add(button1);
		button1.setBorderPainted(false);
		button1.setContentAreaFilled(false);
		button1.setFocusPainted(false);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if (obj.equals(button1)) {
					Login.out.println("[WaitingRoom]");
					setVisible(false);
					new WaitingRoom();
					//new GameRoom().setVisible(false);
				}
			}
		});
		button1.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				panel2.setVisible(true);
				panel3.setVisible(false);
				panel4.setVisible(false);

			}
		});

		originImg = Ranking.getImage();
		changedImg = originImg.getScaledInstance(400, 80, Image.SCALE_SMOOTH);
		Icon = new ImageIcon(changedImg);
		JButton button2 = new JButton(Icon);
		button2.setBounds(92, 360, 456, 139);
		contentPane.add(button2);
		button2.setBorderPainted(false);
		button2.setContentAreaFilled(false);
		button2.setFocusPainted(false);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if (obj.equals(button2)) {
					Login.out.println("[Ranking]");
					new Ranking().setVisible(true);
				}
			}
		});
		button2.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				panel2.setVisible(false);
				panel3.setVisible(true);
				panel4.setVisible(false);

			}
		});

		originImg = Personal.getImage();
		changedImg = originImg.getScaledInstance(400, 80, Image.SCALE_SMOOTH);
		Icon = new ImageIcon(changedImg);
		JButton button3 = new JButton(Icon);
		button3.setBounds(92, 534, 456, 139);
		contentPane.add(button3);
		button3.setBorderPainted(false);
		button3.setContentAreaFilled(false);
		button3.setFocusPainted(false);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if (obj.equals(button3)) {
					Login.out.println("[Mypage]");
					new Mypage().setVisible(true);
				}
			}
		});
		button3.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				panel2.setVisible(false);
				panel3.setVisible(true);
				panel4.setVisible(false);

			}
		});

		JPanel panel1 = new JPanel() {
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				g.drawImage(Title.getImage(), 0, 0, 450, 100, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel1.setBounds(92, 36, 968, 119);
		contentPane.add(panel1);

		panel2 = new JPanel(){
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				g.drawImage(gamestart.getImage(), 0, 0, 417, 486, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel2.setBounds(640, 187, 417, 486);
		contentPane.add(panel2);
		panel3 = new JPanel(){
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				g.drawImage(ranking.getImage(), 0, 0, 417, 486, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel2.setBounds(640, 187, 417, 486);
		contentPane.add(panel2);
		panel4 = new JPanel(){
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				g.drawImage(mypage.getImage(), 0, 0, 417, 486, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel2.setBounds(640, 187, 417, 486);
		contentPane.add(panel2);
		

		setBounds(400, 100, 1200, 800);
	}

	public static void main(String[] args) {
		MainMenu test = new MainMenu();
		test.setVisible(true);
		
	}
}