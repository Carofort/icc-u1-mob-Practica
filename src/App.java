
import controllers.*;
import views.View;

public class App {
    public static void main(String[] args) throws Exception {
       //CREAR LA VISTA
       View view = new View();

       //CREAR LAS CLASES CON LOS MÉTODOS DE ORDENAMIENTO Y BÚSQUEDA
       SortingMethods sortingMethods = new SortingMethods();
       SearchMethods searchMethods = new SearchMethods();

       //CREAR CONTROLADOR
       Controller controller = new Controller(view, sortingMethods, searchMethods);
       
       //INICIAR APLICACIÓN
       controller.start();
    }
}
