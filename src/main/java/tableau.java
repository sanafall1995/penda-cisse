import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class tableau {
    private List<String> listeVille;
    private List<Etudiant> listeEtudiant;

    public tableau() {
        addVille();
        addEtudiants();
    }

    public void addVille() {
        listeVille = new ArrayList<>();
        listeVille.add("Dakar");
        listeVille.add("Thies");
        listeVille.add("Ziguinchor");
        listeVille.add("Fatick");
        listeVille.add("Kaolack");
        listeVille.add("Mbour");
        listeVille.add("Diouberl");
        listeVille.add("Saint-Louis");
        listeVille.add("Kolda"); 
    }

    public void addEtudiants() {
        listeEtudiant = new ArrayList<Etudiant>();
        listeEtudiant.add(new Etudiant("Khady", "Badji", "Ziguinchor"));
        listeEtudiant.add(new Etudiant("Penda", "CISSE", "Fatick"));
        listeEtudiant.add(new Etudiant("Moussa", "Faye", "Mbour"));
        listeEtudiant.add(new Etudiant("Sega", "Faye", "Thies"));
        listeEtudiant.add(new Etudiant("Ousmane", "Fall", "Dakar"));
      
        listeEtudiant.add(new Etudiant("Lamine", "Diop", "Kaolack"));
    }
    public class Etudiant {
        private String prenom;

       

        public Etudiant(String Prenom, String Nom, String Ville) {
			
		}

		public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }
    }

    public List<String> getListeVille() {
        return listeVille;
    }

    public void setListeVille(List<String> listeVille) {
        this.listeVille = listeVille;
    }

    public List<Etudiant> getListeEtudiant() {
        return listeEtudiant;
    }

    public void setListeEtudiant(List<Etudiant> listeEtudiant) {
        this.listeEtudiant = listeEtudiant;
    }
}