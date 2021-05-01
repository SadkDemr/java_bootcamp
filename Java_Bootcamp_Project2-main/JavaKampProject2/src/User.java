
public class User {
    private int id;
    private String FullName;
    private String password;
    private String email;

    public User() {

    }


    public User(int id, String fullName,String password, String email) {
        super();
        this.id = id;
        this.FullName = fullName;
        this.password = password;
        this.email = email;

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

















