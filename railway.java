import java.util.Scanner;

interface calc
{ 
  public int sfinder(String a);
  public int diff(int a,int b);
  public int fare(int a,int b,int c);
  public int doubler(int a,int b);
}

class calculator implements calc 
{
 public int sfinder(String s)
 {
 s.toLowerCase();
 s.trim();
 switch(s)
 {
   case "virar":
    return 60;
   case "nalllasopara":
    return 56;
   case "vasai rd":
   case "vasai":
    return 52;
   case "naigoan":
    return 48;
   case "bhayander":
    return 44;
   case "mira rd":
    return 40;
   case "dahisar":
    return 37;
   case "borivali":
    return 34;
   case "kandivali":
    return 32;
   case "malad":
    return 30;
   case "goregoan":
    return 27;
   case "jogeshwari":
    return 24;
   case "andheri":
    return 22;
   case "vile parle":
    return 20;
   case "santacruz":
    return 18;
  case "khar rd":
    return 17;
  case "bandra":
    return 15;
  case "mahim jn":
  case "mahim":
    return 13;
  case "matunga rd":
  case "matunga":
    return 12;
  case "dadar":
    return 11;
  case "elphinstone":
    return 9;
  case "lower parel":
    return 8;
  case "mahalaxmi":
    return 6;
  case "mumbai central":
    return 5;
  case "grant rd":
  case "grant road":
    return 4;
  case "charni rd":
  case "charni road":
    return 3;
 case "marine lines":
 case "marinelines":
    return 2;
 case "churchgate":
    return 0;
 default:
  System.out.println("ERROR:Invalid Station Name.");  
  System.out.println("Refer table below for valid Station Names");
    return -1;
  }
 }
 public int diff(int a,int b)
 {
	if(a>b)
   return a-b;
        else
   return b-a;
 }
 public int fare(int n,int m,int d)
 {
  if(d<=0)
   System.out.println("Error");
  if(n==2) //class
  {
   if(m==1) //age
    {
     if(d<=10)
      return 5;
     else if(d<37&d>10)
      return 10;
     else
      return 15;
    }
   else
    {
     if(d<=10)
      return 3;
     else if(d<37&d>10)
      return 5;
     else
      return 8;
    }
  }
  else
  {
   if(m==1)
    {
     if(d<=10)
      return 45;
     else if(d<37&d>10)
      return 90;
     else
      return 15*9;
    }
   else
    {
     if(d<=10)
      return 3*9;
     else if(d<37&d>10)
      return 5*9;
     else
      return 8*9;
    }
  }
 }
  public int doubler(int a,int b)
  {
   return (a*b);
  }
}

class printer extends data
{
void printTicket()
 {
  System.out.println("Ticket:");
  System.out.println("Source      :"+s);
  System.out.println("Destination :"+d);
  System.out.print("Age Group   :");
  if(m==1)
  System.out.println("Adult");
  else
  System.out.println("Child");
  System.out.print("Class       :");
  if(n==1)
  System.out.println("First Class");
  else
  System.out.println("Second Class");
  System.out.print("Journey Type:");
  if(j==1)
  System.out.println("Single");
  else
  System.out.println("Return");
  System.out.println("Fare        :Rs."+finfare); 
 }
}

class data
{
 String s,d;
 int n,m,j,finfare;
 void set(String s,String d,int n,int m,int j,int finfare)
 {
  this.s=s;
  this.d=d;
  this.n=n;
  this.m=m;
  this.j=j;
  this.finfare=finfare;
 }
}



class railway
{
 public static void main(String args[])
 {
  try
  {
  String s,d;
  int n,m,j,ch;
  int diffn,a,b;
  int f,finfare;
  Scanner sc=new Scanner(System.in);
  System.out.println("Welcome!");
  System.out.println(" SOURCE STATION AND DESTINATION STATION\n\n");
System.out.println(" VIRAR     \t\t\t CHRUCHGATE");
System.out.println(" NALASOPARA\t\t\t MARINE LINES");
System.out.println(" VASAI     \t\t\t CHARNI ROAD");
System.out.println(" NAIGOAN   \t\t\t GRANT ROAD");
System.out.println(" MIRA ROAD \t\t\t MUMBAI CENTRAL");
System.out.println(" DIASAR    \t\t\t MAHALAKSHMI");
System.out.println(" BORIVALI  \t\t\t LOWER PAREL");
System.out.println(" KANDIVALI \t\t\t ELPHINSTONE");
System.out.println(" MALAD     \t\t\t DADAR");
System.out.println(" GOREGOAN  \t\t\t MATUNGA");
System.out.println(" JOGESHWARI\t\t\t MAHIM");
System.out.println(" ANDHERI   \t\t\t BANDRA");
System.out.println(" VILE PARLE\t\t\t KHAR");
System.out.println(" SANTACRUZ \t\t\t SANTACRUZ");
System.out.println(" KHAR      \t\t\t VILE PAREL");
System.out.println(" BANDRA    \t\t\t ANDHERI");
System.out.println(" MAHIM     \t\t\t JOGESHWARI");
System.out.println(" MATUNGA   \t\t\t GOREGOAN");
System.out.println(" DADAR     \t\t\t MALAD");
System.out.println(" ELPHINSTONE\t\t\t KANDIVALI");
System.out.println(" LOWER PAREL\t\t\t BORIVALI");
System.out.println(" MAHALAKSHMI\t\t\t DAHISAR");
System.out.println(" MUMBAI CENTRAL\t\t\t MIRA ROAD");
System.out.println(" GRANT ROAD\t\t\t NAIGOAN");
System.out.println(" CHARNI ROAD\t\t\t VASAI");
System.out.println(" MARINE LINES\t\t\t NALASOPARA");
System.out.println(" CHURCHGATE\t\t\t VIRAR");
System.out.println("\n\n");
  while(true)
  {
  System.out.println("Enter Source");
  s=sc.next();
  System.out.println("Enter Destination");
  d=sc.next();
  System.out.println("Enter  Class: \n1 First class \n2 Second Class \nEnter 1 or 2");
  n=sc.nextInt();
  System.out.println("Enter Age Group: \n1 Adult \n2 Child \nEnter 1 or 2");
  m=sc.nextInt();
  System.out.println("Enter Type of journey: \n1 Single  \n2 Return \nEnter 1 or 2");
  j=sc.nextInt();
  calc c=new calculator();
  a=c.sfinder(s);
  b=c.sfinder(d);
  diffn=c.diff(a,b);
  f=c.fare(n,m,diffn);
  finfare=c.doubler(f,j);
  printer p=new printer();
  p.set(s,d,n,m,j,finfare);
  p.printTicket();
  System.out.println("Do you want to continue? \n1-YES \n2-NO");
  ch=sc.nextInt();
  if(ch==2)
   break;
  }
  }
  finally
  {
   System.out.println("Thank you for using!");
  }
 
}
} 


