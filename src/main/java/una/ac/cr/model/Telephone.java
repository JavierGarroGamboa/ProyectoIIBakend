package una.ac.cr.model;

import javax.persistence.*;

/**
 * Telephone Model
 *
 * @author JavierGarro, JosuaEsquivel
 */

@Entity
@Table(name = "telephone")

/**
 * Entity Telephone
 */
public class Telephone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_telephone")
    private int id_telephone;
    @Column(name = "telephone")
    private int telephone;
    @Column(name = "type_telephone")
    private String type_telephone;

    /**
     *
     */
    public Telephone() {
    }

    /**
     *
      * @param id_telephone
     * @param telephone
     * @param type_telephone
     */
    public Telephone(int id_telephone, int telephone, String type_telephone) {
        this.id_telephone = id_telephone;
        this.telephone = telephone;
        this.type_telephone = type_telephone;
    }

    public int getId_telephone() {
        return id_telephone;
    }

    public void setId_telephone(int id_telephone) {
        this.id_telephone = id_telephone;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getType_telephone() {
        return type_telephone;
    }

    public void setType_telephone(String type_telephone) {
        this.type_telephone = type_telephone;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "id_telephone=" + id_telephone +
                ", telephone=" + telephone +
                ", type_telephone='" + type_telephone +
                '}';
    }
}
