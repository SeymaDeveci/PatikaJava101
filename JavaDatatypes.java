
// HackerRank Java Datatypes Alıştırması

import java.util.Scanner;
public class JavaDatatypes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane değer girişi yapacaksınız: ");
        int t = input.nextInt();

        for(int i=0; i<t; i++)
        {
            try{
                long x = input.nextLong();
                System.out.println( x + " can be fitted in:");

                if(x>=-128 && x<=127)
                    System.out.println("* byte");

                if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                    System.out.println("* short");

                if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                    System.out.println("* int");

                if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(input.next()+" can't be fitted anywhere.");
            }
        }
    }
}
