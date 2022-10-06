package src;
import src.app.Admin;

import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Data.staticData();
        int choice ;
        Scanner s = new Scanner(System.in);  // Create a Scanner object
        do{
            System.out.println("1 => Vous Etes Admin ");
            System.out.println("2 => Vous Etes Enseignant ");
            System.out.println("3 => Vous Etes Responsable ");

            System.out.println("Choiseserez Votre Choix : ");
            choice=s.nextInt();

            if(choice==1){
                do{
                    System.out.println("1 => Manage les College ");
                    System.out.println("2 => Manage les deparetement");
                    System.out.println("3 => Manage les Enseignant ");
                    System.out.println("4 => Manage Les Classes");
                    System.out.println("5 => Manage les Etudiants ");
                    System.out.println("9 => Operations de filtrage ");

                    System.out.println("Choiseserez Votre Choix : ");
                    choice=s.nextInt();

                    switch(choice){
                            case 1 :{
                                Admin.ManageCollege();
                                break;
                            }
                            case 2 :{
                                Admin.ManageDeparetement();
                                break;
                            }
                            case 3 :{
                                Admin.ManageEnseignant();
                            }
                            case 4 :{
                                Admin.ManageClasses();
                            }
                            case 5:{
                                Admin.ManageEtudiants();
                            }
                            case 6:{
                                //Admin.ManageEtudiants();
                            }
                            case 7:{
                                //Admin.ManageEtudiants();
                            }
                            case 9:{
                                Admin.Filtrage();
                        }
                    }
                }while(choice!=0) ;
            }
                        
            
        }
        while(choice!=0);
}

}
