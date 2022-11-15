public class Vehicule{
   int annee;
   String brand;
   String marque;

   Vehicule(String brand, String marque, int annee) {
	this.annee = annee;

	this.brand = brand;

	this.marque = marque;

  }

public Vehicule(String marque2) {
}

public int getAnnee() {
    return annee;
   }


    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
 
}


public class Voiture extends Vehicule {
    int vitesse=100;
    int rapport;
    Voiture (int vitesse, int rapport,int annee,String brand, String marque){
        super(marque);
        this.rapport=rapport;
        this.vitesse=vitesse;
       }
       int accelerer(int v){
        this.vitesse=this.vitesse+v;
        return this.vitesse;
    }
}


public class Camion extends Vehicule {
    int vitesse=50;
    int rapport;
    void Voiture (int vitesse, int rapport,int annee,String brand, String marque){
        this.rapport=rapport;
        this.vitesse=vitesse;
       }
       int accelerer(int v){
        this.vitesse=this.vitesse+v;
        return this.vitesse;
    }
}