
package Pruebas;

import Controladores.Control_Menu;
import Modelo.Teatro;
import Vista.Menu;


public class Main {
   
    
    public static void main(String[] args) {
        Teatro teatro = new Teatro("Patito");
        Menu menu = new Menu();
        Control_Menu controlGeneral = new Control_Menu(menu, teatro);
    }
    
    
}
