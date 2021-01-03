import java.util.*;
public class Person {
   
    String svar = new String();
    Scanner sc = new Scanner(System.in);
    //int count = 0;
    int num;
    //String[] kort = new String[52];
    String nummer;
    int personKort;
    //Här skapar vi metoden person() 
    public int person(String[] kort,int count)
    {System.out.println("Valkomen till kortspel!!!");
        svar = "j";
//Har användar vi while loop som ska förtsätta 
//till användaren ska välja j eller J
//om användaren tryck på andra ord loop ska inte förtsätta
while(svar.equals("j")||svar.equals("J"))
{System.out.println("Ska du dra ut kort? j/n");
svar = sc.nextLine();
//if else för att kolla på vad användaren har trycka på
//om användaren välja "j" eller "J" då ska vi förtsätta
if(svar.equals("j")||svar.equals("J")){
System.out.println("Vi ska försätta");
   System.out.println(kort[count]);
//for loop för att hitta kort nummer
//vi ska börja från 13 till 1 för att
//vi använder contains() metoden som ska kolla 
//om det finns char mellan 13 till 1 och om vi börjar vi 
//från 1 till 13 det finns möjlighet att vi fick mer än en resultat 
//till exempel för 13 vi vil ha svar resultat 1, 3 och 13 
   for(int i=13; i>0;i--)
   {    nummer = String.valueOf(i);
       if(kort[count].contains(nummer))
       {
//här summan vi alla användarens kort nummer
        personKort +=i; 
        break;}
    }
    System.out.println("Summan av användarens kort är "+personKort);     
//if else loop som ska kolla om användarens kort 
//summan är mer än 21 då sluta utförs program  
    if(personKort>20){break;}
   }count++;
   }
   return count;
    }
//metoden som return användarens kort summ
    public int getPersonKort()
    {return personKort;}
}
