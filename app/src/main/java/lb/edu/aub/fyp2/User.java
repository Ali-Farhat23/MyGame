package lb.edu.aub.fyp2;

public class User {
    String username;
    String first_name;
    String last_name;
    int phone_number;
    String address;
    String email;
    int user_id;
    int sex;


    public User(){

    }

    public User (String username, String first_name, String last_name, int phone_number, String address, String email, int user_id , int sex) {
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.address = address;
        this.email = email;
        this.user_id = user_id;
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getUserID() {
        return user_id;
    }

    public int getSex() {
        return sex;
    }
}

