package controllers;

import models.Person;

public class SearchMethods {
    
    public Person binarySearchByAge(Person[] persons, int age) {
        int left = 0;
        int right = persons.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (persons[mid].getAge() == age) {
                return persons[mid];
            } else if (persons[mid].getAge() < age) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public Person binarySearchByName(Person[] persons, String name) {
        int left = 0;
        int right = persons.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (persons[mid].getName().equals(name)) {
                return persons[mid];
            } else if (persons[mid].getName().compareTo(name) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public boolean isSortedByAge(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            if (persons[i].getAge() > persons[i + 1].getAge()) {
                return false;
            }
        }
        return true;
    }

    public boolean isSortedByName(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            if (persons[i].getName().compareTo(persons[i + 1].getName()) > 0) {
                return false;
            }
        }
        return true;
    }
    
}
