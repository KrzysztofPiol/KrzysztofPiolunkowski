package com.pjatk.pesel.model;

import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String PeselNumber;
    private String Name;
    private String Surname;
    private String Gender;
    private LocalDate dateOfBirth;

    Person(String pesel){
        PeselNumber=pesel;
    }


    public void setName (String nameParameter){
        Name = nameParameter;
    }

    public String getName(){
        return Name;
    }


    public void setSurname(String surnameParameter) {
        Surname = surnameParameter;
    }

    public String getSurname() {
        return Surname;
    }


    public String getPeselNumber() {
        return PeselNumber;
    }

    public String getGender() {
           return PeselValidator.getGender();
    }

    public LocalDate getDateOfBirth() {
        LocalDate dateOfBirth = LocalDate.of(PeselValidator.getBirthYear(), PeselValidator.getBirthMonth(),PeselValidator.getBirthDay());
        return dateOfBirth;
    }
}
