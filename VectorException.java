/**
 * <b>VectorException est une classe qui hérite de la classe Exception.</b>
 * <p>Si une exception de type VectorException est lancé, le message "lengths don't match" sera affiché</p>
 *
 * @see java.lang.Exception
 * @author MekkiMohamed
 */
public class VectorException extends Exception {

    /**
     * Retourne un message quand ce type d'exception est lancé.
     * @return  le message "lengths don't match".
     */
    public String getMessage(){
        return "lengths don't match";
    }
}
