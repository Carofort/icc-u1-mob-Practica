package controllers;

import views.View;

import models.Person;

public class Controller {
    private View view;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;

    private Person[] personas;
    public Controller(View view, 
                        SortingMethods sortingMethods,
                        SearchMethods searchmethods){
        this.view = view;
        this.searchMethods = searchmethods;
        this.sortingMethods = sortingMethods;
        System.out.println("Controller created");             
    }                        

    public void start(){
        int option = 0;
        do{
            option = view.showMenu();
            switch(option){
                case 1:
                    inputPersons();
                    break;
                case 2:
                    addPerson();
                    break;    
                case 3:
                    sortPersons();
                    break;     
                case 100:
                   System.out.println("Adiós");
                   break;       
                default:
                    System.out.println("Opción no válida");   
            }
        } while( option != 10);

        
    }

    private void sortPersons() {
        int sortingOption = view.selectSortingMethod();

        if(sortingOption == 1){
            sortingMethods.sortByeNameWithBubble(personas);
        } else if(sortingOption == 2){
            sortingMethods.sortByAgeWithSelection(personas);

        }else{
            view.showMessage("Opción inválida.");
        }    
    }

    public void inputPersons(){
        int numeroPersonas = view.inputInt("Ingrese el número de Personas: ");
        personas = new Person[numeroPersonas];
        for(int i = 0; i < numeroPersonas; i++){
            personas[i] = view.inputPerson();
        }
    }

    public void addPerson(){
        if(personas == null){
            view.showMessage("No existe, ingrese las personas por primera vez");
            inputPersons();
        } else{
            int numeroPersonas = view.inputInt("Ingrese el número de Personas a adicionar: ");
            Person[] personasTotales = new Person[personas.length + numeroPersonas];
            for(int i = 0; i < personas.length; i++){
                personasTotales[i] = personas[i];
            }     
            for(int i = personas.length; i < personasTotales.length; i++){
                personas[i] = view.inputPerson();
            }     

            personas = personasTotales;
        }
    } 
}

