package una.ac.cr.model;

/**
 * MedicalOfficeRegistration Model
 *
 * @author JavierGarro, JosuaEsquivel
 */
public class MedicalOfficeRegistration {
    private String name;
    private int phone;
    private String address;

    /**
     * Main Constructor
     *
     * @param name
     * @param phone
     * @param address
     */
    public MedicalOfficeRegistration(String name, int phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
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
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(int phone) {
        this.phone = phone;
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
}
