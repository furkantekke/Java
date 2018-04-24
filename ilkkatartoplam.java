package prototip1;
import java.util.Scanner;
public class ilkkatartoplam {
    private int toplam1 = 0;
    public ilkkatartoplam(){
        
    Scanner girdi = new Scanner(System.in);
     String ilkkatar ;
    System.out.println("İlk sayıyı roma rakamı olarak giriniz: "); ilkkatar=girdi.next();
            

     String newNumeral = ilkkatar.replace("XL", "XXXX"); 

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
      
        if ( romanNumeral == 'M'){toplam1+=1000; }
      
      if ( romanNumeral == 'D'){toplam1+=500;}
      
      if ( romanNumeral == 'C'){toplam1+=100; }

       if ( romanNumeral == 'L'){ toplam1+=50; }

       if ( romanNumeral == 'X'){toplam1+=10; }

       if ( romanNumeral == 'V'){toplam1+=5; }

       if ( romanNumeral == 'I'){toplam1+=1; }

     }
 
}
public Integer gettoplam(){
return toplam1;
}

}
