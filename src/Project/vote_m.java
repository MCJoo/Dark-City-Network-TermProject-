package Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;

public class vote_m {

	//������Ʈ ����
	static JFrame frame = new JFrame();
	JLabel msg = new JLabel("���Ǿ��� ��ǥ�� �������Դϴ�");
	Font font = new Font("��������",Font.BOLD,40); //font ���� ���� ���� ���� ���Ƿ� �ֽ��ϴ�.
	public vote_m()
	{
		//�� ǥ���� �����ϱ�(����ڰ� ���Ƿ� â �� �ݰ� �Ϸ��� �߰��߽��ϴ�.)
		frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		//Font ����
		msg.setFont(font);
		//������Ʈ�� ���� �����̳� ���ϱ�
		Container container = frame.getContentPane();
        container.add(msg, BorderLayout.CENTER);
        msg.setHorizontalAlignment(JLabel.CENTER);
        msg.setForeground(Color.white);
        frame.setBounds(600,300, 0, 0);
        frame.getContentPane().setBackground(new Color(53,53,53));
		//������ ũ�� ����
		frame.setSize(750, 150);
		frame.setBackground(Color.black);
		frame.setResizable(false);
		//������ ���̱� ����
		frame.setUndecorated(true);
	}

	public static void main(String[] args)
	{
		//����
		new vote_m();
	}
}