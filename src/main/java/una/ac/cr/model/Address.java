package una.ac.cr.model;

import javax.persistence.*;

/**
 * Address Model
 *
 * @author JavierGarro, JosuaEsquivel
 */

@Entity
@Table(name = "address")

/**
 * Entity Address
 */
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_address")
    private int id_address;
    @Column(name = "address")
    private int address;
    @Column(name = "type_address")
    private String type_address;

    /**
     *
     */
    public Address() {
    }

    /**
     */
    public Address(int id_address, int address, String type_address) {
        this.id_address = id_address;
        this.address = address;
        this.type_address = type_address;
    }

    public int getId_address() {
        return id_address;
    }

    public void setId_address(int id_address) {
        this.id_address = id_address;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public String getType_address() {
        return type_address;
    }

    public void setType_address(String type_address) {
        this.type_address = type_address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id_address=" + id_address +
                ", address=" + address +
                ", type_address='" + type_address +
                '}';
    }
}



