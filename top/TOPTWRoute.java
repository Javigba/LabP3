/**
 * @file TOPTWRoute.java
 * @brief Contiene la implementación de la clase TOPTWRoute.
 */

package top;

/**
 * @class TOPTWRoute
 * @brief Representa una ruta en el problema TOPTW.
 */
public class TOPTWRoute {
    int predecessor; ///< El predecesor en la ruta.
    int successor; ///< El sucesor en la ruta.
    int id; ///< El identificador de la ruta.
    
    /**
     * @brief Constructor por defecto de TOPTWRoute.
     */
    TOPTWRoute() {
        
    }
    
    /**
     * @brief Constructor de TOPTWRoute con predecesor, sucesor e identificador.
     * @param pre El predecesor.
     * @param suc El sucesor.
     * @param id El identificador.
     */
    TOPTWRoute(int pre, int suc, int id) {
        this.predecessor = pre;
        this.successor = suc;
        this.id = id;
    }
    
    /**
     * @brief Obtiene el predecesor de la ruta.
     * @return El predecesor.
     */
    public int getPredecessor() {
        return this.predecessor;
    }
    
    /**
     * @brief Obtiene el sucesor de la ruta.
     * @return El sucesor.
     */
    public int getSuccessor() {
        return this.successor;
    }
    
    /**
     * @brief Obtiene el identificador de la ruta.
     * @return El identificador.
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * @brief Establece el predecesor de la ruta.
     * @param pre El nuevo predecesor.
     */
    public void setPredecessor(int pre) {
        this.predecessor = pre;
    }
    
    /**
     * @brief Establece el sucesor de la ruta.
     * @param suc El nuevo sucesor.
     */
    public void setSuccessor(int suc) {
        this.successor = suc;
    }
    
    /**
     * @brief Establece el identificador de la ruta.
     * @param id El nuevo identificador.
     */
    public void setId(int id) {
        this.id = id;
    }
}
