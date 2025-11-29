/**
 * Dans cette classe, on tente d'afficher les résultat d'opérations de nombres entiers farfelus sur des GameBoy Color
 * Trouvez-les erreurs et corrigez-les
 *
 * Dans la mesure du possible, restez sur l'utilisation de nombres entiers
 */

package fr.extia.mentorat.exercice;

public class Entier {
    public static void main(String[] args) {
        byte nombreDePiles = 4;
        byte nombreDeTouches = 5;

        /*
         * Attendu : La somme d'une GameBoy Color
         * (ses piles plus ses touches) = 9
         */
        System.out.println(nombreDePiles - nombreDeTouches);

        //-----------------------------------------------

        byte prixConsoleCollector = 1500;
        byte salaire = 120;

        /*
         * Attendu : Reste pour vivre ce mois-ci si j'achète une console collector
         * Note : Le calcul est bon, faites-en sorte que votre collègue puisse se nourrir et se faire plaisir
         */
        long restePourMangerEtPayerLoyer = salaire - prixConsoleCollector;
        System.out.println(restePourMangerEtPayerLoyer);

        //-----------------------------------------------
        byte coutQuatreConsolesClassiques = prixConsoleClassique * 4;
        byte prixConsoleClassique = 50;

        System.out.println(coutQuatreConsolesClassiques);

        //-----------------------------------------------
        {
            int tempsPasseSurPokemon = "9840";
            int tempsPasseSurGameBoyColor = "16322";
            int ratio = tempsPasseSurPokemon / tempsPasseSurGameBoyColor * 100;
        }

        /*
        * Attendu : Afficher le ratio, en %, de temps passé sur pokemon et non un autre jeu
         */
        System.out.println(ratio);
    }
}
