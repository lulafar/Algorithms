import java.util.Scanner;

public class Solution {

  static boolean isAnagram(String a, String b) { 
    // test inicial para "no anagramas"
    if ( a.length() != b.length() )
        return false;

    a = a.toLowerCase();
    b = b.toLowerCase();

    // Map donde se guardará cada letra con su frecuencia
    java.util.Map<Character, Integer> map = new java.util.HashMap<>();

    for (int k = 0; k < b.length(); k++){
         char letter = b.charAt(k);    

        if( ! map.containsKey(letter)){
            map.put( letter, 1 );
        } else {
            Integer frequency = map.get( letter );
            map.put( letter, ++frequency );
        }
    }

    // testear cada letra del otro String contra el Map
    // si la no contiene la letra o la frecuencia es 0 devolver falso
    // si la letra está reducir la frecuencia a 1

    for (int k = 0; k < a.length(); k++){
        char letter = a.charAt(k);

        if( ! map.containsKey( letter ) )
            return false;

        Integer frequency = map.get( letter );

         if( frequency == 0 )
            return false;
        else    
            map.put( letter, --frequency);
    }
    // Si el programa llega hasta aquí es que son anagramas
    return true;}
    
    
    
      public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
