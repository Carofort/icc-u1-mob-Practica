package views;

import java.util.Scanner;

import models.Person;
public class View {
    Scanner scanner = new Scanner(System.in);
    public int showMenu(){
        System.out.println("**MENÚ**");
        System.out.println("1. Ingresar Personas");
        System.out.println("2. Añadir Personas: ");
        System.out.println("3. Ordenamiento: ");
        System.out.println("100. Salir");
        System.out.println("Ingrese una opción: ");
        return scanner.nextInt();
    }    

    public int inputInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }

    public Person inputPerson(){
        String name = inputName();
        int age = inputAge();
        return new Person(name, age);
    }

    public String inputName(){
        System.out.println("Ingrese el nombre: ");
        return scanner.nextLine();
    }    

    public int inputAge(){
        return inputInt("Ingrese la edad: ");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public int selectSortingMethod() {
        System.out.println("INGRESE LA CONDICIÓN A ORDENAR");
        System.out.println("1. Por nombre: ");
        System.out.println("2. Por edad: ");
        System.out.println("Ingrese una opción: ");
        return scanner.nextInt();
    }
    
}
