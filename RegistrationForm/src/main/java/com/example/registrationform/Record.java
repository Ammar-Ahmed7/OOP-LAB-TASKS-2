package com.example.registrationform;

public class Record {
    String Name;
    String Phone;
    String DOB;
    String Email;
    String Password;
    String Gender;
    String Expert;
    String Qualification;
    String Location;

    public Record(String name, String phone, String DOB, String email, String password, String gender, String expert, String qualification, String location) {
        Name = name;
        Phone = phone;
        this.DOB = DOB;
        Email = email;
        Password = password;
        Gender = gender;
        Expert = expert;
        Qualification = qualification;
         Location = location;
    }

    @Override
    public String toString() {
        return "Record{" +
                "Name='" + Name +
                ", Phone='" + Phone +
                ", DOB='" + DOB +
                ", Email='" + Email +
                ", Password='" + Password +
                ", Gender='" + Gender +
                ", Expert='" + Expert +
                ", Qualification='" + Qualification +
                ", Location='" + Location +
                '}';
    }
}