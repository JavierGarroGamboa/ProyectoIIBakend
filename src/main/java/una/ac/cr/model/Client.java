package una.ac.cr.model;


/**
 * Client Model
 *
 * @author JavierGarro, JosuaEsquivel
 */
public class Client {

    private String id;
    private String dateBorn;
    private String name;
    private String address;
    private String phone;
    private String associatedDiseases;
    private String observations;
    private String password;

    public Client() {
    }


    public Client(String id, String name, String dateBorn,String phone,String address,String password, String associatedDiseases, String observations) {
        this.id = id;
        this.dateBorn = dateBorn;
        this.name = name;
        this.address=address;
        this.phone=phone;
        this.password=password;
        this.associatedDiseases = associatedDiseases;
        this.observations = observations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(String  dateBorn) {
        this.dateBorn = dateBorn;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
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

    public void setObservations(String observations) { this.observations = observations; }

    public String getAddress() { return address;  }

    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }


    @Override
    public String toString() {
        return "Client{" + "id=" + id + "dateBorn=" + dateBorn  + ", name=" + name + ", associatedDiseases=" + associatedDiseases + ", observations=" + observations + '}';
    }

}
