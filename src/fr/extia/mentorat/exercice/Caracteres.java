/**
 * Dans cette classe, on tente d'afficher des caractères et des chaînes de caractères
 * Trouvez-les erreurs et corrigez-les
 */


package fr.extia.mentorat.exercice;

public class Caracteres {
    public static void main(String[] args) {
        char a = 'a';
        String b = "abc";

        System.out.println(a + b);

        //---------------------------------
        char b = 97;
        System.out.println(b);

        //---------------------------------
        char c = "c";
        System.out.println(c);
        //---------------------------------

        char d = """
                Ceci est mon texte
                Merci d'en respcter la nature
                L'oeuvre
                Et tout le tintoin
                
                
                """;
        System.out.println(d);

        //---------------------------------
        {
            String prenom = 'Julie';
            System.out.println(prenom);
        }
    }
}
