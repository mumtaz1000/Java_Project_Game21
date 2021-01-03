import java.util.*;

//filen heter Kortlek.java
//Har skapar jag en klass som heter Kortlek
public class Kortlek {
    //Klassen kortlek innehåller 3 fält av String 
    //datatype som heter färg, valör och kort
        String[] färg = { "Spader", "Hjärter", "Ruter", "Klöver" };
        String[] valör = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" };
        String[] kort = new String[52];
        String svar = new String();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int datorKort;
    // Metoden skapaKort() ska skapa 52 olika kortet
        public void skapaKort() {
    // här användar jag for loop 
    // som ska utförs för 52 gånger
            for (int i = 0; i < kort.length; i++) {
    // Här skapar kortet.
    // På grund av “i/13” färg index ska ökar inte
    // till i ska bli 13 och på grund av “i%13” vi ska 
    //ha valör index som ökar från 0 till 12 till i=13
               kort[i] = färg[i / 13] + valör[i % 13];
            }
        }
        // Metoden printKort() ska visa resultat
        // kort[] värde från 0 till 51
        public String printKort(int i) {
            
               return (kort[i]);
        }
     // Metoden blandaKort() ska blanda alla 52 kort
    // Vi ska ta två olika index av fält "kort[]" 
    // En random index och en index som for loop ska //skapas och ska byta båda två index värde
        public void blandaKort() {
    //Vi behöver två kortet för att blanda
    //här använder vi for loop 
    //så att vi ska välja våra första kort
            for (int i = 0; i < kort.length; i++) {
    //här använder vi random function 
    //för att välja andra kort
                int index = (int) (Math.random() * kort.length);
    // Här blanda vi två kort
                String temp = kort[i];
                kort[i] = kort[index];
                kort[index] = temp;
            }
        }    
       
   }
    
    

    
  
 
 

  
    