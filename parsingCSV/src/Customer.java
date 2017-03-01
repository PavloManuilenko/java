public class Customer {

    private long id;
    private String fName;
    private String lName;
    private String mail;
    private String pass;
    private int storeFront;

    public Customer(long id, String fName, String lName, String mail, String pass, int storeFront) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.mail = mail;
        this.pass = pass;
        this.storeFront = storeFront;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setStoreFront(int storeFront) {
        this.storeFront = storeFront;
    }

    public long getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getMail() {
        return mail;
    }

    public String getPass() {
        return pass;
    }

    public int getStoreFront() {
        return storeFront;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", mail='" + mail + '\'' +
                ", pass='" + pass + '\'' +
                ", storeFront=" + storeFront +
                '}';
    }
}