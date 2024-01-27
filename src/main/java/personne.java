import java.util.ArrayList;
import java.util.List;




import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named("personneBean") // Renommez le bean pour éviter les conflits de nom

public class personne {
    private String nom;
    
  
private String prenom;
    
   
private String ville;
    private List<String> listVille;
    private int poids;
    
    
private float prix;

    public personne() {
        listVille = new ArrayList<>();
        
  
// ajout de quelques Villes
        listVille.add("Dakar");
        listVille.add("Fatick");
        listVille.add("Thies");
        listVille.add("Ziguinchor");
    }
    
    public String menu() {
    	if(ville.equals("Dakar"))
    		return "dakar";
    	if(ville.equals("Fatick"))
    		return "fatick";
    	if(ville.equals("Thies"))
    		return "thies";
    		return "zig";
    	
    }
    
    public String menu2() {
    	switch (ville) {
    		case "Dakar": return"dakar";
    		case "Fatick": return"fatick";
    		case "Thies": return"thies";
    		case "Zig": return"zig";
    	}
    	return"";
    }

    public int getPoids() {
        return poids;
    }

    
    
public void setPoids(int poids) {
        this.poids = poids;
    }

    
    

    
public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getNom() {
        
       
return nom;
    }

    
    

    

    
public void setNom(String nom) {
        
        

   
this.nom = nom;
    }

    
    
public String getPrenom() {
        
        
return prenom;
    }

    
    
public void setPrenom(String prenom) {
        
        
this.prenom = prenom;
    }

    
    

    
public String getVille() {
        return ville;
    }

    
   

   
public void setVille(String ville) {
        this.ville = ville;
    }

    
    

   
public List<String> getListVille() {
        
        
return listVille;
    }

    
    
public void setListVille(List<String> listVille) {
        
   
this.listVille = listVille;
    }
}
