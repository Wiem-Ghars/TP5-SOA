package metier;
import java.util.Date;
public class Compte {
    int code;
    double solde;
    Date date;
    //Constructeur sans paramètres
    public Compte() {
    }

    //Constucteur avec paramètres
    public Compte(int code, double solde, Date date) {
        this.code = code;
        this.solde = solde;
        this.date = date;
    }
    //getters et setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
