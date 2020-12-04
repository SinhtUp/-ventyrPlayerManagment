import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;


public class Playermanager {

	public JFrame 
	frame;

	public JTextPane 
	txtInventory;
	
	
	public JTextField 
			//skillfelder variablen
			txtSkill1, txtSkill3, txtSkill2, txtSkill4, txtSkill5, txtSkill6, txtSkill7, txtSkill8, txtSkill9,
			txtSkill10, txtSkill11, txtSkill12, txtSkill13, txtSkill14, txtSkill15, txtSkill16, txtSkill17, txtSkill18,
			//skillFertigkeitswurf variablen
			skillFw1, skillFw2, skillFw3, skillFw4, skillFw5, skillFw6, skillFw7, skillFw8, skillFw9, skillFw10, skillFw11,
			skillFw12, skillFw13, skillFw14, skillFw15, skillFw16, skillFw17, skillFw18,
			//Waffenslots variablen
			txtweapon1, txtweapon2, txtweapon3, txtweapon4,
			//waffenFertigkeitswurf variablen
			txtWeaponFw1, txtWeaponFw2, txtWeaponFw3, txtWeaponFw4,
			//Waffenschaden variablen
			txtWeapondamage1, txtWeapondamage2, txtWeapondamage3, txtWeapondamage4,
			//Rüstungsslots varaiblen
			txtArmor1, txtArmor2, txtArmor3, txtArmor4,
			//Rüstungswerte variablen
			txtArmorpoint1, txtArmorpoint2, txtArmorpoint3, txtArmorpoint4,
			//Spezialskills variablen
			txtSpecialskill1, txtSpecialskill2, txtSpecialskill3, txtSpecialskill4, txtSpecialskill5,
			//Attribute variablen
			txtAttention, txtStrength, txtKnowledge, txtMagic, txtInitiative, txtMovement,
			//Leiden variablen
			txtSuffer1, txtSuffer2, txtSuffer3,
			//Charackter information Variablen
			txtAge, txtName, txtFolk, txtJob, txtGold, txtSilver, txtCopper, txtSkillpoints;
	
	

	
	
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
		skillFields();
		background();
		weapon();
		armor();
		specialSkill();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1380, 957);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}
	public void skillFields() {
		
		txtInventory = new JTextPane();
		txtInventory.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtInventory.setBackground(Color.LIGHT_GRAY);
		txtInventory.setBounds(1031, 473, 302, 415);
		frame.getContentPane().add(txtInventory);
		
		txtSkill1 = new JTextField();
		txtSkill1.setBounds(50, 220, 250, 27);
		txtSkill1.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill1.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill1.setText("test");
		frame.getContentPane().add(txtSkill1);
		txtSkill1.setColumns(10);

		txtSkill2 = new JTextField();
		txtSkill2.setBounds(50, 255, 250, 27);
		txtSkill2.setText("test");
		txtSkill2.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill2.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill2.setColumns(10);
		frame.getContentPane().add(txtSkill2);

		txtSkill3 = new JTextField();
		txtSkill3.setBounds(50, 290, 250, 27);
		txtSkill3.setText("test");
		txtSkill3.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill3.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill3.setColumns(10);
		frame.getContentPane().add(txtSkill3);

		txtSkill4 = new JTextField();
		txtSkill4.setBounds(50, 325, 250, 27);
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
		txtSkill6.setBounds(49, 395, 250, 27);
		txtSkill6.setText("test");
		txtSkill6.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill6.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill6.setColumns(10);
		frame.getContentPane().add(txtSkill6);

		txtSkill7 = new JTextField();
		txtSkill7.setBounds(49, 432, 250, 27);
		txtSkill7.setText("test");
		txtSkill7.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill7.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill7.setColumns(10);
		frame.getContentPane().add(txtSkill7);

		txtSkill8 = new JTextField();
		txtSkill8.setBounds(49, 468, 250, 27);
		txtSkill8.setText("test");
		txtSkill8.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill8.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill8.setColumns(10);
		frame.getContentPane().add(txtSkill8);

		txtSkill9 = new JTextField();
		txtSkill9.setBounds(47, 503, 250, 27);
		txtSkill9.setText("test");
		txtSkill9.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill9.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill9.setColumns(10);
		frame.getContentPane().add(txtSkill9);

		txtSkill10 = new JTextField();
		txtSkill10.setBounds(45, 539, 250, 27);
		txtSkill10.setText("test");
		txtSkill10.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill10.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill10.setColumns(10);
		frame.getContentPane().add(txtSkill10);

		txtSkill11 = new JTextField();
		txtSkill11.setBounds(45, 575, 250, 27);
		txtSkill11.setText("test");
		txtSkill11.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill11.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill11.setColumns(10);
		frame.getContentPane().add(txtSkill11);

		txtSkill12 = new JTextField();
		txtSkill12.setBounds(42, 610, 250, 27);
		txtSkill12.setText("test");
		txtSkill12.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill12.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill12.setColumns(10);
		frame.getContentPane().add(txtSkill12);

		txtSkill13 = new JTextField();
		txtSkill13.setBounds(42, 647, 250, 27);
		txtSkill13.setText("test");
		txtSkill13.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill13.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill13.setColumns(10);
		frame.getContentPane().add(txtSkill13);

		txtSkill14 = new JTextField();
		txtSkill14.setBounds(41, 683, 250, 27);
		txtSkill14.setText("test");
		txtSkill14.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill14.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill14.setColumns(10);
		frame.getContentPane().add(txtSkill14);

		txtSkill15 = new JTextField();
		txtSkill15.setBounds(40, 719, 250, 27);
		txtSkill15.setText("test");
		txtSkill15.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill15.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill15.setColumns(10);
		frame.getContentPane().add(txtSkill15);

		txtSkill16 = new JTextField();
		txtSkill16.setBounds(40, 755, 250, 27);
		txtSkill16.setText("test");
		txtSkill16.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkill16.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSkill16.setColumns(10);
		frame.getContentPane().add(txtSkill16);

		txtSkill17 = new JTextField();
		txtSkill17.setBounds(39, 791, 250, 27);
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
		txtSkill18.setBounds(40, 827, 250, 27);
		frame.getContentPane().add(txtSkill18);
		
		skillFw1 = new JTextField();
		skillFw1.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw1.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw1.setText("99");
		skillFw1.setBounds(313, 220, 30, 25);
		frame.getContentPane().add(skillFw1);
		skillFw1.setColumns(10);
		
		skillFw2 = new JTextField();
		skillFw2.setText("99");
		skillFw2.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw2.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw2.setColumns(10);
		skillFw2.setBounds(313, 255, 30, 25);
		frame.getContentPane().add(skillFw2);
		
		skillFw3 = new JTextField();
		skillFw3.setText("99");
		skillFw3.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw3.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw3.setColumns(10);
		skillFw3.setBounds(313, 291, 30, 25);
		frame.getContentPane().add(skillFw3);
		
		skillFw4 = new JTextField();
		skillFw4.setText("99");
		skillFw4.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw4.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw4.setColumns(10);
		skillFw4.setBounds(313, 326, 30, 25);
		frame.getContentPane().add(skillFw4);
		
		skillFw5 = new JTextField();
		skillFw5.setText("99");
		skillFw5.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw5.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw5.setColumns(10);
		skillFw5.setBounds(313, 362, 30, 25);
		frame.getContentPane().add(skillFw5);
		
		skillFw6 = new JTextField();
		skillFw6.setText("99");
		skillFw6.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw6.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw6.setColumns(10);
		skillFw6.setBounds(313, 397, 30, 25);
		frame.getContentPane().add(skillFw6);
		
		skillFw7 = new JTextField();
		skillFw7.setText("99");
		skillFw7.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw7.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw7.setColumns(10);
		skillFw7.setBounds(312, 432, 30, 25);
		frame.getContentPane().add(skillFw7);
		
		skillFw8 = new JTextField();
		skillFw8.setText("99");
		skillFw8.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw8.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw8.setColumns(10);
		skillFw8.setBounds(312, 468, 30, 25);
		frame.getContentPane().add(skillFw8);
		
		skillFw9 = new JTextField();
		skillFw9.setText("99");
		skillFw9.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw9.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw9.setColumns(10);
		skillFw9.setBounds(312, 504, 30, 25);
		frame.getContentPane().add(skillFw9);
		
		skillFw10 = new JTextField();
		skillFw10.setText("99");
		skillFw10.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw10.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw10.setColumns(10);
		skillFw10.setBounds(311, 539, 30, 25);
		frame.getContentPane().add(skillFw10);
		
		skillFw11 = new JTextField();
		skillFw11.setText("99");
		skillFw11.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw11.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw11.setColumns(10);
		skillFw11.setBounds(310, 576, 30, 25);
		frame.getContentPane().add(skillFw11);
		
		skillFw12 = new JTextField();
		skillFw12.setText("99");
		skillFw12.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw12.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw12.setColumns(10);
		skillFw12.setBounds(310, 612, 30, 25);
		frame.getContentPane().add(skillFw12);
		
		skillFw13 = new JTextField();
		skillFw13.setText("99");
		skillFw13.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw13.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw13.setColumns(10);
		skillFw13.setBounds(310, 647, 30, 25);
		frame.getContentPane().add(skillFw13);
		
		skillFw14 = new JTextField();
		skillFw14.setText("99");
		skillFw14.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw14.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw14.setColumns(10);
		skillFw14.setBounds(309, 683, 30, 25);
		frame.getContentPane().add(skillFw14);
		
		skillFw15 = new JTextField();
		skillFw15.setText("99");
		skillFw15.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw15.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw15.setColumns(10);
		skillFw15.setBounds(309, 719, 30, 25);
		frame.getContentPane().add(skillFw15);
		
		skillFw16 = new JTextField();
		skillFw16.setText("99");
		skillFw16.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw16.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw16.setColumns(10);
		skillFw16.setBounds(308, 756, 30, 25);
		frame.getContentPane().add(skillFw16);
		
		skillFw17 = new JTextField();
		skillFw17.setText("99");
		skillFw17.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw17.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw17.setColumns(10);
		skillFw17.setBounds(307, 794, 30, 25);
		frame.getContentPane().add(skillFw17);
		
		skillFw18 = new JTextField();
		skillFw18.setText("99");
		skillFw18.setHorizontalAlignment(SwingConstants.CENTER);
		skillFw18.setFont(new Font("Ubuntu", Font.BOLD, 17));
		skillFw18.setColumns(10);
		skillFw18.setBounds(307, 828, 30, 25);
		frame.getContentPane().add(skillFw18);
		
		
		
	}
	
	public void weapon() {
		txtweapon1 = new JTextField();
		txtweapon1.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtweapon1.setHorizontalAlignment(SwingConstants.CENTER);
		txtweapon1.setText("test");
		txtweapon1.setBounds(380, 290, 185, 30);
		frame.getContentPane().add(txtweapon1);
		txtweapon1.setColumns(10);
		
		txtweapon2 = new JTextField();
		txtweapon2.setText("test");
		txtweapon2.setHorizontalAlignment(SwingConstants.CENTER);
		txtweapon2.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtweapon2.setColumns(10);
		txtweapon2.setBounds(380, 323, 185, 30);
		frame.getContentPane().add(txtweapon2);
		
		txtweapon3 = new JTextField();
		txtweapon3.setText("test");
		txtweapon3.setHorizontalAlignment(SwingConstants.CENTER);
		txtweapon3.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtweapon3.setColumns(10);
		txtweapon3.setBounds(380, 359, 185, 30);
		frame.getContentPane().add(txtweapon3);
		
		txtweapon4 = new JTextField();
		txtweapon4.setText("test");
		txtweapon4.setHorizontalAlignment(SwingConstants.CENTER);
		txtweapon4.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtweapon4.setColumns(10);
		txtweapon4.setBounds(380, 394, 185, 30);
		frame.getContentPane().add(txtweapon4);
		
		txtWeapondamage1 = new JTextField();
		txtWeapondamage1.setText("999");
		txtWeapondamage1.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeapondamage1.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtWeapondamage1.setColumns(10);
		txtWeapondamage1.setBounds(585, 290, 42, 27);
		frame.getContentPane().add(txtWeapondamage1);
		
		txtWeapondamage2 = new JTextField();
		txtWeapondamage2.setText("999");
		txtWeapondamage2.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeapondamage2.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtWeapondamage2.setColumns(10);
		txtWeapondamage2.setBounds(586, 325, 42, 27);
		frame.getContentPane().add(txtWeapondamage2);
		
		txtWeapondamage3 = new JTextField();
		txtWeapondamage3.setText("999");
		txtWeapondamage3.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeapondamage3.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtWeapondamage3.setColumns(10);
		txtWeapondamage3.setBounds(585, 361, 42, 27);
		frame.getContentPane().add(txtWeapondamage3);
		
		txtWeapondamage4 = new JTextField();
		txtWeapondamage4.setText("999");
		txtWeapondamage4.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeapondamage4.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtWeapondamage4.setColumns(10);
		txtWeapondamage4.setBounds(586, 397, 42, 27);
		frame.getContentPane().add(txtWeapondamage4);
		
		txtWeaponFw1 = new JTextField();
		txtWeaponFw1.setAlignmentY(0.0f);
		txtWeaponFw1.setAlignmentX(0.0f);
		txtWeaponFw1.setText("99");
		txtWeaponFw1.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeaponFw1.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtWeaponFw1.setColumns(10);
		txtWeaponFw1.setBounds(641, 292, 30, 25);
		frame.getContentPane().add(txtWeaponFw1);
		
		txtWeaponFw2 = new JTextField();
		txtWeaponFw2.setText("99");
		txtWeaponFw2.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeaponFw2.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtWeaponFw2.setColumns(10);
		txtWeaponFw2.setAlignmentY(0.0f);
		txtWeaponFw2.setAlignmentX(0.0f);
		txtWeaponFw2.setBounds(640, 327, 30, 25);
		frame.getContentPane().add(txtWeaponFw2);
		
		txtWeaponFw3 = new JTextField();
		txtWeaponFw3.setText("99");
		txtWeaponFw3.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeaponFw3.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtWeaponFw3.setColumns(10);
		txtWeaponFw3.setAlignmentY(0.0f);
		txtWeaponFw3.setAlignmentX(0.0f);
		txtWeaponFw3.setBounds(640, 361, 30, 25);
		frame.getContentPane().add(txtWeaponFw3);
		
		txtWeaponFw4 = new JTextField();
		txtWeaponFw4.setText("99");
		txtWeaponFw4.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeaponFw4.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtWeaponFw4.setColumns(10);
		txtWeaponFw4.setAlignmentY(0.0f);
		txtWeaponFw4.setAlignmentX(0.0f);
		txtWeaponFw4.setBounds(640, 397, 30, 25);
		frame.getContentPane().add(txtWeaponFw4);
		
		

	}
	
	public void armor() {
		
		
		txtArmor1 = new JTextField();
		txtArmor1.setText("test");
		txtArmor1.setHorizontalAlignment(SwingConstants.CENTER);
		txtArmor1.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtArmor1.setBounds(380, 485, 226, 27);
		frame.getContentPane().add(txtArmor1);
		txtArmor1.setColumns(10);
		
		txtArmor2 = new JTextField();
		txtArmor2.setText("test");
		txtArmor2.setHorizontalAlignment(SwingConstants.CENTER);
		txtArmor2.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtArmor2.setColumns(10);
		txtArmor2.setBounds(380, 523, 226, 27);
		frame.getContentPane().add(txtArmor2);
		
		txtArmor3 = new JTextField();
		txtArmor3.setText("test");
		txtArmor3.setHorizontalAlignment(SwingConstants.CENTER);
		txtArmor3.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtArmor3.setColumns(10);
		txtArmor3.setBounds(380, 558, 226, 27);
		frame.getContentPane().add(txtArmor3);
		
		txtArmor4 = new JTextField();
		txtArmor4.setHorizontalAlignment(SwingConstants.CENTER);
		txtArmor4.setText("test");
		txtArmor4.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtArmor4.setColumns(10);
		txtArmor4.setBounds(380, 595, 226, 27);
		frame.getContentPane().add(txtArmor4);
		
		txtArmorpoint1 = new JTextField();
		txtArmorpoint1.setText("999");
		txtArmorpoint1.setHorizontalAlignment(SwingConstants.CENTER);
		txtArmorpoint1.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtArmorpoint1.setColumns(10);
		txtArmorpoint1.setBounds(625, 485, 42, 27);
		frame.getContentPane().add(txtArmorpoint1);
		
		txtArmorpoint2 = new JTextField();
		txtArmorpoint2.setText("999");
		txtArmorpoint2.setHorizontalAlignment(SwingConstants.CENTER);
		txtArmorpoint2.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtArmorpoint2.setColumns(10);
		txtArmorpoint2.setBounds(625, 523, 42, 27);
		frame.getContentPane().add(txtArmorpoint2);
		
		txtArmorpoint3 = new JTextField();
		txtArmorpoint3.setText("999");
		txtArmorpoint3.setHorizontalAlignment(SwingConstants.CENTER);
		txtArmorpoint3.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtArmorpoint3.setColumns(10);
		txtArmorpoint3.setBounds(625, 558, 42, 27);
		frame.getContentPane().add(txtArmorpoint3);
		
		txtArmorpoint4 = new JTextField();
		txtArmorpoint4.setText("999");
		txtArmorpoint4.setHorizontalAlignment(SwingConstants.CENTER);
		txtArmorpoint4.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtArmorpoint4.setColumns(10);
		txtArmorpoint4.setBounds(625, 595, 42, 27);
		frame.getContentPane().add(txtArmorpoint4);
		
	}
	public void specialSkill() {
		
		txtSpecialskill5 = new JTextField();
		txtSpecialskill5.setText("test");
		txtSpecialskill5.setHorizontalAlignment(SwingConstants.CENTER);
		txtSpecialskill5.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSpecialskill5.setColumns(10);
		txtSpecialskill5.setBounds(708, 430, 279, 30);
		frame.getContentPane().add(txtSpecialskill5);
		
		txtSpecialskill3 = new JTextField();
		txtSpecialskill3.setText("test");
		txtSpecialskill3.setHorizontalAlignment(SwingConstants.CENTER);
		txtSpecialskill3.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSpecialskill3.setColumns(10);
		txtSpecialskill3.setBounds(708, 359, 281, 30);
		frame.getContentPane().add(txtSpecialskill3);
		
		txtSpecialskill4 = new JTextField();
		txtSpecialskill4.setText("test");
		txtSpecialskill4.setHorizontalAlignment(SwingConstants.CENTER);
		txtSpecialskill4.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSpecialskill4.setColumns(10);
		txtSpecialskill4.setBounds(706, 395, 282, 30);
		frame.getContentPane().add(txtSpecialskill4);
		
		txtSpecialskill2 = new JTextField();
		txtSpecialskill2.setText("test");
		txtSpecialskill2.setHorizontalAlignment(SwingConstants.CENTER);
		txtSpecialskill2.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSpecialskill2.setColumns(10);
		txtSpecialskill2.setBounds(708, 323, 282, 30);
		frame.getContentPane().add(txtSpecialskill2);
		txtSpecialskill1 = new JTextField();
		txtSpecialskill1.setText("test");
		txtSpecialskill1.setHorizontalAlignment(SwingConstants.CENTER);
		txtSpecialskill1.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSpecialskill1.setColumns(10);
		txtSpecialskill1.setBounds(708, 288, 283, 30);
		frame.getContentPane().add(txtSpecialskill1);
		
		txtSuffer1 = new JTextField();
		txtSuffer1.setText("test");
		txtSuffer1.setHorizontalAlignment(SwingConstants.CENTER);
		txtSuffer1.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSuffer1.setColumns(10);
		txtSuffer1.setBounds(708, 522, 279, 30);
		frame.getContentPane().add(txtSuffer1);
		
		txtSuffer2 = new JTextField();
		txtSuffer2.setText("test");
		txtSuffer2.setHorizontalAlignment(SwingConstants.CENTER);
		txtSuffer2.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSuffer2.setColumns(10);
		txtSuffer2.setBounds(708, 558, 279, 30);
		frame.getContentPane().add(txtSuffer2);
		
		txtSuffer3 = new JTextField();
		txtSuffer3.setText("test");
		txtSuffer3.setHorizontalAlignment(SwingConstants.CENTER);
		txtSuffer3.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSuffer3.setColumns(10);
		txtSuffer3.setBounds(708, 594, 279, 30);
		frame.getContentPane().add(txtSuffer3);
		
		txtAttention = new JTextField();
		txtAttention.setText("999");
		txtAttention.setHorizontalAlignment(SwingConstants.CENTER);
		txtAttention.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtAttention.setColumns(10);
		txtAttention.setBounds(400, 195, 42, 27);
		frame.getContentPane().add(txtAttention);
		
		txtStrength = new JTextField();
		txtStrength.setText("999");
		txtStrength.setHorizontalAlignment(SwingConstants.CENTER);
		txtStrength.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtStrength.setColumns(10);
		txtStrength.setBounds(491, 197, 42, 27);
		frame.getContentPane().add(txtStrength);
		
		txtKnowledge = new JTextField();
		txtKnowledge.setText("999");
		txtKnowledge.setHorizontalAlignment(SwingConstants.CENTER);
		txtKnowledge.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtKnowledge.setColumns(10);
		txtKnowledge.setBounds(592, 197, 42, 27);
		frame.getContentPane().add(txtKnowledge);
		
		txtMagic = new JTextField();
		txtMagic.setText("999");
		txtMagic.setHorizontalAlignment(SwingConstants.CENTER);
		txtMagic.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtMagic.setColumns(10);
		txtMagic.setBounds(693, 195, 42, 27);
		frame.getContentPane().add(txtMagic);
		
		txtInitiative = new JTextField();
		txtInitiative.setText("999");
		txtInitiative.setHorizontalAlignment(SwingConstants.CENTER);
		txtInitiative.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtInitiative.setColumns(10);
		txtInitiative.setBounds(796, 195, 42, 27);
		frame.getContentPane().add(txtInitiative);
		
		txtMovement = new JTextField();
		txtMovement.setText("999");
		txtMovement.setHorizontalAlignment(SwingConstants.CENTER);
		txtMovement.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtMovement.setColumns(10);
		txtMovement.setBounds(897, 196, 42, 27);
		frame.getContentPane().add(txtMovement);
		
		txtAge = new JTextField();
		txtAge.setText("999");
		txtAge.setHorizontalAlignment(SwingConstants.CENTER);
		txtAge.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtAge.setColumns(10);
		txtAge.setBounds(961, 99, 42, 27);
		frame.getContentPane().add(txtAge);
		
		txtName = new JTextField();
		txtName.setText("test");
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtName.setColumns(10);
		txtName.setBounds(464, 56, 461, 27);
		frame.getContentPane().add(txtName);
		
		txtFolk = new JTextField();
		txtFolk.setText("test");
		txtFolk.setHorizontalAlignment(SwingConstants.CENTER);
		txtFolk.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtFolk.setColumns(10);
		txtFolk.setBounds(427, 102, 148, 27);
		frame.getContentPane().add(txtFolk);
		
		txtJob = new JTextField();
		txtJob.setText("test");
		txtJob.setHorizontalAlignment(SwingConstants.CENTER);
		txtJob.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtJob.setColumns(10);
		txtJob.setBounds(696, 102, 175, 27);
		frame.getContentPane().add(txtJob);
		
		txtGold = new JTextField();
		txtGold.setText("999");
		txtGold.setHorizontalAlignment(SwingConstants.CENTER);
		txtGold.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtGold.setColumns(10);
		txtGold.setBounds(883, 675, 104, 27);
		frame.getContentPane().add(txtGold);
		
		txtSilver = new JTextField();
		txtSilver.setText("999");
		txtSilver.setHorizontalAlignment(SwingConstants.CENTER);
		txtSilver.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSilver.setColumns(10);
		txtSilver.setBounds(883, 760, 103, 27);
		frame.getContentPane().add(txtSilver);
		
		txtCopper = new JTextField();
		txtCopper.setText("999");
		txtCopper.setHorizontalAlignment(SwingConstants.CENTER);
		txtCopper.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtCopper.setColumns(10);
		txtCopper.setBounds(883, 851, 106, 27);
		frame.getContentPane().add(txtCopper);
		
		
		
		
		
				
		JLabel lblCharakterbogen = new JLabel("");
		lblCharakterbogen.setBounds(0, 0, 1376, 937);
		lblCharakterbogen.setIcon(new ImageIcon(Playermanager.class.getResource("/image/charakter bogen.png")));
		frame.getContentPane().add(lblCharakterbogen);
		
		txtSkillpoints = new JTextField();
		txtSkillpoints.setText("99");
		txtSkillpoints.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkillpoints.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtSkillpoints.setColumns(10);
		txtSkillpoints.setBounds(246, 879, 30, 25);
		frame.getContentPane().add(txtSkillpoints);
		
	}
	
	public void background() {
	}
}
