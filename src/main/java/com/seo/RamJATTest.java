package com.seo;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;



class RamJATTest  extends Frame implements ActionListener,MouseListener,MouseMotionListener,WindowListener,ItemListener,TreeSelectionListener,TreeSelectionModel
{
	private static final int time[]={6,10,7,18,16,19,17,7,20};
	private static final String grah[]={"INAH  ","SASI  ","KUJA  ","RAAHU ","JEEVA ","MANDA ","GNA   ","KETU  ","BRUGHU"};
	private static final double lagna[]={5.32,4.07,5.12,3.18,4.12,4.40,3.45,2.18,3.20,4.50,5.32,3.45};
	 RamYear r=null,temp=null;
	LinkedHashMap lhs_nak=new LinkedHashMap();
	LinkedHashMap lhs_raasi=new LinkedHashMap();
	LinkedHashMap lhs_cal_raasi=new LinkedHashMap();
	java.awt.List ch1,ch2,ch3,grah_pos,grah_pos_amsa;
	Button b=null;
	FileOutputStream fos=null;
	PrintStream ps=null;
	TextField ruk_tf=null,buk_tf=null,tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
	Label l1,l2,l3,l4,l5,l6,cbl1,cbl2,cbl3,cbl4,cbl5,cbl6,cbl7,cbl8,cbl9;
	Checkbox cb=null,cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9;
	DefaultMutableTreeNode root=null;
	public static final String MESHAM="MESHAM";
	public static final String VRISHABHAM="VRISHABHAM";
	public static final String MIDHUNAM="MIDHUNAM";
	public static final String KARKATAKAM="KARKATAKAM";
	public static final String SIMHAM="SIMHAM";
	public static final String KANYA="KANYA";
	public static final String THULA="THULA" ;
	public static final String VRISCHIKAM="VRISCHIKAM";
	public static final String DHANASSU="DHANASSU";
	public static final String MAKARAM="MAKARAM";
	public static final String KUMBHAM="KUMBHAM";
	public static final String MEENAM="MEENAM" ;
	
	public static  final String INAH="INAH";
	public static  final String SASI="SASI";
	public static  final String KUJA="KUJA";
	public static  final String RAAHU="RAAHU";
	public static  final String JEEVA="JEEVA";
	public static  final String MANDA="MANDA";
	public static  final String GNA="GNA";
	public static  final String KETU="KETU";
	public static  final String BRUGHU="BRUGHU";
	
	private String RAVI="";
	private String CHANDRUDU="";
	private String KUJUDU="";
	private String RAAHUVU="";
	private String GURUDU="";
	private String SANI="";
	private String BHUDHUDU="";
	private String KETUVU="";
	private String SUKRUDU="";
	
	private String RAVI_IN_AMSA="";
	private String CHANDRUDU_IN_AMSA="";
	private String KUJUDU_IN_AMSA="";
	private String RAAHUVU_IN_AMSA="";
	private String GURUDU_IN_AMSA="";
	private String SANI_IN_AMSA="";
	private String BHUDHUDU_IN_AMSA="";
	private String KETUVU_IN_AMSA="";
	private String SUKRUDU_IN_AMSA="";
	
	private String RUNNING_DASA="";
	
	private String FristPlaceBasedOnLagna="";
	private String SecondPlaceBasedOnLagna="";
	private String ThirdPlaceBasedOnLagna="";
	private String FourthPlaceBasedOnLagna="";
	private String FifthPlaceBasedOnLagna="";
	private String SixthPlaceBasedOnLagna="";
	private String SeventhPlaceBasedOnLagna="";
	private String EighthPlaceBasedOnLagna="";
	private String NinethPlaceBasedOnLagna="";
	private String TenthPlaceBasedOnLagna="";
	private String EleventhPlaceBasedOnLagna="";
	private String TwelevethPlaceBasedOnLagna="";
	
	private String FristPlaceBasedOnLagnaAtAmsa="";
	private String SecondPlaceBasedOnLagnaAtAmsa="";
	private String ThirdPlaceBasedOnLagnaAtAmsa="";
	private String FourthPlaceBasedOnLagnaAtAmsa="";
	private String FifthPlaceBasedOnLagnaAtAmsa="";
	private String SixthPlaceBasedOnLagnaAtAmsa="";
	private String SeventhPlaceBasedOnLagnaAtAmsa="";
	private String EighthPlaceBasedOnLagnaAtAmsa="";
	private String NinethPlaceBasedOnLagnaAtAmsa="";
	private String TenthPlaceBasedOnLagnaAtAmsa="";
	private String EleventhPlaceBasedOnLagnaAtAmsa="";
	private String TwelevethPlaceBasedOnLagnaAtAmsa="";
	
	private String RAASI_LAGNA="";
	private String AMSA_LAGNA="";
	
	public static final int MESHAM_1=1;
	public static final int VRISHABHAM_2=2;
	public static final int MIDHUNAM_3=3;
	public static final int KARKATAKAM_4=4;
	public static final int SIMHAM_5=5;
	public static final int KANYA_6=6;
	public static final int THULA_7=7;
	public static final int VRISCHIKAM_8=8;
	public static final int DHANASSU_9=9;
	public static final int MAKARAM_10=10;
	public static final int KUMBHAM_11=11;
	public static final int MEENAM_12=12;
	
	public static final String ASHWINI="ASHWINI";
	public static final String BHARANI="BHARANI";
	public static final String KRITHIKA="KRITHIKA";
	public static final String ROHINI="ROHINI";
	public static final String MRUGASIRA="MRUGASIRA";
	public static final String ARUDRA="ARUDRA";
	public static final String PUNARVASU="PUNARVASU";
	public static final String PUSHYAMI="PUSHYAMI";
	public static final String ASHLESHA="ASHLESHA";
	public static final String MAKHA="MAKHA";
	public static final String PUBBA="PUBBA";
	public static final String UTTARA="UTTARA";
	public static final String HASTHA="HASTHA";
	public static final String CHITTA="CHITTA";
	public static final String SWATHI="SWATHI";
	public static final String VISAKHA="VISAKHA";
	public static final String ANURADHA="ANURADHA";
	public static final String JYESTA="JYESTA";
	public static final String MOOLA="MOOLA";
	public static final String POORVASHADA="POORVASHADA";
	public static final String UTTARASHADA="UTTARASHADA";
	public static final String SRAVANAM="SRAVANAM";
	public static final String DHANISTA="DHANISTA";
	public static final String SATHABISHAM="SATHABISHAM";
	public static final String POORVABHADRA="POORVABHADRA";
	public static final String UTTARABHADRA="UTTARABHADRA";
	public static final String REVATHI="REVATHI";
	
	
	public static final int ASHWINI_1=1;
	public static final int BHARANI_2=2;
	public static final int KRITHIKA_3=3;
	public static final int ROHINI_4=4;
	public static final int MRUGASIRA_5=5;
	public static final int ARUDRA_6=6;
	public static final int PUNARVASU_7=7;
	public static final int PUSHYAMI_8=8;
	public static final int ASHLESHA_9=9;
	public static final int MAKHA_10=10;
	public static final int PUBBA_11=11;
	public static final int UTTARA_12=12;
	public static final int HASTHA_13=13;
	public static final int CHITTA_14=14;
	public static final int SWATHI_15=15;
	public static final int VISAKHA_16=16;
	public static final int ANURADHA_17=17;
	public static final int JYESTA_18=18;
	public static final int MOOLA_19=19;
	public static final int POORVASHADA_20=20;
	public static final int UTTARASHADA_21=21;
	public static final int SRAVANAM_22=22;
	public static final int DHANISTA_23=23;
	public static final int SATHABISHAM_24=24;
	public static final int POORVABHADRA_25=25;
	public static final int UTTARABHADRA_26=26;
	public static final int REVATHI_27=27;
	Panel p=null,p1=null;
	TextArea ta=null;
	public RamJATTest()
	{
		setSize(1300,1300);
		setVisible(true);
		setLayout(null);
		setTitle("Ram Applet");
		setRAASI_LAGNA(VRISCHIKAM); //SETTING THE RAASI LAGNA
		describingAmsaLagna(getRAASI_LAGNA());// SETTING THE AMSA LAGNA
		addWindowListener(this);
		addMouseListener(this);
		addMouseMotionListener(this); 
		ta=new TextArea(50,50); root=new DefaultMutableTreeNode("ROOT");
		DefaultMutableTreeNode dmt=new DefaultMutableTreeNode("1");
		root.add(dmt);
		l1=new Label("NAKSHTRA SET");
		l2=new Label("GRAHA SET");
		l3=new Label("PADAM");
		l4=new Label("RAASI");
		l5=new Label("AMSA");
		l6=new Label("GAJA KESARI YOGA");
		cbl1=new Label("RAVI UCHCHA");
		cbl2=new Label("CHANDRA UCHCHA");
		cbl3=new Label("KUJA UCHCHA");
		cbl4=new Label("RAAHU UCHCHA");
		cbl5=new Label("JEEVA UCHCHA");
		cbl6=new Label("MANDA UCHCHA");
		cbl7=new Label("BHUDHUDU UCHCHA");
		cbl8=new Label("KETU UCHCHA");
		cbl9=new Label("SUKRA UCHCHA");
		r=new RamYear();
		temp=new RamYear();
		b=new Button("SHOW");
		cb=new Checkbox("GAJA KESARI YOGA");cb.setState(false);
		cb.addItemListener(this);
		
		cb1=new Checkbox("GAJA KESARI YOGA");cb1.setState(false);
		cb1.addItemListener(this);
		cb2=new Checkbox("GAJA KESARI YOGA");cb2.setState(false);
		cb2.addItemListener(this);
		cb3=new Checkbox("GAJA KESARI YOGA");cb3.setState(false);
		cb3.addItemListener(this);
		cb4=new Checkbox("GAJA KESARI YOGA");cb4.setState(false);
		cb4.addItemListener(this);
		cb5=new Checkbox("GAJA KESARI YOGA");cb5.setState(false);
		cb5.addItemListener(this);
		cb6=new Checkbox("GAJA KESARI YOGA");cb6.setState(false);
		cb6.addItemListener(this);
		cb7=new Checkbox("GAJA KESARI YOGA");cb7.setState(false);
		cb7.addItemListener(this);
		cb8=new Checkbox("GAJA KESARI YOGA");cb8.setState(false);
		cb8.addItemListener(this);
		cb9=new Checkbox("GAJA KESARI YOGA");cb9.setState(false);
		cb9.addItemListener(this);
		
		try{
		fos=new FileOutputStream("History.txt");
		ps=new PrintStream(fos);
		}//catch(IOException ie){}
		catch(FileNotFoundException fe){fe.printStackTrace();}
		lhs_raasi.put(new Integer(MESHAM_1),MESHAM);
		lhs_raasi.put(new Integer(VRISHABHAM_2),VRISHABHAM);
		lhs_raasi.put(new Integer(MIDHUNAM_3),MIDHUNAM);
		lhs_raasi.put(new Integer(KARKATAKAM_4),KARKATAKAM);
		lhs_raasi.put(new Integer(SIMHAM_5),SIMHAM);
		lhs_raasi.put(new Integer(KANYA_6),KANYA);
		lhs_raasi.put(new Integer(THULA_7),THULA);
		lhs_raasi.put(new Integer(VRISCHIKAM_8),VRISCHIKAM);
		lhs_raasi.put(new Integer(DHANASSU_9),DHANASSU);
		lhs_raasi.put(new Integer(MAKARAM_10),MAKARAM);
		lhs_raasi.put(new Integer(KUMBHAM_11),KUMBHAM);
		lhs_raasi.put(new Integer(MEENAM_12),MEENAM);
		
		lhs_nak.put(new Integer(ASHWINI_1),ASHWINI);
		lhs_nak.put(new Integer(BHARANI_2),BHARANI);
		lhs_nak.put(new Integer(KRITHIKA_3),KRITHIKA);
		lhs_nak.put(new Integer(ROHINI_4),ROHINI);
		lhs_nak.put(new Integer(MRUGASIRA_5),MRUGASIRA);
		lhs_nak.put(new Integer(ARUDRA_6),ARUDRA);
		lhs_nak.put(new Integer(PUNARVASU_7),PUNARVASU);
		lhs_nak.put(new Integer(PUSHYAMI_8),PUSHYAMI);
		lhs_nak.put(new Integer(ASHLESHA_9),ASHLESHA);
		lhs_nak.put(new Integer(MAKHA_10),MAKHA);
		lhs_nak.put(new Integer(PUBBA_11),PUBBA);
		lhs_nak.put(new Integer(UTTARA_12),UTTARA);
		lhs_nak.put(new Integer(HASTHA_13),HASTHA);
		lhs_nak.put(new Integer(CHITTA_14),CHITTA);
		lhs_nak.put(new Integer(SWATHI_15),SWATHI);
		lhs_nak.put(new Integer(VISAKHA_16),VISAKHA);
		lhs_nak.put(new Integer(ANURADHA_17),ANURADHA);
		lhs_nak.put(new Integer(JYESTA_18),JYESTA);
		lhs_nak.put(new Integer(MOOLA_19),MOOLA);
		lhs_nak.put(new Integer(POORVASHADA_20),POORVASHADA);
		lhs_nak.put(new Integer(UTTARASHADA_21),UTTARASHADA);
		lhs_nak.put(new Integer(SRAVANAM_22),SRAVANAM);
		lhs_nak.put(new Integer(DHANISTA_23),DHANISTA);
		lhs_nak.put(new Integer(SATHABISHAM_24),SATHABISHAM);
		lhs_nak.put(new Integer(POORVABHADRA_25),POORVABHADRA);
		lhs_nak.put(new Integer(UTTARABHADRA_26),UTTARABHADRA);
		lhs_nak.put(new Integer(REVATHI_27),REVATHI);
		
		ch1=new java.awt.List(30,false);
		ch2=new java.awt.List(9,false);
		ch3=new java.awt.List(4,false);
		grah_pos=new java.awt.List(9,false);
		grah_pos_amsa=new java.awt.List(9,false);
		ch3.add("1");
		ch3.add("2");
		ch3.add("3");
		ch3.add("4");
		ch2.add(INAH);
		ch2.add(SASI);
		ch2.add(KUJA);
		ch2.add(RAAHU);
		ch2.add(JEEVA);
		ch2.add(MANDA);
		ch2.add(GNA);
		ch2.add(KETU);
		ch2.add(BRUGHU);
		
		
	      ch1.add(ASHWINI);
	      ch1.add(BHARANI);
	      ch1.add(KRITHIKA);
	      ch1.add(ROHINI);
	      ch1.add(MRUGASIRA);
	      ch1.add(ARUDRA);
	      ch1.add(PUNARVASU);
	      ch1.add(PUSHYAMI);
	      ch1.add(ASHLESHA);
	      ch1.add(MAKHA);
	      ch1.add(PUBBA);
	      ch1.add(UTTARA);
	      ch1.add(HASTHA);
	      ch1.add(CHITTA);
	      ch1.add(SWATHI);
	      ch1.add(VISAKHA);
	      ch1.add(ANURADHA);
	      ch1.add(JYESTA);
	      ch1.add(MOOLA);
	      ch1.add(POORVASHADA);
	      ch1.add(UTTARASHADA);
	      ch1.add(SRAVANAM);
	      ch1.add(DHANISTA);
	      ch1.add(SATHABISHAM);
	      ch1.add(POORVABHADRA);
	      ch1.add(UTTARABHADRA);
	      ch1.add(REVATHI);
	      ruk_tf=new TextField(50);
	      buk_tf=new TextField(50);
	      tf1=new TextField(25);
	      tf2=new TextField(10);
	      tf3=new TextField(10);
	      tf4=new TextField(10);
	      tf5=new TextField(10);
	      tf6=new TextField(10);
	      tf7=new TextField(10);
	      tf8=new TextField(10);
	      tf7.setText("5");
	      tf8.setText("30");
		p=new Panel();
		p1=new Panel();
		JTree jt =new JTree(root,true);
		p.add("SOUTH",ch1);ch1.setBounds(50,55,200,450); p.add(jt);
		jt.setBounds(224,518,130,50);jt.addTreeSelectionListener(this);
		p.add("NORTH",ch2);ch2.setBounds(255,55,200,250);
		p.add("EAST",ch3); ch3.setBounds(460,55,200,75);
		p.add("WEST",ta);   ta.setBounds(255,310,400,190);p.add(cbl1);p.add(cbl2);p.add(cbl3);p.add(cbl4);
		p.add(cbl5);p.add(cbl6);p.add(cbl7);p.add(cbl8);p.add(cbl9);
		p.add(cb);cb.setBounds(469,259,10,10);cb1.setBounds(53,516,10,10);cbl1.setBounds(79,512,100,10);
		cb2.setBounds(53,526,10,10);cbl2.setBounds(79,522,100,10);
		cb3.setBounds(53,536,10,10);cbl3.setBounds(79,532,100,10);
		cb4.setBounds(53,546,10,10);cbl4.setBounds(79,542,100,10);
		cb5.setBounds(53,556,10,10);cbl5.setBounds(79,552,100,10);
		cb6.setBounds(53,566,10,10);cbl6.setBounds(79,562,100,10);
		cb7.setBounds(53,576,10,10);cbl7.setBounds(79,572,100,10);
		cb8.setBounds(53,586,10,10);cbl8.setBounds(79,582,100,10);
		cb9.setBounds(53,596,10,10);cbl9.setBounds(79,592,100,10);
		p.add(cb1);p.add(cb2);p.add(cb3);p.add(cb4);p.add(cb5);p.add(cb6);p.add(cb7);p.add(cb8);p.add(cb9);
		ruk_tf.setBounds(460,160,200,30);
	    buk_tf.setBounds(460,210,200,30);
	    tf1.setBounds(460,292,50,30);tf2.setBounds(519,292,25,30);tf3.setBounds(557,292,25,30);
	    tf4.setBounds(586,292,25,30);tf5.setBounds(617,292,25,30);tf6.setBounds(466,142,50,30);
	    tf7.setBounds(533,142,50,30);tf8.setBounds(612,142,50,30);
	    
		p1.add("SOUTH",grah_pos);grah_pos.setBounds(145,16,150,450);
		p1.add("NORTH",grah_pos_amsa);grah_pos_amsa.setBounds(300,16,150,450);
		p.add("SOUTH",ruk_tf);p.add(tf1);p.add(tf2);p.add(tf3);p.add(tf4);p.add(tf5);p.add(tf6);p.add(tf7);p.add(tf8);
		p.add("SOUTH",buk_tf);l1.setBounds(57,35,100,30);l2.setBounds(265,35,100,30);l3.setBounds(466,35,100,30);
		p.setBackground(new Color(128,128,128));l4.setBounds(157,8,100,30);l5.setBounds(313,8,100,30);
		p.setSize(650,650);p.add(l1);p.add(l2);p.add(l3);
		p1.setBackground(new Color(125,126,127));
		p1.setSize(650,650);
		p1.add(b);b.setBounds(145,470,310,50); 
		p1.add(l4);
		p1.add(l5);p.add(l6);l6.setBounds(496,259,150,20);
		b.addActionListener(this);
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
		p1.setBounds(536,48,1300,1300);
		
		add(p);
		add(p1);
		p.addMouseListener(this);
		p1.addMouseListener(this);
		
		
	}
	public void paint(Graphics g)
	{
		g.drawString("-",514,292);
	}
	
	@SuppressWarnings("deprecation")
	public String searchForStringinFile(String searchStr,InputStream fis) throws IOException
	{


		DataInputStream dis=new DataInputStream(fis);
		
		String st="";
		while(st!=null)
		{
			st=dis.readLine();
			if(searchForString(searchStr, st))
			{
				System.out.println(st);
				return st;
			}
		}
		return "-";
	}
	
	public boolean searchForString(String searchStr,String mainStr)
	{
		char buf[]=searchStr.toCharArray();
		boolean result=false;
		
		
			char main_arr[]=mainStr.toCharArray();
			for(int i=0;i<main_arr.length;i++)
			{
				if(main_arr[i]==buf[0])
				{
					for(int j=0;j<buf.length;j++)
					{
						if(main_arr[j+i]==buf[j])
						{
							if(j==buf.length-1)
						  result=true;	
						  
						}
						else
						 break;	
						
					}
				}
				else
					continue;
            } 
			return result;
				
	
	}
	public String getEighthPlaceBasedOnLagna() {
		return EighthPlaceBasedOnLagna;
	}
	
	public Rectangle getManupulatedBounds(int x,int y,int width,int height )
	{
		int totW=x+width;
		int totH=y+height;
		return new Rectangle(x,y,totW,totH);
	}
	
    public void describingAmsaLagna(String lagna_raasi)
    {
       if((lagna_raasi.trim().equalsIgnoreCase(MESHAM)) || (lagna_raasi.trim().equalsIgnoreCase(SIMHAM)) || (lagna_raasi.trim().equalsIgnoreCase(DHANASSU)))
    		   setAMSA_LAGNA(MESHAM);
       else if((lagna_raasi.trim().equalsIgnoreCase(VRISHABHAM)) || (lagna_raasi.trim().equalsIgnoreCase(KANYA)) || (lagna_raasi.trim().equalsIgnoreCase(MAKARAM)))
    		   setAMSA_LAGNA(MAKARAM);
       else if((lagna_raasi.trim().equalsIgnoreCase(MIDHUNAM)) || (lagna_raasi.trim().equalsIgnoreCase(THULA)) || (lagna_raasi.trim().equalsIgnoreCase(KUMBHAM)))
    		   setAMSA_LAGNA(THULA);
       else if((lagna_raasi.trim().equalsIgnoreCase(KARKATAKAM)) || (lagna_raasi.trim().equalsIgnoreCase(VRISCHIKAM)) || (lagna_raasi.trim().equalsIgnoreCase(MEENAM)))
    		   setAMSA_LAGNA(KARKATAKAM);
     	
    }
	public void setEighthPlaceBasedOnLagna(String eighthPlaceBasedOnLagna) {
		EighthPlaceBasedOnLagna = eighthPlaceBasedOnLagna;
	}

	public String getEleventhPlaceBasedOnLagna() {
		return EleventhPlaceBasedOnLagna;
	}

	public void setEleventhPlaceBasedOnLagna(String eleventhPlaceBasedOnLagna) {
		EleventhPlaceBasedOnLagna = eleventhPlaceBasedOnLagna;
	}

	public String getFifthPlaceBasedOnLagna() {
		return FifthPlaceBasedOnLagna;
	}

	public void setFifthPlaceBasedOnLagna(String fifthPlaceBasedOnLagna) {
		FifthPlaceBasedOnLagna = fifthPlaceBasedOnLagna;
	}

	public String getFourthPlaceBasedOnLagna() {
		return FourthPlaceBasedOnLagna;
	}

	public void setFourthPlaceBasedOnLagna(String fourthPlaceBasedOnLagna) {
		FourthPlaceBasedOnLagna = fourthPlaceBasedOnLagna;
	}

	public String getFristPlaceBasedOnLagna() {
		return FristPlaceBasedOnLagna;
	}
	
	/*START*/
	public String getEighthPlaceBasedOnLagnaAtAmsa() {
		return EighthPlaceBasedOnLagnaAtAmsa;
	}

	public void setEighthPlaceBasedOnLagnaAtAmsa(String eighthPlaceBasedOnLagnaAtAmsa) {
		EighthPlaceBasedOnLagnaAtAmsa = eighthPlaceBasedOnLagnaAtAmsa;
	}

	public String getEleventhPlaceBasedOnLagnaAtAmsa() {
		return EleventhPlaceBasedOnLagnaAtAmsa;
	}

	public void setEleventhPlaceBasedOnLagnaAtAmsa(String eleventhPlaceBasedOnLagnaAtAmsa) {
		EleventhPlaceBasedOnLagnaAtAmsa = eleventhPlaceBasedOnLagnaAtAmsa;
	}

	public String getFifthPlaceBasedOnLagnaAtAmsa() {
		return FifthPlaceBasedOnLagnaAtAmsa;
	}

	public void setFifthPlaceBasedOnLagnaAtAmsa(String fifthPlaceBasedOnLagnaAtAmsa) {
		FifthPlaceBasedOnLagnaAtAmsa = fifthPlaceBasedOnLagnaAtAmsa;
	}

	public String getFourthPlaceBasedOnLagnaAtAmsa() {
		return FourthPlaceBasedOnLagnaAtAmsa;
	}

	public void setFourthPlaceBasedOnLagnaAtAmsa(String fourthPlaceBasedOnLagnaAtAmsa) {
		FourthPlaceBasedOnLagnaAtAmsa = fourthPlaceBasedOnLagnaAtAmsa;
	}

	public String getFristPlaceBasedOnLagnaAtAmsa() {
		return FristPlaceBasedOnLagnaAtAmsa;
	}
	
	/*END*/
	public String getMentionedPlaceGrah(int place)
	{
		String ras="";
		switch(place)
		{
		case 1:
			   ras=getFristPlaceBasedOnLagna();
			    break;
		case 2:
			ras=getSecondPlaceBasedOnLagna();
		    break;
		case 3:
			ras=getThirdPlaceBasedOnLagna();
		    break;
		case 4:
			ras=getFourthPlaceBasedOnLagna();
		    break;
		case 5:
			ras=getFifthPlaceBasedOnLagna();
		    break;
		case 6:
			ras=getSixthPlaceBasedOnLagna();
		    break;
		case 7:
			ras=getSeventhPlaceBasedOnLagna();
		    break;
		case 8:
			ras=getEighthPlaceBasedOnLagna();
		    break;
		case 9:
			ras=getNinethPlaceBasedOnLagna();
		    break;
		case 10:
			ras=getTenthPlaceBasedOnLagna();
		    break;
		case 11:
			ras=getEleventhPlaceBasedOnLagna();
		    break;
		case 12:
			ras=getTwelevethPlaceBasedOnLagna();
		    break;
		}
		String result="";
		if(ras.trim().equalsIgnoreCase(getRAVI().trim()))
			result+= "RAVI,";
		if(ras.trim().equalsIgnoreCase(getCHANDRUDU().trim()))
			result+= "CHANDRUDU,";
		if(ras.trim().equalsIgnoreCase(getKUJUDU().trim()))
			result+= "KUJUDU,";
		if(ras.trim().equalsIgnoreCase(getRAAHUVU().trim()))
			result+= "RAAHUVU,";
		if(ras.trim().equalsIgnoreCase(getGURUDU().trim()))
			result+= "GURUDU,";
		if(ras.trim().equalsIgnoreCase(getSANI().trim()))
			result+= "SANI,";
		if(ras.trim().equalsIgnoreCase(getBHUDHUDU().trim()))
			result+= "BHUDHUDU,";
		if(ras.trim().equalsIgnoreCase(getKETUVU().trim()))
			result+= "KETUVU,";
		if(ras.trim().equalsIgnoreCase(getSUKRUDU().trim()))
			result+= "SUKRUDU,"; 
		return result;
		
	}
     
	public String getMentionedPlaceGrahAtAmsa(int place)
	{
		String ras="";
		switch(place)
		{
		case 1:
			   ras=getFristPlaceBasedOnLagnaAtAmsa();
			    break;
		case 2:
			ras=getSecondPlaceBasedOnLagnaAtAmsa();
		    break;
		case 3:
			ras=getThirdPlaceBasedOnLagnaAtAmsa();
		    break;
		case 4:
			ras=getFourthPlaceBasedOnLagnaAtAmsa();
		    break;
		case 5:
			ras=getFifthPlaceBasedOnLagnaAtAmsa();
		    break;
		case 6:
			ras=getSixthPlaceBasedOnLagnaAtAmsa();
		    break;
		case 7:
			ras=getSeventhPlaceBasedOnLagnaAtAmsa();
		    break;
		case 8:
			ras=getEighthPlaceBasedOnLagnaAtAmsa();
		    break;
		case 9:
			ras=getNinethPlaceBasedOnLagnaAtAmsa();
		    break;
		case 10:
			ras=getTenthPlaceBasedOnLagnaAtAmsa();
		    break;
		case 11:
			ras=getEleventhPlaceBasedOnLagnaAtAmsa();
		    break;
		case 12:
			ras=getTwelevethPlaceBasedOnLagnaAtAmsa();
		    break;
		}
		String result="";
		if(ras.trim().equalsIgnoreCase(getRAVI_IN_AMSA().trim()))
			result+= "RAVI,";
		if(ras.trim().equalsIgnoreCase(getCHANDRUDU_IN_AMSA().trim()))
			result+= "CHANDRUDU,";
		if(ras.trim().equalsIgnoreCase(getKUJUDU_IN_AMSA().trim()))
			result+= "KUJUDU,";
		if(ras.trim().equalsIgnoreCase(getRAAHUVU_IN_AMSA().trim()))
			result+= "RAAHUVU,";
		if(ras.trim().equalsIgnoreCase(getGURUDU_IN_AMSA().trim()))
			result+= "GURUDU,";
		if(ras.trim().equalsIgnoreCase(getSANI_IN_AMSA().trim()))
			result+= "SANI,";
		if(ras.trim().equalsIgnoreCase(getBHUDHUDU_IN_AMSA().trim()))
			result+= "BHUDHUDU,";
		if(ras.trim().equalsIgnoreCase(getKETUVU_IN_AMSA().trim()))
			result+= "KETUVU,";
		if(ras.trim().equalsIgnoreCase(getSUKRUDU_IN_AMSA().trim()))
			result+= "SUKRUDU,"; 
		return result;
		
	}
	
	public String getAmsaCalculationForGivenGrah(int star_no,int pad)
	{
		int result=star_no%3;
		switch(result)
		{
		case 0:
			   return getRaasiName(8+pad);
			  // break;
		case 1:
			   return getRaasiName(pad); 
			  // break;
		case 2:
			   return getRaasiName(4+pad);
			   //break;
	      
		}
		return "NIL";
	}
	public String getRaasiName(int no)
	{
	   switch(no)
	   {
	   case 1: 
		      return MESHAM;
	   case 2: 
		      return VRISHABHAM;
	   case 3: 
		      return MIDHUNAM;
	   case 4: 
		      return KARKATAKAM;
	   case 5: 
		      return SIMHAM;
	   case 6: 
		      return KANYA;
	   case 7: 
		      return THULA;
	   case 8: 
		      return VRISCHIKAM;
	   case 9: 
		      return DHANASSU;
	   case 10: 
		      return MAKARAM;
	   case 11: 
		      return KUMBHAM;
	   case 12: 
		      return MEENAM;
	   }
	   return "NIL";
	}
	public void setFristPlaceBasedOnLagna(String fristPlaceBasedOnLagna) {
		FristPlaceBasedOnLagna = fristPlaceBasedOnLagna;
	}

	public String getNinethPlaceBasedOnLagna() {
		return NinethPlaceBasedOnLagna;
	}

	public void setNinethPlaceBasedOnLagna(String ninethPlaceBasedOnLagna) {
		NinethPlaceBasedOnLagna = ninethPlaceBasedOnLagna;
	}

	public String getSecondPlaceBasedOnLagna() {
		return SecondPlaceBasedOnLagna;
	}

	public void setSecondPlaceBasedOnLagna(String secondPlaceBasedOnLagna) {
		SecondPlaceBasedOnLagna = secondPlaceBasedOnLagna;
	}

	public String getSeventhPlaceBasedOnLagna() {
		return SeventhPlaceBasedOnLagna;
	}

	public void setSeventhPlaceBasedOnLagna(String seventhPlaceBasedOnLagna) {
		SeventhPlaceBasedOnLagna = seventhPlaceBasedOnLagna;
	}

	public String getSixthPlaceBasedOnLagna() {
		return SixthPlaceBasedOnLagna;
	}

	public void setSixthPlaceBasedOnLagna(String sixthPlaceBasedOnLagna) {
		SixthPlaceBasedOnLagna = sixthPlaceBasedOnLagna;
	}

	public String getTenthPlaceBasedOnLagna() {
		return TenthPlaceBasedOnLagna;
	}

	public void setTenthPlaceBasedOnLagna(String tenthPlaceBasedOnLagna) {
		TenthPlaceBasedOnLagna = tenthPlaceBasedOnLagna;
	}

	public String getThirdPlaceBasedOnLagna() {
		return ThirdPlaceBasedOnLagna;
	}

	public void setThirdPlaceBasedOnLagna(String thirdPlaceBasedOnLagna) {
		ThirdPlaceBasedOnLagna = thirdPlaceBasedOnLagna;
	}

	public String getTwelevethPlaceBasedOnLagna() {
		return TwelevethPlaceBasedOnLagna;
	}

	public void setTwelevethPlaceBasedOnLagna(String twelevethPlaceBasedOnLagna) {
		TwelevethPlaceBasedOnLagna = twelevethPlaceBasedOnLagna;
	}
	
	
	/*******START********/
	
	public void setFristPlaceBasedOnLagnaAtAmsa(String fristPlaceBasedOnLagnaAtAmsa) {
		FristPlaceBasedOnLagnaAtAmsa = fristPlaceBasedOnLagnaAtAmsa;
	}

	public String getNinethPlaceBasedOnLagnaAtAmsa() {
		return NinethPlaceBasedOnLagnaAtAmsa;
	}

	public void setNinethPlaceBasedOnLagnaAtAmsa(String ninethPlaceBasedOnLagnaAtAmsa) {
		NinethPlaceBasedOnLagnaAtAmsa = ninethPlaceBasedOnLagnaAtAmsa;
	}

	public String getSecondPlaceBasedOnLagnaAtAmsa() {
		return SecondPlaceBasedOnLagnaAtAmsa;
	}

	public void setSecondPlaceBasedOnLagnaAtAmsa(String secondPlaceBasedOnLagnaAtAmsa) {
		SecondPlaceBasedOnLagnaAtAmsa = secondPlaceBasedOnLagnaAtAmsa;
	}

	public String getSeventhPlaceBasedOnLagnaAtAmsa() {
		return SeventhPlaceBasedOnLagnaAtAmsa;
	}

	public void setSeventhPlaceBasedOnLagnaAtAmsa(String seventhPlaceBasedOnLagnaAtAmsa) {
		SeventhPlaceBasedOnLagnaAtAmsa = seventhPlaceBasedOnLagnaAtAmsa;
	}

	public String getSixthPlaceBasedOnLagnaAtAmsa() {
		return SixthPlaceBasedOnLagnaAtAmsa;
	}

	public void setSixthPlaceBasedOnLagnaAtAmsa(String sixthPlaceBasedOnLagnaAtAmsa) {
		SixthPlaceBasedOnLagnaAtAmsa = sixthPlaceBasedOnLagnaAtAmsa;
	}

	public String getTenthPlaceBasedOnLagnaAtAmsa() {
		return TenthPlaceBasedOnLagnaAtAmsa;
	}

	public void setTenthPlaceBasedOnLagnaAtAmsa(String tenthPlaceBasedOnLagnaAtAmsa) {
		TenthPlaceBasedOnLagnaAtAmsa = tenthPlaceBasedOnLagnaAtAmsa;
	}

	public String getThirdPlaceBasedOnLagnaAtAmsa() {
		return ThirdPlaceBasedOnLagnaAtAmsa;
	}

	public void setThirdPlaceBasedOnLagnaAtAmsa(String thirdPlaceBasedOnLagnaAtAmsa) {
		ThirdPlaceBasedOnLagnaAtAmsa = thirdPlaceBasedOnLagnaAtAmsa;
	}

	public String getTwelevethPlaceBasedOnLagnaAtAmsa() {
		return TwelevethPlaceBasedOnLagnaAtAmsa;
	}

	public void setTwelevethPlaceBasedOnLagnaAtAmsa(String twelevethPlaceBasedOnLagnaAtAmsa) {
		TwelevethPlaceBasedOnLagnaAtAmsa = twelevethPlaceBasedOnLagnaAtAmsa;
	}
	
	
	

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		RamJATTest rr=new RamJATTest();
		try {
			rr.searchForStringinFile( "Mercury is in the 8th house",
					Thread.currentThread().getContextClassLoader().getResourceAsStream("Bhrigu Sutras.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getRaasi(int no)
	{ 
		
		  if(no==11 ||no==12 ||no==13|| no==14||no==21||no==22||no==23||no==24||no==31)
			  return MESHAM;
		  if(no==32 ||no==33||no==34||no==41||no==42||no==43||no==44||no==51||no==52)
			  return VRISHABHAM;  
		  if(no==53||no==54||no==61||no==62||no==63||no==64||no==71||no==72||no==73)
			  return  MIDHUNAM;
		  if(no==74||no==81||no==82||no==83||no==84||no==91||no==92||no==93||no==94)
			  return KARKATAKAM;
		  
		  if(no==101||no==102||no==103||no==104||no==111||no==112||no==113||no==114||no==121)
			  return SIMHAM;
		  if(no==122||no==123||no==124||no==131||no==132||no==133||no==134||no==141||no==142)
			  return KANYA;
		  if(no==143||no==144||no==151||no==152||no==153||no==154||no==161||no==162||no==163)
			  return THULA;
		  if(no==164||no==171||no==172||no==173||no==174||no==181||no==182||no==183||no==184)
			  return VRISCHIKAM;   
		     
		  if(no==191||no==192||no==193||no==194||no==201||no==202||no==203||no==204||no==211)
			  return DHANASSU;
		  if(no==212||no==213||no==214||no==221||no==222||no==223||no==224||no==231||no==232)
			  return MAKARAM;
		  if(no==233||no==234||no==241||no==242||no==243||no==244||no==251||no==252||no==253)
			  return KUMBHAM;
		  if(no==254||no==261||no==262||no==263||no==264||no==271||no==272||no==273||no==274)
			  return MEENAM;
		  
		  return "NIL";   
		
	}
	
 public int getDasaNumber(String dasa)
 {
   if(dasa.trim().equalsIgnoreCase(INAH))
	   return 1;
   else if(dasa.trim().equalsIgnoreCase(SASI))
	   return 2;
   else if(dasa.trim().equalsIgnoreCase(KUJA))
	   return 3;
   else if(dasa.trim().equalsIgnoreCase(RAAHU))
	   return 4;
   else if(dasa.trim().equalsIgnoreCase(JEEVA))
	   return 5;
   else if(dasa.trim().equalsIgnoreCase(MANDA))
	   return 6;
   else if(dasa.trim().equalsIgnoreCase(GNA))
	   return 7;
   else if(dasa.trim().equalsIgnoreCase(KETU))
	   return 8;
   else if(dasa.trim().equalsIgnoreCase(BRUGHU))
	   return 9;
   
   else
	   return -1;
	 
 }
 
 public String getDasaAttheTimeOfBirth(String nak)
 {
	 int num=getNakNo(nak);
	 
	 if(num==1)
		return KETU;
	 else if(num==2)
		 return BRUGHU;
	 else
	 {
		 int num1=(num-3)%9;
		 switch(num1)
		 {
		   case 0:
			       return INAH;
		   case 1:	       
			       return SASI;
		   case 2:
		           return KUJA;
	       case 3:	       
		           return RAAHU;
	       case 4:
		           return JEEVA;
	       case 5:	       
		           return MANDA;
	       case 6:
	               return GNA;
           case 7:	       
	               return KETU;
           case 8:	       
	               return BRUGHU;    
			       
		 }
	 }
	 return "NIL";
	 
 }
 
public int getRaasiNo(String name)
{
	Collection c=lhs_raasi.values();
	Iterator i=c.iterator();
	int count=1;
	while(i.hasNext())
	{
		String str=(String)i.next();
		System.out.println(str+":"+count);
	  if(name.trim().equalsIgnoreCase(str))	
		  return count;
	  count++;
	}
	return -1;
	
}
public String getUchchaRaasi(String grah)
{
  if(grah.trim().equalsIgnoreCase(INAH))
	 return MESHAM; 
  else 	if(grah.trim().equalsIgnoreCase(SASI))
	  return VRISHABHAM; 
  else 	if(grah.trim().equalsIgnoreCase(KUJA))
	  return MAKARAM; 
  else 	if(grah.trim().equalsIgnoreCase(RAAHU))
	  return SIMHAM; 
  else 	if(grah.trim().equalsIgnoreCase(JEEVA))
	  return KARKATAKAM; 
  else 	if(grah.trim().equalsIgnoreCase(MANDA))
	  return THULA; 
  else 	if(grah.trim().equalsIgnoreCase(GNA))
	  return KANYA; 
  else 	if(grah.trim().equalsIgnoreCase(KETU))
	  return KUMBHAM; 
  else 	if(grah.trim().equalsIgnoreCase(BRUGHU))
	  return MEENAM; 
  else 
	  return "NIL"; 
}
public String getNeechRaasi(String grah)
{
	if(grah.trim().equalsIgnoreCase(INAH))
		 return THULA; 
	  else 	if(grah.trim().equalsIgnoreCase(SASI))
		  return VRISCHIKAM; 
	  else 	if(grah.trim().equalsIgnoreCase(KUJA))
		  return KARKATAKAM; 
	  else 	if(grah.trim().equalsIgnoreCase(RAAHU))
		  return DHANASSU; 
	  else 	if(grah.trim().equalsIgnoreCase(JEEVA))
		  return MAKARAM; 
	  else 	if(grah.trim().equalsIgnoreCase(MANDA))
		  return MESHAM; 
	  else 	if(grah.trim().equalsIgnoreCase(GNA))
		  return MEENAM; 
	  else 	if(grah.trim().equalsIgnoreCase(KETU))
		  return MIDHUNAM; 
	  else 	if(grah.trim().equalsIgnoreCase(BRUGHU))
		  return KANYA; 
	  else 
		  return "NIL"; 
	
}
public String prepareChartMesham()
{
  String str="";
  if(getRAVI().equalsIgnoreCase(MESHAM))
  {
	  str+=" RAVI\n";
  }
  if(getCHANDRUDU().equalsIgnoreCase(MESHAM))
  {
	  str+=" CHANDRUDU\n";
  }
  if(getKUJUDU().equalsIgnoreCase(MESHAM))
  {
	  str+=" KUJUDU\n";
  }
  if(getRAAHUVU().equalsIgnoreCase(MESHAM))
  {
	  str+=" RAAHUVU\n";
  }
  if(getGURUDU().equalsIgnoreCase(MESHAM))
  {
	  str+=" GURUDU\n";
  }
  if(getSANI().equalsIgnoreCase(MESHAM))
  {
	  str+=" SANI\n";
  }
  if(getBHUDHUDU().equalsIgnoreCase(MESHAM))
  {
	  str+=" BHUDHUDU\n";
  }
  if(getKETUVU().equalsIgnoreCase(MESHAM))
  {
	  str+=" KETUVU\n";
  }
  if(getSUKRUDU().equalsIgnoreCase(MESHAM))
  {
	  str+=" SUKRUDU\n";
  }
  return str;
}

public String prepareChartVrishabham()
{
  String str="";
  if(getRAVI().equalsIgnoreCase(VRISHABHAM))
  {
	  str+=" RAVI\n";
  }
  if(getCHANDRUDU().equalsIgnoreCase(VRISHABHAM))
  {
	  str+=" CHANDRUDU\n";
  }
  if(getKUJUDU().equalsIgnoreCase(VRISHABHAM))
  {
	  str+=" KUJUDU\n";
  }
  if(getRAAHUVU().equalsIgnoreCase(VRISHABHAM))
  {
	  str+=" RAAHUVU\n";
  }
  if(getGURUDU().equalsIgnoreCase(VRISHABHAM))
  {
	  str+=" GURUDU\n";
  }
  if(getSANI().equalsIgnoreCase(VRISHABHAM))
  {
	  str+=" SANI\n";
  }
  if(getBHUDHUDU().equalsIgnoreCase(VRISHABHAM))
  {
	  str+=" BHUDHUDU\n";
  }
  if(getKETUVU().equalsIgnoreCase(VRISHABHAM))
  {
	  str+=" KETUVU\n";
  }
  if(getSUKRUDU().equalsIgnoreCase(VRISHABHAM))
  {
	  str+=" SUKRUDU\n";
  }
  return str;
}

public String prepareChartMidhunam()
{
  String str="";
  if(getRAVI().equalsIgnoreCase(MIDHUNAM))
  {
	  str+=" RAVI\n";
  }
  if(getCHANDRUDU().equalsIgnoreCase(MIDHUNAM))
  {
	  str+=" CHANDRUDU\n";
  }
  if(getKUJUDU().equalsIgnoreCase(MIDHUNAM))
  {
	  str+=" KUJUDU\n";
  }
  if(getRAAHUVU().equalsIgnoreCase(MIDHUNAM))
  {
	  str+=" RAAHUVU\n";
  }
  if(getGURUDU().equalsIgnoreCase(MIDHUNAM))
  {
	  str+=" GURUDU\n";
  }
  if(getSANI().equalsIgnoreCase(MIDHUNAM))
  {
	  str+=" SANI\n";
  }
  if(getBHUDHUDU().equalsIgnoreCase(MIDHUNAM))
  {
	  str+=" BHUDHUDU\n";
  }
  if(getKETUVU().equalsIgnoreCase(MIDHUNAM))
  {
	  str+=" KETUVU\n";
  }
  if(getSUKRUDU().equalsIgnoreCase(MIDHUNAM))
  {
	  str+=" SUKRUDU\n";
  }
  return str;
}

public String prepareChartKarkatakam()
{
  String str="";
  if(getRAVI().equalsIgnoreCase(KARKATAKAM))
  {
	  str+=" RAVI\n";
  }
  if(getCHANDRUDU().equalsIgnoreCase(KARKATAKAM))
  {
	  str+=" CHANDRUDU\n";
  }
  if(getKUJUDU().equalsIgnoreCase(KARKATAKAM))
  {
	  str+=" KUJUDU\n";
  }
  if(getRAAHUVU().equalsIgnoreCase(KARKATAKAM))
  {
	  str+=" RAAHUVU\n";
  }
  if(getGURUDU().equalsIgnoreCase(KARKATAKAM))
  {
	  str+=" GURUDU\n";
  }
  if(getSANI().equalsIgnoreCase(KARKATAKAM))
  {
	  str+=" SANI\n";
  }
  if(getBHUDHUDU().equalsIgnoreCase(KARKATAKAM))
  {
	  str+=" BHUDHUDU\n";
  }
  if(getKETUVU().equalsIgnoreCase(KARKATAKAM))
  {
	  str+=" KETUVU\n";
  }
  if(getSUKRUDU().equalsIgnoreCase(KARKATAKAM))
  {
	  str+=" SUKRUDU\n";
  }
  return str;
}

public String prepareChartSimham()
{
  String str="";
  if(getRAVI().equalsIgnoreCase(SIMHAM))
  {
	  str+=" RAVI\n";
  }
  if(getCHANDRUDU().equalsIgnoreCase(SIMHAM))
  {
	  str+=" CHANDRUDU\n";
  }
  if(getKUJUDU().equalsIgnoreCase(SIMHAM))
  {
	  str+=" KUJUDU\n";
  }
  if(getRAAHUVU().equalsIgnoreCase(SIMHAM))
  {
	  str+=" RAAHUVU\n";
  }
  if(getGURUDU().equalsIgnoreCase(SIMHAM))
  {
	  str+=" GURUDU\n";
  }
  if(getSANI().equalsIgnoreCase(SIMHAM))
  {
	  str+=" SANI\n";
  }
  if(getBHUDHUDU().equalsIgnoreCase(SIMHAM))
  {
	  str+=" BHUDHUDU\n";
  }
  if(getKETUVU().equalsIgnoreCase(SIMHAM))
  {
	  str+=" KETUVU\n";
  }
  if(getSUKRUDU().equalsIgnoreCase(SIMHAM))
  {
	  str+=" SUKRUDU\n";
  }
  return str;
}

public String prepareChartKanya()
{
  String str="";
  if(getRAVI().equalsIgnoreCase(KANYA))
  {
	  str+=" RAVI\n";
  }
  if(getCHANDRUDU().equalsIgnoreCase(KANYA))
  {
	  str+=" CHANDRUDU\n";
  }
  if(getKUJUDU().equalsIgnoreCase(KANYA))
  {
	  str+=" KUJUDU\n";
  }
  if(getRAAHUVU().equalsIgnoreCase(KANYA))
  {
	  str+=" RAAHUVU\n";
  }
  if(getGURUDU().equalsIgnoreCase(KANYA))
  {
	  str+=" GURUDU\n";
  }
  if(getSANI().equalsIgnoreCase(KANYA))
  {
	  str+=" SANI\n";
  }
  if(getBHUDHUDU().equalsIgnoreCase(KANYA))
  {
	  str+=" BHUDHUDU\n";
  }
  if(getKETUVU().equalsIgnoreCase(KANYA))
  {
	  str+=" KETUVU\n";
  }
  if(getSUKRUDU().equalsIgnoreCase(KANYA))
  {
	  str+=" SUKRUDU\n";
  }
  return str;
}

public String prepareChartThula()
{
  String str="";
  if(getRAVI().equalsIgnoreCase(THULA))
  {
	  str+=" RAVI\n";
  }
  if(getCHANDRUDU().equalsIgnoreCase(THULA))
  {
	  str+=" CHANDRUDU\n";
  }
  if(getKUJUDU().equalsIgnoreCase(THULA))
  {
	  str+=" KUJUDU\n";
  }
  if(getRAAHUVU().equalsIgnoreCase(THULA))
  {
	  str+=" RAAHUVU\n";
  }
  if(getGURUDU().equalsIgnoreCase(THULA))
  {
	  str+=" GURUDU\n";
  }
  if(getSANI().equalsIgnoreCase(THULA))
  {
	  str+=" SANI\n";
  }
  if(getBHUDHUDU().equalsIgnoreCase(THULA))
  {
	  str+=" BHUDHUDU\n";
  }
  if(getKETUVU().equalsIgnoreCase(THULA))
  {
	  str+=" KETUVU\n";
  }
  if(getSUKRUDU().equalsIgnoreCase(THULA))
  {
	  str+=" SUKRUDU\n";
  }
  return str;
}

public String prepareChartVrischikam()
{
  String str="";
  if(getRAVI().equalsIgnoreCase(VRISCHIKAM))
  {
	  str+=" RAVI\n";
  }
  if(getCHANDRUDU().equalsIgnoreCase(VRISCHIKAM))
  {
	  str+=" CHANDRUDU\n";
  }
  if(getKUJUDU().equalsIgnoreCase(VRISCHIKAM))
  {
	  str+=" KUJUDU\n";
  }
  if(getRAAHUVU().equalsIgnoreCase(VRISCHIKAM))
  {
	  str+=" RAAHUVU\n";
  }
  if(getGURUDU().equalsIgnoreCase(VRISCHIKAM))
  {
	  str+=" GURUDU\n";
  }
  if(getSANI().equalsIgnoreCase(VRISCHIKAM))
  {
	  str+=" SANI\n";
  }
  if(getBHUDHUDU().equalsIgnoreCase(VRISCHIKAM))
  {
	  str+=" BHUDHUDU\n";
  }
  if(getKETUVU().equalsIgnoreCase(VRISCHIKAM))
  {
	  str+=" KETUVU\n";
  }
  if(getSUKRUDU().equalsIgnoreCase(VRISCHIKAM))
  {
	  str+=" SUKRUDU\n";
  }
  return str;
}

public String prepareChartDhanassu()
{
  String str="";
  if(getRAVI().equalsIgnoreCase(DHANASSU))
  {
	  str+=" RAVI\n";
  }
  if(getCHANDRUDU().equalsIgnoreCase(DHANASSU))
  {
	  str+=" CHANDRUDU\n";
  }
  if(getKUJUDU().equalsIgnoreCase(DHANASSU))
  {
	  str+=" KUJUDU\n";
  }
  if(getRAAHUVU().equalsIgnoreCase(DHANASSU))
  {
	  str+=" RAAHUVU\n";
  }
  if(getGURUDU().equalsIgnoreCase(DHANASSU))
  {
	  str+=" GURUDU\n";
  }
  if(getSANI().equalsIgnoreCase(DHANASSU))
  {
	  str+=" SANI\n";
  }
  if(getBHUDHUDU().equalsIgnoreCase(DHANASSU))
  {
	  str+=" BHUDHUDU\n";
  }
  if(getKETUVU().equalsIgnoreCase(DHANASSU))
  {
	  str+=" KETUVU\n";
  }
  if(getSUKRUDU().equalsIgnoreCase(DHANASSU))
  {
	  str+=" SUKRUDU\n";
  }
  return str;
}

public String prepareChartMakaram()
{
  String str="";
  if(getRAVI().equalsIgnoreCase(MAKARAM))
  {
	  str+=" RAVI\n";
  }
  if(getCHANDRUDU().equalsIgnoreCase(MAKARAM))
  {
	  str+=" CHANDRUDU\n";
  }
  if(getKUJUDU().equalsIgnoreCase(MAKARAM))
  {
	  str+=" KUJUDU\n";
  }
  if(getRAAHUVU().equalsIgnoreCase(MAKARAM))
  {
	  str+=" RAAHUVU\n";
  }
  if(getGURUDU().equalsIgnoreCase(MAKARAM))
  {
	  str+=" GURUDU\n";
  }
  if(getSANI().equalsIgnoreCase(MAKARAM))
  {
	  str+=" SANI\n";
  }
  if(getBHUDHUDU().equalsIgnoreCase(MAKARAM))
  {
	  str+=" BHUDHUDU\n";
  }
  if(getKETUVU().equalsIgnoreCase(MAKARAM))
  {
	  str+=" KETUVU\n";
  }
  if(getSUKRUDU().equalsIgnoreCase(MAKARAM))
  {
	  str+=" SUKRUDU\n";
  }
  return str;
}

public String prepareChartKumbham()
{
  String str="";
  if(getRAVI().equalsIgnoreCase(KUMBHAM))
  {
	  str+=" RAVI\n";
  }
  if(getCHANDRUDU().equalsIgnoreCase(KUMBHAM))
  {
	  str+=" CHANDRUDU\n";
  }
  if(getKUJUDU().equalsIgnoreCase(KUMBHAM))
  {
	  str+=" KUJUDU\n";
  }
  if(getRAAHUVU().equalsIgnoreCase(KUMBHAM))
  {
	  str+=" RAAHUVU\n";
  }
  if(getGURUDU().equalsIgnoreCase(KUMBHAM))
  {
	  str+=" GURUDU\n";
  }
  if(getSANI().equalsIgnoreCase(KUMBHAM))
  {
	  str+=" SANI\n";
  }
  if(getBHUDHUDU().equalsIgnoreCase(KUMBHAM))
  {
	  str+=" BHUDHUDU\n";
  }
  if(getKETUVU().equalsIgnoreCase(KUMBHAM))
  {
	  str+=" KETUVU\n";
  }
  if(getSUKRUDU().equalsIgnoreCase(KUMBHAM))
  {
	  str+=" SUKRUDU\n";
  }
  return str;
}

public String prepareChartMeenam()
{
  String str=" ";
  if(getRAVI().equalsIgnoreCase(MEENAM))
  {
	  str+=" RAVI\n";
  }
  if(getCHANDRUDU().equalsIgnoreCase(MEENAM))
  {
	  str+=" CHANDRUDU\n";
  }
  if(getKUJUDU().equalsIgnoreCase(MEENAM))
  {
	  str+=" KUJUDU\n";
  }
  if(getRAAHUVU().equalsIgnoreCase(MEENAM))
  {
	  str+=" RAAHUVU\n";
  }
  if(getGURUDU().equalsIgnoreCase(MEENAM))
  {
	  str+=" GURUDU\n";
  }
  if(getSANI().equalsIgnoreCase(MEENAM))
  {
	  str+=" SANI\n";
  }
  if(getBHUDHUDU().equalsIgnoreCase(MEENAM))
  {
	  str+=" BHUDHUDU\n";
  }
  if(getKETUVU().equalsIgnoreCase(MEENAM))
  {
	  str+=" KETUVU\n";
  }
  if(getSUKRUDU().equalsIgnoreCase(MEENAM))
  {
	  str+=" SUKRUDU\n";
  }
  return str;
}



public int getNakNo(String name)
{
	Collection c=lhs_nak.values();
	Iterator i=c.iterator();
	int count=1;
	while(i.hasNext())
	{
		String str=(String)i.next();
		System.out.println(str+":"+count);
	  if(name.trim().equalsIgnoreCase(str))	
		  return count;
	  count++;
	}
	return -1;
}
public String getRasiName(int no)
{
	return (String) lhs_raasi.get(new Integer(no));
}
public String getNakName(int no)
{
	return (String) lhs_nak.get(new Integer(no));
}
public void calculateLagna(double time)
	{
      double 	total=0;
	  int i=0;
       while(total<=time)
		{
		   if(i==11)
			   i=0;

           total=total+lagna[i];
		   System.out.println(total+"        "+lagna[i]);
		   i++;
		}
	}

  public int get7thHouse(int no)
  {
	 switch(no)
	 {
	 case 1:
		     return 7;
	 case 2: 
		     return 8;
	 case 3:
		     return 9;
	 case 4:
		     return 10;
	 case 5:
		     return 11;
	 case 6:
		     return 12;
	 case 7:
		     return 1;
	 case 8:
		     return 2;
	 case 9:
		     return 3;
	 case 10:
		     return 4;
	 case 11:
		     return 5;
	 case 12:
		     return 6;
   		     
	 }
	  return -1;
  }
	public void getInnerDasa(String dasa)
	{
           int value=0;
		for(int i=0;i<grah.length;i++)
		{
             if(dasa.trim().equals(grah[i].trim()))
			{
              value=i;
			}
		}
		for(int j=value;j<time.length;j++)
		{
                int mul=time[value]*time[j];
				int mul1= mul/10;
				int mul4= mul1/12;//YEARS
				int mul5=mul1%12;//MONTHS
				int mul2=mul%10;
				int mul3=mul2*3; //DAYS
				ps.println("                                            "+r.toString());
				ps.println(grah[value]+"-"+grah[j]+"SAM-MAS-DIN-GANTA-NIMISHA-SEC  "+mul4+"-"+mul5+"-"+mul3+"-0-0-0");

				getInnerInnerDasa(grah[value],grah[j]);
		}
        for(int k=0;k<value;k++)
		{
                 int mul=time[value]*time[k];
				int mul1= mul/10;
				int mul4= mul1/12;//YEARS
				int mul5=mul1%12;//MONTHS
				int mul2=mul%10;
				int mul3=mul2*3; //DAYS
				ps.println("                                            "+r.toString());
				ps.println(grah[value]+"-"+grah[k]+"SAM-MAS-DIN-GANTA-NIMISHA-SEC  "+mul4+"-"+mul5+"-"+mul3);
				getInnerInnerDasa(grah[value],grah[k]);
		}
	}

	public void getInnerInnerDasa(String dasa1,String dasa2)
	{
		int value=0;
		for(int i=0;i<grah.length;i++)
		{
          if(dasa2.trim().equals(grah[i].trim()))
			{
			  value=i;
			  break;
			}
		}
		int temp1=getDasaTime(dasa1);
		int temp2=getDasaTime(dasa2);
		int mul = temp1*temp2; 

		int mul1=mul/10;
		int mul2=mul%10;

		int mul3=mul1*30;//MONTH DAYS
		int mul4=mul2*3;
		int mul5=mul3+mul4;//TOTAL DAYS

		for(int j=value;j<time.length;j++)
		{
			int m1=mul5*time[j];

			int days= m1/120;
			int days1=m1%120;
            int days2=days1*24;

			int gantas=days2/120;
			int gantas1=days2%120;
			int gantas2=gantas1*60;

			int mins= gantas2/120;
			ps.println("                                            "+r.toString());
			ps.println(dasa1+"-"+dasa2+"-"+grah[j]+"   -                           "+days+"-"+gantas+"-"+mins+"-0");
			RamYear r1=new RamYear();
			r1.setDay(days);
			r1.setGanta(gantas);
			r1.setNimisha(mins);
             r=temp.add(r,r1);
            ps.println("                                            "+r.toString());
			ps.println(r.getYear()+"-"+r.getMonth()+"-"+r.getDay()+"-"+r.getGanta()+"-"+r.getNimisha()+"-"+r.getSecs());
		}
		for(int k=0;k<value;k++)
		{
			int m1=mul5*time[k];

			int days= m1/120;
			int days1=m1%120;
            int days2=days1*24;

			int gantas=days2/120;
			int gantas1=days2%120;
			int gantas2=gantas1*60;

			int mins= gantas2/120;

			ps.println(dasa1+"-"+dasa2+"-"+grah[k]+"   -                           "+days+"-"+gantas+"-"+mins+"-0");
			RamYear r1=new RamYear();
			r1.setDay(days);
			r1.setGanta(gantas);
			r1.setNimisha(mins);
			ps.println("                                            "+r.toString());
			ps.println((r.getYear()+"-"+r.getMonth()+"-"+r.getDay()+"-"+r.getGanta()+"-"+r.getNimisha()+"-"+r.getSecs()));
             r=temp.add(r,r1);
            ps.println("                                            "+r.toString()); 
			ps.println(r.getYear()+"-"+r.getMonth()+"-"+r.getDay()+"-"+r.getGanta()+"-"+r.getNimisha()+"-"+r.getSecs());
		}
	}

	public int getDasaTime(String dasa)
	{
      for(int i=0;i<grah.length;i++)
		{
          if(dasa.trim().equals(grah[i].trim()))
			{

			  return time[i];
			}
		}
		return -1;
	}
	
	public RamYear calculateDasaBhukthiAtTheTimeOfBirth(int vg1,int vg2,String dasa)
	{
	   	int time=getDasaTime(dasa.trim());
	   	
	   	int mul=vg2*time;
	   	
	   	int year = mul/vg1; //YEAR
	   	int year1= mul%vg1;
	   	int year2=year1*12;
	   	int month=year2/vg1; //MONTH
	   	int month1=year2%vg1;
	   	int month2=month1*30;
	   	int day=month2/vg1;
	   	ta.append("\nJANAKALA MAHA DASA :"+time+"-"+0+"-"+0);
	   	ps.println("\nJANAKALA MAHA DASA :"+time+"-"+0+"-"+0);
	   	RamYear rzy1=new RamYear();
	   	rzy1.setYear(time);
	   	rzy1.setMonth(0);
	   	rzy1.setDay(0);
	   	ta.append("\nBHUKTHI            :"+year+"-"+month+"-"+day);
	   	ps.println("\nBHUKTHI            :"+year+"-"+month+"-"+day);
	   	RamYear rzy2=new RamYear();
	   	rzy2.setYear(year);
	   	rzy2.setMonth(month);
	   	rzy2.setDay(day);
	   	ta.append("\n");
	   	ta.append("                     ------------------------\n");
	   	ps.println("                     ------------------------\n");
	   	RamYear rzy3=new RamYear();
	   	RamYear rzy4=rzy3.sub(rzy1,rzy2);
	   	ta.append("\nSESHAM             :"+rzy4.getYear()+"-"+rzy4.getMonth()+"-"+rzy4.getDay()+"\n");
	   	ps.println("\nSESHAM             :"+rzy4.getYear()+"-"+rzy4.getMonth()+"-"+rzy4.getDay()+"\n");
	   	ta.append("                     ------------------------\n");
	   	ps.println("                     ------------------------\n");
		return rzy4; 
	}
	
	public int getHousePosition(String lagna_raasi,String target_raasi)
	{
	   int no=getRaasiNo(lagna_raasi.trim());	//6=1
	   int tar_no=getRaasiNo(target_raasi.trim());
	   if(tar_no>=no && tar_no<=12)
		   return (tar_no-no)+1;
	   else
	    return (12-no)+1+tar_no;
	  	
		
	}
	
	public String getHouseName(String lagna_raasi,int n)
	{
		if(getHousePosition(lagna_raasi,MESHAM)==n)
			return MESHAM;
		else if(getHousePosition(lagna_raasi,VRISHABHAM)==n)
			return VRISHABHAM;
		else if(getHousePosition(lagna_raasi,MIDHUNAM)==n)
			return MIDHUNAM;
		else if(getHousePosition(lagna_raasi,KARKATAKAM)==n)
			return KARKATAKAM;
		else if(getHousePosition(lagna_raasi,SIMHAM)==n)
			return SIMHAM;
		else if(getHousePosition(lagna_raasi,KANYA)==n)
			return KANYA;
		else if(getHousePosition(lagna_raasi,THULA)==n)
			return THULA;
		else if(getHousePosition(lagna_raasi,VRISCHIKAM)==n)
			return VRISCHIKAM;
		else if(getHousePosition(lagna_raasi,DHANASSU)==n)
			return DHANASSU;
		else if(getHousePosition(lagna_raasi,MAKARAM)==n)
			return MAKARAM;
		else if(getHousePosition(lagna_raasi,KUMBHAM)==n)
			return KUMBHAM;
		else if(getHousePosition(lagna_raasi,MEENAM)==n)
			return MEENAM;
		else 
			return "NIL";
		
	}
	
	
	
	public String getAdhipathi(String raasi)
	{
		if(raasi.trim().equalsIgnoreCase(MESHAM) || raasi.trim().equalsIgnoreCase(VRISCHIKAM))
		  return KUJA;
		else if(raasi.trim().equalsIgnoreCase(VRISHABHAM) || raasi.trim().equalsIgnoreCase(THULA))
		  return BRUGHU;
		else  if(raasi.trim().equalsIgnoreCase(MIDHUNAM) || raasi.trim().equalsIgnoreCase(KANYA))
		  return GNA;
		else if(raasi.trim().equalsIgnoreCase(KARKATAKAM))
		  return SASI;
		else if(raasi.trim().equalsIgnoreCase(SIMHAM) )
		  return INAH;
		else  if(raasi.trim().equalsIgnoreCase(DHANASSU) || raasi.trim().equalsIgnoreCase(MEENAM))
		  return JEEVA;
		else if(raasi.trim().equalsIgnoreCase(MAKARAM) || raasi.trim().equalsIgnoreCase(KUMBHAM))
			return MANDA;
		  else
		  return "NIL";
	}
	
	public void setHousesBasedOnLagnaAfterCalculation(int no,String raasi)
	{
		switch(no)
		{
		case 1 :
			     setFristPlaceBasedOnLagna(raasi.trim());
			     break;
		case 2 :
		         setSecondPlaceBasedOnLagna(raasi.trim());
		         break;
		case 3 :
		         setThirdPlaceBasedOnLagna(raasi.trim());
		         break;
		case 4 :
		         setFourthPlaceBasedOnLagna(raasi.trim());
		         break;
		case 5 :
		         setFifthPlaceBasedOnLagna(raasi.trim());
		         break;
		case 6 :
		         setSixthPlaceBasedOnLagna(raasi.trim());
		         break;
		case 7 :
		         setSeventhPlaceBasedOnLagna(raasi.trim());
		         break;
		case 8 :
		         setEighthPlaceBasedOnLagna(raasi.trim());
		         break;
		case 9 :
		         setNinethPlaceBasedOnLagna(raasi.trim());
		         break;
		case 10 :
		         setTenthPlaceBasedOnLagna(raasi.trim());
		         break;
		case 11 :
		         setEleventhPlaceBasedOnLagna(raasi.trim());
		         break;
		case 12 :
		         setTwelevethPlaceBasedOnLagna(raasi.trim());
		         break;
		}
	}
	
	public void setHousesBasedOnLagnaAfterCalculationAtAmsa(int no,String raasi)
	{
		switch(no)
		{
		case 1 :
			     setFristPlaceBasedOnLagnaAtAmsa(raasi.trim());
			     break;
		case 2 :
		         setSecondPlaceBasedOnLagnaAtAmsa(raasi.trim());
		         break;
		case 3 :
		         setThirdPlaceBasedOnLagnaAtAmsa(raasi.trim());
		         break;
		case 4 :
		         setFourthPlaceBasedOnLagnaAtAmsa(raasi.trim());
		         break;
		case 5 :
		         setFifthPlaceBasedOnLagnaAtAmsa(raasi.trim());
		         break;
		case 6 :
		         setSixthPlaceBasedOnLagnaAtAmsa(raasi.trim());
		         break;
		case 7 :
		         setSeventhPlaceBasedOnLagnaAtAmsa(raasi.trim());
		         break;
		case 8 :
		         setEighthPlaceBasedOnLagnaAtAmsa(raasi.trim());
		         break;
		case 9 :
		         setNinethPlaceBasedOnLagnaAtAmsa(raasi.trim());
		         break;
		case 10 :
		         setTenthPlaceBasedOnLagnaAtAmsa(raasi.trim());
		         break;
		case 11 :
		         setEleventhPlaceBasedOnLagnaAtAmsa(raasi.trim());
		         break;
		case 12 :
		         setTwelevethPlaceBasedOnLagnaAtAmsa(raasi.trim());
		         break;
		}
	}
	
	public String getRAASI_LAGNA()
	{
		return RAASI_LAGNA;
	}
	public void setRAASI_LAGNA(String raasi_lagna)
	{
		RAASI_LAGNA=raasi_lagna;
	}
	
	public String getAMSA_LAGNA()
	{
		return AMSA_LAGNA;
	}
	public void setAMSA_LAGNA(String amsa_lagna)
	{
		AMSA_LAGNA=amsa_lagna;
	}
	
	public boolean isGajaKesariYoga()
	{
		String str1=getCHANDRUDU();
		String str2=getGURUDU();
		ta.append(str1+"-----GAJA KESARI YOGA----"+str2);
		if(getRaasiName(get7thHouse(getRaasiNo(str1.trim()))).equalsIgnoreCase(str2.trim()))
			return true;
		else
			return false;
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		String str1=ch1.getSelectedItem();
		String str2=ch2.getSelectedItem();
		String str3=ch3.getSelectedItem();
		int pp=ch2.getSelectedIndex();tf6.setText(pp+" ");
		
		
		ps.println("\n");ps.println(str1+":"+str2+":"+str3+"\n");
		int p=getNakNo(str1.trim());
		
		ps.println("\n");ps.println("\n"+getRaasi(Integer.parseInt(p+str3.trim())));
		ta.append("\n  RAASI-------->"+str1+":"+str2+":"+str3+"---------->"+getRaasi(Integer.parseInt(p+str3.trim())));
		ps.println("\n RAASI-------->"+str1+":"+str2+":"+str3+"---------->"+getRaasi(Integer.parseInt(p+str3.trim())));
		
		
		ta.append("\n  AMSA-------->"+str1+":"+str2+":"+str3+"---------->"+getAmsaCalculationForGivenGrah(p,Integer.parseInt(str3.trim())));
		ps.println("\n AMSA-------->"+str1+":"+str2+":"+str3+"---------->"+getAmsaCalculationForGivenGrah(p,Integer.parseInt(str3.trim())));
		
		/*ps.println("\n");ps.println("\n"+MESHAM+"-->"+getHousePosition(getRAASI_LAGNA(),MESHAM));
		ps.println("\n");ps.println("\n"+VRISHABHAM+"-->"+getHousePosition(getRAASI_LAGNA(),VRISHABHAM));
		ps.println("\n");ps.println("\n"+MIDHUNAM+"-->"+getHousePosition(getRAASI_LAGNA(),MIDHUNAM));
		ps.println("\n");ps.println("\n"+KARKATAKAM+"-->"+getHousePosition(getRAASI_LAGNA(),KARKATAKAM));
		ps.println("\n");ps.println("\n"+SIMHAM+"-->"+getHousePosition(getRAASI_LAGNA(),SIMHAM));
		ps.println("\n");ps.println("\n"+KANYA+"-->"+getHousePosition(getRAASI_LAGNA(),KANYA));
		ps.println("\n");ps.println("\n"+THULA+"-->"+getHousePosition(getRAASI_LAGNA(),THULA));
		ps.println("\n");ps.println("\n"+VRISCHIKAM+"-->"+getHousePosition(getRAASI_LAGNA(),VRISCHIKAM));
		ps.println("\n");ps.println("\n"+DHANASSU+"-->"+getHousePosition(getRAASI_LAGNA(),DHANASSU));
		ps.println("\n");ps.println("\n"+MAKARAM+"-->"+getHousePosition(getRAASI_LAGNA(),MAKARAM));
		ps.println("\n");ps.println("\n"+KUMBHAM+"-->"+getHousePosition(getRAASI_LAGNA(),KUMBHAM));
		ps.println("\n");ps.println("\n"+MEENAM+"-->"+getHousePosition(getRAASI_LAGNA(),MEENAM));*/
		
		setHousesBasedOnLagnaAfterCalculation(getHousePosition(getRAASI_LAGNA(),MESHAM),MESHAM);
		setHousesBasedOnLagnaAfterCalculation(getHousePosition(getRAASI_LAGNA(),VRISHABHAM),VRISHABHAM);
		setHousesBasedOnLagnaAfterCalculation(getHousePosition(getRAASI_LAGNA(),MIDHUNAM),MIDHUNAM);
		setHousesBasedOnLagnaAfterCalculation(getHousePosition(getRAASI_LAGNA(),KARKATAKAM),KARKATAKAM);
		setHousesBasedOnLagnaAfterCalculation(getHousePosition(getRAASI_LAGNA(),SIMHAM),SIMHAM);
		setHousesBasedOnLagnaAfterCalculation(getHousePosition(getRAASI_LAGNA(),KANYA),KANYA);
		setHousesBasedOnLagnaAfterCalculation(getHousePosition(getRAASI_LAGNA(),THULA),THULA);
		setHousesBasedOnLagnaAfterCalculation(getHousePosition(getRAASI_LAGNA(),VRISCHIKAM),VRISCHIKAM);
		setHousesBasedOnLagnaAfterCalculation(getHousePosition(getRAASI_LAGNA(),DHANASSU),DHANASSU);
		setHousesBasedOnLagnaAfterCalculation(getHousePosition(getRAASI_LAGNA(),MAKARAM),MAKARAM);
		setHousesBasedOnLagnaAfterCalculation(getHousePosition(getRAASI_LAGNA(),KUMBHAM),KUMBHAM);
		setHousesBasedOnLagnaAfterCalculation(getHousePosition(getRAASI_LAGNA(),MEENAM),MEENAM);
		
		
		setHousesBasedOnLagnaAfterCalculationAtAmsa(getHousePosition(getAMSA_LAGNA(),MESHAM),MESHAM);
		setHousesBasedOnLagnaAfterCalculationAtAmsa(getHousePosition(getAMSA_LAGNA(),VRISHABHAM),VRISHABHAM);
		setHousesBasedOnLagnaAfterCalculationAtAmsa(getHousePosition(getAMSA_LAGNA(),MIDHUNAM),MIDHUNAM);
		setHousesBasedOnLagnaAfterCalculationAtAmsa(getHousePosition(getAMSA_LAGNA(),KARKATAKAM),KARKATAKAM);
		setHousesBasedOnLagnaAfterCalculationAtAmsa(getHousePosition(getAMSA_LAGNA(),SIMHAM),SIMHAM);
		setHousesBasedOnLagnaAfterCalculationAtAmsa(getHousePosition(getAMSA_LAGNA(),KANYA),KANYA);
		setHousesBasedOnLagnaAfterCalculationAtAmsa(getHousePosition(getAMSA_LAGNA(),THULA),THULA);
		setHousesBasedOnLagnaAfterCalculationAtAmsa(getHousePosition(getAMSA_LAGNA(),VRISCHIKAM),VRISCHIKAM);
		setHousesBasedOnLagnaAfterCalculationAtAmsa(getHousePosition(getAMSA_LAGNA(),DHANASSU),DHANASSU);
		setHousesBasedOnLagnaAfterCalculationAtAmsa(getHousePosition(getAMSA_LAGNA(),MAKARAM),MAKARAM);
		setHousesBasedOnLagnaAfterCalculationAtAmsa(getHousePosition(getAMSA_LAGNA(),KUMBHAM),KUMBHAM);
		setHousesBasedOnLagnaAfterCalculationAtAmsa(getHousePosition(getAMSA_LAGNA(),MEENAM),MEENAM);
		
		
		
		
		
		ps.println("\n");ps.println("\n********************    ADHIPATHI*************");
		ps.println("\n");ps.println("\n"+MESHAM+"-->"+getAdhipathi(MESHAM));
		ps.println("\n");ps.println("\n"+VRISHABHAM+"-->"+getAdhipathi(VRISHABHAM));
		ps.println("\n");ps.println("\n"+MIDHUNAM+"-->"+getAdhipathi(MIDHUNAM));
		ps.println("\n");ps.println("\n"+KARKATAKAM+"-->"+getAdhipathi(KARKATAKAM));
		ps.println("\n");ps.println("\n"+SIMHAM+"-->"+getAdhipathi(SIMHAM));
		ps.println("\n");ps.println("\n"+KANYA+"-->"+getAdhipathi(KANYA));
		ps.println("\n");ps.println("\n"+THULA+"-->"+getAdhipathi(THULA));
		ps.println("\n");ps.println("\n"+VRISCHIKAM+"-->"+getAdhipathi(VRISCHIKAM));
		ps.println("\n");ps.println("\n"+DHANASSU+"-->"+getAdhipathi(DHANASSU));
		ps.println("\n");ps.println("\n"+MAKARAM+"-->"+getAdhipathi(MAKARAM));
		ps.println("\n");ps.println("\n"+KUMBHAM+"-->"+getAdhipathi(KUMBHAM));
		ps.println("\n");ps.println("\n"+MEENAM+"-->"+getAdhipathi(MEENAM));
		/*
		ps.println("\n");ps.println("\n******************** HOUSE BASE ADHIPATHI*************");
		ps.println("\n");ps.println("\n"+1+"-->"+getAdhipathi(getHouseName(getRAASI_LAGNA(),1)));
		ps.println("\n");ps.println("\n"+2+"-->"+getAdhipathi(getHouseName(getRAASI_LAGNA(),2)));
		ps.println("\n");ps.println("\n"+3+"-->"+getAdhipathi(getHouseName(getRAASI_LAGNA(),3)));
		ps.println("\n");ps.println("\n"+4+"-->"+getAdhipathi(getHouseName(getRAASI_LAGNA(),4)));
		ps.println("\n");ps.println("\n"+5+"-->"+getAdhipathi(getHouseName(getRAASI_LAGNA(),5)));
		ps.println("\n");ps.println("\n"+6+"-->"+getAdhipathi(getHouseName(getRAASI_LAGNA(),6)));
		ps.println("\n");ps.println("\n"+7+"-->"+getAdhipathi(getHouseName(getRAASI_LAGNA(),7)));
		ps.println("\n");ps.println("\n"+8+"-->"+getAdhipathi(getHouseName(getRAASI_LAGNA(),8)));
		ps.println("\n");ps.println("\n"+9+"-->"+getAdhipathi(getHouseName(getRAASI_LAGNA(),9)));
		ps.println("\n");ps.println("\n"+10+"-->"+getAdhipathi(getHouseName(getRAASI_LAGNA(),10)));
		ps.println("\n");ps.println("\n"+11+"-->"+getAdhipathi(getHouseName(getRAASI_LAGNA(),11)));
		ps.println("\n");ps.println("\n"+12+"-->"+getAdhipathi(getHouseName(getRAASI_LAGNA(),12)));
		ps.println("\n");ps.println("\n******************** HOUSE NAME*************");
		ps.println("\n");ps.println("\n"+1+"-->"+(getHouseName(getRAASI_LAGNA(),1)));
		ps.println("\n");ps.println("\n"+2+"-->"+(getHouseName(getRAASI_LAGNA(),2)));
		ps.println("\n");ps.println("\n"+3+"-->"+(getHouseName(getRAASI_LAGNA(),3)));
		ps.println("\n");ps.println("\n"+4+"-->"+(getHouseName(getRAASI_LAGNA(),4)));
		ps.println("\n");ps.println("\n"+5+"-->"+(getHouseName(getRAASI_LAGNA(),5)));
		ps.println("\n");ps.println("\n"+6+"-->"+(getHouseName(getRAASI_LAGNA(),6)));
		ps.println("\n");ps.println("\n"+7+"-->"+(getHouseName(getRAASI_LAGNA(),7)));
		ps.println("\n");ps.println("\n"+8+"-->"+(getHouseName(getRAASI_LAGNA(),8)));
		ps.println("\n");ps.println("\n"+9+"-->"+(getHouseName(getRAASI_LAGNA(),9)));
		ps.println("\n");ps.println("\n"+10+"-->"+(getHouseName(getRAASI_LAGNA(),10)));
		ps.println("\n");ps.println("\n"+11+"-->"+(getHouseName(getRAASI_LAGNA(),11)));
		ps.println("\n");ps.println("\n"+12+"-->"+(getHouseName(getRAASI_LAGNA(),12)));*/
		
		
		if(str2.trim().equalsIgnoreCase(INAH))
		{
			setRAVI(getRaasi(Integer.parseInt(p+str3.trim())));
			setRAVI_IN_AMSA(getAmsaCalculationForGivenGrah(p,Integer.parseInt(str3.trim())));
			ps.println("\n");ps.println("\n"+INAH+"---->"+getHousePosition(getRAASI_LAGNA(),getRaasi(Integer.parseInt(p+str3.trim()))));
		}
		if(str2.trim().equalsIgnoreCase(SASI))
		{
			setCHANDRUDU(getRaasi(Integer.parseInt(p+str3.trim())));
			setCHANDRUDU_IN_AMSA(getAmsaCalculationForGivenGrah(p,Integer.parseInt(str3.trim())));
			ps.println("\n");ps.println("\n"+SASI+"---->"+getHousePosition(getRAASI_LAGNA(),getRaasi(Integer.parseInt(p+str3.trim()))));
			ps.println("\n");ps.println("RUNNING DASA:----------------->"+getDasaAttheTimeOfBirth(getNakName(p)));
			RamYear realRY=calculateDasaBhukthiAtTheTimeOfBirth(5400,3400,getDasaAttheTimeOfBirth(getNakName(p)));
			RamYear temp_ry=new RamYear();
			tf1.setText(""+1981);
			tf2.setText(""+7);
			tf3.setText(""+28);
			
			r.setYear(Integer.parseInt(tf1.getText().trim()));
			r.setMonth(Integer.parseInt(tf2.getText().trim()));
			r.setDay(Integer.parseInt(tf3.getText().trim()));
			ta.append("\n"+r.toString());
			r=temp_ry.add(realRY,r);
			ta.append(" THIS IS COMPLETED DASA\n"+r.toString());
			String DASA_NEXT_TO_BE_CALC=getDasaAttheTimeOfBirth(getNakName(p));
			int temp_val_next=0;
			for(int m=0;m<grah.length;m++)
			{
				//ta.append("\n----------------------->"+DASA_NEXT_TO_BE_CALC+":"+grah[m]+":"+m);
				if(DASA_NEXT_TO_BE_CALC.trim().equalsIgnoreCase(grah[m].trim()))
				{
					temp_val_next=m;
					break;
				}
			}
			ta.append("\n NEXT DASA ----------->"+grah[temp_val_next+1]);
			getInnerDasa(grah[temp_val_next+1]);
			RamMain rm=new RamMain(realRY.getYear(),realRY.getMonth(),realRY.getDay(),0,0,grah[temp_val_next+1],Integer.parseInt(tf1.getText().trim()),Integer.parseInt(tf2.getText().trim()),Integer.parseInt(tf3.getText().trim()));
		}
		if(str2.trim().equalsIgnoreCase(KUJA))
		{
			setKUJUDU(getRaasi(Integer.parseInt(p+str3.trim())));
			setKUJUDU_IN_AMSA(getAmsaCalculationForGivenGrah(p,Integer.parseInt(str3.trim())));
			ps.println("\n");ps.println("\n"+KUJA+"---->"+getHousePosition(getRAASI_LAGNA(),getRaasi(Integer.parseInt(p+str3.trim()))));
		}
		if(str2.trim().equalsIgnoreCase(RAAHU))
		{
			setRAAHUVU(getRaasi(Integer.parseInt(p+str3.trim())));
			setRAAHUVU_IN_AMSA(getAmsaCalculationForGivenGrah(p,Integer.parseInt(str3.trim())));
			ps.println("\n");ps.println("\n"+RAAHU+"---->"+getHousePosition(getRAASI_LAGNA(),getRaasi(Integer.parseInt(p+str3.trim()))));
		}
		if(str2.trim().equalsIgnoreCase(JEEVA))
		{
			setGURUDU(getRaasi(Integer.parseInt(p+str3.trim())));
			setGURUDU_IN_AMSA(getAmsaCalculationForGivenGrah(p,Integer.parseInt(str3.trim())));
			ps.println("\n");ps.println("\n"+JEEVA+"---->"+getHousePosition(getRAASI_LAGNA(),getRaasi(Integer.parseInt(p+str3.trim()))));
		}
		if(str2.trim().equalsIgnoreCase(MANDA))
		{
			setSANI(getRaasi(Integer.parseInt(p+str3.trim())));
			setSANI_IN_AMSA(getAmsaCalculationForGivenGrah(p,Integer.parseInt(str3.trim())));
			ps.println("\n");ps.println("\n"+MANDA+"---->"+getHousePosition(getRAASI_LAGNA(),getRaasi(Integer.parseInt(p+str3.trim()))));
		}
		if(str2.trim().equalsIgnoreCase(GNA))
		{
			setBHUDHUDU(getRaasi(Integer.parseInt(p+str3.trim())));
			setBHUDHUDU_IN_AMSA(getAmsaCalculationForGivenGrah(p,Integer.parseInt(str3.trim())));
			ps.println("\n");ps.println("\n"+GNA+"---->"+getHousePosition(getRAASI_LAGNA(),getRaasi(Integer.parseInt(p+str3.trim()))));
		}
		if(str2.trim().equalsIgnoreCase(KETU))
		{
			setKETUVU(getRaasi(Integer.parseInt(p+str3.trim())));
			setKETUVU_IN_AMSA(getAmsaCalculationForGivenGrah(p,Integer.parseInt(str3.trim())));
			ps.println("\n");ps.println("\n"+KETU+"---->"+getHousePosition(getRAASI_LAGNA(),getRaasi(Integer.parseInt(p+str3.trim()))));
		}
		if(str2.trim().equalsIgnoreCase(BRUGHU))
		{
			setSUKRUDU(getRaasi(Integer.parseInt(p+str3.trim())));
			setSUKRUDU_IN_AMSA(getAmsaCalculationForGivenGrah(p,Integer.parseInt(str3.trim())));
			ps.println("\n");ps.println("\n"+BRUGHU+"---->"+getHousePosition(getRAASI_LAGNA(),getRaasi(Integer.parseInt(p+str3.trim()))));
		}
		  ch2.remove(pp);
	    String str="INAH:-->"+getRAVI()+" \nSASI:-->"+getCHANDRUDU()+" \nKUJA:-->"+getKUJUDU()+" \nRAAHU:-->"+getRAAHUVU()+" \nJEEVA:-->"+getGURUDU()+" \nMANDA:-->"+getSANI()+" \nGNA:-->"+getBHUDHUDU()+" \nKETU:-->"+getKETUVU()+" \nBRUGHU:-->"+getSUKRUDU();
	    ps.println("\n");ps.println(str);
	    if(ch2.countItems()<=0)
	    {
	    	ch1.disable();
	    	ch2.disable();
	    	ch3.disable();
	    	ps.println("**********************PLANETS PLACES BELOW********************************");
	    	ps.println(MESHAM+ "GRAHA---->"+prepareChartMesham());
	    	ps.println(VRISHABHAM+ "GRAHA---->"+prepareChartVrishabham());
	    	ps.println(MIDHUNAM+ "GRAHA---->"+prepareChartMidhunam());
	    	ps.println(KARKATAKAM+ "GRAHA---->"+prepareChartKarkatakam());
	    	ps.println(SIMHAM+ "GRAHA---->"+prepareChartSimham());
	    	ps.println(KANYA+ "GRAHA---->"+prepareChartKanya());
	    	ps.println(THULA+ "GRAHA---->"+prepareChartThula());
	    	ps.println(VRISCHIKAM+ "GRAHA---->"+prepareChartVrischikam());
	    	ps.println(DHANASSU+ "GRAHA---->"+prepareChartDhanassu());
	    	ps.println(MAKARAM+ "GRAHA---->"+prepareChartMakaram());
	    	ps.println(KUMBHAM+ "GRAHA---->"+prepareChartKumbham());
	    	ps.println(MEENAM+ "GRAHA---->"+prepareChartMeenam());
	    	ps.println("****************************************************************************");
	    	 
	      class RamFrame extends Frame implements ActionListener
	    	{
	    	/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				private String LAGNA="";
			TextField mesham,vrishabham,midhunam,karkatakam,simham,kanya,thula,vrischikam,dhanassu,makaram,kumbham,meenam;
	    	TextField mesham_amsa,vrishabham_amsa,midhunam_amsa,karkatakam_amsa,simham_amsa,kanya_amsa,thula_amsa,vrischikam_amsa,dhanassu_amsa,makaram_amsa,kumbham_amsa,meenam_amsa;
	    	JButton jb=null;
	    		public RamFrame(String var1,String var2,String var3,String var4,String var5,String var6,String var7,String var8,String var9,String var10,String var11,String var12)
	    		{
	    			this.setVisible(true);
	    	    	this.setSize(800,800);	
	    	    	jb=new JButton("SHOW");add(jb);jb.addActionListener(this);jb.setBounds(0,0,50,50);
	    	    	mesham=new TextField(50);
	    			add(mesham);
	    			int x= 100, y=90;
	    			mesham.setBounds(x,y,50,50);
	    			mesham.setText(var1);
	    			vrishabham=new TextField(50);
	    			add(vrishabham);
	    			vrishabham.setBounds(x+70,y,50,50);
	    			vrishabham.setText(var2);
	    			midhunam=new TextField(50);
	    			add(midhunam);
	    			midhunam.setBounds(x+140,y,50,50);
	    			midhunam.setText(var3);
	    			karkatakam=new TextField(50);
	    			add(karkatakam);
	    			karkatakam.setBounds(x+140,y+70,50,50);
	    			karkatakam.setText(var4);
	    			simham=new TextField(50);
	    			add(simham);
	    			simham.setBounds(x+140,y+140,50,50);
	    			simham.setText(var5);
	    			kanya=new TextField(50);
	    			add(kanya);
	    			kanya.setBounds(x+140,y+210,50,50);
	    			kanya.setText(var6);
	    			thula=new TextField(50);
	    			add(thula);
	    			thula.setBounds(x+70,y+210,50,50);
	    			thula.setText(var7);
	    			vrischikam=new TextField(50);
	    			add(vrischikam);
	    			vrischikam.setBounds(x,y+210,50,50);
	    			vrischikam.setText(var8);
	    			dhanassu=new TextField(50);
	    			add(dhanassu);
	    			dhanassu.setBounds(x-70,y+210,50,50);
	    			dhanassu.setText(var9);
	    			makaram=new TextField(50);
	    			add(makaram);
	    			makaram.setBounds(x-70,y+140,50,50);
	    			makaram.setText(var10);
	    			kumbham=new TextField(50);
	    			add(kumbham);
	    			kumbham.setBounds(x-70,y+70,50,50);
	    			kumbham.setText(var11);
	    			meenam=new TextField(50);
	    			add(meenam);
	    			meenam.setBounds(x-70,y,50,50);
	    			meenam.setText(var12);
	    			
	    			/* AMSA */
	    			
	    			
	    			mesham_amsa=new TextField(50);
	    			add(mesham_amsa);
	    			 x= 500; y=90;
	    			mesham_amsa.setBounds(x,y,50,50);
	    			vrishabham_amsa=new TextField(50);
	    			add(vrishabham_amsa);
	    			vrishabham_amsa.setBounds(x+70,y,50,50);
	    			
	    			midhunam_amsa=new TextField(50);
	    			add(midhunam_amsa);
	    			midhunam_amsa.setBounds(x+140,y,50,50);
	    			
	    			karkatakam_amsa=new TextField(50);
	    			add(karkatakam_amsa);
	    			karkatakam_amsa.setBounds(x+140,y+70,50,50);
	    			
	    			simham_amsa=new TextField(50);
	    			add(simham_amsa);
	    			simham_amsa.setBounds(x+140,y+140,50,50);
	    			
	    			kanya_amsa=new TextField(50);
	    			add(kanya_amsa);
	    			kanya_amsa.setBounds(x+140,y+210,50,50);
	    			
	    			thula_amsa=new TextField(50);
	    			add(thula_amsa);
	    			thula_amsa.setBounds(x+70,y+210,50,50);
	    			
	    			vrischikam_amsa=new TextField(50);
	    			add(vrischikam_amsa);
	    			vrischikam_amsa.setBounds(x,y+210,50,50);
	    			
	    			dhanassu_amsa=new TextField(50);
	    			add(dhanassu_amsa);
	    			dhanassu_amsa.setBounds(x-70,y+210,50,50);
	    			
	    			makaram_amsa=new TextField(50);
	    			add(makaram_amsa);
	    			makaram_amsa.setBounds(x-70,y+140,50,50);
	    			
	    			kumbham_amsa=new TextField(50);
	    			add(kumbham_amsa);
	    			kumbham_amsa.setBounds(x-70,y+70,50,50);
	    			
	    			meenam_amsa=new TextField(50);
	    			add(meenam_amsa);
	    			meenam_amsa.setBounds(x-70,y,50,50);
	    		}

				@Override
				public void paint(Graphics g){
					g.drawString("WELCOME TO SITARAMAYYA JYOTHISHYA PARIJATHAM", 0, 0);
					}
				public void actionPerformed(final ActionEvent ae) {
					// TODO Auto-generated method stub
					String str=ae.getActionCommand();
					if(str.equalsIgnoreCase("SHOW"))
					{
						Graphics g=this.getGraphics();
						String lag=this.getLAGNA();
						if(lag.trim().equalsIgnoreCase(MESHAM))
						{
							g.drawString("LAGNA - 1 ", 500, 40);
							repaint();
						}
						
						if(lag.trim().equalsIgnoreCase(VRISHABHAM))
						{
							
						}
						if(lag.trim().equalsIgnoreCase(MIDHUNAM))
						{
							
						}
						if(lag.trim().equalsIgnoreCase(SIMHAM))
						{
							
						}
						if(lag.trim().equalsIgnoreCase(KANYA))
						{
							
						}
						if(lag.trim().equalsIgnoreCase(THULA))
						{
							
						}
						if(lag.trim().equalsIgnoreCase(VRISCHIKAM))
						{
							
						}
						if(lag.trim().equalsIgnoreCase(DHANASSU))
						{
							
						}
						if(lag.trim().equalsIgnoreCase(MAKARAM))
						{
							
						}
						if(lag.trim().equalsIgnoreCase(KUMBHAM))
						{
							
						}
						if(lag.trim().equalsIgnoreCase(MEENAM))
						{
							
						}
					}
				}
				public void setLAGNA(String lagna)
				{
					this.LAGNA=lagna;
				}
				public String getLAGNA()
				{
					return this.LAGNA;
				}
				
	    	
	    	};
	    	RamFrame rff=new RamFrame(prepareChartMesham(),prepareChartVrishabham(),prepareChartMidhunam(),prepareChartKarkatakam(),prepareChartSimham(),prepareChartKanya(),prepareChartThula(),prepareChartVrischikam(),prepareChartDhanassu(),prepareChartMakaram(),prepareChartKumbham(),prepareChartMeenam());
	    	rff.setLAGNA(getRAASI_LAGNA());
	    	  ps.println("  |----------|---------|---------|----------|       |----------|---------|---------|----------|");
	    	  ps.println("  |          |         |         |          |    	  |          |         |         |          |");    
	    	  ps.println("  |          |         |         |          |    	  |          |         |         |          |");      
	    	  ps.println("  |          |         |         |          |    	  |          |         |         |          |");     
	    	  ps.println("  |          |         |         |          |    	  |          |         |         |          |");      
	    	  ps.println("  |----------|---------|---------|----------|    	  |----------|---------|---------|----------|");      
	    	  ps.println("  |          |                   |          |		  |          |                   |          |");      
	    	  ps.println("  |          |                   |          |		  |          |                   |          |");      
	    	  ps.println("  |          |                   |          |		  |          |                   |          |");      
	    	  ps.println("  |----------|                   |----------|		  |----------|                   |----------|");      
	    	  ps.println("  |          |                   |          |		  |          |                   |          |");      
	    	  ps.println("  |          |                   |          |		  |          |                   |          |");      
	    	  ps.println("  |          |                   |          |		  |          |                   |          |");      
	    	  ps.println("  |----------|---------|---------|----------|    	  |----------|---------|---------|----------|");      
	    	  ps.println("  |          |         |         |          |    	  |          |         |         |          |");      
	    	  ps.println("  |          |         |         |          |    	  |          |         |         |          |");     
	    	  ps.println("  |          |         |         |          |    	  |          |         |         |          |");      
	    	  ps.println("  |          |         |         |          |    	  |          |         |         |          |");    
	    	  ps.println("  |----------|---------|---------|----------|    	  |----------|---------|---------|----------|");      

	    	
	    	//getInnerDasa(SASI);
	    	grah_pos.add(1+":"+getFristPlaceBasedOnLagna()+":"+getMentionedPlaceGrah(1));
			grah_pos.add(2+":"+getSecondPlaceBasedOnLagna()+":"+getMentionedPlaceGrah(2));
			grah_pos.add(3+":"+getThirdPlaceBasedOnLagna()+":"+getMentionedPlaceGrah(3));
			grah_pos.add(4+":"+getFourthPlaceBasedOnLagna()+":"+getMentionedPlaceGrah(4));
			grah_pos.add(5+":"+getFifthPlaceBasedOnLagna()+":"+getMentionedPlaceGrah(5));
			grah_pos.add(6+":"+getSixthPlaceBasedOnLagna()+":"+getMentionedPlaceGrah(6));
			grah_pos.add(7+":"+getSeventhPlaceBasedOnLagna()+":"+getMentionedPlaceGrah(7));
			grah_pos.add(8+":"+getEighthPlaceBasedOnLagna()+":"+getMentionedPlaceGrah(8));
			grah_pos.add(9+":"+getNinethPlaceBasedOnLagna()+":"+getMentionedPlaceGrah(9));
			grah_pos.add(10+":"+getTenthPlaceBasedOnLagna()+":"+getMentionedPlaceGrah(10));
			grah_pos.add(11+":"+getEleventhPlaceBasedOnLagna()+":"+getMentionedPlaceGrah(11));
			grah_pos.add(12+":"+getTwelevethPlaceBasedOnLagna()+":"+getMentionedPlaceGrah(12));
			
			
			grah_pos_amsa.add(1+":"+getFristPlaceBasedOnLagnaAtAmsa()+":"+getMentionedPlaceGrahAtAmsa(1));
			grah_pos_amsa.add(2+":"+getSecondPlaceBasedOnLagnaAtAmsa()+":"+getMentionedPlaceGrahAtAmsa(2));
			grah_pos_amsa.add(3+":"+getThirdPlaceBasedOnLagnaAtAmsa()+":"+getMentionedPlaceGrahAtAmsa(3));
			grah_pos_amsa.add(4+":"+getFourthPlaceBasedOnLagnaAtAmsa()+":"+getMentionedPlaceGrahAtAmsa(4));
			grah_pos_amsa.add(5+":"+getFifthPlaceBasedOnLagnaAtAmsa()+":"+getMentionedPlaceGrahAtAmsa(5));
			grah_pos_amsa.add(6+":"+getSixthPlaceBasedOnLagnaAtAmsa()+":"+getMentionedPlaceGrahAtAmsa(6));
			grah_pos_amsa.add(7+":"+getSeventhPlaceBasedOnLagnaAtAmsa()+":"+getMentionedPlaceGrahAtAmsa(7));
			grah_pos_amsa.add(8+":"+getEighthPlaceBasedOnLagnaAtAmsa()+":"+getMentionedPlaceGrahAtAmsa(8));
			grah_pos_amsa.add(9+":"+getNinethPlaceBasedOnLagnaAtAmsa()+":"+getMentionedPlaceGrahAtAmsa(9));
			grah_pos_amsa.add(10+":"+getTenthPlaceBasedOnLagnaAtAmsa()+":"+getMentionedPlaceGrahAtAmsa(10));
			grah_pos_amsa.add(11+":"+getEleventhPlaceBasedOnLagnaAtAmsa()+":"+getMentionedPlaceGrahAtAmsa(11));
			grah_pos_amsa.add(12+":"+getTwelevethPlaceBasedOnLagnaAtAmsa()+":"+getMentionedPlaceGrahAtAmsa(12));
			
			int value1=Integer.parseInt(tf4.getText().trim().length()==0?"0":tf4.getText().trim());
			int value2=Integer.parseInt(tf5.getText().trim().length()==0?"0":tf5.getText().trim());
			int value3=Integer.parseInt(tf7.getText().trim().length()==0?"0":tf7.getText().trim());
			int value4=Integer.parseInt(tf8.getText().trim().length()==0?"0":tf8.getText().trim());
			GadiyaVgadiyaMain gy_result=new GadiyaVgadiyaMain();
			GadiyaVgadiyaMain gyyy=new GadiyaVgadiyaMain();
			GadiyaVgadiyaMain g_dup1=new GadiyaVgadiyaMain();
			GadiyaVgadiyaMain g_dup2=new GadiyaVgadiyaMain();
			g_dup1.setGanta(value1);g_dup1.setNimisha(value2);
			g_dup2.setGanta(value3);g_dup2.setNimisha(value4);
			gyyy.sub(g_dup1,g_dup2);
			
			GadiyaVgadiyaMain gy_op=gy_result.convertGantaToGadiya(gyyy);
			tf6.setText(gy_op.getGadiya()+"-"+gy_op.getVgadiya());
	    }
	    cb.setState(isGajaKesariYoga());
	    cb1.setState(getUchchaRaasi(INAH).equalsIgnoreCase(getRAVI()));
	    cb2.setState(getUchchaRaasi(SASI).equalsIgnoreCase(getCHANDRUDU()));
	    cb3.setState(getUchchaRaasi(KUJA).equalsIgnoreCase(getKUJUDU()));
	    cb4.setState(getUchchaRaasi(RAAHU).equalsIgnoreCase(getRAAHUVU()));
	    cb5.setState(getUchchaRaasi(JEEVA).equalsIgnoreCase(getGURUDU()));
	    cb6.setState(getUchchaRaasi(MANDA).equalsIgnoreCase(getSANI()));
	    cb7.setState(getUchchaRaasi(GNA).equalsIgnoreCase(getBHUDHUDU()));
	    cb8.setState(getUchchaRaasi(KETU).equalsIgnoreCase(getKETUVU()));
	    cb9.setState(getUchchaRaasi(BRUGHU).equalsIgnoreCase(getSUKRUDU()));
	}
	
	public void mouseClicked(MouseEvent me) {
		// TODO Auto-generated method stub
		
		
		Graphics g=p.getGraphics();
		g.drawString(me.getX()+":"+me.getY(),me.getX(),me.getY());
		
	}
	public void mousePressed(MouseEvent me) {
		// TODO Auto-generated method stub
		
		
		Graphics g=p.getGraphics();
		Graphics g1=p1.getGraphics();
		g.drawString(me.getX()+":"+me.getY(),me.getX(),me.getY());
		g1.drawString(me.getX()+":"+me.getY(),me.getX(),me.getY());
		
		
	}
	
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mouseDragged(MouseEvent me) {
		// TODO Auto-generated method stub
		Graphics g=p.getGraphics();
		Graphics g1=p1.getGraphics();
		g.drawString(me.getX()+":"+me.getY(),me.getX(),me.getY());
		g1.drawString(me.getX()+":"+me.getY(),me.getX(),me.getY());
		g.drawOval(me.getX(),me.getY(),10,10);
		
	}
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(1);
	}
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void itemStateChanged(ItemEvent ie) {
		// TODO Auto-generated method stub
	}
	
	public String getBHUDHUDU() {
		return BHUDHUDU;
	}
	public void setBHUDHUDU(String bhudhudu) {
		BHUDHUDU = bhudhudu;
	}
	public String getCHANDRUDU() {
		return CHANDRUDU;
	}
	public void setCHANDRUDU(String chandrudu) {
		CHANDRUDU = chandrudu;
	}
	public String getGURUDU() {
		return GURUDU;
	}
	public void setGURUDU(String gurudu) {
		GURUDU = gurudu;
	}
	public String getKETUVU() {
		return KETUVU;
	}
	public void setKETUVU(String ketuvu) {
		KETUVU = ketuvu;
	}
	public String getKUJUDU() {
		return KUJUDU;
	}
	public void setKUJUDU(String kujudu) {
		KUJUDU = kujudu;
	}
	public String getRAAHUVU() {
		return RAAHUVU;
	}
	public void setRAAHUVU(String raahuvu) {
		RAAHUVU = raahuvu;
	}
	public String getRAVI() {
		return RAVI;
	}
	public void setRAVI(String ravi) {
		RAVI = ravi;
	}
	
	public String getBHUDHUDU_IN_AMSA() {
		return BHUDHUDU_IN_AMSA;
	}

	public void setBHUDHUDU_IN_AMSA(String bhudhudu_in_amsa) {
		BHUDHUDU_IN_AMSA = bhudhudu_in_amsa;
	}

	public String getCHANDRUDU_IN_AMSA() {
		return CHANDRUDU_IN_AMSA;
	}

	public void setCHANDRUDU_IN_AMSA(String chandrudu_in_amsa) {
		CHANDRUDU_IN_AMSA = chandrudu_in_amsa;
	}

	public String getGURUDU_IN_AMSA() {
		return GURUDU_IN_AMSA;
	}

	public void setGURUDU_IN_AMSA(String gurudu_in_amsa) {
		GURUDU_IN_AMSA = gurudu_in_amsa;
	}

	public String getKETUVU_IN_AMSA() {
		return KETUVU_IN_AMSA;
	}

	public void setKETUVU_IN_AMSA(String ketuvu_in_amsa) {
		KETUVU_IN_AMSA = ketuvu_in_amsa;
	}

	public String getKUJUDU_IN_AMSA() {
		return KUJUDU_IN_AMSA;
	}

	public void setKUJUDU_IN_AMSA(String kujudu_in_amsa) {
		KUJUDU_IN_AMSA = kujudu_in_amsa;
	}

	public String getRAAHUVU_IN_AMSA() {
		return RAAHUVU_IN_AMSA;
	}

	public void setRAAHUVU_IN_AMSA(String raahuvu_in_amsa) {
		RAAHUVU_IN_AMSA = raahuvu_in_amsa;
	}

	public String getRAVI_IN_AMSA() {
		return RAVI_IN_AMSA;
	}

	public void setRAVI_IN_AMSA(String ravi_in_amsa) {
		RAVI_IN_AMSA = ravi_in_amsa;
	}

	public String getSANI_IN_AMSA() {
		return SANI_IN_AMSA;
	}

	public void setSANI_IN_AMSA(String sani_in_amsa) {
		SANI_IN_AMSA = sani_in_amsa;
	}

	public String getSUKRUDU_IN_AMSA() {
		return SUKRUDU_IN_AMSA;
	}

	public void setSUKRUDU_IN_AMSA(String sukrudu_in_amsa) {
		SUKRUDU_IN_AMSA = sukrudu_in_amsa;
	}

	public String getSANI() {
		return SANI;
	}
	public void setSANI(String sani) {
		SANI = sani;
	}
	public String getSUKRUDU() {
		return SUKRUDU;
	}
	public void setSUKRUDU(String sukrudu) {
		SUKRUDU = sukrudu;
	}
	public String getRUNNING_DASA()
	{
		return RUNNING_DASA;
	}
	public void setRUNNING_DASA(String dasa)
	{
		RUNNING_DASA=dasa; 
	}

	public void valueChanged(TreeSelectionEvent tse) {
		// TODO Auto-generated method stub
		tse.getPath();
	}

	public void setSelectionMode(int arg0) {
		// TODO Auto-generated method stub
		
	}

	public int getSelectionMode() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setSelectionPath(TreePath arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setSelectionPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		
	}

	public void addSelectionPath(TreePath arg0) {
		// TODO Auto-generated method stub
		
	}

	public void addSelectionPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		
	}

	public void removeSelectionPath(TreePath arg0) {
		// TODO Auto-generated method stub
		
	}

	public void removeSelectionPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		
	}

	public TreePath getSelectionPath() {
		// TODO Auto-generated method stub
		return null;
	}

	public TreePath[] getSelectionPaths() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getSelectionCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isPathSelected(TreePath arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSelectionEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public void clearSelection() {
		// TODO Auto-generated method stub
		
	}

	public void setRowMapper(RowMapper arg0) {
		// TODO Auto-generated method stub
		
	}

	public RowMapper getRowMapper() {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] getSelectionRows() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getMinSelectionRow() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxSelectionRow() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isRowSelected(int arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void resetRowSelection() {
		// TODO Auto-generated method stub
		
	}

	public int getLeadSelectionRow() {
		// TODO Auto-generated method stub
		return 0;
	}

	public TreePath getLeadSelectionPath() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addTreeSelectionListener(TreeSelectionListener arg0) {
		// TODO Auto-generated method stub
		
	}

	public void removeTreeSelectionListener(TreeSelectionListener arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

class RamYear
{
   int year;
   int month;
   int day;
   int ganta;
   int nimisha;
   int secs;

   public RamYear()
	{
        year=0;       
		month=0;        
		day=0;           
		ganta=0;         
		nimisha=0;     
		secs=0;          

	}

    public void setYear(int year)
	{
		this.year=year;
	}
	public void setMonth(int month)
	{
		this.month=month;
	}
	public void setDay(int day)
	{
		this.day=day;
	}
	public void setGanta(int ganta)
	{
		this.ganta=ganta;
	}
	public void setNimisha(int nimisha)
	{
		this.nimisha=nimisha;
	}
	public void setSecs(int secs)
	{
		this.secs=secs;
	}


 public int getYear()
	{
		return this.year;
	}
	public int getMonth()
	{
		return this.month;
	}
	public int getDay()
	{
		return this.day;
	}
	public int getGanta()
	{
		return this.ganta;
	}
	public int getNimisha()
	{
		return this.nimisha;
	}
	public int getSecs()
	{
		return this.secs;
	}
	
   public RamYear add(RamYear r1,RamYear r2)
	{
	   int year1=r1.getYear();
	   int month1=r1.getMonth();
	   int day1=r1.getDay();
	   int ganta1=r1.getGanta();
	   int nimisha1=r1.getNimisha();
	   int year2=r2.getYear();
	   int month2=r2.getMonth();
	   int day2=r2.getDay();
	   int ganta2=r2.getGanta();
	   int nimisha2=r2.getNimisha();
           int tempNimisha=nimisha1+nimisha2;
		   int tempGanta=ganta1+ganta2+(tempNimisha/60);
		   
           tempNimisha=tempNimisha%60;
		   int tempDay=day1+day2+(tempGanta/24);
		   
		   tempGanta=tempGanta%24;
		   int tempMonth=month1+month2+(tempDay/30);
		   
		   tempDay=tempDay%30;
		   int tempYear=year1+year2+(tempMonth/12);
		   if(tempMonth>12)
		   tempMonth=tempMonth%12;
		   RamYear ry=new RamYear();
            ry.setYear(tempYear);
			ry.setMonth(tempMonth);
			ry.setDay(tempDay);
			ry.setGanta(tempGanta);
			ry.setNimisha(tempNimisha);
			ry.setSecs(0);

			
			toString();
			return ry;
		   
	}
   public RamYear sub(RamYear ry1,RamYear ry2)
   {
	   int y1=ry1.getYear();
	   int m1=ry1.getMonth();
	   int d1=ry1.getDay();
	   
	   int y2=ry2.getYear();
	   int m2=ry2.getMonth();
	   int d2=ry2.getDay();
	   
	   int tempY=0,tempM=0,tempD=0;
	   
	   if(d1<d2)
	   {
		  tempD=d1+30-d2;
		  m1=m1-1;
	   }
	   else
	   {
		   tempD=d1-d2; 
	   }
	   if(m1<m2)
	   {
		   tempM=m1+12-m2;
		   y1=y1-1;
	   }
	   else
	   {
		   tempM=m1-m2; 
	   }
	   tempY=y1-y2;
	   RamYear rzy=new RamYear();
	   rzy.setYear(tempY);
	   rzy.setMonth(tempM);
	   rzy.setDay(tempD);
	   return rzy;
	   
   }
	public String toString()
	{
		System.out.println(this.getYear()+"-"+this.getMonth()+"-"+this.getDay()+"-"+this.getGanta()+"-"+this.getNimisha()+"-"+this.getSecs());
		return  this.getYear()+"-"+this.getMonth()+"-"+this.getDay()+"-"+this.getGanta()+"-"+this.getNimisha()+"-"+this.getSecs();
	}
}

class GadiyaVgadiya
{
	int ganta;
	int nimisha;
	int gadiya;
	int vgadiya;
    public GadiyaVgadiya()
	{
		ganta=0;
		nimisha=0;
		gadiya=0;
		vgadiya=0;
	}
    public void setGanta(int ganta)
	{
		this.ganta=ganta;
	}
    public void setNimisha(int nimisha)
	{
		this.nimisha=nimisha;
	}
	public void setGadiya(int gadiya)
	{
		this.gadiya=gadiya;
	}
	public void setVgadiya(int vgadiya)
	{
		this.vgadiya=vgadiya;
	}

	public int getGadiya()
	{
		return this.gadiya;
	}
	public int getNimisha()
	{
		return this.nimisha;
	}
	public int getGanta()
	{
		return this.ganta;
	}
	public int getVgadiya()
	{
		return this.vgadiya;
	}
   
    public  GadiyaVgadiya  convertGadiyaToGanta(GadiyaVgadiya gg)
	{
		int gadiya=gg.getGadiya();
		int vgadiya=gg.getVgadiya();
		int temp = gadiya*60;
		int total= temp+vgadiya;
		GadiyaVgadiya g=new GadiyaVgadiya();
		int  tempGanta=total/150;
		int tempGanta1=total%150;
		int tempGanta2=tempGanta1*60;
		int tempNimisha=tempGanta2/150;
		g.setGanta(tempGanta);
		g.setNimisha(tempNimisha);
		return g;
	}
	public  GadiyaVgadiya convertGantaToGadiya(GadiyaVgadiya gg)
	{
		int ganta=gg.getGanta();
		int nimisha=gg.getNimisha();

		int mul=ganta*60;
		int total=nimisha+mul;

		int  tempgadiya= total/24;
		int tempgadiya1= total%24;
		int tempgadiya2=tempgadiya1*60;
		int tempvgadiya=tempgadiya2/24;

		GadiyaVgadiya g=new GadiyaVgadiya();
		g.setGadiya(tempgadiya);
		g.setVgadiya(tempvgadiya);
		return g;
	}
	
	public GadiyaVgadiyaMain add(GadiyaVgadiyaMain g1,GadiyaVgadiyaMain g2)
	{
		int nimisha=g1.getNimisha()+g2.getNimisha();
		int ganta=g1.getGanta()+g2.getGanta()+(nimisha/60);
		nimisha=nimisha%60;
		int day=g1.getDay()+g2.getDay()+(ganta/24);
		ganta=ganta%24;
		int month=g1.getMonth()+g2.getMonth()+(day/30);
		day=day%30;
		int year=g1.getYear()+g2.getYear()+(month/12);
		month=month%12;
		GadiyaVgadiyaMain gm=new GadiyaVgadiyaMain();
		gm.setYear(year);
		gm.setMonth(month);
		gm.setDay(day);
		gm.setGanta(ganta);
		gm.setNimisha(nimisha);
		return gm;
		
	}
	
	public GadiyaVgadiyaMain sub(GadiyaVgadiyaMain g1,GadiyaVgadiyaMain g2)
	{
		int nimisha=0;
		int ganta=0,ganta_root;
		 ganta_root=g1.getGanta();
		if(g1.getNimisha()>g2.getNimisha())
		 nimisha=g1.getNimisha()-g2.getNimisha();
		else
		{
		 nimisha=60+g1.getNimisha()-g2.getNimisha();
		
		 ganta_root=ganta_root-1;
		}
			
		 ganta=ganta_root-g2.getGanta()+(nimisha/60);
		
		GadiyaVgadiyaMain gm=new GadiyaVgadiyaMain();
		gm.setYear(0);
		gm.setMonth(0);
		gm.setDay(0);
		gm.setGanta(ganta);
		gm.setNimisha(nimisha);
		return gm;
		
	}

}


class RamSequence implements  CharSequence
{
 private String sequence="";
 private char buf[];
public RamSequence(String str)
{
	sequence=str;
	buf=sequence.toCharArray();
}

@Override
public char charAt(int arg) {
	// TODO Auto-generated method stub
	return buf[arg];
}

@Override
public int length() {
	// TODO Auto-generated method stub
	return sequence.length();
}

@Override
public CharSequence subSequence(int arg0, int arg1) {
	// TODO Auto-generated method stub
	return new RamSequence(new String(buf,arg0,arg1));
}

}
