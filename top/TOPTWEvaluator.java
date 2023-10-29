/**
 * @file TOPTWEvaluator.java
 * @brief Contiene la implementación del evaluador de soluciones TOPTW.
 */

package top;

/**
 * @class TOPTWEvaluator
 * @brief Implementación del evaluador de soluciones TOPTW.
 */
public class TOPTWEvaluator {
    // Valor para indicar que la evaluación no se ha realizado.
    public static double NO_EVALUATED = -1.0;

    /**
     * @brief Evalúa una solución TOPTW.
     * @param solution La solución a evaluar.
     */
    public void evaluate(TOPTWSolution solution) {
        /* 
         * Comentario: El código original está comentado, 
         * se puede descomentar y adaptar según sea necesario.
         */
        /* 
         * CumulativeCVRP problem = solution.getProblem();
         * double objectiveFunctionValue = 0.0;
         * for (int i = 0; i < solution.getIndexDepot().size(); i++) {
         *     double cumulative = 0;
         *     int depot = solution.getAnIndexDepot(i);
         *     int actual = depot;
         *     actual = solution.getSuccessor(actual);
         *     cumulative += problem.getDistanceMatrix(0, actual);
         *     objectiveFunctionValue += problem.getDistanceMatrix(0, actual);
         *     System.out.println("Desde " + 0 + " a " + actual + " = " + cumulative);
         *     while (actual != depot) {
         *         int ant = actual;
         *         actual = solution.getSuccessor(actual);
         *         if (actual != depot) {
         *             cumulative += problem.getDistanceMatrix(ant, actual);
         *             objectiveFunctionValue += cumulative;
         *             System.out.println("Desde " + ant + " a " + actual + " = " + cumulative);
         *         } else {
         *             cumulative += problem.getDistanceMatrix(ant, 0);
         *             objectiveFunctionValue += cumulative;
         *             System.out.println("Desde " + ant + " a " + 0 + " = " + cumulative);
         *         }
         *     }
         *     System.out.println("");
         * }
         * solution.setObjectiveFunctionValue(objectiveFunctionValue);
         */
    }
}
