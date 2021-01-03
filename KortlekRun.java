//import java.util.*;
    //filen heter KortlekRun.java
    public class KortlekRun {
        public static void main(final String[] args) {
    //Här skapar jag klassen Kortlek objekt 
    //som heter k
            Kortlek k = new Kortlek();
            String [] check= new String [52] ;
    //Här skapar jag klassen Person objekt 
    //som heter p
            Person p = new Person();
    //Här skapar jag klassen Dator objekt 
    //som heter d
            Dator d = new Dator(); 
            int ans;
            int pKort;
            System.out.println("Här skapar vi 52 olika kort.");
            k.skapaKort();
            for(int i=0;i<52;i++)
            {System.out.println(k.printKort(i));}
            System.out.println("Kort efter blanda.");
            k.blandaKort();
            for(int i=0;i<52;i++)
            {check[i]=k.printKort(i);
            System.out.println(check[i]);
            }
           ans = p.person(check,0);
           pKort = p.getPersonKort();
           if(pKort<=21)
           {d.dator(check,ans,pKort);}
           else
           {System.out.println("Dator vinn!");}
        }
       
    }