package aktuelleuebung;

public class AktuelleUebung
{

    public static void main( String[] args )
    {
        System.out.println( bitweise_addidition( 78, 1 ) );
    }

    private static int bitweise_addidition( int a, int b )
    {
        while ( b != 0 )
        {
            int uebertrag = a & b; // wenn Übertrag negiert wird ~, dann Subtraktion
            a = a ^ b;
            b = uebertrag << 1;
            
        }
        return a;
    }

}
