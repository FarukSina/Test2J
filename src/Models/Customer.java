package Models;

import java.time.LocalDate;

public class Customer {
    private int id;
    private String gender, firstName, lastName;
    private String province, bloodType;
    private LocalDate birthday;

    public Customer(int id, String gender, String firstName, String lastName, String province, String bloodType, String birthday) {
        this.id = id;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.province = province;
        this.bloodType = bloodType;
        setBirthday(birthday);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
            this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
            this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setbloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
    }

    public int getAge()
    {
        return 0;
    }
}
