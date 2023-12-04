import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner tangentbord = new Scanner(System.in);
    double omkrets= cirkel(4.5);
    System.out.println(omkrets); 

    ritaLinje(1);
    System.out.println("rita rektangel");
    ritaRektangel(0, 0);
    tecken('3');
    siffra('0');


    
    }
    static boolean siffra (char tecken3)
    {
        char B = 'b';
        boolean svar = Character.isDigit(B);
        
        if (svar==true) {
            System.out.println(B+" är en siffra");
            return true;
        }
        else if (svar!=true) {
            System.out.println(B+" är en bokstav");
            return false;
        }
        return false;
    }
    static char tecken(int i)
    {
        char t='0';
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Ange ett positivt eller negativt tal ");
        double tal1 = tangentbord.nextInt();
        if(i==0)
        {
            return 0;
        }        
        else if (tal1>=0) {
            System.out.println("+");
            t= '+';
            i=0;
            
        }
        else if(tal1<0) {
            System.out.println("-");
            t= '-';
            i=0;
            
        }

        return t;
    }
    static void ritaRektangel(int a, int bc)
    {
        Scanner tangentbord = new Scanner(System.in);
        System.out.print("Ange bredd ");
        int abcd = tangentbord.nextInt();
        System.out.print("Ange höjd ");
        int abc=tangentbord.nextInt();
        for (int i =0;i<abc;i++)
        {
            System.out.println("");

            for (int j =0;j<abcd;j++) 
            {
                
            System.out.print("*");
            }
    }
    
    }
    static void ritaLinje(int b)
    {
        Scanner tangentbord = new Scanner(System.in);
        int varv = 0;
        System.out.println("hur många gånger ska den rita?");
        b = tangentbord.nextInt();
        while (b>varv) {
            varv++;
            System.out.print("-");  
        }
    }

    static double cirkel (double radie)
    {
        double omkrets = radie*2*3.14;
        
        
        return omkrets;
    }
}
