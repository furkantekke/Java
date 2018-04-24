package prototip1;
import java.util.Scanner;
public class ikincikatartoplam {
    private int toplam2 = 0;
     public ikincikatartoplam(){
        
    Scanner girdi = new Scanner(System.in);
     String ikincikatar ;
    System.out.println("İkinci sayıyı roma rakamı olarak giriniz: "); ikincikatar=girdi.next();
            

     String newNumeral = ikincikatar.replace("XL", "XXXX"); 

     String newNumeral2 = newNumeral.replace("XC", "LXXXX");

     String newNumeral3 = newNumeral2.replace("CD", "CCCC"); 

     String newNumeral4 = newNumeral3.replace("CM", "DCCCC");

     String newNumeral5 = newNumeral4.replace("IV", "IIII"); 

     String newNumeral6 = newNumeral5.replace("IX", "VIIII");

    

     char romanNumeral = 0; 

     int length = newNumeral6.length();

    for (int n = 0; n< length; n++)

     {
        romanNumeral = newNumeral6.charAt(n);
      
        if ( romanNumeral == 'M'){toplam2+=1000; }
      
      if ( romanNumeral == 'D'){toplam2+=500;}
      
      if ( romanNumeral == 'C'){toplam2+=100; }

       if ( romanNumeral == 'L'){ toplam2+=50; }

       if ( romanNumeral == 'X'){toplam2+=10; }

       if ( romanNumeral == 'V'){toplam2+=5; }

       if ( romanNumeral == 'I'){toplam2+=1; }

     }
 
}
  public Integer gettoplam(){
return toplam2;
}  
}
