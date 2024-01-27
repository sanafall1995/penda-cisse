/**
 * 
 */

import java.util.Objects;

/**
 * 
 */
public class Etudiant {
	    private String nom;
	    private String prenom;
	    private String ville;
	    
	    
		public Etudiant(String prenom, String nom, String ville ) {
			
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(prenom, nom, ville);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Etudiant other = (Etudiant) obj;
			return Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom)
					&& Objects.equals(ville, other.ville);
		}
		/**
		 * @return the nom
		 */
		public String getNom() {
			return nom;
		}
		/**
		 * @param nom the nom to set
		 */
		public void setNom(String nom) {
			this.nom = nom;
		}
		/**
		 * @return the prenom
		 */
		public String getPrenom() {
			return prenom;
		}
		/**
		 * @param prenom the prenom to set
		 */
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		/**
		 * @return the ville
		 */
		public String getVille() {
			return ville;
		}
		/**
		 * @param ville the ville to set
		 */
		public void setVille(String ville) {
			this.ville = ville;
		}

	   
}
