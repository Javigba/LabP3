/**
 * @file PowerSet.java
 * @brief Contiene la definición de la clase PowerSet para calcular todos los subconjuntos de un conjunto dado.
 */

package es.ull.esit.utilities;

import java.util.BitSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @class PowerSet
 * @brief Calcula todos los subconjuntos de un conjunto dado.
 * @tparam E Tipo de elementos del conjunto.
 */
public class PowerSet<E> implements Iterator<Set<E>>, Iterable<Set<E>> {

    private E[] arr = null; /**< Arreglo de elementos del conjunto. */
    private BitSet bset = null; /**< Conjunto de bits para representar el subconjunto actual. */

    /**
     * @brief Constructor de la clase PowerSet.
     * @param set Conjunto del cual se calcularán los subconjuntos.
     */
    @SuppressWarnings("unchecked")
    public PowerSet(Set<E> set) {
        this.arr = (E[]) set.toArray();
        this.bset = new BitSet(this.arr.length + 1);
    }

    /**
     * @brief Comprueba si hay más subconjuntos por calcular.
     * @return true si hay más subconjuntos, false en caso contrario.
     */
    @Override
    public boolean hasNext() {
        return !this.bset.get(this.arr.length);
    }

    /**
     * @brief Obtiene el siguiente subconjunto.
     * @return Conjunto que representa el subconjunto actual.
     */
    @Override
    public Set<E> next() {
        Set<E> returnSet = new TreeSet<>();
        for (int i = 0; i < this.arr.length; i++) {
            if (this.bset.get(i)) {
                returnSet.add(this.arr[i]);
            }
        }
        for (int i = 0; i < this.bset.size(); i++) {
            if (!this.bset.get(i)) {
                this.bset.set(i);
                break;
            } else {
                this.bset.clear(i);
            }
        }
        return returnSet;
    }

    /**
     * @brief No se permite la operación de eliminación.
     * @throws UnsupportedOperationException Si se llama a este método.
     */
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not Supported!");
    }

    /**
     * @brief Obtiene un iterador para los subconjuntos.
     * @return Iterador de subconjuntos.
     */
    @Override
    public Iterator<Set<E>> iterator() {
        return this;
    }
}
