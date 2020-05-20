package una.ac.cr.model;

/**
 * AdmitMedicalOffice Model
 *
 * @author JavierGarro, JosuaEsquivel
 */
public class AdmitMedicalOffice {

    String name;
    String [][] date1;
    String [][] date2;
    Client [] client;
    String atentionDate;
    String atentionHour;
    int telefon;

    /**
     *
     * @param name
     * @param atentionDate
     * @param atentionHour
     * @param telefon
     */
    public AdmitMedicalOffice(String name, String atentionDate, String atentionHour, int telefon) {
        this.name = name;
        this.date1 = new String[3][13];
        this.date2 = new String[3][13];
        this.client = new Client[100];
        this.atentionDate = atentionDate;
        this.atentionHour = atentionHour;
        this.telefon = telefon;
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
    public String[][] getDate1() {
        return date1;
    }

    /**
     *
     * @param date1
     */
    public void setDate1(String[][] date1) {
        this.date1 = date1;
    }

    /**
     *
     * @return
     */
    public String[][] getDate2() {
        return date2;
    }

    /**
     *
     * @param date2
     */
    public void setDate2(String[][] date2) {
        this.date2 = date2;
    }

    /**
     *
     * @return
     */
    public Client[] getClient() {
        return client;
    }

    /**
     *
     * @param client
     */
    public void setClient(Client[] client) {
        this.client = client;
    }

    /**
     *
     * @return
     */
    public String getAtentionDate() {
        return atentionDate;
    }

    /**
     *
     * @param atentionDate
     */
    public void setAtentionDate(String atentionDate) {
        this.atentionDate = atentionDate;
    }

    /**
     *
     * @return
     */
    public String getAtentionHour() {
        return atentionHour;
    }

    /**
     *
     * @param atentionHour
     */
    public void setAtentionHour(String atentionHour) {
        this.atentionHour = atentionHour;
    }

    /**
     *
     * @return
     */
    public int getTelefon() {
        return telefon;
    }

    /**
     *
     * @param telefon
     */
    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
}
