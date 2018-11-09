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
        int[] zahlen = new int[ 6 ];
        int[] reihenfolge =
        {
            50, 50, 50, 50, 50, 50
        };
        int pos = -1;
        int neueZahl;

        for ( int i = 0; i < 6; i++ )
        {
            do
            {
                neueZahl = ( int ) ( Math.random() * 49 ) + 1;
            } while ( vorhanden( neueZahl, zahlen ) );

            zahlen[ i ] = neueZahl;
        }

        for ( int i = 0; i < 6; i++ )
        {
            for ( int j = 0; j < 6; j++ )
                if ( zahlen[ j ] < reihenfolge[ i ] )
                {
                    reihenfolge[ i ] = zahlen[ j ];
                    pos = j;
                }
            zahlen[ pos ] = 50;
        }

        for ( int i = 0; i < 6; i++ )
            System.out.print( reihenfolge[ i ] + " " );
    }

    private static boolean vorhanden( int neueZahl, int[] zahlen )
    {
        for ( int i = 0; i < zahlen.length; i++ )
            if ( neueZahl == zahlen[ i ] )
                return true;
        return false;
    }

}
