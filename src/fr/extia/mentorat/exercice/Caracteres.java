/**
 * Dans cette classe, on tente d'afficher des caractères et des chaînes de caractères
 * Trouvez-les erreurs et corrigez-les
 */


package fr.extia.mentorat.exercice;

public class Caracteres {
    public static void main(String[] args) {
        // Afficher la concaténation des variables a et b (sortie attendue : aabc)
        char a = 'a';
        String b = "abc";

        System.out.println(a + b);

        //---------------------------------
        // Afficher le caractère en correspondant au code 97
        char b = 97;
        System.out.println(b);

        //---------------------------------
        // Afficher le caractère c 
        char c = "c";
        System.out.println(c);
        
        //---------------------------------
        // Afficher le texte suivant dans la console
        char d = """
                Ceci est mon texte
                Merci d'en respcter la nature
                L'oeuvre
                Et tout le tintoin
                
                
                """;
        System.out.println(d);

        //---------------------------------
        // Afficher le plus beau prénom du monde
        {
            String prenom = 'Julie';
        }
        System.out.println(prenom);
    }
}
