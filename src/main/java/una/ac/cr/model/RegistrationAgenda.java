package una.ac.cr.model;


/**
 * RegistrationAgenda Model
 *
 * @author JavierGarro, JosuaEsquivel
 */
public class RegistrationAgenda {

    private String name;
    private int hour;
    private String date;
    private String office;

    /**
     *
     * @param name
     * @param hour
     * @param date
     * @param office
     */
    public RegistrationAgenda(String name, int hour, String date, String office) {
        this.name = name;
        this.hour = hour;
        this.date = date;
        this.office=office;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public int getPhone() {
        return hour;
    }

    /**
     *
     * @param hour
     */
    public void setPhone(int hour) {
        this.hour = hour;
    }

    /**
     *
     * @return
     */
    public String getAddress() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setAddress(String date) {
        this.date = date;
    }

    /**
     *
     * @return
     */
    public String getOffice() {
        return office;
    }

    /**
     *
     * @param office
     */
    public void setOffice(String office) {
        this.office = office;
    }
}
