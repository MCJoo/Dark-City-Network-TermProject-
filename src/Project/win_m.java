package Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;

public class win_m {
	//������Ʈ ����
		static JFrame frame = new JFrame();
		JLabel msg = new JLabel("마피아가 승리하였습니다.");
		Font font = new Font("맑은 고딕",Font.BOLD,40); //font ���� ���� ���� ���� ���Ƿ� �ֽ��ϴ�.
		public win_m()
		{
			//�� ǥ���� �����ϱ�(����ڰ� ���Ƿ� â �� �ݰ� �Ϸ��� �߰��߽��ϴ�.)
			//Font ����
			msg.setFont(font);
			//������Ʈ�� ���� �����̳� ���ϱ�
			Container container = frame.getContentPane();
	        container.add(msg, BorderLayout.CENTER);
	        msg.setHorizontalAlignment(JLabel.CENTER);
	        msg.setForeground(Color.white);
	        frame.getContentPane().setBackground(new Color(53,53,53));
			//������ ũ�� ����
	        frame.setBounds(600,300, 0, 0);
			frame.setSize(750, 150);
			frame.setBackground(Color.black);
			frame.setResizable(false);
			//������ ���̱� ����
			frame.setVisible(true);
			
			//���� ��ư ����
		}

		public static void main(String[] args)
		{
			//����
			new win_m();
		}
}
