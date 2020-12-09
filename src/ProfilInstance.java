

public class ProfilInstance extends Playermanager{
	
	public String strSkill1, strSkill3, strSkill2, strSkill4, strSkill5, strSkill6, strSkill7, strSkill8, strSkill9,
	strSkill10, strSkill11, strSkill12, strSkill13, strSkill14, strSkill15, strSkill16, strSkill17, strSkill18,
	//skillFertigkeitswurf variablen
	strSkillfw1, strSkillfw2, strSkillfw3, strSkillfw4, strSkillfw5, strSkillfw6, strSkillfw7, strSkillfw8, strSkillfw9, strSkillfw10, strSkillfw11,
	strSkillfw12, strSkillfw13, strSkillfw14, strSkillfw15, strSkillfw16, strSkillfw17, strSkillfw18,
	//Waffenslots variablen
	strWeapon1, strWeapon2, strWeapon3, strWeapon4,
	//waffenFertigkeitswurf variablen
	strWeaponfw1, strWeaponfw2, strWeaponfw3, strWeaponfw4,
	//Waffenschaden variablen
	strWeapondamage1, strWeapondamage2, strWeapondamage3, strWeapondamage4,
	//Rüstungsslots varaiblen
	strArmor1, strArmor2, strArmor3, strArmor4,
	//Rüstungswerte variablen
	strArmorpoint1, strArmorpoint2, strArmorpoint3, strArmorpoint4,
	//Spezialskills variablen
	strSpecialskill1, strSpecialskill2, strSpecialskill3, strSpecialskill4, strSpecialskill5,
	//Attribute variablen
	strAttention, strStrength, strKnowledge, strMagic, strInitiative, strMovement,
	//Leiden variablen
	strSuffer1, strSuffer2, strSuffer3,
	//Charackter information Variablen
	strAge, strName, strFolk, strJob, strGold, strSilver, strCopper, strSkillpoints,
	//variablen verteidigungs punkte
	strDefensepoint1, strDefensepoint2, strDefensepoint3, strDefensepoint4, strDefensepoint5, strDefensepoint6, strDefensepoint7, strDefensepoint8,
	//Lebenspunkte variablen
	strLifepoints1, strLifepoints2, strLifepoints3, strLifepoints4, strLifepoints5, strLifepoints6, strLifepoints7, strLifepoints8,
	//Verwundet Variablen
	strWounded1, strWounded3, strWounded2, strWounded4, strWounded5, strWounded6, strWounded7, strDeadlywounded;
	
	//Int Variablen
	public int skill1, skill3, skill2, skill4, skill5, skill6, skill7, skill8, skill9,
	skill10, skill11, skill12, skill13, skill14, skill15, skill16, skill17, skill18,
	//skillFertigkeitswurf variablen
	skillFw1, skillFw2, skillFw3, skillFw4, skillFw5, skillFw6, skillFw7, skillFw8, skillFw9, skillFw10, skillFw11,
	skillFw12, skillFw13, skillFw14, skillFw15, skillFw16, skillFw17, skillFw18,
	//Waffenslots variablen
	weapon1, weapon2, weapon3, weapon4,
	//waffenFertigkeitswurf variablen
	weaponFw1, weaponFw2, weaponFw3, weaponFw4,
	//Waffenschaden variablen
	weaponDamage1, weaponDamage2, weaponDamage3, weaponDamage4,
	//Rüstungsslots varaiblen
	armor1, armor2, armor3, armor4,
	//Rüstungswerte variablen
	armorPoint1, armorPoint2, armorPoint3, armorPoint4,
	//Spezialskills variablen
	specialSkill1, specialSkill2, specialSkill3, specialSkill4, specialSkill5,
	//Attribute variablen
	attention, strength, knowledge, magic, initiative, movement,
	//Leiden variablen
	suffer1, suffer2, suffer3,
	//Charackter information Variablen
	age, name, folk, job, gold, silver, copper, skillpoints,
	//variablen verteidigungs punkte
	defensePoint1, defensePoint2, defensePoint3, defensePoint4, defensePoint5, defensePoint6, defensePoint7, defensePoint8,
	//Lebenspunkte variablen
	lifePoints1, lifePoints2, lifePoints3, lifePoints4, lifePoints5, lifePoints6, lifePoints7, lifePoints8,
	//Verwundet Variablen
	wounded1, wounded3, wounded2, wounded4, wounded5, wounded6, wounded7, deadlyWounded;
	//String variablen

	

	public void instance() {
		
		getSkill();
		getSkillfw();
		getWeapon();
		getWeaponfw();
		getWeapondamage();
		getArmor();
		getArmorpoint();
		getSpecialskill();
		getAttribute();
		getSuffer();
		getCharcterinfo();
		getDefensepoint();
		getLifepoints();
		getWounded();
		
	}
	
	public void getSkill() {
		strSkill1 = txtSkill1.getText();
		
	
		strSkill2 = txtSkill2.getText();
		
		
		strSkill3 = txtSkill3.getText();
		
		
		strSkill4 = txtSkill4.getText();
		
		
		strSkill5 = txtSkill5.getText();
		
		
		strSkill6 = txtSkill6.getText();

		
		strSkill7 = txtSkill7.getText();
		
		
		strSkill8 = txtSkill8.getText();
		
		
		strSkill9 = txtSkill9.getText();
	
		
		strSkill10 = txtSkill10.getText();
		
		
		strSkill11 = txtSkill11.getText();
		
		
		strSkill12 = txtSkill12.getText();
		
		
		strSkill13 = txtSkill13.getText();
		
		
		strSkill14 = txtSkill14.getText();
		
		
		strSkill15 = txtSkill15.getText();
		
		
		strSkill16 = txtSkill16.getText();
		
		
		strSkill17 = txtSkill17.getText();
		
		
		strSkill18 = txtSkill18.getText();
		
		
		
	}

	public void getSkillfw() {
		strSkillfw1 = txtskillFw1.getText();
		skillFw1=Integer.parseInt(strSkillfw1);
		
		strSkillfw2 = txtskillFw2.getText();
		skillFw2=Integer.parseInt(strSkillfw2);
		
		strSkillfw3 = txtskillFw3.getText();
		skillFw3=Integer.parseInt(strSkillfw3);
		
		strSkillfw4 = txtskillFw4.getText();
		skillFw4=Integer.parseInt(strSkillfw4);
		
		strSkillfw5 = txtskillFw5.getText();
		skillFw5=Integer.parseInt(strSkillfw5);
		
		strSkillfw6 = txtskillFw6.getText();
		skillFw6=Integer.parseInt(strSkillfw6);
		
		strSkillfw7 = txtskillFw7.getText();
		skillFw7=Integer.parseInt(strSkillfw7);
		
		strSkillfw8 = txtskillFw8.getText();
		skillFw8=Integer.parseInt(strSkillfw8);
		
		strSkillfw9 = txtskillFw9.getText();
		skillFw9=Integer.parseInt(strSkillfw9);
		
		strSkillfw10 = txtskillFw10.getText();
		skillFw10=Integer.parseInt(strSkillfw10);
		
		strSkillfw11 = txtskillFw11.getText();
		skillFw11=Integer.parseInt(strSkillfw11);
		
		strSkillfw12 = txtskillFw12.getText();
		skillFw12=Integer.parseInt(strSkillfw12);
		
		strSkillfw13 = txtskillFw13.getText();
		skillFw13=Integer.parseInt(strSkillfw13);
		
		strSkillfw14 = txtskillFw14.getText();
		skillFw14=Integer.parseInt(strSkillfw14);
		
		strSkillfw15 = txtskillFw15.getText();
		skillFw15=Integer.parseInt(strSkillfw15);
		
		strSkillfw16 = txtskillFw16.getText();
		skillFw16=Integer.parseInt(strSkillfw16);
		
		strSkillfw17 = txtskillFw17.getText();
		skillFw17=Integer.parseInt(strSkillfw17);
		
		strSkillfw18 = txtskillFw1.getText();
		skillFw18=Integer.parseInt(strSkillfw18);
		
		
	}
	
	public void getWeapon() {
		strWeapon1 = txtWeapon1.getText();
		strWeapon2 = txtWeapon2.getText();
		strWeapon3 = txtWeapon3.getText();
		strWeapon4 = txtWeapon4.getText();
		
		
	}
	
	public void getWeaponfw() {
		strWeaponfw1 = txtWeaponFw1.getText();
		weaponFw1=Integer.parseInt(strWeaponfw1);
		
		strWeaponfw2 = txtWeaponFw2.getText();
		weaponFw2=Integer.parseInt(strWeaponfw2);
		
		strWeaponfw3 = txtWeaponFw3.getText();
		weaponFw3=Integer.parseInt(strWeaponfw3);
		
		strWeaponfw4 = txtWeaponFw4.getText();
		weaponFw4=Integer.parseInt(strWeaponfw4);
		
	}

	public void getWeapondamage() {
		strWeapondamage1 = txtWeapondamage1.getText();
		weaponDamage1=Integer.parseInt(strWeapondamage1);
		
		strWeapondamage2 = txtWeapondamage2.getText();
		weaponDamage2=Integer.parseInt(strWeapondamage2);
		
		strWeapondamage3 = txtWeapondamage3.getText();
		weaponDamage3=Integer.parseInt(strWeapondamage3);
		
		strWeapondamage4 = txtWeapondamage4.getText();
		weaponDamage4=Integer.parseInt(strWeapondamage4);
		
		
	}

	public void getArmor() {
		strArmor1 = txtArmor1.getText();
		
		strArmor2 = txtArmor2.getText();
		
		strArmor3 = txtArmor3.getText();
		
		strArmor4 = txtArmor4.getText();
	}
	
	public void getArmorpoint() {
		strArmorpoint1 = txtArmorpoint1.getText();
		armorPoint1=Integer.parseInt(strArmorpoint1);
		
		strArmorpoint2 = txtArmorpoint2.getText();
		armorPoint2=Integer.parseInt(strArmorpoint2);
		
		strArmorpoint3 = txtArmorpoint3.getText();
		armorPoint3=Integer.parseInt(strArmorpoint3);
		
		strArmorpoint4 = txtArmorpoint4.getText();
		armorPoint4=Integer.parseInt(strArmorpoint4);
	}

	public void getSpecialskill() {
		
		strSpecialskill1 = txtSpecialskill1.getText();
		strSpecialskill2 = txtSpecialskill2.getText();
		strSpecialskill3 = txtSpecialskill3.getText();
		strSpecialskill4 = txtSpecialskill4.getText();
	}

	public void getAttribute() {
		
		strAttention = txtAttention.getText();
		attention =Integer.parseInt(strAttention);

		strStrength = txtStrength.getText();
		strength=Integer.parseInt(strStrength);
		
		strKnowledge = txtKnowledge.getText();
		knowledge=Integer.parseInt(strKnowledge);
		
		strMagic = txtMagic.getText();
		magic=Integer.parseInt(strMagic);
		
		strInitiative = txtInitiative.getText();
		initiative=Integer.parseInt(strInitiative);
		
		strMovement = txtMovement.getText();
		movement=Integer.parseInt(strMovement);
		
	}

	public void getSuffer() {
		
		strSuffer1 = txtSuffer1.getText();
		strSuffer2 = txtSuffer2.getText();
		strSuffer3 = txtSuffer3.getText();
	}

	public void getCharcterinfo() {
		
		strName = txtName.getText();
		
		strFolk = txtFolk.getText();
		
		strJob = txtJob.getText();
		
		strAge = txtAge.getText();
		age = Integer.parseInt(strAge);
		
		strGold = txtGold.getText();
		gold = Integer.parseInt(strGold);
		
		strSilver = txtSilver.getText();
		silver = Integer.parseInt(strSilver);
		
		strCopper = txtCopper.getText();
		copper = Integer.parseInt(strCopper);
		
		strSkillpoints = txtSkillpoints.getText();
		skillpoints = Integer.parseInt(strSkillpoints);
		
		}

	public void getDefensepoint() {
		
		strDefensepoint1 = txtDefensepoint1.getText();
		defensePoint1 = Integer.parseInt(strDefensepoint1);
		
		strDefensepoint2 = txtDefensepoint2.getText();
		defensePoint2 = Integer.parseInt(strDefensepoint2);
		
		strDefensepoint3 = txtDefensepoint3.getText();
		defensePoint3 = Integer.parseInt(strDefensepoint3);
		
		strDefensepoint4 = txtDefensepoint4.getText();
		defensePoint4 = Integer.parseInt(strDefensepoint4);
		
	}

	public void getLifepoints() {
		
		strLifepoints1 = txtLifepoints1.getText();
		lifePoints1 = Integer.parseInt(strLifepoints1);

		strLifepoints2 = txtLifepoints2.getText();
		lifePoints2 = Integer.parseInt(strLifepoints2);
		
		strLifepoints3 = txtLifepoints3.getText();
		lifePoints3 = Integer.parseInt(strLifepoints3);
		
		strLifepoints4 = txtLifepoints4.getText();
		lifePoints4 = Integer.parseInt(strLifepoints4);
		
		strLifepoints5 = txtLifepoints5.getText();
		lifePoints5 = Integer.parseInt(strLifepoints5);
		
		strLifepoints6 = txtLifepoints6.getText();
		lifePoints6 = Integer.parseInt(strLifepoints6);
		
		strLifepoints7 = txtLifepoints7.getText();
		lifePoints7 = Integer.parseInt(strLifepoints7);

		strLifepoints8 = txtLifepoints8.getText();
		lifePoints8 = Integer.parseInt(strLifepoints8);
		
		
	}

	public void getWounded() {
		strWounded1 = txtWounded1.getText();
		wounded1 = Integer.parseInt(strWounded1);
		
		strWounded2 = txtWounded2.getText();
		wounded2 = Integer.parseInt(strWounded2);
		
		strWounded3 = txtWounded3.getText();
		wounded3 = Integer.parseInt(strWounded3);
		
		strWounded4 = txtWounded4.getText();
		wounded4 = Integer.parseInt(strWounded4);
		
		strWounded5 = txtWounded5.getText();
		wounded5 = Integer.parseInt(strWounded5);
		
		strWounded6 = txtWounded6.getText();
		wounded6 = Integer.parseInt(strWounded6);
		
		strWounded7 = txtWounded7.getText();
		wounded7 = Integer.parseInt(strWounded7);
		
		strDeadlywounded = txtDeadlywounded.getText();
		deadlyWounded = Integer.parseInt(strDeadlywounded);
	}
	
	
	
	
	
}
