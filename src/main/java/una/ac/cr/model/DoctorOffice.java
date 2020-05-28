package una.ac.cr.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DoctorOffice Model
 *
 * @author JavierGarro, JosuaEsquivel
 */

@Entity
@Table(name = "doctoroffice")
/**
 * Entity DoctorOffice
 */

public class DoctorOffice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_office")
    private int id_office;
    @Column(name = "name")
    private String name;
    @Column(name = "schedule")
    private String schedule;

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

    /**
     *
     */
    public DoctorOffice() {
    }

    /**
     *
     * @param id_office
     * @param name
     * @param schedule
     * @param telephoneList
     * @param addressList
     */
    public DoctorOffice(int id_office, String name, String schedule, List<Telephone> telephoneList, List<Address> addressList) {
        this.id_office = id_office;
        this.name = name;
        this.schedule = schedule;
        this.telephoneList = telephoneList;
        this.addressList = addressList;
    }

    public int getId_office() {
        return id_office;
    }

    public void setId_office(int id_office) {
        this.id_office = id_office;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
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

    @Override
    public String toString() {
        return "DoctorOffice{" +
                "id_office=" + id_office +
                ", name='" + name +
                ", schedule='" + schedule +
                ", telephoneList=" + telephoneList +
                ", addressList=" + addressList +
                '}';
    }
}
