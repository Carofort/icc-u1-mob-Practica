package views;

import java.util.Scanner;

import models.Person;

public class View {

    Scanner scanner = new Scanner(System.in);
    public int showMenu(){
        System.out.println("**MENU**");
        System.out.println("1. Ingresar Personas");
        System.out.println("2. Ordenamiento: ");
        System.out.println("3. Busqueda: ");
        System.out.println("100. Salir");
        System.out.println("Ingrese una opción: ");
        return scanner.nextInt();
    }    

    public int inputInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }

    public Person inputPerson() {
        System.out.print("Ingrese el nombre: ");
        String name = scanner.next();
        System.out.print("Ingrese la edad: ");
        int age = scanner.nextInt();
        return new Person(name, age);
    }


    public void showMessage(String message) {
        System.out.println(message);
    }

    public int selectSortingMethod() {
        System.out.println("-METODO DE ORDENAMIENTO-");
        System.out.println("1. Burbuja por edad");
        System.out.println("2. Seleccion por nombre, descendiente");
        System.out.println("3. Insercion por edad");
        return scanner.nextInt();
    }

    public int selectSearchCriterion() {
        System.out.println("-QUE DESEA BUSCAR-");
        System.out.println("1. Por nombre: ");
        System.out.println("2. Por edad: ");
        System.out.println("Ingrese una opción: ");
        return scanner.nextInt();
    }

    public void displayPersons(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public void displaySearchResult(Person person) {
        if (person != null) {
            System.out.println("Encontrado: " + person);
        } else {
            System.out.println("No se encontró");
        }
    }

    public int inputAge() {
        System.out.print("Ingrese edad a buscar: ");
        return scanner.nextInt();
    }

    public String inputName() {
        System.out.print("Ingrese nombre a buscar: ");
        return scanner.next();
    }
    public int inputCount() {
        System.out.print("Ingrese el numero: ");
        return scanner.nextInt();
    }    
    
}
