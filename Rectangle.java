import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rectangle
 {
     public static void main(String[] args) {
 
 
int largeur = 0;
int longueure = 0;
 
try
{
//Lire la longueure du rectangle au clavier
Scanner entree = new Scanner(System.in);
 
System.out.println("Veuillez taper la longueure du rectangle");
longueure = Integer.parseInt(entree.nextLine());
 
//Lire la largeur du rectangle au clavier
System.out.println("Veuillez taper la largeur du rectangle");
largeur = Integer.parseInt(entree.nextLine());
 
 
}
//Vérifier si l'entrée clavier est valide
catch(NumberFormatException ne)
{
System.out.println("Valeur incorrecte" + ne);
System.exit(0); // Sortir dans le programme
}
 
/*
* le périmètre d'un rectangle=
* 2 * (longueure + largeur)
*/
 
int perimetre = 2 * (longueure + largeur);
 
System.out.println(" Le périmètre du rectangle est " + perimetre);
}
 
}
int largeur = 0;
int longueure = 0;
 
try
{
//Lire la longueure du rectangle au clavier
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
System.out.println("Veuillez taper la longueure du rectangle");
longueure = Integer.parseInt(br.readLine());
 
//Lire la largeur du rectangle au clavier
System.out.println("Veuillez taper la largeur du rectangle");
largeur = Integer.parseInt(br.readLine());
 
 
}
//Vérifier si l'entrée clavier est valide
catch(NumberFormatException ne)
{
System.out.println("Valeur incorrecte" + ne);
System.exit(0); // Sortir dans le programme
}
catch(IOException ioex)
{
System.out.println("Erreur d'entrée/Sortie :" + ioex);
System.exit(0);
}
 
/*
* Calcul de surafce=
* longueure * largeur
*/
 
int surface = longueure * largeur;
 
System.out.println("La surface du rectangle= " + surface);
}
 
}

int largeur = 0;
int longueure = 0;
 
try
{
//Lire la longueure du rectangle au clavier
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
System.out.println("Veuillez taper la longueure du rectangle");
longueure = Integer.parseInt(br.readLine());
 
//Lire la largeur du rectangle au clavier
System.out.println("Veuillez taper la largeur du rectangle");
largeur = Integer.parseInt(br.readLine());
 
 
}
//Vérifier si l'entrée clavier est valide
catch(NumberFormatException ne)
{
System.out.println("Valeur incorrecte" + ne);
System.exit(0); // Sortir dans le programme
}
catch(IOException ioex)
{
System.out.println("Erreur d'entrée/Sortie :" + ioex);
System.exit(0);
}
 
/*
* Calcul du demi perimetre=
* longueure + largeur
*/
 
int surface = longueure + largeur;
 
System.out.println("Le demi perimetre du rectangle= " + demi perimetre);
}
 
}
int largeur = 0;
int longueure = 0;
 
try
{
//Lire la longueure du rectangle au clavier
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
System.out.println("Veuillez taper la longueure du rectangle");
longueure = Integer.parseInt(br.readLine());
 
//Lire la largeur du rectangle au clavier
System.out.println("Veuillez taper la largeur du rectangle");
largeur = Integer.parseInt(br.readLine());
 
 
}
//Vérifier si l'entrée clavier est valide
catch(NumberFormatException ne)
{
System.out.println("Valeur incorrecte" + ne);
System.exit(0); // Sortir dans le programme
}
catch(IOException ioex)
{
System.out.println("Erreur d'entrée/Sortie :" + ioex);
System.exit(0);
}
 
/*
* Calcul de la diagonale=
* longueure^2 + largeur^2
*/
 
int surface = Math.pow(longueur,2) + Math.pow(largeur,2);
 
System.out.println("La diagonale du rectangle= " + diagonale);
}
  
}
// Afficher les informations du rectangle :
System.out.println("Veuillez taper la largeur du rectangle");
largeur = Integer.parseInt(entree.nextLine());
System.out.println("Veuillez taper la longueure du rectangle");
longueure = Integer.parseInt(entree.nextLine());
System.out.println(" Le périmètre du rectangle est " + perimetre);
System.out.println("La surface du rectangle= " + surface);
System.out.println("Le demi perimetre du rectangle= " + demi perimetre);
System.out.println("La diagonale du rectangle= " + diagonale);
}

}