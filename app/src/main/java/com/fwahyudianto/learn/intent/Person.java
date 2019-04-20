package com.fwahyudianto.learn.intent;

public class Person {
    private String strName;
    private String strEmail;
    private String strNik;
    private int iAge;

    // Constructor
    public Person(
            String p_strName,
            String p_strEmail,
            String p_strNik,
            int p_iAge) {
        this.strName = p_strName;
        this.strEmail = p_strEmail;
        this.strNik = p_strNik;
        this.iAge = p_iAge;
    }

    //  Getter
    public String getName() {
        return strName;
    }

    public String getEmail() {
        return strEmail;
    }

    public String getNik() {
        return strNik;
    }

    public int getAge() {
        return iAge;
    }

    //  Setter
    public void setName(String p_strName) {
        this.strName = p_strName;
    }

    public void setEmail(String p_strEmail) {
        this.strEmail = p_strEmail;
    }

    public void setNik(String p_strNik) {
        this.strNik = p_strNik;
    }

    public void setAge(int p_iAge) {
        this.iAge = p_iAge;
    }
}