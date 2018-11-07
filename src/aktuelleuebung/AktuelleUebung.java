package aktuelleuebung;

public class AktuelleUebung
{

    public static String umdrehen( String str )
    {
        String result = "";
        for ( int i = str.length() - 1; i >= 0; i-- )
            result += str.charAt( i );
        return result;
    }

    public static String leerzeichenEntfernen( String str )
    {
        String result = "";
        for ( int i = 0; i < str.length(); i++ )
            if ( str.charAt( i ) != ' ' )
                result += str.charAt( i );
        return result;
    }

    public static int zaehleZiffern( String str )
    {
        int counter = 0;
        for ( int i = 0; i < str.length(); i++ )
        {
            char ch = str.charAt( i );
            if ( ch >= 48 && ch <= 57 )
                counter++;
        }

        return counter;
    }

    public static int zaehleVokale( String str )
    {
        int counter = 0;
        for ( int i = 0; i < str.length(); i++ )
            switch ( str.charAt( i ) )
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    counter++;
                    break;
            }

        return counter;
    }

    public static String trimmen( String str )
    {
        int firstLetter = -1, lastLetter = str.length();
        for ( int i = 0; i < str.length(); i++ )
            if ( str.charAt( i ) != ' ' )
            {
                if ( firstLetter == -1 )
                    firstLetter = i;
                lastLetter = i;
            }
        return str.substring( firstLetter, ++lastLetter );
    }

    public static String int2String( int i )
    {
        int ziffer, stelle = 1;
        String result = "";

        while ( i / stelle != 0 )
        {
            ziffer = i / stelle % 10;
            result = ziffer + result;
            stelle *= 10;
        }

        return result;
    }

    public static int String2int( String str )
    {
        int result = 0, ziffer, zehnerpotenz = 1;
        for ( int i = str.length() - 1; i >= 0; i-- )
        {
            ziffer = str.charAt( i ) - 48;
            result += ziffer * zehnerpotenz;
            zehnerpotenz *= 10;
        }
        return result;
    }

    public static void main( String[] args )
    {
        System.out.println( "Umdrehen: " + umdrehen( "Josef" ) );
        System.out.println( "Leerzeichen entfernen: " + leerzeichenEntfernen( "Java ist toll" ) );
        System.out.println( "Zähle Ziffern: " + zaehleZiffern( "0J1a2v3a4 5i6st t789o10ll" ) );
        System.out.println( "Zähle Vokale: " + zaehleVokale( "Computer" ) );
        System.out.println( "Trimmen: --->" + trimmen( "     C o mpute    r         " ) + "<---" );
        System.out.println( "int2String: " + int2String( 123 ) );
        System.out.println( "String2int: " + String2int( "12345" ) * 2 );
    }

}
