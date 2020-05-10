public class carre 
{
     public static void main(String[] args) {
 
         // saisir le côté du carré : 
       cote = Utile.lireReel("Tapez le cote d'un carre ");
         //Vérifier si l'entrée clavier est valide
    catch(NumberFormatException ne)
    {
    System.out.println("Valeur incorrecte" + ne);
    System.exit(0); // Sortir dans le programme
    }

       // calculer le périmètre:
       int  perimetre = 4 * cote ;
       // calculer la surface :  
       int  surface = cote * cote ;
       // calculer la diagonale:
       int  diagonale= Math.pow(cote,2) + Math.pow(cote,2)
	   
       // Afficher les informations du carré :
	  System.out.println("Pour un carre de cote : " + cote);
          System.out.println(" - le perimetre : " + perimetre);
          System.out.println(" - la surface   : " + surface);
	   
   }
}