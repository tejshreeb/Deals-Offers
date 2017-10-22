
package Model;


public class UserMaster {
    private int id;
    private String name,email,c_pass,address;
   private int contact;  

    public UserMaster(int id, String name, String email, String c_pass, String address, int contact) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.c_pass = c_pass;
        this.address = address;
        this.contact = contact;
    }

    public UserMaster(String name, String email, String c_pass, String address, int contact) {
        this.name = name;
        this.email = email;
        this.c_pass = c_pass;
        this.address = address;
        this.contact = contact;
    }

    public UserMaster() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getC_pass() {
        return c_pass;
    }

    public String getAddress() {
        return address;
    }

    public int getContact() {
        return contact;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setC_pass(String c_pass) {
        this.c_pass = c_pass;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    
    
}
