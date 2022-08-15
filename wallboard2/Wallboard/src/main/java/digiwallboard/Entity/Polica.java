package digiwallboard.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Polica {
	
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @Column(name="ime_pol")
    private String ime_pol;
    
    public Polica() {
        super();
    }
    
    public Polica(int id, String ime_pol) {
        this.id = id;
        this.ime_pol = ime_pol;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIme_pol() {
        return ime_pol;
    }
    public void setIme_pol(String ime_pol) {
        this.ime_pol = ime_pol;
    }
}
