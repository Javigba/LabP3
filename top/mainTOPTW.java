/**
 * @file mainTOPTW.java
 * @brief Contiene la clase principal que ejecuta el algoritmo GRASP en diferentes instancias del problema TOPTW.
 */

package top;

/**
 * @class mainTOPTW
 * @brief Clase que contiene el método main para ejecutar el algoritmo GRASP en diferentes instancias del problema TOPTW.
 */
public class mainTOPTW {

    /**
     * @brief Método principal que ejecuta el algoritmo GRASP en diferentes instancias del problema TOPTW.
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        
        // Arreglo que contiene los nombres de las instancias del problema TOPTW.
        String[] instances = new String[29];
        
        // Se asignan los nombres de las instancias a los elementos del arreglo 'instances'.
        // Las primeras 9 instancias corresponden a casos c, las siguientes 9 a casos r, y las últimas 11 a casos rc.
        instances[0] = "c101.txt"; instances[3] = "c104.txt"; instances[6] = "c107.txt";
        instances[1] = "c102.txt"; instances[4] = "c105.txt"; instances[7] = "c108.txt";
        instances[2] = "c103.txt"; instances[5] = "c106.txt"; instances[8] = "c109.txt"; 

        instances[9] = "r101.txt";  instances[12] = "r104.txt"; instances[15] = "r107.txt";
        instances[10] = "r102.txt"; instances[13] = "r105.txt"; instances[16] = "r108.txt";
        instances[11] = "r103.txt"; instances[14] = "r106.txt"; instances[17] = "r109.txt";
        instances[18] = "r110.txt"; instances[19] = "r111.txt"; instances[20] = "r112.txt";
        
        instances[21] = "rc101.txt"; instances[24] = "rc104.txt"; instances[27] = "rc107.txt";
        instances[22] = "rc102.txt"; instances[25] = "rc105.txt"; instances[28] = "rc108.txt";
        instances[23] = "rc103.txt"; instances[26] = "rc106.txt"; 
        
        // Se itera sobre el arreglo de instancias.
        for(int i = 0; i < instances.length; i++) {
            // Se construye la ruta de la instancia actual.
            String INSTANCE = "Instances/TOPTW/"+instances[i];
            
            // Se lee el problema desde el archivo y se crea una solución inicial.
            TOPTW problem = TOPTWReader.readProblem(INSTANCE);
            TOPTWSolution solution = new TOPTWSolution(problem);
            
            // Se crea una instancia de la clase TOPTWGRASP para ejecutar el algoritmo GRASP.
            TOPTWGRASP grasp = new TOPTWGRASP(solution);

            // Se imprime el nombre de la instancia actual.
            System.out.println(" --> Instance: "+instances[i]);
            
            // Se ejecuta el algoritmo GRASP con diferentes configuraciones de parámetros.
            grasp.GRASP(10000, 3);
            grasp.GRASP(10000, 5);
            grasp.GRASP(10000, 7);
            
            // Se imprime una línea en blanco para separar las salidas de las diferentes instancias.
            System.out.println("");
        }
    }
    
}
