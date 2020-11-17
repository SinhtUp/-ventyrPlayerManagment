import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Playermanager {

	public JFrame frame;

	// skill textfelder variablen!
	public JTextField txtSkill1, txtSkill3, txtSkill2, txtSkill4, txtSkill5, txtSkill6, txtSkill7, txtSkill8, txtSkill9,
			txtSkill10, txtSkill11, txtSkill12, txtSkill13, txtSkill14, txtSkill15, txtSkill16, txtSkill17, txtSkill18;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Playermanager window = new Playermanager();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Playermanager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1380, 957);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtSkill1 = new JTextField();
		txtSkill1.setBounds(50, 219, 250, 27);
		txtSkill1.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill1.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill1.setText("test");
		frame.getContentPane().add(txtSkill1);
		txtSkill1.setColumns(10);

		txtSkill2 = new JTextField();
		txtSkill2.setBounds(50, 253, 250, 27);
		txtSkill2.setText("test");
		txtSkill2.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill2.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill2.setColumns(10);
		frame.getContentPane().add(txtSkill2);

		txtSkill3 = new JTextField();
		txtSkill3.setBounds(50, 292, 250, 27);
		txtSkill3.setText("test");
		txtSkill3.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill3.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill3.setColumns(10);
		frame.getContentPane().add(txtSkill3);

		txtSkill4 = new JTextField();
		txtSkill4.setBounds(50, 322, 250, 27);
		txtSkill4.setText("test");
		txtSkill4.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill4.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill4.setColumns(10);
		frame.getContentPane().add(txtSkill4);

		txtSkill5 = new JTextField();
		txtSkill5.setBounds(50, 361, 250, 27);
		txtSkill5.setText("test");
		txtSkill5.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill5.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill5.setColumns(10);
		frame.getContentPane().add(txtSkill5);

		txtSkill6 = new JTextField();
		txtSkill6.setBounds(50, 395, 250, 27);
		txtSkill6.setText("test");
		txtSkill6.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill6.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill6.setColumns(10);
		frame.getContentPane().add(txtSkill6);

		txtSkill7 = new JTextField();
		txtSkill7.setBounds(50, 434, 250, 27);
		txtSkill7.setText("test");
		txtSkill7.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill7.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill7.setColumns(10);
		frame.getContentPane().add(txtSkill7);

		txtSkill8 = new JTextField();
		txtSkill8.setBounds(50, 465, 250, 27);
		txtSkill8.setText("test");
		txtSkill8.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill8.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill8.setColumns(10);
		frame.getContentPane().add(txtSkill8);

		txtSkill9 = new JTextField();
		txtSkill9.setBounds(50, 500, 250, 27);
		txtSkill9.setText("test");
		txtSkill9.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill9.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill9.setColumns(10);
		frame.getContentPane().add(txtSkill9);

		txtSkill10 = new JTextField();
		txtSkill10.setBounds(50, 539, 250, 27);
		txtSkill10.setText("test");
		txtSkill10.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill10.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill10.setColumns(10);
		frame.getContentPane().add(txtSkill10);

		txtSkill11 = new JTextField();
		txtSkill11.setBounds(50, 571, 250, 27);
		txtSkill11.setText("test");
		txtSkill11.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill11.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill11.setColumns(10);
		frame.getContentPane().add(txtSkill11);

		txtSkill12 = new JTextField();
		txtSkill12.setBounds(50, 610, 250, 27);
		txtSkill12.setText("test");
		txtSkill12.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill12.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill12.setColumns(10);
		frame.getContentPane().add(txtSkill12);

		txtSkill13 = new JTextField();
		txtSkill13.setBounds(50, 644, 250, 27);
		txtSkill13.setText("test");
		txtSkill13.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill13.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill13.setColumns(10);
		frame.getContentPane().add(txtSkill13);

		txtSkill14 = new JTextField();
		txtSkill14.setBounds(50, 678, 250, 27);
		txtSkill14.setText("test");
		txtSkill14.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill14.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill14.setColumns(10);
		frame.getContentPane().add(txtSkill14);

		txtSkill15 = new JTextField();
		txtSkill15.setBounds(50, 717, 250, 27);
		txtSkill15.setText("test");
		txtSkill15.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill15.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill15.setColumns(10);
		frame.getContentPane().add(txtSkill15);

		txtSkill16 = new JTextField();
		txtSkill16.setBounds(50, 756, 250, 27);
		txtSkill16.setText("test");
		txtSkill16.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill16.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill16.setColumns(10);
		frame.getContentPane().add(txtSkill16);

		txtSkill17 = new JTextField();
		txtSkill17.setBounds(50, 788, 250, 27);
		txtSkill17.setText("test");
		txtSkill17.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill17.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill17.setColumns(10);
		frame.getContentPane().add(txtSkill17);

		txtSkill18 = new JTextField();
		txtSkill18.setText("test");
		txtSkill18.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill18.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill18.setColumns(10);
		txtSkill18.setBounds(50, 827, 250, 27);
		frame.getContentPane().add(txtSkill18);

		JLabel lblCharakterbogen = new JLabel("");
		lblCharakterbogen.setBounds(0, 0, 1376, 937);
		lblCharakterbogen.setIcon(new ImageIcon(Playermanager.class.getResource("/image/charakter bogen.png")));
		frame.getContentPane().add(lblCharakterbogen);
	}
}
