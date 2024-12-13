package management;
import utils.ConsoleUtils;

public class Menu {

    public void ShowMenu(){
        System.out.println("1. Píldora Roja: Agentes de la Resistencia");
        System.out.println("2. Píldora Azul: Control de Anomalías");
        System.out.println("3. mostrar cantidad");
        int opcion = ConsoleUtils.leerEntero("Selecciona una opción (1 o 2 o 3): ");

        if (opcion == 1) {
            AgenteManager agenteManager = new AgenteManager();
            agenteManager.mostrarMenu();
        } else if (opcion == 2) {
            AnomaliaManager anomaliaManager = new AnomaliaManager();
            anomaliaManager.mostrarMenu();
        } else  if(opcion == 3){
            AgenteManager agenteManager = new AgenteManager();
            AnomaliaManager anomaliaManager = new AnomaliaManager();
            anomaliaManager.mostrarAnomalias();
            agenteManager.contarAgentes();
        } else {
            System.out.println("Opción no válida. Adiós.");
        }
    }
    
}
