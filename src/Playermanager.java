import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;

import java.io.File;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.awt.event.ActionEvent;

import java.awt.Insets;
import javax.swing.UIManager;

import java.awt.Dimension;









public class Playermanager {
	
	public JFrame 
	frame;

	public JTextPane 
	txtInventory;
	
	
	//Textfeld Variablen
	public JTextField 
			//skillfelder variablen
			txtSkill1, txtSkill3, txtSkill2, txtSkill4, txtSkill5, txtSkill6, txtSkill7, txtSkill8, txtSkill9,
			txtSkill10, txtSkill11, txtSkill12, txtSkill13, txtSkill14, txtSkill15, txtSkill16, txtSkill17, txtSkill18,
			//skillFertigkeitswurf variablen
			txtskillFw1, txtskillFw2, txtskillFw3, txtskillFw4, txtskillFw5, txtskillFw6, txtskillFw7, txtskillFw8, txtskillFw9, txtskillFw10, txtskillFw11,
			txtskillFw12, txtskillFw13, txtskillFw14, txtskillFw15, txtskillFw16, txtskillFw17, txtskillFw18,
			//Waffenslots variablen
			txtWeapon1, txtWeapon2, txtWeapon3, txtWeapon4,
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
			txtAge, txtName, txtFolk, txtJob, txtGold, txtSilver, txtCopper, txtSkillpoints,
			//variablen verteidigungs punkte
			txtDefensepoint1, txtDefensepoint2, txtDefensepoint3, txtDefensepoint4, txtDefensepoint5, txtDefensepoint6, txtDefensepoint7, txtDefensepoint8,
			//Lebenspunkte variablen
			txtLifepoints1, txtLifepoints2, txtLifepoints3, txtLifepoints4, txtLifepoints5, txtLifepoints6, txtLifepoints7, txtLifepoints8,
			//Verwundet Variablen
			txtWounded1, txtWounded3, txtWounded2, txtWounded4, txtWounded5, txtWounded6, txtWounded7, txtDeadlywounded
			;
	
	public String empty = "";
	private JButton btnLoad;
	private JButton btnReset;
	

	
	
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
		//probe kann später gelöscht werden, nur zu überprüfung ob alle werte übergebn werden.
		//ProfilInstance pi = new ProfilInstance();
		//pi.instance();
		//System.out.println( pi.strSkill1 +" " + pi.skillFw1);
			
		
		
		
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
		suffer();
		inventory();
		attributes();
		character();
		buttons();
		
		
		
		
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
		
		txtskillFw1 = new JTextField();
		txtskillFw1.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw1.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw1.setText("99");
		txtskillFw1.setBounds(313, 220, 30, 25);
		frame.getContentPane().add(txtskillFw1);
		txtskillFw1.setColumns(10);
		
		txtskillFw2 = new JTextField();
		txtskillFw2.setText("99");
		txtskillFw2.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw2.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw2.setColumns(10);
		txtskillFw2.setBounds(313, 255, 30, 25);
		frame.getContentPane().add(txtskillFw2);
		
		txtskillFw3 = new JTextField();
		txtskillFw3.setText("99");
		txtskillFw3.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw3.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw3.setColumns(10);
		txtskillFw3.setBounds(313, 291, 30, 25);
		frame.getContentPane().add(txtskillFw3);
		
		txtskillFw4 = new JTextField();
		txtskillFw4.setText("99");
		txtskillFw4.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw4.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw4.setColumns(10);
		txtskillFw4.setBounds(313, 326, 30, 25);
		frame.getContentPane().add(txtskillFw4);
		
		txtskillFw5 = new JTextField();
		txtskillFw5.setText("99");
		txtskillFw5.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw5.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw5.setColumns(10);
		txtskillFw5.setBounds(313, 362, 30, 25);
		frame.getContentPane().add(txtskillFw5);
		
		txtskillFw6 = new JTextField();
		txtskillFw6.setText("99");
		txtskillFw6.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw6.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw6.setColumns(10);
		txtskillFw6.setBounds(313, 397, 30, 25);
		frame.getContentPane().add(txtskillFw6);
		
		txtskillFw7 = new JTextField();
		txtskillFw7.setText("99");
		txtskillFw7.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw7.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw7.setColumns(10);
		txtskillFw7.setBounds(312, 432, 30, 25);
		frame.getContentPane().add(txtskillFw7);
		
		txtskillFw8 = new JTextField();
		txtskillFw8.setText("99");
		txtskillFw8.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw8.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw8.setColumns(10);
		txtskillFw8.setBounds(312, 468, 30, 25);
		frame.getContentPane().add(txtskillFw8);
		
		txtskillFw9 = new JTextField();
		txtskillFw9.setText("99");
		txtskillFw9.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw9.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw9.setColumns(10);
		txtskillFw9.setBounds(312, 504, 30, 25);
		frame.getContentPane().add(txtskillFw9);
		
		txtskillFw10 = new JTextField();
		txtskillFw10.setText("99");
		txtskillFw10.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw10.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw10.setColumns(10);
		txtskillFw10.setBounds(311, 539, 30, 25);
		frame.getContentPane().add(txtskillFw10);
		
		txtskillFw11 = new JTextField();
		txtskillFw11.setText("99");
		txtskillFw11.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw11.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw11.setColumns(10);
		txtskillFw11.setBounds(310, 576, 30, 25);
		frame.getContentPane().add(txtskillFw11);
		
		txtskillFw12 = new JTextField();
		txtskillFw12.setText("99");
		txtskillFw12.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw12.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw12.setColumns(10);
		txtskillFw12.setBounds(310, 612, 30, 25);
		frame.getContentPane().add(txtskillFw12);
		
		txtskillFw13 = new JTextField();
		txtskillFw13.setText("99");
		txtskillFw13.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw13.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw13.setColumns(10);
		txtskillFw13.setBounds(310, 647, 30, 25);
		frame.getContentPane().add(txtskillFw13);
		
		txtskillFw14 = new JTextField();
		txtskillFw14.setText("99");
		txtskillFw14.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw14.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw14.setColumns(10);
		txtskillFw14.setBounds(309, 683, 30, 25);
		frame.getContentPane().add(txtskillFw14);
		
		txtskillFw15 = new JTextField();
		txtskillFw15.setText("99");
		txtskillFw15.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw15.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw15.setColumns(10);
		txtskillFw15.setBounds(309, 719, 30, 25);
		frame.getContentPane().add(txtskillFw15);
		
		txtskillFw16 = new JTextField();
		txtskillFw16.setText("99");
		txtskillFw16.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw16.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw16.setColumns(10);
		txtskillFw16.setBounds(308, 756, 30, 25);
		frame.getContentPane().add(txtskillFw16);
		
		txtskillFw17 = new JTextField();
		txtskillFw17.setText("99");
		txtskillFw17.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw17.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw17.setColumns(10);
		txtskillFw17.setBounds(307, 794, 30, 25);
		frame.getContentPane().add(txtskillFw17);
		
		txtskillFw18 = new JTextField();
		txtskillFw18.setText("99");
		txtskillFw18.setHorizontalAlignment(SwingConstants.CENTER);
		txtskillFw18.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtskillFw18.setColumns(10);
		txtskillFw18.setBounds(307, 828, 30, 25);
		frame.getContentPane().add(txtskillFw18);
		
		txtSkillpoints = new JTextField();
		txtSkillpoints.setText("99");
		txtSkillpoints.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkillpoints.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtSkillpoints.setColumns(10);
		txtSkillpoints.setBounds(246, 879, 30, 25);
		frame.getContentPane().add(txtSkillpoints);
		
		
		
	}
	public void weapon() {
		txtWeapon1 = new JTextField();
		txtWeapon1.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtWeapon1.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeapon1.setText("test");
		txtWeapon1.setBounds(380, 290, 185, 30);
		frame.getContentPane().add(txtWeapon1);
		txtWeapon1.setColumns(10);
		
		txtWeapon2 = new JTextField();
		txtWeapon2.setText("test");
		txtWeapon2.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeapon2.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtWeapon2.setColumns(10);
		txtWeapon2.setBounds(380, 323, 185, 30);
		frame.getContentPane().add(txtWeapon2);
		
		txtWeapon3 = new JTextField();
		txtWeapon3.setText("test");
		txtWeapon3.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeapon3.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtWeapon3.setColumns(10);
		txtWeapon3.setBounds(380, 359, 185, 30);
		frame.getContentPane().add(txtWeapon3);
		
		txtWeapon4 = new JTextField();
		txtWeapon4.setText("test");
		txtWeapon4.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeapon4.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtWeapon4.setColumns(10);
		txtWeapon4.setBounds(380, 394, 185, 30);
		frame.getContentPane().add(txtWeapon4);
		
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
		
		txtDefensepoint1 = new JTextField();
		txtDefensepoint1.setText("999");
		txtDefensepoint1.setHorizontalAlignment(SwingConstants.CENTER);
		txtDefensepoint1.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtDefensepoint1.setColumns(10);
		txtDefensepoint1.setBounds(393, 664, 42, 27);
		frame.getContentPane().add(txtDefensepoint1);
		
		txtDefensepoint2 = new JTextField();
		txtDefensepoint2.setText("999");
		txtDefensepoint2.setHorizontalAlignment(SwingConstants.CENTER);
		txtDefensepoint2.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtDefensepoint2.setColumns(10);
		txtDefensepoint2.setBounds(470, 664, 30, 25);
		frame.getContentPane().add(txtDefensepoint2);
		
		txtDefensepoint3 = new JTextField();
		txtDefensepoint3.setText("999");
		txtDefensepoint3.setHorizontalAlignment(SwingConstants.CENTER);
		txtDefensepoint3.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtDefensepoint3.setColumns(10);
		txtDefensepoint3.setBounds(519, 663, 30, 25);
		frame.getContentPane().add(txtDefensepoint3);
		
		txtDefensepoint4 = new JTextField();
		txtDefensepoint4.setText("999");
		txtDefensepoint4.setHorizontalAlignment(SwingConstants.CENTER);
		txtDefensepoint4.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtDefensepoint4.setColumns(10);
		txtDefensepoint4.setBounds(566, 663, 30, 25);
		frame.getContentPane().add(txtDefensepoint4);
		
		txtDefensepoint5 = new JTextField();
		txtDefensepoint5.setText("999");
		txtDefensepoint5.setHorizontalAlignment(SwingConstants.CENTER);
		txtDefensepoint5.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtDefensepoint5.setColumns(10);
		txtDefensepoint5.setBounds(614, 663, 30, 25);
		frame.getContentPane().add(txtDefensepoint5);
		
		txtDefensepoint6 = new JTextField();
		txtDefensepoint6.setText("999");
		txtDefensepoint6.setHorizontalAlignment(SwingConstants.CENTER);
		txtDefensepoint6.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtDefensepoint6.setColumns(10);
		txtDefensepoint6.setBounds(663, 663, 30, 25);
		frame.getContentPane().add(txtDefensepoint6);
		
		txtDefensepoint7 = new JTextField();
		txtDefensepoint7.setText("999");
		txtDefensepoint7.setHorizontalAlignment(SwingConstants.CENTER);
		txtDefensepoint7.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtDefensepoint7.setColumns(10);
		txtDefensepoint7.setBounds(712, 663, 30, 25);
		frame.getContentPane().add(txtDefensepoint7);
		
		txtDefensepoint8 = new JTextField();
		txtDefensepoint8.setText("999");
		txtDefensepoint8.setHorizontalAlignment(SwingConstants.CENTER);
		txtDefensepoint8.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtDefensepoint8.setColumns(10);
		txtDefensepoint8.setBounds(761, 663, 30, 25);
		frame.getContentPane().add(txtDefensepoint8);
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
			
	}
	public void suffer() {
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
	}
	public void inventory() {
		txtInventory = new JTextPane();
		txtInventory.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtInventory.setBackground(Color.LIGHT_GRAY);
		txtInventory.setBounds(1031, 473, 302, 415);
		frame.getContentPane().add(txtInventory);
	}
	public void attributes() {
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
		
		txtLifepoints1 = new JTextField();
		txtLifepoints1.setText("999");
		txtLifepoints1.setHorizontalAlignment(SwingConstants.CENTER);
		txtLifepoints1.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtLifepoints1.setColumns(10);
		txtLifepoints1.setBounds(393, 760, 42, 27);
		frame.getContentPane().add(txtLifepoints1);
		
		txtLifepoints2 = new JTextField();
		txtLifepoints2.setText("999");
		txtLifepoints2.setHorizontalAlignment(SwingConstants.CENTER);
		txtLifepoints2.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtLifepoints2.setColumns(10);
		txtLifepoints2.setBounds(468, 760, 30, 25);
		frame.getContentPane().add(txtLifepoints2);
		
		txtLifepoints3 = new JTextField();
		txtLifepoints3.setText("999");
		txtLifepoints3.setHorizontalAlignment(SwingConstants.CENTER);
		txtLifepoints3.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtLifepoints3.setColumns(10);
		txtLifepoints3.setBounds(518, 760, 30, 25);
		frame.getContentPane().add(txtLifepoints3);
		
		txtLifepoints4 = new JTextField();
		txtLifepoints4.setText("999");
		txtLifepoints4.setHorizontalAlignment(SwingConstants.CENTER);
		txtLifepoints4.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtLifepoints4.setColumns(10);
		txtLifepoints4.setBounds(565, 760, 30, 25);
		frame.getContentPane().add(txtLifepoints4);
		
		txtLifepoints5 = new JTextField();
		txtLifepoints5.setText("999");
		txtLifepoints5.setHorizontalAlignment(SwingConstants.CENTER);
		txtLifepoints5.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtLifepoints5.setColumns(10);
		txtLifepoints5.setBounds(615, 761, 30, 25);
		frame.getContentPane().add(txtLifepoints5);
		
		txtLifepoints6 = new JTextField();
		txtLifepoints6.setText("999");
		txtLifepoints6.setHorizontalAlignment(SwingConstants.CENTER);
		txtLifepoints6.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtLifepoints6.setColumns(10);
		txtLifepoints6.setBounds(663, 760, 30, 25);
		frame.getContentPane().add(txtLifepoints6);
		
		txtLifepoints7 = new JTextField();
		txtLifepoints7.setText("999");
		txtLifepoints7.setHorizontalAlignment(SwingConstants.CENTER);
		txtLifepoints7.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtLifepoints7.setColumns(10);
		txtLifepoints7.setBounds(713, 760, 30, 25);
		frame.getContentPane().add(txtLifepoints7);
		
		txtLifepoints8 = new JTextField();
		txtLifepoints8.setText("999");
		txtLifepoints8.setHorizontalAlignment(SwingConstants.CENTER);
		txtLifepoints8.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtLifepoints8.setColumns(10);
		txtLifepoints8.setBounds(762, 760, 30, 25);
		frame.getContentPane().add(txtLifepoints8);
		
		txtWounded1 = new JTextField();
		txtWounded1.setText("999");
		txtWounded1.setHorizontalAlignment(SwingConstants.CENTER);
		txtWounded1.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtWounded1.setColumns(10);
		txtWounded1.setBounds(469, 825, 30, 25);
		frame.getContentPane().add(txtWounded1);
		
		txtWounded2 = new JTextField();
		txtWounded2.setText("999");
		txtWounded2.setHorizontalAlignment(SwingConstants.CENTER);
		txtWounded2.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtWounded2.setColumns(10);
		txtWounded2.setBounds(566, 825, 30, 25);
		frame.getContentPane().add(txtWounded2);
		
		txtWounded3 = new JTextField();
		txtWounded3.setText("999");
		txtWounded3.setHorizontalAlignment(SwingConstants.CENTER);
		txtWounded3.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtWounded3.setColumns(10);
		txtWounded3.setBounds(517, 825, 30, 25);
		frame.getContentPane().add(txtWounded3);
		
		txtWounded4 = new JTextField();
		txtWounded4.setText("999");
		txtWounded4.setHorizontalAlignment(SwingConstants.CENTER);
		txtWounded4.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtWounded4.setColumns(10);
		txtWounded4.setBounds(614, 827, 30, 25);
		frame.getContentPane().add(txtWounded4);
		
		txtWounded5 = new JTextField();
		txtWounded5.setText("999");
		txtWounded5.setHorizontalAlignment(SwingConstants.CENTER);
		txtWounded5.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtWounded5.setColumns(10);
		txtWounded5.setBounds(665, 827, 30, 25);
		frame.getContentPane().add(txtWounded5);
		
		txtWounded6 = new JTextField();
		txtWounded6.setText("999");
		txtWounded6.setHorizontalAlignment(SwingConstants.CENTER);
		txtWounded6.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtWounded6.setColumns(10);
		txtWounded6.setBounds(713, 828, 30, 25);
		frame.getContentPane().add(txtWounded6);
		
		txtWounded7 = new JTextField();
		txtWounded7.setText("999");
		txtWounded7.setHorizontalAlignment(SwingConstants.CENTER);
		txtWounded7.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtWounded7.setColumns(10);
		txtWounded7.setBounds(762, 828, 30, 25);
		frame.getContentPane().add(txtWounded7);
		
		txtDeadlywounded = new JTextField();
		txtDeadlywounded.setText("999");
		txtDeadlywounded.setHorizontalAlignment(SwingConstants.CENTER);
		txtDeadlywounded.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtDeadlywounded.setColumns(10);
		txtDeadlywounded.setBounds(614, 881, 30, 25);
		frame.getContentPane().add(txtDeadlywounded);
	}
	public void character(){
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
	}	
	public void buttons() {
		
		JButton btnSave = new JButton("Speichern");
		btnSave.setBorder(UIManager.getBorder("CheckBox.border"));
		btnSave.setMargin(new Insets(2, 34, 2, 14));
		//Speicher button Action
		btnSave.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent event) {
				
				if (event.getSource() == btnSave) {
					
					
					
					//speicher code für die Skill und SkillFW felder (1)
					try{
					
					File profile = new File("Playerskill.csv");
					profile.delete();
					FileOutputStream fos = new FileOutputStream(profile, true);
					PrintWriter pw = new PrintWriter(fos);
					
					pw.println("Skill" + "," + "SkillFw");
					pw.println(txtSkill1.getText() + "," + txtskillFw1.getText());
					pw.println(txtSkill2.getText() + "," + txtskillFw2.getText());
					pw.println(txtSkill3.getText() + "," + txtskillFw3.getText());
					pw.println(txtSkill4.getText() + "," + txtskillFw4.getText());
					pw.println(txtSkill5.getText() + "," + txtskillFw5.getText());
					pw.println(txtSkill6.getText() + "," + txtskillFw6.getText());
					pw.println(txtSkill7.getText() + "," + txtskillFw7.getText());
					pw.println(txtSkill8.getText() + "," + txtskillFw8.getText());
					pw.println(txtSkill9.getText() + "," + txtskillFw9.getText());
					pw.println(txtSkill10.getText() + "," + txtskillFw10.getText());
					pw.println(txtSkill11.getText() + "," + txtskillFw11.getText());
					pw.println(txtSkill12.getText() + "," + txtskillFw12.getText());
					pw.println(txtSkill13.getText() + "," + txtskillFw13.getText());
					pw.println(txtSkill14.getText() + "," + txtskillFw14.getText());
					pw.println(txtSkill15.getText() + "," + txtskillFw15.getText());
					pw.println(txtSkill16.getText() + "," + txtskillFw16.getText());
					pw.println(txtSkill17.getText() + "," + txtskillFw17.getText());
					pw.println(txtSkill18.getText() + "," + txtskillFw18.getText());
					pw.flush();
					pw.close();
					
					profile.createNewFile();
					System.out.println(profile.exists());
					}
						catch (IOException e){
							e.printStackTrace();
						}//(1ende)
					
					//Speichercode für waffen und waffen Damage so wie fertigkeitswürfe für waffen (2)
					try{
						
						File profile = new File("Playerweapon.csv");
						profile.delete();
						FileOutputStream fos = new FileOutputStream(profile, true);
						PrintWriter pw = new PrintWriter(fos);
						
						pw.println("Weapon" + "," + "Damage" + "," + "DamageFw");
						pw.println(txtWeapon1.getText() + "," + txtWeapondamage1.getText() + "," + txtWeaponFw1.getText());
						pw.println(txtWeapon2.getText() + "," + txtWeapondamage2.getText() + "," + txtWeaponFw2.getText());
						pw.println(txtWeapon3.getText() + "," + txtWeapondamage3.getText() + "," + txtWeaponFw3.getText());
						pw.println(txtWeapon4.getText() + "," + txtWeapondamage4.getText() + "," + txtWeaponFw4.getText());
						
						pw.flush();
						pw.close();
						
						profile.createNewFile();
						System.out.println(profile.exists());
						}
							catch (IOException e){
								e.printStackTrace();
							}//(2ende)
					
					//Speichercode für Rüstungenund Schutz felder (3)
					try{
						
						File profile = new File("Playerarmor.csv");
						profile.delete();
						FileOutputStream fos = new FileOutputStream(profile, true);
						PrintWriter pw = new PrintWriter(fos);
						
						pw.println("Armor" + "," + "Defensepointsarmor" );
						pw.println(txtArmor1.getText() + "," + txtArmorpoint1.getText());
						pw.println(txtArmor2.getText() + "," + txtArmorpoint2.getText());
						pw.println(txtArmor3.getText() + "," + txtArmorpoint3.getText());
						pw.println(txtArmor4.getText() + "," + txtArmorpoint4.getText());
						
					
						
						pw.flush();
						pw.close();
						
						profile.createNewFile();
						System.out.println(profile.exists());
						}
							catch (IOException e){
								e.printStackTrace();
							}//(3ende)
				
					
					//Speichercode für Spezialskillfelder (4)
					try{
						
						File profile = new File("Playerspezialskill.csv");
						profile.delete();
						FileOutputStream fos = new FileOutputStream(profile, true);
						PrintWriter pw = new PrintWriter(fos);
						
						pw.println("Spezialskill" );
						pw.println(txtSpecialskill1.getText());
						pw.println(txtSpecialskill2.getText());
						pw.println(txtSpecialskill3.getText());
						pw.println(txtSpecialskill4.getText());
						pw.println(txtSpecialskill5.getText());
						
						
					
						
						pw.flush();
						pw.close();
						
						profile.createNewFile();
						System.out.println(profile.exists());
						}
							catch (IOException e){
								e.printStackTrace();
							}//(4ende)
					
					
					//Speichercode für Spezialskillfelder (5)
					try{
						
						File profile = new File("Playersuffer.csv");
						profile.delete();
						FileOutputStream fos = new FileOutputStream(profile, true);
						PrintWriter pw = new PrintWriter(fos);
						
						pw.println("Suffering" );
						pw.println(txtSuffer1.getText());
						pw.println(txtSuffer2.getText());
						pw.println(txtSuffer3.getText());
						
						
						
					
						
						pw.flush();
						pw.close();
						
						profile.createNewFile();
						System.out.println(profile.exists());
						}
							catch (IOException e){
								e.printStackTrace();
							}//(5ende)
					
					//Speichercode für Spielerattribute (6)
					try{
						
						File profile = new File("Playerattributes.csv");
						profile.delete();
						FileOutputStream fos = new FileOutputStream(profile, true);
						PrintWriter pw = new PrintWriter(fos);
						
						pw.println("Attention" + "," + "Strength" + "," + "Knowledge" + "," + "Magic" + "," + "Intitiative" + "," + "Movement" + "," + "Skillpoints");
						pw.println(txtAttention.getText() + "," + txtStrength.getText() + "," + txtKnowledge.getText() + "," + txtMagic.getText() + "," + txtInitiative.getText() + "," + txtMovement.getText() + "," + txtSkillpoints.getText());
						
						
						pw.flush();
						pw.close();
						
						profile.createNewFile();
						System.out.println(profile.exists());
						}
							catch (IOException e){
								e.printStackTrace();
							}//(6ende)
					
					//Speichercode für Spieler Rüstungspunkte (7)
					try{
						
						File profile = new File("Playerdefensepoints.csv");
						profile.delete();
						FileOutputStream fos = new FileOutputStream(profile, true);
						PrintWriter pw = new PrintWriter(fos);
						
						pw.println("Playerdefensepoints" );
						pw.println(txtDefensepoint1.getText());
						pw.println(txtDefensepoint2.getText());
						pw.println(txtDefensepoint3.getText());
						pw.println(txtDefensepoint4.getText());
						pw.println(txtDefensepoint5.getText());
						pw.println(txtDefensepoint6.getText());
						pw.println(txtDefensepoint7.getText());
						pw.println(txtDefensepoint8.getText());
											
												
						pw.flush();
						pw.close();
						
						profile.createNewFile();
						System.out.println(profile.exists());
						}
							catch (IOException e){
								e.printStackTrace();
							}//(7ende)
					
					
					//Speichercode für Spieler Lebenspunkte (8)
					try{
						
						File profile = new File("Playerlifepoints.csv");
						profile.delete();
						FileOutputStream fos = new FileOutputStream(profile, true);
						PrintWriter pw = new PrintWriter(fos);
						
						pw.println("Playerlifepoints" );
						pw.println(txtLifepoints1.getText());
						pw.println(txtLifepoints2.getText());
						pw.println(txtLifepoints3.getText());
						pw.println(txtLifepoints4.getText());
						pw.println(txtLifepoints5.getText());
						pw.println(txtLifepoints6.getText());
						pw.println(txtLifepoints7.getText());
						pw.println(txtLifepoints8.getText());
						
						
											
												
						pw.flush();
						pw.close();
						
						profile.createNewFile();
						System.out.println(profile.exists());
						}
							catch (IOException e){
								e.printStackTrace();
							}//(8ende)
					
					//Speichercode für Spieler Verwundetpunkte (9)
					try{
						
						File profile = new File("Playerwounded.csv");
						profile.delete();
						FileOutputStream fos = new FileOutputStream(profile, true);
						PrintWriter pw = new PrintWriter(fos);
						
						pw.println("Playerwounded points" );
						pw.println(txtWounded1.getText());
						pw.println(txtWounded2.getText());
						pw.println(txtWounded3.getText());
						pw.println(txtWounded4.getText());
						pw.println(txtWounded5.getText());
						pw.println(txtWounded6.getText());
						pw.println(txtWounded7.getText());
						
												
						pw.flush();
						pw.close();
						
						profile.createNewFile();
						System.out.println(profile.exists());
						}
							catch (IOException e){
								e.printStackTrace();
							}//(9ende)
					
					//Speichercode für Spieler Tötlichverwundetpunkte (10)
					try{
						
						File profile = new File("Playerdeadlywounded.csv");
						profile.delete();
						FileOutputStream fos = new FileOutputStream(profile, true);
						PrintWriter pw = new PrintWriter(fos);
						
						pw.println("Playerdeadlywounded points");
						pw.println(txtDeadlywounded.getText());
						
						
												
						pw.flush();
						pw.close();
						
						profile.createNewFile();
						System.out.println(profile.exists());
						}
							catch (IOException e){
								e.printStackTrace();
							}//(10ende)
					
					//Speichercode für Spieler informationen wie herkunft, name etc. (11)
					try{
						
						File profile = new File("Playerinformation.csv");
						profile.delete();
						FileOutputStream fos = new FileOutputStream(profile, true);
						PrintWriter pw = new PrintWriter(fos);
						
						pw.println("Name" + "," + "Folk" + "," + "Job" + "," + "Age" + "," + "Copper" + "," + "Silver" + "," + "Gold");
						pw.println(txtName.getText() + "," + txtFolk.getText() + "," + txtJob.getText() + "," + txtAge.getText() + "," + txtCopper.getText() + "," + txtSilver.getText() + "," + txtGold.getText());
						
												
						pw.flush();
						pw.close();
						
						profile.createNewFile();
						System.out.println(profile.exists());
						}
							catch (IOException e){
								e.printStackTrace();
							}//(11ende)
				
				
				}
				
			
			
			
			}
		});
		btnSave.setIcon(new ImageIcon(Playermanager.class.getResource("/image/savebtn.png")));
		btnSave.setFont(new Font("Ubuntu", Font.BOLD, 14));
		btnSave.setBounds(20, 11, 135, 47);
		frame.getContentPane().add(btnSave);
		
		btnLoad = new JButton("Laden");
		btnLoad.setPreferredSize(new Dimension(79, 23));
		btnLoad.setMinimumSize(new Dimension(79, 23));
		btnLoad.setMaximumSize(new Dimension(79, 23));
		btnLoad.setIcon(new ImageIcon(Playermanager.class.getResource("/image/loadbtn.png")));
		//Laden button Action
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == btnLoad) {
					int rowc = 0;
					
					String line = "";
					
							// werte laden für Rüstung und rüstungswerte
					try {
						//array der größe der tabelle anpassen namen ändern
						String[][] myArray = new String[10][2];
						//pfad zur csv setzen
						String path = "Playerarmor.csv";
						
						//neuen Buffered reader anlegen
					BufferedReader bReader = new BufferedReader(new FileReader(path));
						//solange die nächste zeile welche gelesen werden soll nicht null ist zeile für zeile durchgehen
						while ((line = bReader.readLine()) != null) {
							
							// jede zeile wird komplett in einem array gespeichert (vom , getrennte wörter)
							String[] inArray = line.split(",");
							
							//verschachtelte for schleife itterriert durch ein zweidimensionales array und spalltet die langen zeilen in zellen auf
							//auf welche wie bei einem 2d koordinatensystem zugegriffen werden kann
							for (int x = 0; x < inArray.length; x++) {
								
								myArray[rowc][x] = inArray[x];
								
							}
							
							rowc++;
						
							
						}
						//textfelder werden die abgespeicherten werte übergeben.
						txtArmor1.setText(myArray[1][0]); txtArmorpoint1.setText(myArray[1][1]);
						txtArmor2.setText(myArray[2][0]); txtArmorpoint2.setText(myArray[2][1]);
						txtArmor3.setText(myArray[3][0]); txtArmorpoint3.setText(myArray[3][1]);
						txtArmor4.setText(myArray[4][0]); txtArmorpoint4.setText(myArray[4][1]);
						bReader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//werte müssen auf null gesetzt werden
					rowc = 0;
				
					line = "";
					
					
					// werte laden für Skills und skillfw
					try {
						//array der größe der tabelle anpassen namen ändern
						String[][] skillArray = new String[20][2];
						//pfad zur csv setzen
						String path = "Playerskill.csv";
						
						//neuen Buffered reader anlegen
					BufferedReader bReader = new BufferedReader(new FileReader(path));
						//solange die nächste zeile welche gelesen werden soll nicht null ist zeile für zeile durchgehen
						while ((line = bReader.readLine()) != null) {
							
							// jede zeile wird komplett in einem array gespeichert (vom , getrennte wörter)
							String[] inArray = line.split(",");
							
							//verschachtelte for schleife itterriert durch ein zweidimensionales array und spalltet die langen zeilen in zellen auf
							//auf welche wie bei einem 2d koordinatensystem zugegriffen werden kann
							for (int x = 0; x < inArray.length; x++) {
								
								skillArray[rowc][x] = inArray[x];
								
							}
							
							rowc++;
						
							
						}
						//textfelder werden die abgespeicherten werte übergeben.
						txtSkill1.setText(skillArray[1][0]); txtskillFw1.setText(skillArray[1][1]);
						txtSkill2.setText(skillArray[2][0]); txtskillFw2.setText(skillArray[2][1]);
						txtSkill3.setText(skillArray[3][0]); txtskillFw3.setText(skillArray[3][1]);
						txtSkill4.setText(skillArray[4][0]); txtskillFw4.setText(skillArray[4][1]);
						txtSkill5.setText(skillArray[5][0]); txtskillFw5.setText(skillArray[5][1]);
						txtSkill6.setText(skillArray[6][0]); txtskillFw6.setText(skillArray[6][1]);
						txtSkill7.setText(skillArray[7][0]); txtskillFw7.setText(skillArray[7][1]);
						txtSkill8.setText(skillArray[8][0]); txtskillFw8.setText(skillArray[8][1]);
						txtSkill9.setText(skillArray[9][0]); txtskillFw9.setText(skillArray[9][1]);
						txtSkill10.setText(skillArray[10][0]); txtskillFw10.setText(skillArray[10][1]);
						txtSkill11.setText(skillArray[11][0]); txtskillFw11.setText(skillArray[11][1]);
						txtSkill12.setText(skillArray[12][0]); txtskillFw12.setText(skillArray[12][1]);
						txtSkill13.setText(skillArray[13][0]); txtskillFw13.setText(skillArray[13][1]);
						txtSkill14.setText(skillArray[14][0]); txtskillFw14.setText(skillArray[14][1]);
						txtSkill15.setText(skillArray[15][0]); txtskillFw15.setText(skillArray[15][1]);
						txtSkill16.setText(skillArray[16][0]); txtskillFw16.setText(skillArray[16][1]);
						txtSkill17.setText(skillArray[17][0]); txtskillFw17.setText(skillArray[17][1]);
						txtSkill18.setText(skillArray[18][0]); txtskillFw18.setText(skillArray[18][1]);



						
						bReader.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					//werte müssen auf null gesetzt werden
					rowc = 0;
					
					line = "";
					
					
					// werte laden für Attribute
					try {
						//array der größe der tabelle anpassen namen ändern
						String[][] attributArray = new String[2][8];
						//pfad zur csv setzen
						String path = "Playerattributes.csv";
						
						//neuen Buffered reader anlegen
					BufferedReader bReader = new BufferedReader(new FileReader(path));
						//solange die nächste zeile welche gelesen werden soll nicht null ist zeile für zeile durchgehen
						while ((line = bReader.readLine()) != null) {
							
							// jede zeile wird komplett in einem array gespeichert (vom , getrennte wörter)
							String[] inArray = line.split(",");
							
							//verschachtelte for schleife itterriert durch ein zweidimensionales array und spalltet die langen zeilen in zellen auf
							//auf welche wie bei einem 2d koordinatensystem zugegriffen werden kann
							for (int x = 0; x < inArray.length; x++) {
								
								attributArray[rowc][x] = inArray[x];
								
							}
							
							rowc++;
						
							
						}
						//textfelder werden die abgespeicherten werte übergeben.
						txtAttention.setText(attributArray[1][0]);
						txtStrength.setText(attributArray[1][1]);
						txtKnowledge.setText(attributArray[1][2]);
						txtMagic.setText(attributArray[1][3]);
						txtInitiative.setText(attributArray[1][4]);
						txtMovement.setText(attributArray[1][5]);
						txtSkillpoints.setText(attributArray[1][6]);
						
						



						
						
						bReader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					//werte müssen auf null gesetzt werden
					rowc = 0;
				
					line = "";
					
					
					// werte laden für tödlich verwundet
					try {
						//array der größe der tabelle anpassen namen ändern
						String[][] deadlywoundedArray = new String[2][3];
						//pfad zur csv setzen
						String path = "Playerdeadlywounded.csv";
						
						//neuen Buffered reader anlegen
					BufferedReader bReader = new BufferedReader(new FileReader(path));
						//solange die nächste zeile welche gelesen werden soll nicht null ist zeile für zeile durchgehen
						while ((line = bReader.readLine()) != null) {
							
							// jede zeile wird komplett in einem array gespeichert (vom , getrennte wörter)
							String[] inArray = line.split(",");
							
							//verschachtelte for schleife itterriert durch ein zweidimensionales array und spalltet die langen zeilen in zellen auf
							//auf welche wie bei einem 2d koordinatensystem zugegriffen werden kann
							for (int x = 0; x < inArray.length; x++) {
								
								deadlywoundedArray[rowc][x] = inArray[x];
								
							}
							
							rowc++;
						
							
						}
						//textfelder werden die abgespeicherten werte übergeben.
						txtDeadlywounded.setText(deadlywoundedArray[1][0]);
						
						
						



						
						bReader.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					//werte müssen auf null gesetzt werden
					rowc = 0;
				
					line = "";
					
					
					// werte laden für defensepoints
					try {
						//array der größe der tabelle anpassen namen ändern
						String[][] defensepointsArray = new String[20][2];
						//pfad zur csv setzen
						String path = "Playerdefensepoints.csv";
						
						//neuen Buffered reader anlegen
					BufferedReader bReader = new BufferedReader(new FileReader(path));
						//solange die nächste zeile welche gelesen werden soll nicht null ist zeile für zeile durchgehen
						while ((line = bReader.readLine()) != null) {
							
							// jede zeile wird komplett in einem array gespeichert (vom , getrennte wörter)
							String[] inArray = line.split(",");
							
							//verschachtelte for schleife itterriert durch ein zweidimensionales array und spalltet die langen zeilen in zellen auf
							//auf welche wie bei einem 2d koordinatensystem zugegriffen werden kann
							for (int x = 0; x < inArray.length; x++) {
								
								defensepointsArray[rowc][x] = inArray[x];
								
							}
							
							rowc++;
						
							
						}
						//textfelder werden die abgespeicherten werte übergeben.
						txtDefensepoint1.setText(defensepointsArray[1][0]);
						txtDefensepoint2.setText(defensepointsArray[2][0]);
						txtDefensepoint3.setText(defensepointsArray[3][0]);
						txtDefensepoint4.setText(defensepointsArray[4][0]);
						txtDefensepoint5.setText(defensepointsArray[5][0]);
						txtDefensepoint6.setText(defensepointsArray[6][0]);
						txtDefensepoint7.setText(defensepointsArray[7][0]);
						txtDefensepoint8.setText(defensepointsArray[8][0]);
						
						
						



						
						bReader.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					
					//werte müssen auf null gesetzt werden
					rowc = 0;
				
					line = "";
					
					
					// werte laden für Playerinformation
					try {
						//array der größe der tabelle anpassen namen ändern
						String[][] playerinformationArray = new String[10][8];
						//pfad zur csv setzen
						String path = "Playerinformation.csv";
						
						//neuen Buffered reader anlegen
					BufferedReader bReader = new BufferedReader(new FileReader(path));
						//solange die nächste zeile welche gelesen werden soll nicht null ist zeile für zeile durchgehen
						while ((line = bReader.readLine()) != null) {
							
							// jede zeile wird komplett in einem array gespeichert (vom , getrennte wörter)
							String[] inArray = line.split(",");
							
							//verschachtelte for schleife itterriert durch ein zweidimensionales array und spalltet die langen zeilen in zellen auf
							//auf welche wie bei einem 2d koordinatensystem zugegriffen werden kann
							for (int x = 0; x < inArray.length; x++) {
								
								playerinformationArray[rowc][x] = inArray[x];
								
							}
							
							rowc++;
						
							
						}
						//textfelder werden die abgespeicherten werte übergeben.
						txtName.setText(playerinformationArray[1][0]);
						txtFolk.setText(playerinformationArray[1][1]);
						txtJob.setText(playerinformationArray[1][2]);
						txtAge.setText(playerinformationArray[1][3]);
						txtCopper.setText(playerinformationArray[1][4]);
						txtSilver.setText(playerinformationArray[1][5]);
						txtGold.setText(playerinformationArray[1][6]);
						
						
						
						
						



						
						bReader.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					//werte müssen auf null gesetzt werden
					rowc = 0;
				
					line = "";
					
					
					// werte laden für Playerlifepoints
					try {
						//array der größe der tabelle anpassen namen ändern
						String[][] playerlifepointsArray = new String[10][8];
						//pfad zur csv setzen
						String path = "Playerlifepoints.csv";
						
						//neuen Buffered reader anlegen
					BufferedReader bReader = new BufferedReader(new FileReader(path));
						//solange die nächste zeile welche gelesen werden soll nicht null ist zeile für zeile durchgehen
						while ((line = bReader.readLine()) != null) {
							
							// jede zeile wird komplett in einem array gespeichert (vom , getrennte wörter)
							String[] inArray = line.split(",");
							
							//verschachtelte for schleife itterriert durch ein zweidimensionales array und spalltet die langen zeilen in zellen auf
							//auf welche wie bei einem 2d koordinatensystem zugegriffen werden kann
							for (int x = 0; x < inArray.length; x++) {
								
								playerlifepointsArray[rowc][x] = inArray[x];
								
							}
							
							rowc++;
						
							
						}
						//textfelder werden die abgespeicherten werte übergeben.
						txtLifepoints1.setText(playerlifepointsArray[1][0]);
						txtLifepoints2.setText(playerlifepointsArray[2][0]);
						txtLifepoints3.setText(playerlifepointsArray[3][0]);
						txtLifepoints4.setText(playerlifepointsArray[4][0]);
						txtLifepoints5.setText(playerlifepointsArray[5][0]);
						txtLifepoints6.setText(playerlifepointsArray[6][0]);
						txtLifepoints7.setText(playerlifepointsArray[7][0]);
						txtLifepoints8.setText(playerlifepointsArray[8][0]);
						
						
						
						
						
						



						
						bReader.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					//werte müssen auf null gesetzt werden
					rowc = 0;
				
					line = "";
					
					
					// werte laden für Playerspezialskills
					try {
						//array der größe der tabelle anpassen namen ändern
						String[][] playerspezialskillArray = new String[10][8];
						//pfad zur csv setzen
						String path = "Playerspezialskill.csv";
						
						//neuen Buffered reader anlegen
					BufferedReader bReader = new BufferedReader(new FileReader(path));
						//solange die nächste zeile welche gelesen werden soll nicht null ist zeile für zeile durchgehen
						while ((line = bReader.readLine()) != null) {
							
							// jede zeile wird komplett in einem array gespeichert (vom , getrennte wörter)
							String[] inArray = line.split(",");
							
							//verschachtelte for schleife itterriert durch ein zweidimensionales array und spalltet die langen zeilen in zellen auf
							//auf welche wie bei einem 2d koordinatensystem zugegriffen werden kann
							for (int x = 0; x < inArray.length; x++) {
								
								playerspezialskillArray[rowc][x] = inArray[x];
								
							}
							
							rowc++;
						
							
						}
						//textfelder werden die abgespeicherten werte übergeben.
						txtSpecialskill1.setText(playerspezialskillArray[1][0]);
						txtSpecialskill2.setText(playerspezialskillArray[2][0]);
						txtSpecialskill3.setText(playerspezialskillArray[3][0]);
						txtSpecialskill4.setText(playerspezialskillArray[4][0]);
						txtSpecialskill5.setText(playerspezialskillArray[5][0]);
						
						
						
						
						
						
						



						
						bReader.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					//werte müssen auf null gesetzt werden
					rowc = 0;
				
					line = "";
					
					
					// werte laden für Playersuffer
					try {
						//array der größe der tabelle anpassen namen ändern
						String[][] playersufferArray = new String[10][8];
						//pfad zur csv setzen
						String path = "Playersuffer.csv";
						
						//neuen Buffered reader anlegen
					BufferedReader bReader = new BufferedReader(new FileReader(path));
						//solange die nächste zeile welche gelesen werden soll nicht null ist zeile für zeile durchgehen
						while ((line = bReader.readLine()) != null) {
							
							// jede zeile wird komplett in einem array gespeichert (vom , getrennte wörter)
							String[] inArray = line.split(",");
							
							//verschachtelte for schleife itterriert durch ein zweidimensionales array und spalltet die langen zeilen in zellen auf
							//auf welche wie bei einem 2d koordinatensystem zugegriffen werden kann
							for (int x = 0; x < inArray.length; x++) {
								
								playersufferArray[rowc][x] = inArray[x];
								
							}
							
							rowc++;
						
							
						}
						//textfelder werden die abgespeicherten werte übergeben.
						txtSuffer1.setText(playersufferArray[1][0]);
						txtSuffer2.setText(playersufferArray[2][0]);
						txtSuffer3.setText(playersufferArray[3][0]);
						
						
						bReader.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					//werte müssen auf null gesetzt werden
					rowc = 0;
				
					line = "";
					
					
					// werte laden für Playerweapon
					try {
						//array der größe der tabelle anpassen namen ändern
						String[][] playerweaponArray = new String[10][8];
						//pfad zur csv setzen
						String path = "Playerweapon.csv";
						
						//neuen Buffered reader anlegen
					BufferedReader bReader = new BufferedReader(new FileReader(path));
						//solange die nächste zeile welche gelesen werden soll nicht null ist zeile für zeile durchgehen
						while ((line = bReader.readLine()) != null) {
							
							// jede zeile wird komplett in einem array gespeichert (vom , getrennte wörter)
							String[] inArray = line.split(",");
							
							//verschachtelte for schleife itterriert durch ein zweidimensionales array und spalltet die langen zeilen in zellen auf
							//auf welche wie bei einem 2d koordinatensystem zugegriffen werden kann
							for (int x = 0; x < inArray.length; x++) {
								
								playerweaponArray[rowc][x] = inArray[x];
								
							}
							
							rowc++;
						
							
						}
						//textfelder werden die abgespeicherten werte übergeben.
						txtWeapon1.setText(playerweaponArray[1][0]); txtWeapondamage1.setText(playerweaponArray[1][1]); txtWeaponFw1.setText(playerweaponArray[1][2]);
						txtWeapon2.setText(playerweaponArray[2][0]); txtWeapondamage2.setText(playerweaponArray[2][1]); txtWeaponFw2.setText(playerweaponArray[2][2]);
						txtWeapon3.setText(playerweaponArray[3][0]); txtWeapondamage3.setText(playerweaponArray[3][1]); txtWeaponFw3.setText(playerweaponArray[3][2]);
						txtWeapon4.setText(playerweaponArray[4][0]); txtWeapondamage4.setText(playerweaponArray[4][1]); txtWeaponFw4.setText(playerweaponArray[4][2]);
						
						
						bReader.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					// werte laden für Playerwounded
					try {
						//array der größe der tabelle anpassen namen ändern
						String[][] playerwoundedArray = new String[40][40];
						//pfad zur csv setzen
						String path = "Playerwounded.csv";
						
						//neuen Buffered reader anlegen
					BufferedReader bReader = new BufferedReader(new FileReader(path));
						//solange die nächste zeile welche gelesen werden soll nicht null ist zeile für zeile durchgehen
						while ((line = bReader.readLine()) != null) {
							
							// jede zeile wird komplett in einem array gespeichert (vom , getrennte wörter)
							String[] inArray = line.split(",");
							
							//verschachtelte for schleife itterriert durch ein zweidimensionales array und spalltet die langen zeilen in zellen auf
							//auf welche wie bei einem 2d koordinatensystem zugegriffen werden kann
							for (int x = 0; x < inArray.length; x++) {
								
								playerwoundedArray[rowc][x] = inArray[x];
								
							}
							
							rowc++;
						
							
						}
						//textfelder werden die abgespeicherten werte übergeben.

						txtWounded1.setText(playerwoundedArray[6][0]);
						txtWounded2.setText(playerwoundedArray[7][0]);
						txtWounded3.setText(playerwoundedArray[8][0]);
						txtWounded4.setText(playerwoundedArray[9][0]);
						txtWounded5.setText(playerwoundedArray[10][0]);
						txtWounded6.setText(playerwoundedArray[11][0]);
						txtWounded7.setText(playerwoundedArray[12][0]);
						
						
						bReader.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		btnLoad.setMargin(new Insets(2, 34, 2, 14));
		btnLoad.setFont(new Font("Ubuntu", Font.BOLD, 14));
		btnLoad.setBorder(UIManager.getBorder("DesktopIcon.border"));
		btnLoad.setBounds(165, 11, 140, 47);
		frame.getContentPane().add(btnLoad);
		
		btnReset = new JButton("Zur\u00FCcksetzen");
		//Felder zurücksetzen Action
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == btnReset) {
					
					String empty = "";
					
					//Skillfelder und FW  zurück setzen
					txtSkill1.setText(empty); txtSkill2.setText(empty); txtSkill3.setText(empty); txtSkill4.setText(empty); txtSkill5.setText(empty); txtSkill6.setText(empty);
					txtSkill7.setText(empty); txtSkill8.setText(empty); txtSkill9.setText(empty); txtSkill10.setText(empty); txtSkill11.setText(empty); txtSkill12.setText(empty);
					txtSkill13.setText(empty); txtSkill14.setText(empty); txtSkill15.setText(empty); txtSkill16.setText(empty); txtSkill17.setText(empty); txtSkill18.setText(empty);
					
					txtskillFw1.setText(empty); txtskillFw2.setText(empty); txtskillFw3.setText(empty); txtskillFw4.setText(empty); txtskillFw5.setText(empty); txtskillFw6.setText(empty);
					txtskillFw7.setText(empty); txtskillFw8.setText(empty); txtskillFw9.setText(empty); txtskillFw10.setText(empty); txtskillFw11.setText(empty); txtskillFw12.setText(empty);
					txtskillFw13.setText(empty); txtskillFw14.setText(empty); txtskillFw15.setText(empty); txtskillFw16.setText(empty); txtskillFw17.setText(empty); txtskillFw18.setText(empty);
					
					
					//Waffen zurück setzen
					txtWeapon1.setText(empty); txtWeapon2.setText(empty); txtWeapon3.setText(empty); txtWeapon4.setText(empty);
					txtWeapondamage1.setText(empty); txtWeapondamage2.setText(empty); txtWeapondamage3.setText(empty); txtWeapondamage4.setText(empty);
					txtWeaponFw1.setText(empty); txtWeaponFw2.setText(empty); txtWeaponFw3.setText(empty); txtWeaponFw4.setText(empty);
					
					//sonderfähigkeiten zurücksetzen
					txtSpecialskill1.setText(empty); txtSpecialskill2.setText(empty); txtSpecialskill3.setText(empty); txtSpecialskill4.setText(empty); txtSpecialskill5.setText(empty);
					
					//Spielerinfo zurücksetzen
					txtAttention.setText(empty); txtStrength.setText(empty); txtKnowledge.setText(empty); txtMagic.setText(empty); txtInitiative.setText(empty); txtMovement.setText(empty);
					txtSkillpoints.setText(empty);
					
					//rüstung und werte zurück setzen
					txtArmor1.setText(empty); txtArmor2.setText(empty); txtArmor3.setText(empty); txtArmor4.setText(empty);
					txtArmorpoint1.setText(empty); txtArmorpoint2.setText(empty); txtArmorpoint3.setText(empty); txtArmorpoint4.setText(empty);
					
					//leiden zurücksetzen
					txtSuffer1.setText(empty); txtSuffer2.setText(empty); txtSuffer3.setText(empty);
					
					//Charackter informationen zurücksetzen
					txtName.setText(empty); txtFolk.setText(empty); txtJob.setText(empty); txtAge.setText(empty); txtGold.setText(empty); txtCopper.setText(empty); txtSilver.setText(empty);
					
					//defensepoints zurück setzen
					txtDefensepoint1.setText(empty); txtDefensepoint2.setText(empty); txtDefensepoint3.setText(empty); txtDefensepoint4.setText(empty); txtDefensepoint5.setText(empty);
					txtDefensepoint6.setText(empty); txtDefensepoint7.setText(empty); txtDefensepoint8.setText(empty); 
					
					//lebenspunkte zurück setzen
					txtLifepoints1.setText(empty); txtLifepoints2.setText(empty); txtLifepoints3.setText(empty); txtLifepoints4.setText(empty); txtLifepoints5.setText(empty); txtLifepoints6.setText(empty);
					txtLifepoints7.setText(empty); txtLifepoints8.setText(empty);
					
					//tötlich verwundet zurücksetzen
					txtWounded1.setText(empty); txtWounded2.setText(empty); txtWounded3.setText(empty); txtWounded4.setText(empty); txtWounded5.setText(empty);
					txtWounded6.setText(empty); txtWounded7.setText(empty); txtDeadlywounded.setText(empty);
					
					
				}
			}
		});
		btnReset.setPreferredSize(new Dimension(79, 23));
		btnReset.setMinimumSize(new Dimension(79, 23));
		btnReset.setMaximumSize(new Dimension(79, 23));
		btnReset.setMargin(new Insets(2, 34, 2, 14));
		btnReset.setFont(new Font("Ubuntu", Font.BOLD, 14));
		btnReset.setBorder(UIManager.getBorder("DesktopIcon.border"));
		btnReset.setBounds(94, 139, 140, 47);
		frame.getContentPane().add(btnReset);
		JLabel lblCharakterbogen = new JLabel("");
		lblCharakterbogen.setFocusable(false);
		lblCharakterbogen.setBounds(0, 0, 1376, 937);
		lblCharakterbogen.setIcon(new ImageIcon(Playermanager.class.getResource("/image/charakter bogen.png")));
		frame.getContentPane().add(lblCharakterbogen);
		
		
		
		
		
		
	}
	public void background() {
	}
}
