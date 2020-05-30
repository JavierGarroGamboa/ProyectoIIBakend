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
    @Column(name = "type_Doctor")
    private String type_Doctor;
    @Column(name = "premium")
    private boolean premium;

    /**
     *
     */
    public Doctor() {
    }

    /**
     *
     * @param id_doctor
     * @param name
     * @param type_Doctor
     * @param premium
     */
    public Doctor(int id_doctor, String name, String type_Doctor, boolean premium) {
        this.id_doctor = id_doctor;
        this.name = name;
        this.type_Doctor = type_Doctor;
        this.premium = premium;
    }

    public int getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(int id_doctor) {
        this.id_doctor = id_doctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType_Doctor() {
        return type_Doctor;
    }

    public void setType_Doctor(String type_Doctor) {
        this.type_Doctor = type_Doctor;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id_doctor=" + id_doctor +
                ", name='" + name +
                ", type_Doctor='" + type_Doctor +
                ", premium=" + premium +
                '}';
    }
}
