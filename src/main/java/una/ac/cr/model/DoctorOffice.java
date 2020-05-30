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
    @Column(name = "address")
    private String address;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Column(name = "telephoneList")
    private List<Telephone> telephoneList = new ArrayList<>();

    /**
     *
     */
    public DoctorOffice() {
    }

    public DoctorOffice(int id_office, String name, String schedule, String address, List<Telephone> telephoneList) {
        this.id_office = id_office;
        this.name = name;
        this.schedule = schedule;
        this.address = address;
        this.telephoneList = telephoneList;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Telephone> getTelephoneList() {
        return telephoneList;
    }

    public void setTelephoneList(List<Telephone> telephoneList) {
        this.telephoneList = telephoneList;
    }

    @Override
    public String toString() {
        return "DoctorOffice{" +
                "id_office=" + id_office +
                ", name='" + name +
                ", schedule='" + schedule +
                ", address='" + address +
                ", telephoneList=" + telephoneList +
                '}';
    }
}
