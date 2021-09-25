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

public class RamMain extends Frame implements ActionListener,MouseListener,MouseMotionListener,TreeSelectionListener,TreeSelectionModel,WindowListener,ItemListener {
	
	public static final String INAH="INAH";
	public static final String SASI="SASI";
	public static final String KUJA="KUJA";
	public static final String RAAHU="RAAHU";
	public static final String JEEVA="JEEVA";
	public static final String MANDA="MANDA";
	public static final String GNA="GNA";
	public static final String KETU="KETU";
	public static final String BRUGHU="BRUGHU";
	public int YEAR=1981;
	public int MONTH=7;
	public int DAY=28;
	public int HOUR=0;
	public int MINUTE=0;
	private int x,x_1,y,y_1;
	private static String DATA_1="-";
	private static String DATA_2="-";
	private static String DATA_3="-";
	private static String DATA_4="-";
	private static String DATA_5="-";
	private static String DATA_6="-";
	private static String DATA_7="-";
	private static String DATA_8="-";
	private static String DATA_9="-";
	private static String DATA_10="-";
	private static String DATA_11="-";
	private static String DATA_12="-";
	
	public static final int INAH_1=1;
	public static final int SASI_2=2;
	public static final int KUJA_3=3;
	public static final int RAAHU_4=4;
	public static final int JEEVA_5=5;
	public static final int MANDA_6=6;
	public static final int GNA_7=7;
	public static final int KETU_8=8;
	public static final int BRUGHU_9=9;
	String grah[]={INAH,SASI,KUJA,RAAHU,JEEVA,MANDA,GNA,KETU,BRUGHU};
	int dasa_time[]={6,10,7,18,16,19,17,7,20};
	DefaultMutableTreeNode dmt=null;
	JTree jt=null;Choice ch=null; GadiyaVgadiyaMain main=null;
	public RamMain(int year,int month,int day,int hour,int minute,String dasa,int realYear,int realMonth,int realDay)
	{
		setTitle("RAM APPLET");
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		 YEAR=realYear;
		 MONTH=realMonth;
		 DAY=realDay;
		 HOUR=0;
		 MINUTE=0;
		ch=new Choice();
		ch.addItem(dasa);
		ch.addItemListener(this);ch.setBounds(74,124,50,50);
		add(ch);
		addMouseListener(this);
		addMouseMotionListener(this);
		main=new GadiyaVgadiyaMain();
		main.setYear(YEAR);
		main.setMonth(MONTH);
		main.setDay(DAY);
		main.setGanta(0);
		main.setNimisha(0);
	
		
		Graphics g=this.getGraphics();
		g.drawString(" RAASI ",544,216);
		g.drawString(" AMSA ",844,216);
		
		GadiyaVgadiyaMain gm_m_m=new GadiyaVgadiyaMain();
		GadiyaVgadiyaMain gm_m_m_temp=new GadiyaVgadiyaMain();
		gm_m_m_temp.setYear(year);
		gm_m_m_temp.setMonth(month);
		gm_m_m_temp.setDay(day);
		gm_m_m_temp.setGanta(hour); 
		gm_m_m_temp.setNimisha(minute);
		
		main=gm_m_m.add(main,gm_m_m_temp);
		dmt=new DefaultMutableTreeNode(main.getYear()+"-"+main.getMonth()+"-"+main.getDay()+"-"+main.getGanta()+"-"+main.getNimisha());
		addWindowListener(this);
		dmt.removeAllChildren();
		calculateInnerDasa(ch.getItem(0).trim(),dmt);
			
	}
	
	
	public void calculateInnerDasa(String dasa,DefaultMutableTreeNode dmt)
	{
		int value=getDasaNo(dasa.trim());
		int time=getDasaTime(dasa.trim());
		switch(value)
		{
		case INAH_1:
			        int res1=time*6;
			        System.out.println("--------------"+dasa+"-INAH-------------------");
			        System.out.println(res1/120+"-"+res1/10+"-"+(res1%10)*3);
			        DefaultMutableTreeNode dmt1=new DefaultMutableTreeNode("RAVI");
			        dmt1.add(new DefaultMutableTreeNode(res1/120+"-"+res1/10+"-"+(res1%10)*3));
			        dmt.add(dmt1);
			        System.out.println("-----------------------------------");
			        calculateInnerInnerDasa(dasa,INAH,dmt,dmt1);
			        
		case SASI_2:
			int res2=time*10;
			System.out.println("--------------"+dasa+"-SASI-------------------");
	        System.out.println(res2/120+"-"+res2/10+"-"+(res2%10)*3);
	        System.out.println("-----------------------------------");
	        DefaultMutableTreeNode dmt2=new DefaultMutableTreeNode("SASI");
	        dmt2.add(new DefaultMutableTreeNode(res2/120+"-"+res2/10+"-"+(res2%10)*3));
	        dmt.add(dmt2);
	        calculateInnerInnerDasa(dasa,SASI,dmt,dmt2);
		case KUJA_3:
			int res3=time*7;
			System.out.println("--------------"+dasa+"-KUJA-------------------");
	        System.out.println(res3/120+"-"+res3/10+"-"+(res3%10)*3);
	        System.out.println("-----------------------------------");
	        DefaultMutableTreeNode dmt3=new DefaultMutableTreeNode("KUJA");
	        dmt3.add(new DefaultMutableTreeNode(res3/120+"-"+res3/10+"-"+(res3%10)*3));
	        dmt.add(dmt3);
	        calculateInnerInnerDasa(dasa,KUJA,dmt,dmt3);
		case RAAHU_4:
			int res4=time*18;
			System.out.println("--------------"+dasa+"-RAAHU-------------------");
	        System.out.println(res4/120+"-"+res4/10+"-"+(res4%10)*3);
	        System.out.println("-----------------------------------");
	        DefaultMutableTreeNode dmt4=new DefaultMutableTreeNode("RAAHU");
	        dmt4.add(new DefaultMutableTreeNode(res4/120+"-"+res4/10+"-"+(res4%10)*3));
	        dmt.add(dmt4);
	        calculateInnerInnerDasa(dasa,RAAHU,dmt,dmt4);
		case JEEVA_5:
			int res5=time*16;
			System.out.println("--------------"+dasa+"-JEEVA-------------------");
	        System.out.println(res5/120+"-"+res5/10+"-"+(res5%10)*3);
	        System.out.println("-----------------------------------");
	        DefaultMutableTreeNode dmt5=new DefaultMutableTreeNode("JEEVA");
	        dmt5.add(new DefaultMutableTreeNode(res5/120+"-"+res5/10+"-"+(res5%10)*3));
	        dmt.add(dmt5);
	        calculateInnerInnerDasa(dasa,JEEVA,dmt,dmt5);
		case MANDA_6:
			int res6=time*19;
			System.out.println("--------------"+dasa+"-MANDA-------------------");
	        System.out.println(res6/120+"-"+res6/10+"-"+(res6%10)*3);
	        System.out.println("-----------------------------------");
	        DefaultMutableTreeNode dmt6=new DefaultMutableTreeNode("MANDA");
	        dmt6.add(new DefaultMutableTreeNode(res6/120+"-"+res6/10+"-"+(res6%10)*3));
	        dmt.add(dmt6);
	        calculateInnerInnerDasa(dasa,MANDA,dmt,dmt6);
		case GNA_7:
			int res7=time*17;
			System.out.println("--------------"+dasa+"-GNA-------------------");
	        System.out.println(res7/120+"-"+res7/10+"-"+(res7%10)*3);
	        System.out.println("-----------------------------------");
	        DefaultMutableTreeNode dmt7=new DefaultMutableTreeNode("GNA");
	        dmt7.add(new DefaultMutableTreeNode(res7/120+"-"+res7/10+"-"+(res7%10)*3));
	        dmt.add(dmt7);
	        calculateInnerInnerDasa(dasa,GNA,dmt,dmt7);
		case KETU_8:
			int res8=time*7;
			System.out.println("--------------"+dasa+"-KETU-------------------");
	        System.out.println(res8/120+"-"+res8/10+"-"+(res8%10)*3);
	        System.out.println("-----------------------------------");
	        DefaultMutableTreeNode dmt8=new DefaultMutableTreeNode("KETU");
	        dmt8.add(new DefaultMutableTreeNode(res8/120+"-"+res8/10+"-"+(res8%10)*3));
	        dmt.add(dmt8);
	        calculateInnerInnerDasa(dasa,KETU,dmt,dmt8);
		case BRUGHU_9:
			int res9=time*20;
			System.out.println("--------------"+dasa+"-BRUGHU-------------------");
	        System.out.println(res9/120+"-"+res9/10+"-"+(res9%10)*3);
	        System.out.println("-----------------------------------");
	        DefaultMutableTreeNode dmt9=new DefaultMutableTreeNode("BRUGHU");
	        dmt9.add(new DefaultMutableTreeNode(res9/120+"-"+res9/10+"-"+(res9%10)*3));
	        dmt.add(dmt9);
	        calculateInnerInnerDasa(dasa,BRUGHU,dmt,dmt9);
		}
		for(int i=1;i<value;i++)
		{
			int res10=time*dasa_time[i-1];
			System.out.println("--------------"+dasa+"-"+grah[i-1]+"-------------------");
	        System.out.println(res10/120+"-"+res10/10+"-"+(res10%10)*3);
	        System.out.println("-----------------------------------");
	        DefaultMutableTreeNode dmt10=new DefaultMutableTreeNode(grah[i-1]);
	        dmt10.add(new DefaultMutableTreeNode(res10/120+"-"+res10/10+"-"+(res10%10)*3));
	        dmt.add(dmt10);
	        calculateInnerInnerDasa(dasa,grah[i-1],dmt,dmt10);
	        
		}
		
		jt=new JTree(dmt,true);
		add(jt);
		jt.addTreeSelectionListener(this);jt.setBounds(184,80,150,1000);
		JScrollPane jsp=new JScrollPane(jt);
		jsp.setHorizontalScrollBar(new JScrollBar(JScrollBar.HORIZONTAL));
		jsp.setVerticalScrollBar(new JScrollBar(JScrollBar.VERTICAL));jsp.setAutoscrolls(true);
		add(jsp);
		
	}
    public void calculateInnerInnerDasa(String dasa1,String dasa2,DefaultMutableTreeNode dmt,DefaultMutableTreeNode dmtChild)
    {
     	int time1=getDasaTime(dasa1.trim());
     	int time2=getDasaTime(dasa2.trim());
     	int time3=time1*time2;
     	int time3_1=(time3%10)*3; //days;
     	int time3_4=(time3/10)*30;//days;
     	int total=time3_1+time3_4;
     	int value=getDasaNo(dasa2.trim());
     	GadiyaVgadiyaMain loop_gm=new GadiyaVgadiyaMain();
     	switch(value)
     	{
     	   case INAH_1:
     		           int res1=total*6;
     		           int day1=res1/120;
     		           int ganta1=((res1%120)*24)/120;
     		           int nimisha1=((((res1%120)*24)%120)*60)/120;
     		           System.out.println(dasa1+"-"+dasa2+"-"+"INAH     "+day1+"-"+ganta1+"-"+nimisha1);
     		          DefaultMutableTreeNode dmtc1=new DefaultMutableTreeNode(dasa1+"-"+dasa2+"-"+"INAH     ");
     		          dmtc1.add(new DefaultMutableTreeNode(day1+"-"+ganta1+"-"+nimisha1));
     		          GadiyaVgadiyaMain gm_temp_1=new GadiyaVgadiyaMain();
     		          gm_temp_1.setYear(0);
     		         gm_temp_1.setMonth(0);
     		        gm_temp_1.setDay(day1);
     		       gm_temp_1.setGanta(ganta1);
     		      gm_temp_1.setNimisha(nimisha1);
     		     main=loop_gm.add(main, gm_temp_1);
     		    dmtChild.add(dmtc1);
     		    dmtChild.add(new DefaultMutableTreeNode(main.getYear()+"-"+main.getMonth()+"-"+main.getDay()+"-"+main.getGanta()+"-"+main.getNimisha()));
     		           
     		          
     		           dmt.add(dmtChild);
     	  case SASI_2:
     		 int res2= total * 10;
			int day2 = res2 / 120;
			int ganta2 = ((res2 % 120) * 24) / 120;
			int nimisha2 = ((((res2 % 120) * 24) % 120) * 60) / 120;
			System.out.println(dasa1+"-"+dasa2+"-"+"SASI     "+day2 + "-" + ganta2 + "-" + nimisha2);
			 DefaultMutableTreeNode dmtc2=new DefaultMutableTreeNode(dasa1+"-"+dasa2+"-"+"SASI     ");
	          dmtc2.add(new DefaultMutableTreeNode(day2+"-"+ganta2+"-"+nimisha2));
	          GadiyaVgadiyaMain gm_temp_2=new GadiyaVgadiyaMain();
		          gm_temp_2.setYear(0);
		         gm_temp_2.setMonth(0);
		        gm_temp_2.setDay(day2);
		       gm_temp_2.setGanta(ganta2);
		      gm_temp_2.setNimisha(nimisha2);
		     main=loop_gm.add(main, gm_temp_2);
		     dmtChild.add(dmtc2);
		    dmtChild.add(new DefaultMutableTreeNode(main.getYear()+"-"+main.getMonth()+"-"+main.getDay()+"-"+main.getGanta()+"-"+main.getNimisha()));
	           
	           dmt.add(dmtChild);
     	 case KUJA_3:
     		int res3=total*7;
	           int day3=res3/120;
	           int ganta3=((res3%120)*24)/120;
	           int nimisha3=((((res3%120)*24)%120)*60)/120;
	           System.out.println(dasa1+"-"+dasa2+"-"+"KUJA     "+day3+"-"+ganta3+"-"+nimisha3);
	           DefaultMutableTreeNode dmtc3=new DefaultMutableTreeNode(dasa1+"-"+dasa2+"-"+"KUJA     ");
		          dmtc3.add(new DefaultMutableTreeNode(day3+"-"+ganta3+"-"+nimisha3));
		          GadiyaVgadiyaMain gm_temp_3=new GadiyaVgadiyaMain();
 		          gm_temp_3.setYear(0);
 		         gm_temp_3.setMonth(0);
 		        gm_temp_3.setDay(day3);
 		       gm_temp_3.setGanta(ganta3);
 		      gm_temp_3.setNimisha(nimisha3);
 		     main=loop_gm.add(main, gm_temp_3);
 		    dmtChild.add(dmtc3);
 		    dmtChild.add(new DefaultMutableTreeNode(main.getYear()+"-"+main.getMonth()+"-"+main.getDay()+"-"+main.getGanta()+"-"+main.getNimisha()));
		           
		           dmt.add(dmtChild);
     	case RAAHU_4:
     		int res4=total*18;
	           int day4=res4/120;
	           int ganta4=((res4%120)*24)/120;
	           int nimisha4=((((res4%120)*24)%120)*60)/120;
	           System.out.println(dasa1+"-"+dasa2+"-"+"RAAHU     "+day4+"-"+ganta4+"-"+nimisha4);
	           DefaultMutableTreeNode dmtc4=new DefaultMutableTreeNode(dasa1+"-"+dasa2+"-"+"RAAHU     ");
		          dmtc4.add(new DefaultMutableTreeNode(day4+"-"+ganta4+"-"+nimisha4));
		          GadiyaVgadiyaMain gm_temp_4=new GadiyaVgadiyaMain();
 		          gm_temp_4.setYear(0);
 		         gm_temp_4.setMonth(0);
 		        gm_temp_4.setDay(day4);
 		       gm_temp_4.setGanta(ganta4);
 		      gm_temp_4.setNimisha(nimisha4);
 		     main=loop_gm.add(main, gm_temp_4);
 		    dmtChild.add(dmtc4);
 		    dmtChild.add(new DefaultMutableTreeNode(main.getYear()+"-"+main.getMonth()+"-"+main.getDay()+"-"+main.getGanta()+"-"+main.getNimisha()));
		           
		           dmt.add(dmtChild);
     	case JEEVA_5:
     		int res5=total*16;
	           int day5=res5/120;
	           int ganta5=((res5%120)*24)/120;
	           int nimisha5=((((res5%120)*24)%120)*60)/120;
	           System.out.println(dasa1+"-"+dasa2+"-"+"JEEVA     "+day5+"-"+ganta5+"-"+nimisha5);
	           DefaultMutableTreeNode dmtc5=new DefaultMutableTreeNode(dasa1+"-"+dasa2+"-"+"JEEVA     ");
		          dmtc5.add(new DefaultMutableTreeNode(day5+"-"+ganta5+"-"+nimisha5));
		          GadiyaVgadiyaMain gm_temp_5=new GadiyaVgadiyaMain();
 		          gm_temp_5.setYear(0);
 		         gm_temp_5.setMonth(0);
 		        gm_temp_5.setDay(day5);
 		       gm_temp_5.setGanta(ganta5);
 		      gm_temp_5.setNimisha(nimisha5);
 		     main=loop_gm.add(main, gm_temp_5);
 		    dmtChild.add(dmtc5);
 		    dmtChild.add(new DefaultMutableTreeNode(main.getYear()+"-"+main.getMonth()+"-"+main.getDay()+"-"+main.getGanta()+"-"+main.getNimisha()));
		           
		           dmt.add(dmtChild);
     	case MANDA_6:
     		int res6=total*19;
	           int day6=res6/120;
	           int ganta6=((res6%120)*24)/120;
	           int nimisha6=((((res6%120)*24)%120)*60)/120;
	           System.out.println(dasa1+"-"+dasa2+"-"+"MANDA     "+day6+"-"+ganta6+"-"+nimisha6);
	           DefaultMutableTreeNode dmtc6=new DefaultMutableTreeNode(dasa1+"-"+dasa2+"-"+"MANDA     ");
		          dmtc6.add(new DefaultMutableTreeNode(day6+"-"+ganta6+"-"+nimisha6));
		          GadiyaVgadiyaMain gm_temp_6=new GadiyaVgadiyaMain();
 		          gm_temp_6.setYear(0);
 		         gm_temp_6.setMonth(0);
 		        gm_temp_6.setDay(day6);
 		       gm_temp_6.setGanta(ganta6);
 		      gm_temp_6.setNimisha(nimisha6);
 		     main=loop_gm.add(main, gm_temp_6);
 		    dmtChild.add(dmtc6);
 		    dmtChild.add(new DefaultMutableTreeNode(main.getYear()+"-"+main.getMonth()+"-"+main.getDay()+"-"+main.getGanta()+"-"+main.getNimisha()));
		           
		           dmt.add(dmtChild);
     	case GNA_7:
     		int res7=total*17;
	           int day7=res7/120;
	           int ganta7=((res7%120)*24)/120;
	           int nimisha7=((((res7%120)*24)%120)*60)/120;
	           System.out.println(dasa1+"-"+dasa2+"-"+"GNA     "+day7+"-"+ganta7+"-"+nimisha7);
	           DefaultMutableTreeNode dmtc7=new DefaultMutableTreeNode(dasa1+"-"+dasa2+"-"+"GNA     ");
		          dmtc7.add(new DefaultMutableTreeNode(day7+"-"+ganta7+"-"+nimisha7));
		          GadiyaVgadiyaMain gm_temp_7=new GadiyaVgadiyaMain();
 		          gm_temp_7.setYear(0);
 		         gm_temp_7.setMonth(0);
 		        gm_temp_7.setDay(day7);
 		       gm_temp_7.setGanta(ganta7);
 		      gm_temp_7.setNimisha(nimisha7);
 		     main=loop_gm.add(main, gm_temp_7);
 		    dmtChild.add(dmtc7);
 		    dmtChild.add(new DefaultMutableTreeNode(main.getYear()+"-"+main.getMonth()+"-"+main.getDay()+"-"+main.getGanta()+"-"+main.getNimisha()));
		          
		           dmt.add(dmtChild);
     	case KETU_8:
     		int res8=total*7;
	           int day8=res8/120;
	           int ganta8=((res8%120)*24)/120;
	           int nimisha8=((((res8%120)*24)%120)*60)/120;
	           System.out.println(dasa1+"-"+dasa2+"-"+"KETU     "+day8+"-"+ganta8+"-"+nimisha8);
	           DefaultMutableTreeNode dmtc8=new DefaultMutableTreeNode(dasa1+"-"+dasa2+"-"+"KETU     ");
		          dmtc8.add(new DefaultMutableTreeNode(day8+"-"+ganta8+"-"+nimisha8));
		          GadiyaVgadiyaMain gm_temp_8=new GadiyaVgadiyaMain();
 		          gm_temp_8.setYear(0);
 		         gm_temp_8.setMonth(0);
 		        gm_temp_8.setDay(day8);
 		       gm_temp_8.setGanta(ganta8);
 		      gm_temp_8.setNimisha(nimisha8);
 		     main=loop_gm.add(main, gm_temp_8);
 		    dmtChild.add(dmtc8);
 		    dmtChild.add(new DefaultMutableTreeNode(main.getYear()+"-"+main.getMonth()+"-"+main.getDay()+"-"+main.getGanta()+"-"+main.getNimisha()));
		          
		           dmt.add(dmtChild);
     	case BRUGHU_9:
     		int res9=total*20;
	           int day9=res9/120;
	           int ganta9=((res9%120)*24)/120;
	           int nimisha9=((((res9%120)*24)%120)*60)/120;
	           System.out.println(dasa1+"-"+dasa2+"-"+"BRUGHU     "+day9+"-"+ganta9+"-"+nimisha9);
	           DefaultMutableTreeNode dmtc9=new DefaultMutableTreeNode(dasa1+"-"+dasa2+"-"+"BRUGHU     ");
		          dmtc9.add(new DefaultMutableTreeNode(day9+"-"+ganta9+"-"+nimisha9));
		          GadiyaVgadiyaMain gm_temp_9=new GadiyaVgadiyaMain();
 		          gm_temp_9.setYear(0);
 		         gm_temp_9.setMonth(0);
 		        gm_temp_9.setDay(day9);
 		       gm_temp_9.setGanta(ganta9);
 		      gm_temp_9.setNimisha(nimisha9);
 		     main=loop_gm.add(main, gm_temp_9);
 		    dmtChild.add(dmtc9);
 		    dmtChild.add(new DefaultMutableTreeNode(main.getYear()+"-"+main.getMonth()+"-"+main.getDay()+"-"+main.getGanta()+"-"+main.getNimisha()));
		           
		           dmt.add(dmtChild);
     		   
     	}
     	
     	for(int i=1;i<value;i++)
		{
     		   int res10=total*dasa_time[i-1];
	           int day10=res10/120;
	           int ganta10=((res10%120)*24)/120;
	           int nimisha10=((((res10%120)*24)%120)*60)/120;
	           System.out.println(dasa1+"-"+dasa2+"-"+grah[i-1]+day10+"-"+ganta10+"-"+nimisha10);
	           DefaultMutableTreeNode dmtc10=new DefaultMutableTreeNode(dasa1+"-"+dasa2+"-"+grah[i-1]);
		          dmtc10.add(new DefaultMutableTreeNode(day10+"-"+ganta10+"-"+nimisha10));
		          GadiyaVgadiyaMain gm_temp_10=new GadiyaVgadiyaMain();
 		          gm_temp_10.setYear(0);
 		         gm_temp_10.setMonth(0);
 		        gm_temp_10.setDay(day10);
 		       gm_temp_10.setGanta(ganta10);
 		      gm_temp_10.setNimisha(nimisha10);
 		     main=loop_gm.add(main, gm_temp_10);
 		    dmtChild.add(dmtc10);
 		    dmtChild.add(new DefaultMutableTreeNode(main.getYear()+"-"+main.getMonth()+"-"+main.getDay()+"-"+main.getGanta()+"-"+main.getNimisha()));
		           
		           dmt.add(dmtChild);
		}
     	
     	
    }
    public int getDasaNo(String str)
    {
    	if(str.equalsIgnoreCase(INAH))
    	{
    		return INAH_1;
    	}
    	else if(str.equalsIgnoreCase(SASI))
    	{
    		return SASI_2;
    	}
    	else if(str.equalsIgnoreCase(KUJA))
    	{
    		return KUJA_3;
    	}
    	else if(str.equalsIgnoreCase(RAAHU))
    	{
    		return RAAHU_4;
    	}
    	else if(str.equalsIgnoreCase(JEEVA))
    	{
    		return JEEVA_5;
    	}
    	else if(str.equalsIgnoreCase(MANDA))
    	{
    		return MANDA_6;
    	}
    	else if(str.equalsIgnoreCase(GNA))
    	{
    		return GNA_7;
    	}
    	else if(str.equalsIgnoreCase(KETU))
    	{
    		return KETU_8;
    	}
    	else if(str.equalsIgnoreCase(BRUGHU))
    	{
    		return BRUGHU_9;
    	}
    	return -1;
    }
    
    public String getDasaName(int value)
    {
    	switch(value)
    	{
    	case INAH_1:
    		  return INAH;
    		  
    	case SASI_2:
	         return SASI;
    	case KUJA_3:
	         return KUJA;
    	case RAAHU_4:
	         return RAAHU;
    	case JEEVA_5:
	         return JEEVA;
    	case MANDA_6:
	         return MANDA;
    	case GNA_7:
	         return GNA;
    	case KETU_8:
	         return KETU;
    	case BRUGHU_9:
	         return BRUGHU;     
    	}
    	return "NIL";
    }
    public int getDasaTime(String str)
    {
    	if(str.equalsIgnoreCase(INAH))
    	{
    		return 6;
    	}
    	else if(str.equalsIgnoreCase(SASI))
    	{
    		return 10;
    	}
    	else if(str.equalsIgnoreCase(KUJA))
    	{
    		return 7;
    	}
    	else if(str.equalsIgnoreCase(RAAHU))
    	{
    		return 18;
    	}
    	else if(str.equalsIgnoreCase(JEEVA))
    	{
    		return 16;
    	}
    	else if(str.equalsIgnoreCase(MANDA))
    	{
    		return 19;
    	}
    	else if(str.equalsIgnoreCase(GNA))
    	{
    		return 17;
    	}
    	else if(str.equalsIgnoreCase(KETU))
    	{
    		return 7;
    	}
    	else if(str.equalsIgnoreCase(BRUGHU))
    	{
    		return 20;
    	}
    	return -1;
    	
    }
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent me) {
		// TODO Auto-generated method stub
		x=me.getX();
		y=me.getY();
		this.getGraphics().drawString(x+","+y,x,y);
		
	}

	public void mouseReleased(MouseEvent me) {
		// TODO Auto-generated method stub
		this.getGraphics().drawRect(x,y,x_1-x,y_1-y);
		
	}

	public void mouseDragged(MouseEvent me) {
		// TODO Auto-generated method stub
		x_1=me.getX();
		y_1=me.getY();
		
	}

	public void mouseMoved(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

	public void valueChanged(TreeSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void addSelectionPath(TreePath arg0) {
		// TODO Auto-generated method stub
		
	}

	public void addSelectionPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		
	}

	public void addTreeSelectionListener(TreeSelectionListener arg0) {
		// TODO Auto-generated method stub
		
	}

	public void clearSelection() {
		// TODO Auto-generated method stub
		
	}

	public TreePath getLeadSelectionPath() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getLeadSelectionRow() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxSelectionRow() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMinSelectionRow() {
		// TODO Auto-generated method stub
		return 0;
	}

	public RowMapper getRowMapper() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getSelectionCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getSelectionMode() {
		// TODO Auto-generated method stub
		return 0;
	}

	public TreePath getSelectionPath() {
		// TODO Auto-generated method stub
		return null;
	}

	public TreePath[] getSelectionPaths() {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] getSelectionRows() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isPathSelected(TreePath arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isRowSelected(int arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSelectionEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeSelectionPath(TreePath arg0) {
		// TODO Auto-generated method stub
		
	}

	public void removeSelectionPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		
	}

	public void removeTreeSelectionListener(TreeSelectionListener arg0) {
		// TODO Auto-generated method stub
		
	}

	public void resetRowSelection() {
		// TODO Auto-generated method stub
		
	}

	public void setRowMapper(RowMapper arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setSelectionMode(int arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setSelectionPath(TreePath arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setSelectionPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(1);
	}
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(1);
	}
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void itemStateChanged(ItemEvent ie) {
		// TODO Auto-generated method stub
		
		
	}

}


class GadiyaVgadiyaMain
{
	int ganta;
	int nimisha;
	int gadiya;
	int vgadiya;
	int year;
	int month;
	int day;
    public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public GadiyaVgadiyaMain()
	{
		ganta=0;
		nimisha=0;
		gadiya=0;
		vgadiya=0;
		year=0;
		month=0;
		day=0;
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
   
    public  GadiyaVgadiyaMain  convertGadiyaToGanta(GadiyaVgadiyaMain gg)
	{
		int gadiya=gg.getGadiya();
		int vgadiya=gg.getVgadiya();
		int temp = gadiya*60;
		int total= temp+vgadiya;
		GadiyaVgadiyaMain g=new GadiyaVgadiyaMain();
		int  tempGanta=total/150;
		int tempGanta1=total%150;
		int tempGanta2=tempGanta1*60;
		int tempNimisha=tempGanta2/150;
		g.setGanta(tempGanta);
		g.setNimisha(tempNimisha);
		return g;
	}
	public  GadiyaVgadiyaMain convertGantaToGadiya(GadiyaVgadiyaMain gg)
	{
		int ganta=gg.getGanta();
		int nimisha=gg.getNimisha();

		int mul=ganta*60;
		int total=nimisha+mul;

		int  tempgadiya= total/24;
		int tempgadiya1= total%24;
		int tempgadiya2=tempgadiya1*60;
		int tempvgadiya=tempgadiya2/24;

		GadiyaVgadiyaMain g=new GadiyaVgadiyaMain();
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

