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

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Column(name = "telephoneList")
    private List<Telephone> telephoneList = new ArrayList<>();
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Column(name = "addressList")
    private List<Address> addressList = new ArrayList<>();

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
     * @param telephoneList
     * @param addressList
     * @param associatedDiseases
     * @param observations
     */
    public Patient(int id_patient, String dateBorn, String name, List<Telephone> telephoneList, List<Address> addressList, String associatedDiseases, String observations) {
        this.id_patient = id_patient;
        this.dateBorn = dateBorn;
        this.name = name;
        this.telephoneList = telephoneList;
        this.addressList = addressList;
        this.associatedDiseases = associatedDiseases;
        this.observations = observations;
    }

    public int getId_patient() {
        return id_patient;
    }

    public void setId_patient(int id_patient) {
        this.id_patient = id_patient;
    }

    public String getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(String dateBorn) {
        this.dateBorn = dateBorn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Telephone> getTelephoneList() {
        return telephoneList;
    }

    public void setTelephoneList(List<Telephone> telephoneList) {
        this.telephoneList = telephoneList;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public String getAssociatedDiseases() {
        return associatedDiseases;
    }

    public void setAssociatedDiseases(String associatedDiseases) {
        this.associatedDiseases = associatedDiseases;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id_patient=" + id_patient +
                ", dateBorn='" + dateBorn +
                ", name='" + name +
                ", telephoneList=" + telephoneList +
                ", addressList=" + addressList +
                ", associatedDiseases='" + associatedDiseases +
                ", observations='" + observations +
                '}';
    }
}
