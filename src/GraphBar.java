import java.util.Scanner;

public class GraphBar
{
    private int A;
    private int B;
    private int C;
    private int D;
    private int F;
    private int counter;
    private int aPercentage, bPercentage, cPercentage, dPercentage, fPercentage;
    private int iCounter = 10;
    private int cCounter = 10;
    int i,a,b,c,d,x,y;


    Scanner keyboard = new Scanner(System.in);

    public void display()
    {
        System.out.println("Enter numbers for each of the letter grade");
        System.out.println("Enter for A");
        A = keyboard.nextInt();
        System.out.println("Enter for B");
        B = keyboard.nextInt();
        System.out.println("Enter for C");
        C = keyboard.nextInt();
        System.out.println("Enter for D");
        D = keyboard.nextInt();
        System.out.println("Enter for F");
        F = keyboard.nextInt();
        counter = A+B+C+D+F;
        aPercentage = (A/counter)*100;
        bPercentage = (B/counter)*100;
        cPercentage = (C/counter)*100;
        dPercentage = (D/counter)*100;
        fPercentage = (F/counter)*100;

        System.out.println("0"+"     "+"10"+"     "+"20"+"     "+"30"+"     "+"40"+"     "+"50");
        System.out.println("|"+"      " +"|"+"     "+"|"+"      "+"|"+"       "+"|"+"      "+"|");
        while( i <= 40)
        {
            System.out.print("*");
            i++;
        }

        for(b = 0; b<aPercentage; b++)
        {
            System.out.println("*  " + 'A');
        }
        for(c = 0; c<bPercentage; c++) {
            System.out.println("*  " + 'B');
        }
        for(d = 0; d<cPercentage; d++) {
            System.out.println("*  " + 'C');
        }
        for(x = 0; x<dPercentage; x++) {
            System.out.println("*  " + 'D');
        }
        for(y = 0; y<fPercentage; y++) {
            System.out.println("*  " + 'F');
        }

    }
}
