package example;

import javax.swing.*;
import java.awt.*;

public class CommonComponent extends JFrame {
	public CommonComponent() {
		// �˵���
		JMenuBar bar = new JMenuBar();
		// �˵�
		JMenu file = new JMenu("�ļ�");
		// �˵�ѡ��
		JMenuItem newFile = new JMenuItem("�½�");
		JMenuItem openFile = new JMenuItem("��");
		// �������������
		bar.add(file);
		file.add(newFile);
		file.add(openFile);
		this.add(bar, BorderLayout.NORTH);

		// ���1
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2, 2, 5, 5));
		this.add(panel1);

		// ��ǩ
		JLabel name = new JLabel("�û�����");
		panel1.add(name);

		// �ı���
		JTextField nameText = new JTextField("�������û���", 20);
		panel1.add(nameText);

		// ��ǩ
		JLabel passwd = new JLabel("���룺");
		panel1.add(passwd);

		// ������
		JPasswordField passwdText = new JPasswordField(10);
		panel1.add(passwdText);

		// ���2
		// JPanelĬ����ʽ����
		JPanel panel2 = new JPanel();

		// ��ǩ
		JLabel sex = new JLabel("�Ա�");
		panel2.add(sex);

		// ��ӵ�ѡ��ť
		JRadioButton male = new JRadioButton("��");
		JRadioButton female = new JRadioButton("Ů");
		// ��ѡ��ť�飬ͬһ���еĵ�ѡ��ť�໥�ų�
		ButtonGroup gender = new ButtonGroup();
		gender.add(male);
		gender.add(female);
		// ��ѡ��ť�鲻�ܼ���������
		panel2.add(male);
		panel2.add(female);

		// ���3
		JPanel panel3 = new JPanel();

		// ��ǩ
		JLabel hobby = new JLabel("���ã�");
		panel3.add(hobby);

		// ��ѡ��
		JCheckBox eat = new JCheckBox("�Է�");
		JCheckBox movie = new JCheckBox("��Ӱ");
		JCheckBox sleep = new JCheckBox("˯��");
		panel3.add(eat);
		panel3.add(movie);
		panel3.add(sleep);

		// ���4
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1, 0, 5, 5));

		// �ı���
		JLabel info = new JLabel("���˼��");
		panel4.add(info);
		JTextArea area = new JTextArea(20, 20);
		panel4.add(area);
		
		//���5
		JPanel panel5 = new JPanel(new BorderLayout());
		
		// �б�
		String[] data = { "one", "two", "three" };
		JList<String> list = new JList<String>(data);
		panel5.add(list,BorderLayout.WEST);
		
		//���6
		JPanel panel6 = new JPanel();
		
		// ��ͨ��ť
		JButton button = new JButton("ע��");
		panel6.add(button);
		JButton button2  =new JButton("ȡ��");
		panel6.add(button2);
		
		this.setLayout(new GridLayout(7,1,5,5));
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		this.add(panel5);
		this.add(panel6);

	}

	public static void main(String[] args) {
		CommonComponent frame = new CommonComponent();
		frame.setTitle("�������");
		frame.setSize(400, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
		frame.setVisible(true);
	}

}
