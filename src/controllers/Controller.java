package controllers;

import views.View;

import models.Person;

public class Controller {
    private View view;
    private Person[] persons;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;

    public Controller(View view, 
                        SortingMethods sortingMethods,
                        SearchMethods searchmethods){
        this.view = view;
        this.searchMethods = searchmethods;
        this.sortingMethods = sortingMethods;
        this.persons = new Person[0];           
    }                        

    public void start(){
        int option = 0;
        do{
            option = view.showMenu();
            switch(option){
                case 1:
                    addPersons();
                    break;
                case 2:
                    sortPersons();
                    break;    
                case 3:
                    searchPerson();
                    break;     
                case 100:
                   System.out.println("Adiós");
                   break;       
                default:
                    System.out.println("Opción no válida");   
            }
        } while( option != 10);

        
    }

    public void sortPersons() {
        int method = view.selectSortingMethod();
        switch (method) {
            case 1:
                sortingMethods.sortByNameWithBubble(persons);
                break;
            case 2:
                sortingMethods.sortByNameWithSelectionDes(persons);
                break;
            case 3:
                sortingMethods.sortByAgeWithInsertion(persons);
                break;
        }
        view.displayPersons(persons);
    }

    public void searchPerson() {
        int criterion = view.selectSearchCriterion();
        Person result = null;
        if (criterion == 1) {
            String name = view.inputName();
            result = searchMethods.binarySearchByName(persons, name);
        } else if (criterion == 2) {
            int age = view.inputAge();
            result = searchMethods.binarySearchByAge(persons, age);
        }
        view.displaySearchResult(result);
    }

    public void addPersons() {
        System.out.println("¿Cuantas personas desea agregar?");
        int count = view.inputCount(); 
        persons = new Person[count];
        for (int i = 0; i < count; i++) {
            persons[i] = view.inputPerson();
        }
    }    
}

