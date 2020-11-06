package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 * Earl Atta-Fynn 11/3/2020.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }


    public String whileLoop() {

        Person[] people = getPersonArray();
        String result = "";
        String firstName = "";
        String lastName = "";
        StringBuilder intro = new StringBuilder();
        int counter = 0;

        while (counter < people.length) {

            firstName = people[counter].getFirstName().trim();
            lastName = people[counter].getLastName().trim();
            intro.append(
                    "\nMy first name is " + firstName + "\n");
            intro.append(
                    "My last name is " + lastName);
            counter++;
        }

        result = intro.toString();
        return result;
    }



    public String forLoop() {

        Person[] people = getPersonArray();
        String result = "";
        String firstName = "";
        String lastName = "";
        StringBuilder intro = new StringBuilder();

        for (int i = 0; i < people.length; i++) {

            firstName = people[i].getFirstName().trim();
            lastName = people[i].getLastName().trim();
            intro.append(
                    "\nMy first name is " + firstName + "\n");
            intro.append(
                    "My last name is " + lastName);
        }

        result = intro.toString();
        return result;
    }



    public String forEachLoop() {

        Person[] people = getPersonArray();
        String result = "";
        String firstName = "";
        String lastName = "";
        StringBuilder intro = new StringBuilder();
        int index = 0;

        for (Object current : people) {

            firstName = people[index].getFirstName().trim();
            lastName = people[index].getLastName().trim();
            intro.append(
                    "\nMy first name is " + firstName + "\n");
            intro.append(
                    "My last name is " + lastName);
            index++;
        }

        result = intro.toString();
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
