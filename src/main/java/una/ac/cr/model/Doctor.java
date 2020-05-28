package una.ac.cr.model;

import javax.persistence.*;

/**
 * Doctor Model
 *
 * @author JavierGarro, JosuaEsquivel
 */

@Entity
@Table(name = "doctor")

/**
 * Entity Doctor
 */

public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_doctor")
    private int id_doctor;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "type_address")
    private int type_address;
    @Column(name = "telephone")
    private int telephone;
    @Column(name = "type_telephone")
    private int type_telephone;
    @Column(name = "password")
    private String password;

    /**
     *
     */
    public Doctor() {
    }

    /**
     * @param id_doctor
     * @param name
     * @param address
     * @param type_address
     * @param telephone
     * @param type_telephone
     * @param password
     */
    public Doctor(int id_doctor, String name, String address, int type_address, int telephone, int type_telephone, String password) {
        this.id_doctor = id_doctor;
        this.name = name;
        this.address = address;
        this.type_address = type_address;
        this.telephone = telephone;
        this.type_telephone = type_telephone;
        this.password = password;
    }

    /**
     * @return
     */
    public int getId_doctor() {
        return id_doctor;
    }

    /**
     * @param id_doctor
     */
    public void setId_doctor(int id_doctor) {
        this.id_doctor = id_doctor;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return
     */
    public int getType_address() {
        return type_address;
    }

    /**
     * @param type_address
     */
    public void setType_address(int type_address) {
        this.type_address = type_address;
    }

    /**
     * @return
     */
    public int getTelephone() {
        return telephone;
    }

    /**
     * @param telephone
     */
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    /**
     * @return
     */
    public int getType_telephone() {
        return type_telephone;
    }

    /**
     * @param type_telephone
     */
    public void setType_telephone(int type_telephone) {
        this.type_telephone = type_telephone;
    }

    /**
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id_doctor=" + id_doctor +
                ", name='" + name +
                ", address='" + address +
                ", type_address=" + type_address +
                ", telephone=" + telephone +
                ", type_telephone=" + type_telephone +
                ", password='" + password +
                '}';
    }
}
