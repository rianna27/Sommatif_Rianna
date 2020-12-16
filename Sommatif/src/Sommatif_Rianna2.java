/*
* Author : Rianna Smuk
* Date : 16-Dec-2020
* Nom du programme: Sommatif_Rianna2
* Description du programme: Écrire une méthode qui permet de faire la moyenne des nombres impairs contenus dans un tableau de 20 nombres entiers générés
* au hasard. Déclarer le tableau dans le main et générer au hasard les 20 nombres entiers puis appeler la méthode qui va permettre
* d’afficher la moyenne des nombres impairs contenus dans le tableau.
*/
public class Sommatif_Rianna2
	{

		public static void main(String[] args)
			{
				
				 int []myTab=new int[20]; 
				 for (int i = 0; i < myTab.length; i++) 
				 {
				 myTab[i]=(int)(Math.random()*(i+10)); 
				 }
				 System.out.println(Sommeimpair(myTab ));
			}
	
		
		static int Sommeimpair(int []a)
			{
				
				int somme=0; 
				for (int i = 0; i < a.length; i++) 
				{
					if(a[i]%2==1)
						somme+=a[i];
			    }
				return somme;
				
				 
				 
			}

		}

	
