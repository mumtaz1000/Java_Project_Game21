public class Dator {
    Kortlek dator = new Kortlek();
    int num;
    //String[] kort = new String[52];
    String nummer;
    int datorKort = 0;
    public void dator(String [] kort,int count,int pKort)
    {
//Har användar vi while loop som ska förtsätta 
//till summ av dators kort är mindre än 21 eller
//mindre och samma till användarens kort summan
        while(datorKort < 21 && datorKort <= pKort )
{System.out.println("Dator ska försätta");
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
       {System.out.println(nummer);
        datorKort +=i; 
    break;}}     
    System.out.println("Summan av dator kort är "+datorKort); 
    count++;
   }
//har kolla vi om dator korts summ är mer 21
//eller mindre än användaren då användaren vinn
//else dator vinn
   if(datorKort>21 || datorKort<pKort)
   {System.out.println("Användaren vinn!!!"); }
   else{System.out.println("Dator vinn!!");}
   }
    }
