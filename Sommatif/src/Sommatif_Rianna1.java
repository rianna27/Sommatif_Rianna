/*
*Author : Rianna Smuk
*Date : 16-Dec-2020
* Nom du programme: Sommatif_Rianna1
* Description du programme: Voici un programme écrit avec eclipse et qui 
* comporte des erreurs majeures. Tu devras réécrire le programme en corrigeant 
* les erreurs. Dans les commentaires, tu expliqueras chaque correction
* faite en donnant toutes les options possibles.
*/
public class Sommatif_Rianna1
	{

		public static void main(String[] args)
			{
				System.out.println(saluerAmi("John")); 
			} //Je dois mettre un accolade qui est fermé pour que le public static void main sait ce qu'il doit éffectuer.
				
		/*
		 * Je dois ajouter static à côté de public parce que le membre appartient à la classe elle-même. Je n'ajoute pas void parce que la
		 * méthode retourne une message. Pour exécuter une méthode, il suffit de faire appel
		 * à elle en écrivant son nom suivie d'une paranthèse ouverte (éventuellement des arguments)
		 * puis d'une parenthèse fermée. Dans ce cas, le nom du méthode est "saluerAmi". Je devais 
		 * corriger l'argument parce qu'à cause que l'argument est une expression (String) et non une
		 * constante ou variable (int) alors le "a" doit être changé à "nom".  
		 * 
		 */
		public static String saluerAmi(String nom) 
				{
						String message="Bonjour mon ami " + nom; //change "a" à "nom" et ajouter une espace après ami pour qu'il y a un espace entre le nom et ami. 
						return message; 
						
						/* Si vous voulait, vous pouvez changer "message" à n'importe quel mot sauf pour
						 * les mots qui ont une fonction spécifique sur cet méthode (String, nom, return). 
						 * Aussi, si vous remplacer "message" par un autre mot, assurez- vous d'écrire 
						 * le même mot dans les deux endroit. 
						 */
				}

			}

	//J'ai enlevé un accolade fermé pour qu'il n'y a pas plus d'accolade fermé que d'accolade ouvert.
