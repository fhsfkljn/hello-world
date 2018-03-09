package example;

import javax.swing.*;
import java.awt.*;

public class CommonComponent extends JFrame {
	public CommonComponent() {
		// 菜单条
		JMenuBar bar = new JMenuBar();
		// 菜单
		JMenu file = new JMenu("文件");
		// 菜单选项
		JMenuItem newFile = new JMenuItem("新建");
		JMenuItem openFile = new JMenuItem("打开");
		// 加入自身的容器
		bar.add(file);
		file.add(newFile);
		file.add(openFile);
		this.add(bar, BorderLayout.NORTH);

		// 面板1
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2, 2, 5, 5));
		this.add(panel1);

		// 标签
		JLabel name = new JLabel("用户名：");
		panel1.add(name);

		// 文本域
		JTextField nameText = new JTextField("请输入用户名", 20);
		panel1.add(nameText);

		// 标签
		JLabel passwd = new JLabel("密码：");
		panel1.add(passwd);

		// 密码域
		JPasswordField passwdText = new JPasswordField(10);
		panel1.add(passwdText);

		// 面板2
		// JPanel默认流式布局
		JPanel panel2 = new JPanel();

		// 标签
		JLabel sex = new JLabel("性别：");
		panel2.add(sex);

		// 添加单选按钮
		JRadioButton male = new JRadioButton("男");
		JRadioButton female = new JRadioButton("女");
		// 单选按钮组，同一组中的单选按钮相互排斥
		ButtonGroup gender = new ButtonGroup();
		gender.add(male);
		gender.add(female);
		// 单选按钮组不能加入容器中
		panel2.add(male);
		panel2.add(female);

		// 面板3
		JPanel panel3 = new JPanel();

		// 标签
		JLabel hobby = new JLabel("爱好：");
		panel3.add(hobby);

		// 复选框
		JCheckBox eat = new JCheckBox("吃饭");
		JCheckBox movie = new JCheckBox("电影");
		JCheckBox sleep = new JCheckBox("睡觉");
		panel3.add(eat);
		panel3.add(movie);
		panel3.add(sleep);

		// 面板4
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1, 0, 5, 5));

		// 文本域
		JLabel info = new JLabel("个人简介");
		panel4.add(info);
		JTextArea area = new JTextArea(20, 20);
		panel4.add(area);
		
		//面板5
		JPanel panel5 = new JPanel(new BorderLayout());
		
		// 列表
		String[] data = { "one", "two", "three" };
		JList<String> list = new JList<String>(data);
		panel5.add(list,BorderLayout.WEST);
		
		//面板6
		JPanel panel6 = new JPanel();
		
		// 普通按钮
		JButton button = new JButton("注册");
		panel6.add(button);
		JButton button2  =new JButton("取消");
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
		frame.setTitle("常用组件");
		frame.setSize(400, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
		frame.setVisible(true);
	}

}
