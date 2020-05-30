package una.ac.cr.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Patient Model
 *
 * @author JavierGarro, JosuaEsquivel
 */

@Entity
@Table(name = "patient")
/**
 * Entity Patient
 */
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_patient")
    private int id_patient;
    @Column(name = "dateBorn")
    private String dateBorn;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Column(name = "telephoneList")
    private List<Telephone> telephoneList = new ArrayList<>();

    @Column(name = "associatedDiseases")
    private String associatedDiseases;
    @Column(name = "observations")
    private String observations;

    /**
     *
     */
    public Patient() {
    }

    /**
     *
     * @param id_patient
     * @param dateBorn
     * @param name
     * @param address
     * @param telephoneList
     * @param associatedDiseases
     * @param observations
     */
    public Patient(int id_patient, String dateBorn, String name, String address, List<Telephone> telephoneList, String associatedDiseases, String observations) {
        this.id_patient = id_patient;
        this.dateBorn = dateBorn;
        this.name = name;
        this.address = address;
        this.telephoneList = telephoneList;
        this.associatedDiseases = associatedDiseases;
        this.observations = observations;
    }

    /**
     * @return
     */
    public int getId_patient() {
        return id_patient;
    }

    /**
     * @param id_patient
     */
    public void setId_patient(int id_patient) {
        this.id_patient = id_patient;
    }

    /**
     * @return
     */
    public String getDateBorn() {
        return dateBorn;
    }

    /**
     * @param dateBorn
     */
    public void setDateBorn(String dateBorn) {
        this.dateBorn = dateBorn;
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

    public List<Telephone> getTelephoneList() {
        return telephoneList;
    }

    public void setTelephoneList(List<Telephone> telephoneList) {
        this.telephoneList = telephoneList;
    }

    /**
     * @return
     */
    public String getAssociatedDiseases() {
        return associatedDiseases;
    }

    /**
     * @param associatedDiseases
     */
    public void setAssociatedDiseases(String associatedDiseases) {
        this.associatedDiseases = associatedDiseases;
    }

    /**
     * @return
     */
    public String getObservations() {
        return observations;
    }

    /**
     * @param observations
     */
    public void setObservations(String observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id_patient=" + id_patient +
                ", dateBorn='" + dateBorn + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephoneList=" + telephoneList +
                ", associatedDiseases='" + associatedDiseases + '\'' +
                ", observations='" + observations + '\'' +
                '}';
    }
}
