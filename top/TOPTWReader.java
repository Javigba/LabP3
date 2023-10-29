/**
 * @file TOPTWReader.java
 * @brief Contiene la implementación del lector de instancias TOPTW.
 */

package top;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import es.ull.esit.utilities.ExpositoUtilities;

/**
 * @class TOPTWReader
 * @brief Implementación del lector de instancias TOPTW.
 */
public class TOPTWReader {
    
    /**
     * @brief Lee una instancia del problema TOPTW desde un archivo.
     * @param filePath Ruta del archivo de la instancia.
     * @return Objeto TOPTW con la instancia cargada.
     */
    public static TOPTW readProblem(String filePath) {
        TOPTW problem = null;
        BufferedReader reader = null;
        try {
            File instanceFile = new File(filePath);
            reader = new BufferedReader(new FileReader(instanceFile));
            String line = reader.readLine();
            line = ExpositoUtilities.simplifyString(line);
            String[] parts = line.split(" ");
            problem = new TOPTW(Integer.parseInt(parts[2]), Integer.parseInt(parts[1]));
            line = reader.readLine();
            line = null; parts = null;
            for (int i = 0; i < problem.getPOIs() + 1; i++) {
                line = reader.readLine();
                line = ExpositoUtilities.simplifyString(line);
                parts = line.split(" ");
                problem.setX(i, Double.parseDouble(parts[1]));
                problem.setY(i, Double.parseDouble(parts[2]));
                problem.setServiceTime(i, Double.parseDouble(parts[3]));
                problem.setScore(i, Double.parseDouble(parts[4]));
                if (i == 0) {
                    problem.setReadyTime(i, Double.parseDouble(parts[7]));
                    problem.setDueTime(i, Double.parseDouble(parts[8]));
                } else {
                    problem.setReadyTime(i, Double.parseDouble(parts[8]));
                    problem.setDueTime(i, Double.parseDouble(parts[9]));                    
                }
                line = null; parts = null;
            }
            problem.calculateDistanceMatrix();
        } catch (IOException e) {
            System.err.println(e);
            System.exit(0);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    System.err.println(ex);
                    System.exit(0);
                }
            }
        }
        problem.setMaxTimePerRoute(problem.getDueTime(0));
        return problem;
    }
    
}
