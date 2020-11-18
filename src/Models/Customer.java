package Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Customer {
    private int id;
    private String gender, firstName, lastName;
    private String province, bloodType;
    private LocalDate birthday;

    public Customer(int id, String gender, String firstName, String lastName, String province, String bloodType, String birthday) {
        setId(id);
        setGender(gender);
        setFirstName(firstName);
        setLastName(lastName);
        setProvince(province);
        setbloodType(bloodType);
        setBirthday(birthday);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        if (id>0)
            this.id = id;
        else
            throw new IllegalArgumentException("ID must be greater than 0");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender.toLowerCase() == "Male" || gender.toLowerCase() =="Female")
            this.gender = gender;
        else
            throw new IllegalArgumentException("Gender must be Male or Female");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length() <=40 || firstName.length()>=1)
        this.firstName = firstName;
        else
            throw new IllegalArgumentException("FirstName's length must be between 1 and 40");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(firstName.length() <=40 || firstName.length()>=1)
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("LastName's length must be between 1 and 40");
    }

    public String getProvince() {
        return province;
    }
    public static ArrayList<String> getProvinceList()
    {
        ArrayList<String> provinces = new ArrayList(Arrays.asList("ON", "QC", "AB", "NS", "BC", "SK", "NT", "NB", "MB", "NL"));
        Collections.sort(provinces);
        return provinces;
    }
    public static ArrayList<String> getBloodTypeList()
    {

        ArrayList<String> bloodTypes = new ArrayList(Arrays.asList("B+", "O+", "AB+", "O-", "A+", "B-", "A-", "AB-"));
        Collections.sort(bloodTypes);
        return bloodTypes;
    }

    public void setProvince(String province) {
        if (getProvinceList().contains(province))
            this.province = province;
        else
            throw new IllegalArgumentException("Province must be in the list: "+getProvinceList());
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setbloodType(String bloodType) {
        if(getBloodTypeList().contains(bloodType))
        this.bloodType = bloodType;
        else
            throw new IllegalArgumentException("Blood Type must be in the list: "+getBloodTypeList());
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
