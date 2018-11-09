package aktuelleuebung;

import java.util.Scanner;

public class AktuelleUebung
{

    public static void main( String[] args )
    {
        System.out.print( "Bitte geben Sie eine Zahl: " );
        Scanner sc = new Scanner( System.in );
        int i = sc.nextInt();

        System.out.println( hexadezimal( i ) );
        System.out.println( Integer.toHexString( i ) );

        System.out.println( binaer( i ) );
        System.out.println( Integer.toBinaryString( i ) );
    }

    private static String binaer( int i )
    {
        String zahl = "", ziffer = "";
        boolean firstNonZero = false;

        int gt = 4096;
        while ( gt > 0 )
        {
            ziffer = Integer.toString( i / gt );

            i -= gt * ( i / gt );
            gt /= 2;

            if ( ziffer.equals( "1" ) )
                firstNonZero = true;
            if ( firstNonZero )
                zahl += ziffer;
        }
        return zahl;

    }

    private static String hexadezimal( int i )
    {
        String zahl = "";
        char[] hexZiffern = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int gt = 4096;
        while ( gt > 0 )
        {           
            zahl += hexZiffern[ i / gt ];
            i -= gt * ( i / gt );
            gt /= 16;     
        }
        return zahl;

    }

}
