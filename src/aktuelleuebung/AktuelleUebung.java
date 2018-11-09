package aktuelleuebung;

import java.util.Scanner;

public class AktuelleUebung
{

    public static void main( String[] args )
    {
        lottozahlen();
    }

    private static void lottozahlen()
    {
        int[] zahlen = new int[ 6 ]; // gezogene Zahlen
        int neueZahl;

        for ( int i = 0; i < 6; i++ )
        {
            do
            {
                neueZahl = ( int ) ( Math.random() * 49 ) + 1;
            } while ( vorhanden( neueZahl, zahlen ) );

            zahlen[ i ] = neueZahl;
        }

        bubbleSort( zahlen );

        for ( int i = 0; i < 6; i++ )
            System.out.print( zahlen[ i ] + " " );
    }

    private static boolean vorhanden( int neueZahl, int[] zahlen )
    {
        for ( int i = 0; i < zahlen.length; i++ )
            if ( neueZahl == zahlen[ i ] )
                return true;
        return false;
    }

    private static int[] bubbleSort( int[] zahlen )
    {
        boolean swapped;
        int zwischenspeicher;
        int n = zahlen.length;
        do
        {
            swapped = false;
            for ( int i = 0; i < n - 1; i++ )
                if ( zahlen[ i ] > zahlen[ i + 1 ] )
                {
                    zahlen = vertausche( zahlen, i, i + 1 );
                    swapped = true;
                }
            n--;
        } while ( swapped );

        return zahlen;
    }

    private static int[] vertausche( int[] zahlen, int a, int b )
    {
        int zwischenspeicher = zahlen[ a ];
        zahlen[ a ] = zahlen[ b ];
        zahlen[ b ] = zwischenspeicher;
        return zahlen;
    }

}
