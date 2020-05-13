import java.util.Scanner;
public class Main {
     
         public static void  main(String args[]){

         
                           Creation d'un Objet de Classe rectangle
                           rectangle rectangle=new rectangle();
                    
                          Scanner clavier=new Scanner(System.in); 

                           System.out.println("Entrer la longueur");
                            double longueur=clavier.nextDouble();
                            rectangle rectangle=new rectangle(longueur);

                        
                if(choix >=1 && choix<=5){
                            if(choix==1){
                             System.out.println("Entrer la longueur");
                             double longueur=clavier.nextDouble();
                             Rectangle rectangle=new Rectangle(longueur);
                          } 
                         if(choix==2){
                            System.out.println("La longueur est " + rectangle.getLongueur());
                             System.out.println("Le Demi perimetre est " + rectangle.demiPerimetre());
 			    System.out.println("Le Perimetre est " + rectangle.perimetre());
                             System.out.println("La Surface est " + rectangle.surface());
                            System.out.println("La Diagonale est " + rectangle.diagonale());
                         }
   
                        }else{
                           //choix <1 || choix>5
                        }*/
               rectangle rectangle=null;
               int choix;
    do{
                    Scanner clavier=new Scanner(System.in); 
                        System.out.println("1-Ajout d'un rectangle");
                        System.out.println("2-Afficher les rectangles");
                        System.out.println("3-Ajout d'un carre");
                        System.out.println("4-Afficher les carres");
                        System.out.println("5-Quitter");
                        System.out.println("Faites votre choix");
                       choix =clavier.nextInt();
                switch(choix){
                case 1:
                           System.out.println("Entrer la longueur");
                             double longueur=clavier.nextDouble();
                            rectangle=new rectangle(longueur);
                  break;
                  case 2:
                          if(rectangle!=null){
                            System.out.println("La longueur est " + rectangle.getLongueur());
                             System.out.println("Le Demi perimetre est " + rectangle.demiPerimetre());
 			     System.out.println("Le Perimetre est " + rectangle.perimetre());
                             System.out.println("La Surface est " + rectangle.surface());
                            System.out.println("La Diagonale est " + rectangle.diagonale()); 
                           }else{
                             System.out.println("Veuillez donner la longueur du rectangle");
                           }
                         break;
                  case 3:
    
                   break;
                  case 4:
    
                   break;

                   case 5:
                   break;
                  default:
                    System.out.println("Choix invalide");

               }

}while(choix!=5);




           
          }
}