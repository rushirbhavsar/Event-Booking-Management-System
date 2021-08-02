import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class EventSystem
{
	ArrayList<Integer> tickid = new ArrayList<Integer>();
	ArrayList<String> selCity = new ArrayList<String>();
	ArrayList<String> selEvent = new ArrayList<String>();
	ArrayList<String> userName = new ArrayList<String>();
	ArrayList<String> userID = new ArrayList<String>();
	ArrayList<String> emailID = new ArrayList<String>();
	ArrayList<Integer> tickets = new ArrayList<Integer>();
	ArrayList<Integer> otpcfrm = new ArrayList<Integer>();
	ArrayList<String> paymode = new ArrayList<String>();
	ArrayList<String> selDate = new ArrayList<String>();  
	String date,payment;
	int i=0;
	Random rand=new Random();
	Scanner es=new Scanner(System.in);
}
class City extends EventSystem
{
    ArrayList<String> ctys = new ArrayList<String>();
	
	City()
	{
		setCity();
	}
    void setCity()
    {
    ctys.add("Delhi");
    ctys.add("Bangalore");
    ctys.add("Chennai");
    ctys.add("Mumbai");
    ctys.add("Ahmedabad");
    }
    
	
	void displayCList()
	{
		int i=0;
		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("           City Choices : ( New City-Options will be Added Soon ) ");
		System.out.print("\n----------------------------------------------------------------------------\n");
		
		while(i<ctys.size())
		{
			System.out.println((i+1)+"."+ctys.get(i));
			i++;
		}

		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("---------------------------------------------------------------------------\n");
		
    }
    
	void ScanCC()
	{
		int city=es.nextInt();
		es.nextLine();
        if(city>ctys.size() || city<0)
		{
			System.out.print("\n\t !!     Please Enter a valid number : ");
			city=es.nextInt();
		}
		selCity.add(ctys.get(city-1));
	}
}
class Event extends City

{
	
	ArrayList<String> evts = new ArrayList<String>();
	
	Event()
	{
		setEvent();
	}

    void setEvent()
    {
	evts.add("Concert");
	evts.add("Museum Walk");
    evts.add("Photo Walk");
    evts.add("City Tour");
    evts.add("Comedy Night");
    }
    
	
	void displayEList()
	{
    
		int i=0;
		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("           Event Choices : ( New Event will organised and Added Soon ) ");
        System.out.print("\n----------------------------------------------------------------------------\n");
		
		while(i<evts.size())
		{
			System.out.println((i+1)+"."+evts.get(i));
			i++;
		}
		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("----------------------------------------------------------------------------\n");
		
    }
    void ScanEC()
	{
		int event=es.nextInt();
		es.nextLine();
        if(event>evts.size() || event<0)
		{
			System.out.print("Please Enter a valid number : ");
			event=es.nextInt();
		}
		selEvent.add(evts.get(event-1));
	}

}
class Date extends Event
{
	ArrayList<String> evtDt = new ArrayList<String>();
	
	Date()
	{
		setDates();
	}

    void setDates()
    {
	evtDt.add("12th-December-2020");
	evtDt.add("24th-December-2020");
    evtDt.add("26th-December-2020");
    evtDt.add(" 7th-January-2020");
    evtDt.add("10th-January-2020");
    }
    

	void displayDList()
	{
    
		int i=0;
		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("                   Date Choices : \n");
		System.out.print("  (  Due to COVID-19 we have limited our Dates to December and January Only  )");
        System.out.print("\n----------------------------------------------------------------------------\n");
		
		while(i<evtDt.size())
		{
			System.out.println((i+1)+"."+evtDt.get(i));
			i++;
		}
		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("----------------------------------------------------------------------------\n");
		
    }
    void ScanDC()
	{
		int evDate=es.nextInt();
		es.nextLine();
        if(evDate>evtDt.size() || evDate<0)
		{
			System.out.print("Please Enter a valid number : ");
			evDate=es.nextInt();
		}
		selDate.add(evtDt.get(evDate-1));
	}	
}
class adminlog extends Date
{

	ArrayList<String> adid = new ArrayList<String>();
	ArrayList<String> adpwd = new ArrayList<String>();
	void setAdmin()
	{
		adid.add("Rushir");
		adid.add("Hrishi");
		adid.add("Somya");
		adpwd.add("229");
		adpwd.add("274");
		adpwd.add("268");
	}
	adminlog()
	{
		setAdmin();
	}

	boolean confirmDetails(String name , String pwd)
	{
		int i =0;
		while(i<adid.size())
		{
			if(name.equals(adid.get(i))== true && pwd.equals(adpwd.get(i)) == true)
			{
				return true;
			}
			i++;
		}
		return false;

	}
	void newAdmin()
	{
		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("                           New-Admin Registration UI ");
        System.out.print("\n----------------------------------------------------------------------------\n");
		
		System.out.print("\t\t\tEnter New Admin Name : ");
		String name = new String();
		name = es.next();
		adid.add(name);
		System.out.print("\n\t\t\tEnter New Admin Password : ");
		char[] ch = es.next().toCharArray();
		String k = new String(ch);
		System.out.print("\n\t\t\tPlease Re-enter Password for Confirmation : ");
		char[] chc = es.next().toCharArray();
		String kc = new String(chc);
		while(k.equals(kc)!=true)
		{
			System.out.print("\n----------------------------------------------------------------------------\n");
			System.out.print("\n\t\t\tPlease Re-enter the correct Password for Confirmation : ");
			chc = es.next().toCharArray();
			kc = new String(chc);
			System.out.print("\n----------------------------------------------------------------------------\n");
		}
		adpwd.add(kc);
		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("\t\t\t !! New Admin has been Successfully Added !!");
		System.out.print("\n\t\t Details are , \n\t Admin : "+name+" \n\t Password : "+k);
		System.out.print("\n----------------------------------------------------------------------------\n");
		
		
	}
	void displayAdmin()
	{
		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("                  Administrators Registered are as Follows :");
        System.out.print("\n----------------------------------------------------------------------------\n");
		
		int i =0;
		while(i<adid.size())
		{
			System.out.print("\n\t\t"+(i+1)+"."+adid.get(i));
			i++;
		}
		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("----------------------------------------------------------------------------\n");
	}
	void newValue()
	{
		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("                     Value Addition UI");
        System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("\t\tSelect a Choice for New Addition");
		System.out.print("\n\t\t\t 1. City \n\t\t\t 2.Event \n\t\t\t 3.New Dates (Enter as Date-Month-Year)");
		System.out.print("\n\n\t\tEnter Number of Respective Choice : ");
		int nc = es.nextInt();
		es.nextLine();
		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("\n\t\t Enter New  Value for Addition : ");
		String n = new String();
		if(nc == 1 || nc == 2)
		{
			
			n = es.next();
		}
		else
		{
			char[] getval = es.next().toCharArray();
			n = new String(getval);
		}
		System.out.print("\n----------------------------------------------------------------------------\n");
		
		
		
		
		switch(nc)
		{
			case 1:ctys.add(n);break;
			case 2:evts.add(n);break;
			case 3:evtDt.add(n);break;
			default:
			{ 
			System.out.print("\n----------------------------------------------------------------------------\n");
			System.out.println(" !!    Choice Is Invalid . Please Re-Enter  !! "); newValue();
			System.out.print("\n----------------------------------------------------------------------------\n");
			break;
			}
		}	
	}
	void delValue()
	{
		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("                     Value Deletion UI");
        System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.println("Select a Choice for Deletion");
		System.out.print("\n\t\t\t 1. City \n\t\t\t 2.Event \n\t\t\t 3. Event Date");
		System.out.print("\n\n\t\tEnter Number of Respective Choice : ");
		int nc = es.nextInt();
		es.nextLine();
		int lim =0;

		switch (nc) 
		{
			case 1:
				displayCList();
				lim = ctys.size();
				break;

			case 2:
				displayEList();
				lim  = evts.size();
				break;
			case 3:
				displayDList();
				lim = evtDt.size();
				break;
			default:
			System.out.print("\n----------------------------------------------------------------------------\n");
			System.out.println("                 Choice Is Invalid . Please Re-Enter");newValue();
			System.out.print("\n----------------------------------------------------------------------------\n");
			break;			
		}

			System.out.print("\n----------------------------------------------------------------------------\n");
        	System.out.print("\t\tEnter Number of Respective Choice : ");
			int r = es.nextInt();
			System.out.print("\n----------------------------------------------------------------------------\n");
		

		if(r>lim || r<0)
		{
			System.out.print("\n----------------------------------------------------------------------------\n");
        	System.out.print("\t\t\t Please Enter a Valid Choice Number \n");
			System.out.print("\t\t\t Re-enter the Value : ");
			r = es.nextInt();
			es.nextLine();
			System.out.print("\n----------------------------------------------------------------------------\n");
			
		}
		switch(nc)
		{
			case 1:ctys.remove(r-1);break;
			case 2:evts.remove(r-1);break;
			case 3:evtDt.remove(r-1);break;
			default: 
			System.out.print("\n----------------------------------------------------------------------------\n");
			System.out.println("                 Choice Is Invalid . Please Re-Enter"); newValue();
			System.out.print("\n----------------------------------------------------------------------------\n");
			break;

			
		}	
	}
	void profilechange()
	{
		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("                     Profile Change Menu");
        System.out.print("\n----------------------------------------------------------------------------\n");
		
		System.out.print("\n\t\t\t What would you like to change : \n\t\t1.UserName \n\t\t2.Password \n");
		System.out.print("\t\tEnter Your Choice : ");
		int kc = es.nextInt();
		es.nextLine();

		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("----------------------------------------------------------------------------\n");
		
		switch(kc)
		{
			case 2:
			{
				System.out.print("\n----------------------------------------------------------------------------\n");
        		System.out.print("                     Password Change UI");
        		System.out.print("\n----------------------------------------------------------------------------\n");
		
				System.out.print("\n\t\t Please Enter Your AdminName : ");
				String adnme = es.next();
				System.out.print("\n\t\t Enter Your Old Password :");
				char[] chpwd = es.next().toCharArray();
				String chcpwd = new String(chpwd);
				System.out.print("\n\t\t Enter Your New Password : ");
				char[] nchpwd = es.next().toCharArray();
				String nchcpwd =  new String(nchpwd);
				System.out.print("\n----------------------------------------------------------------------------\n");
				System.out.print("----------------------------------------------------------------------------\n");
		
				if(adid.contains(adnme)==true && adpwd.contains(chcpwd) == true)
				{
						for(int j=0;j<adpwd.size();j++)
						{
						 String p = adpwd.get(j);
						if(p.equals(chcpwd) == true )
						{
							adpwd.set(j,nchcpwd);
							System.out.print("\n----------------------------------------------------------------------------\n");
        					System.out.println("\t\t New Password has been Set ");
        					System.out.print("\n----------------------------------------------------------------------------\n");
		
							
						}
					}
				}
				else
				{
					System.out.print("\n----------------------------------------------------------------------------\n");
					System.out.print("\t\t Enter a Valid AdminId and Password");
					System.out.print("\n----------------------------------------------------------------------------\n");
					profilechange();
				}break;
				
			}
			case 1:
			{
				System.out.print("\n----------------------------------------------------------------------------\n");
				System.out.print("\t\t Admin UserName Change UI");
				System.out.print("\n----------------------------------------------------------------------------\n");
				
				System.out.print("\n\t\t Enter Your Old AdminName : ");
				String oid = es.next();
				System.out.print("\n\t\t Enter Your New Adminname : ");
				String nid = es.next();

				System.out.print("\n----------------------------------------------------------------------------\n");
				System.out.print("\n----------------------------------------------------------------------------\n");
					

				if(adid.contains(oid))
				{
						for(int j=0;j<adid.size();j++)
					{
						String p = adid.get(j);
						if(p.equals(oid) == true )
						{
							adid.set(j,nid);
							System.out.print("\n----------------------------------------------------------------------------\n");
							System.out.print("\t\t New UserName has been Set \t");
							System.out.print("\n----------------------------------------------------------------------------\n");

							
						}
					}
				}
				else
				{
					
					System.out.print("\n----------------------------------------------------------------------------\n");
					System.out.println("Enter a Valid AdminId");
					profilechange();
					System.out.print("\n----------------------------------------------------------------------------\n");
							
					
				}
				
				break;
			}
			default:
			{
				System.out.print("\n----------------------------------------------------------------------------\n");
				System.out.println("                  Choice Is Invalid . Please Re-Enter");newValue();
				System.out.print("\n----------------------------------------------------------------------------\n");
				break;
			}

		}
						
		
	}
}
class userLog extends adminlog
{
	void UserInfo()
	{
		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("                     Enter Your USER Information");
        System.out.print("\n----------------------------------------------------------------------------\n");
		
		System.out.print("\n\t\t Enter Your Name : ");
		String nme = es.next();
		userName.add(nme);
		System.out.print("\n\t\t Enter Your User ID : ");
		char[] usid = es.next().toCharArray();
		String uidstr =new String(usid);
		System.out.print("\n\t\t Enter Your Email ID : ");
		char[] emid = es.next().toCharArray();
		String emdstr =new String(emid);
		emailID.add(emdstr);
		userID.add(uidstr);
		tickid.add(rand.nextInt(10000));
		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("----------------------------------------------------------------------------\n");
		
		
		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("\n\t\t How Many tickets would you like to Buy ? \n\n\t\t !! (We have limited ticket Booking Limit to 10 only) !! \n\n\t\t Enter Ticket Quantity : ");
		int tno = es.nextInt();
		es.nextLine();
		System.out.print("\n----------------------------------------------------------------------------\n");
		
		if(tno>10 || tno<0)
		{
			System.out.print("\n----------------------------------------------------------------------------\n");
			System.out.print("\n\t\t Please choose tickets between 1 and 10 : ");
			tno = es.nextInt();
			es.nextLine();
			System.out.print("\n----------------------------------------------------------------------------\n");
		}
		tickets.add(tno);
		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("----------------------------------------------------------------------------\n");
		
	}
	void UserChoiceInfo()
	{
		
		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("                     City Choice  Option");
        System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("\n\t\t\tWhich City Would You Like to Visit ? ");
		displayCList();
		System.out.print("\n\t\tEnter the number corresponding to your City : ");
		ScanCC();
		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("----------------------------------------------------------------------------\n");
				

		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("                     Event Choice  Option");
        System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("\n\t\t\tWhich Event would you like to Attend ? ");
		displayEList();
		System.out.print("\n\t\tEnter the number corresponding to the Event : ");
		ScanEC();
		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("----------------------------------------------------------------------------\n");

		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("                     Date Choice  Option");
        System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("\n\t\t\tOn Which Date Would You Like to Visit ? ");
		displayDList();
		System.out.print("\n\t\tEnter the number corresponding to your Desired Date : ");
		ScanDC();

		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("----------------------------------------------------------------------------\n");
		
		


                        
	}
	void setPayInfo()
	{
		int otp = rand.nextInt(999999999);
		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("                     Payment-Mode Choice  Option");
        System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("\n\t\tWhich Payment Option would you like to Choose : ");
		System.out.print("\n\t\t\t1.Cash at Counter \n\t\t\t2.Debit/Credit Card \n\t\t\t3.UPI payment \n");
		System.out.print("\t\tEnter Your Choice : ");
		int co = es.nextInt();
		es.nextLine();
		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("----------------------------------------------------------------------------\n");
		switch(co)
		{
			case 1: 
			{
				paymode.add("Cash at Counter");
				otpcfrm.add(otp);
				break;
			}
			case 2:
			{
				paymode.add("Debit/Credit Card");
				otpcfrm.add(otp);
				break;
				
			}
			case 3:
			{
				paymode.add("PI Payment");
				otpcfrm.add(otp);
				break;
			}
		}
	}
}
class TicBookInser extends userLog
{
	void PrintBill( int rcdIn)
	{
		System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("                     Your Ticket Details");
        System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("\n\t\t\t Name           : " + userName.get(rcdIn));
		System.out.print("\n\t\t\t User ID    	  : " + userID.get(rcdIn));
		System.out.print("\n\t\t\t Email ID    	  : " + emailID.get(rcdIn));
		System.out.print("\n\t\t\t Tracking id    : " + tickid.get(rcdIn));

		System.out.print("\n\t\t\t Payment Method : " + paymode.get(rcdIn));
		System.out.print("\n\t\t\t OTP            : " + otpcfrm.get(rcdIn));
		
		System.out.print("\n\t\t\t No. of Tickets : " + tickets.get(rcdIn));
		System.out.print("\n\t\t\t City           : " + selCity.get(rcdIn));
		System.out.print("\n\t\t\t Event          : " + selEvent.get(rcdIn));
		System.out.print("\n\t\t\t Event Date     : " + selDate.get(rcdIn));
		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("----------------------------------------------------------------------------\n");
	}
	void UserBReview()
	{
		if(userID.size() == 0)
		{
		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("                     There are 0 Bookings Done\n");
		System.out.print("             Please Book Your ticket and Return to Review it");
        System.out.print("\n----------------------------------------------------------------------------\n");
		}
		else
		{
			System.out.print("\n----------------------------------------------------------------------------\n");
			System.out.print("                     Booking Review  Option");
			System.out.print("\n----------------------------------------------------------------------------\n");
			System.out.print("\n\t\tHow would you like to Review your Booking ?");
			System.out.print("\n\t\t 1. Review All my Bookings \n\t\t 2.Review a Single Booking \n");
			System.out.println("Enter Your Choice : ");
			int k = es.nextInt();
			es.nextLine();
			System.out.print("\n----------------------------------------------------------------------------\n");
			switch(k)
			{
				case 2 :
				{
				System.out.print("\n----------------------------------------------------------------------------\n");
				System.out.print("\t Enter your Tracking ID to review your ticket : ");
				int checkID=es.nextInt();
				System.out.print("\n----------------------------------------------------------------------------\n");
				for(int j=0;j<tickid.size();j++)
					{
						if(tickid.get(j) == checkID)
							{
								System.out.println();
								PrintBill(j);
								System.out.println();
						}
					}
					break;
				}
				case 1 :
				{
				System.out.print("\n----------------------------------------------------------------------------\n");
				System.out.print("\t Enter your User ID to review all of your ticket : ");
				char[] checkID=es.next().toCharArray();
				System.out.print("\n----------------------------------------------------------------------------\n");
				String m = new String(checkID);
					for(int j=0;j<tickid.size();j++)
						{
							String l = userID.get(j);
							if( l.equals(m)==true)
							{
								System.out.println();
					
								PrintBill(j);
								System.out.println();
							}
						}
					break;
				}
			}
		}
	}
	void BillMsg()
	{
		System.out.print("\n----------------------------------------------------------------------------\n");	
		System.out.print("\t\t !! Thank You for Booking with us !!");
		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("\t\t !! You will shortly recieve a mail !!");
		System.out.print("\n\t\t !! on your Registerd Email ID with !!");
		System.out.print("\n\t\t !! with Details of Payment Process !!");
		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("\n\t\t !!    **You are supposed to Enter   !!");
		System.out.print("\n\t\t !!    the Following Generated OTP   !!");
		System.out.print("\n\t\t !! to confirm your booking when You !!");
		System.out.print("\n\t\t !!    pay via the Payment Gateway** !!");
		System.out.print("\n\t\t !!  (In Case of Online Modes ONLY ) !!");
		System.out.print("\n          !! AS for Cash ,  provide the cashier with this OTP !!");
		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("----------------------------------------------------------------------------\n");
	}
}

class EventBMSMain
{
	public static void main(String[] args) 
	{

			TicBookInser InstanceRecord = new TicBookInser();
			Scanner sca = new Scanner(System.in);  
			 boolean end = false;
	
	System.out.print("\n----------------------------------------------------------------------------\n");
	System.out.print("                           OOP INNOVATIVE ASSIGNMENT "                    );
	System.out.print("\n----------------------------------------------------------------------------");
	System.out.print("\n----------------------------------------------------------------------------\n");
	System.out.print("                          Welcome to Event Booking System"                    );
	System.out.print("\n----------------------------------------------------------------------------\n");
	
	System.out.print("    Developers :                                            \n");
	System.out.print("                   Rushir Bhavsar : 19bce229                \n");
	System.out.print("                   Hrishi Thacker : 19bce274                \n");
	System.out.print("                   Somya  Thacker : 19bce268                \n"); 
			 
	do{
			 int choice;
			 
			System.out.print("\n----------------------------------------------------------------------------\n");
			System.out.print("                            Event Booking :  MAIN MENU"                    );
			System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("\t\t\tLog in as:\n");
        System.out.print(" \n\t\t 1. ADMIN \n\n\t\t 2. USER \n\n\t\t 0. EXIT");
        System.out.print("\n----------------------------------------------------------------------------\n");
        System.out.print("\n----------------------------------------------------------------------------\n\n");
        System.out.print("\n!! 				Enter Login Choice : ");
		choice = sca.nextInt();
		if(choice>2 || choice<0 )
		{
			System.out.print("\n\t !!  Please Enter a valid Choice : ");
			choice=sca.nextInt();
			sca.nextLine();
		}
        switch(choice)
        {
                case 1:
                {
                    System.out.print("\n----------------------------------------------------------------------------\n");
                    System.out.print("                     Welcome ADMIN"                    );
                    System.out.print("\n----------------------------------------------------------------------------\n");
                    String name = new String();
                    
                    System.out.print("\n Enter Username : ");
                    name = sca.next();
                    System.out.print("\n Enter  Password : ");
                    char[] pwdch = sca.next().toCharArray();
                    String pwd = new String(pwdch);
                    Boolean found = InstanceRecord.confirmDetails(name,pwd);
                    if(found== true)
                    {
                        do
                        {
                            
                            System.out.print("\n---------------------------------------------\n");
                            System.out.print("                   Admin Menu                    ");
                            System.out.print("\n---------------------------------------------\n");
                            System.out.print("\n\t1. Generate Record Document\n\t");
                            System.out.print("2. Add New CITY / EVENT / DATE \n\t3. Delete existing CITY / EVENT / DATE");
                            System.out.print("\n\t4. Admin Profile Settings \n\t0. Return to Main Menu \n\n\t");
                            System.out.print("Choice:\t");
                            choice = sca.nextInt();
							if(choice>5 || choice<0 )
							{
								System.out.print("\n\t !!  Please Enter a valid choice : ");
								choice=sca.nextInt();
								sca.nextLine();
							}
                            switch(choice)
                                {
                                    case 0:  break;
                                    case 1: 
                                            System.out.println("Document Generated has been Mailed To Your REgistererd Admin MailID");
                                            break;

                                    case 2: 
                                            InstanceRecord.newValue();
                                            break;

                                    case 3: 
                                            
			                                InstanceRecord.delValue();
                                            break;

                                    case 4:
                                    {    
                                        do{

                                                System.out.print("\n---------------------------------------------\n");
                                                System.out.print("              PROFILE SETTINGS                   ");
                                                System.out.print("\n---------------------------------------------\n");
                                                System.out.print("\n\t1. Add New Admin \n\t");
                                                System.out.print("2. Change Username or Password");
                                                System.out.print("\n\t3. Delete Admin \n\t4. Display Registered Admins \n\t0. EXIT \n\n\t");
                                                System.out.print("Choice:\t");
												int choice1 = sca.nextInt();
												if(choice1>4 || choice1<0 )
												{
													System.out.print("\n\t !!  Please Enter a valid Choice : ");
													choice1=sca.nextInt();
													sca.nextLine();
												}
                                                switch(choice1)
                                                {
                                                    case 1: 
                                                            InstanceRecord.newAdmin();
                                                            InstanceRecord.displayAdmin();
                                                            break;

                                                    case 2:
                                                           
                                                            InstanceRecord.profilechange();
                                                            InstanceRecord.displayAdmin();
                                                           break;

                                                    case 3:
                                                           /*delete_admin();
                                                           display_admin();*/
                                                           break;

                                                    case 4:
                                                           
                                                        InstanceRecord.displayAdmin();
                                                        break;

                                                    case 0:
                                                           break;

                                                }
                                                System.out.print("\n----------------------------------------------------------------------------\n");
                                                System.out.print("\n\tWant to Continue back to [Profile Setting] (1.Yes / 2.No ):\t");
								int k = sca.nextInt();
								sca.nextLine();
									if(k>3 || k<1 )
									{
										System.out.print("\n\t !!  Please Enter a valid number : ");
										k=sca.nextInt();
										sca.nextLine();
									}

                                    if(k==2)
                                    {
                                    break;
                                    }

                                           }
                                           while(true);
                                        
                                    }

                                }
                                System.out.print("\n----------------------------------------------------------------------------\n");
                                System.out.print("\n\tWant to Continue back to [Admin Menu] (1.Yes / 2.No ):\t");
								int k = sca.nextInt();
								sca.nextLine();
								if(k>3 || k<1 )
									{
										System.out.print("\n\t !!  Please Enter a valid number : ");
										k=sca.nextInt();
										sca.nextLine();
									}

                                    if(k==2)
                                    {
                                    break;
                                    }
                            }
                            while(true);

                    }
                    else
                    {
                        
                        System.out.print("\n\n\n\t!! INVALID CREDENTIALS ...... Enter Correct Username And Password !!\n\n");
                    }
                    break;
                }
				
				case 2:
                {
                    do
                    {
                            int choice1;
							
							
                            System.out.print("\n---------------------------------------------\n");
                            System.out.print("                 USER Menu                      ");
                            System.out.print("\n---------------------------------------------\n");
                            System.out.print("\n\t1. Book ticket\n\t");
							System.out.print("\n\t2. Review Ticket\n\t");
							System.out.print("\n\t3. Event , City and Date Details \n\t");
                            System.out.print("\n\t0. Exit\n\t");
                            System.out.print("\nChoice:\t");
							choice1 = sca.nextInt();
							sca.nextLine();
							if(choice1>3 || choice1<0 )
							{
								System.out.print("\n\t !!  Please Enter a valid number : ");
								choice1=sca.nextInt();
								sca.nextLine();
							}
                            switch(choice1)
                            {
                                case 0: break;
                                case 1:
                                    {
                                        System.out.print("\n----------------------------------------------------------------------------\n");
                                        System.out.print("                     Ticket Booking"                    );
                                        System.out.print("\n----------------------------------------------------------------------------\n");
                                        InstanceRecord.UserInfo();
						                InstanceRecord.UserChoiceInfo();
										InstanceRecord.setPayInfo();
										InstanceRecord.BillMsg();

										int m = InstanceRecord.tickid.size();
										int n = InstanceRecord.otpcfrm.size();
										System.out.print("\n\t Your Tracking ID is : "+InstanceRecord.tickid.get(m-1)+" ");
										System.out.print("\t Your OTP : "+InstanceRecord.otpcfrm.get(n-1));
										
										System.out.print("\n----------------------------------------------------------------------------\n");
                                        System.out.print("----------------------------------------------------------------------------\n");
                                        break;
                                    }
                                case 2:
                                    {    
                                        System.out.print("\n----------------------------------------------------------------------------\n");
                                        System.out.print("                     Ticket Booking Review"                    );
                                        System.out.print("\n----------------------------------------------------------------------------\n");
                                        InstanceRecord.UserBReview();
                                        break;
                                    }
                                case 3: 
										
								System.out.print("\n||------------------------------------------------------------------------------------||\n");
								System.out.print("||        We Have Planned a Sophisticated App for much Better User Experience         ||\n");
								System.out.print("||         Many more Features and Choices will made Available on the New App          ||\n");
								System.out.print("|| This Feature will be made Available in the App !! . We Thank You for Your Patience ||\n");
								System.out.print("||----------------------------------------------------------------------------------- ||\n");

										break;
                            }
                            System.out.print("\n----------------------------------------------------------------------------\n");
                            System.out.print("\n\tWant to Continue[User Menu] (1.Yes / 2.No ):\t");
								int k = sca.nextInt();
								sca.nextLine();
								
								if(k>2 || k<0 )
								{
									System.out.print("\n\t !!  Please Enter a valid number : ");
									k= sca.nextInt();
									sca.nextLine();
								}
                                    if(k==2)
                                    {
                                    break;
                                    }
                                

						}while(true);
						
						System.out.print("\n\tWant to Continue back to [Main Menu] (1.Yes / 2.No ):\t");
						int k = sca.nextInt();
						sca.nextLine();
						if(k>3 || k<1 )
						{
							System.out.print("\n\t !!  Please Enter a valid number : ");
							k=sca.nextInt();
							sca.nextLine();
						}
                        if(k==2)
                        {
                        break;
						}
						break;
                        
                }

                    

                case 0: 
                {
                   	System.exit(0);
                   	end=true;
                	break;
                }
            }

        }while(end==false);
		sca.close();
	}
	
}
