
/**
 * <b>VectorHelper est une classe qui facilite le traitement des vecteurs.</b>
 * <p>
 * Cette classe assure les opérations suivantes:
 * <ul>
 *         <li>Trier les éléments d'un vecteur.</li>
 *         <li>Sommer deux vecteurs.</li>
 *         <li>Inverser les éléments d'un vecteur.</li>
 *         <li>Obtenir simultanément le minimum et le maximum d’un vecteur.</li>
 *         <li>Appliquer une formule (addition, soustraction, multiplication) à tous les éléments d’un vecteur.</li>
 * </ul>
 * </p>
 *
 * @author MekkiMohamed, ritsurito21
 * @version 2.0
 */
public class VectorHelper {

    /**
     * Retourne la somme de deux vecteurs.
     * @param vec1
     *          le premier vecteur.
     * @param vec2
     *          le deuxiéme vecteur.
     *
     * @return  la somme des deux vecteurs sous forme d'un vecteur.
     * @throws VectorException si les deux vecteurs n'ont pas la méme taille.
     */
    public static int[]  somme(int[] vec1,int[] vec2)throws Exception{
        if (vec1.length!=vec2.length)  throw new VectorException();
        int[] tab=new int[vec1.length];
        for(int i=0;i<tab.length;i++){
            tab[i]=vec1[i]+vec2[i];
        }
        return tab;
    }

    /**
     * Applique une formule à tout les éléments d'un vecteur.
     * @param vec
     *          le vecteur sur lequel on applique la formule.
     * @param op
     *          le type de l'opération (+ , - , *).
     * @param val
     *          la valeur utilisé.
     */
    public static void fonction(int[] vec, char op,int val){
        if (op == '+'){
            for (int i=0;i<vec.length;i++) vec[i]+=val;
        }else if (op == '-'){
            for (int i=0;i<vec.length;i++) vec[i]-=val;

        }else if (op == '*'){
            for (int i=0;i<vec.length;i++) vec[i]*=val;
        }
    }

    /**
     * Trie les éléments d'un vecteur.
     * @param vecteur
     *          le vecteur sur lequel on applique le trie.
     */
    public static void trie(int[] vecteur){
        int n;
        for(int i=0 ; i<vecteur.length ; i++){
            for(int j=i+1 ; j<vecteur.length ; j++){
                if(vecteur[i]>vecteur[j]) {
                    n=vecteur[i];
                    vecteur[i]=vecteur[j];
                    vecteur[j]=n;
                }
            }
        }
    }

    /**
     * Inverse les éléments d'un vecteur.
     * @param vecteur
     *          le vecteur sur lequel on applique l'inversement.
     */
    public static void invers(int[] vecteur){
        int n;
        for(int i=0 ; i<vecteur.length/2 ; i++){
            n=vecteur[i];
            vecteur[i]=vecteur[vecteur.length-1-i];
            vecteur[vecteur.length-1-i]=n;
        }
    }

    /**
     * Retourne le minimum et le maximum d'un vecteur.
     * @param vecteur
     *          le vecteur dans lequel on cherche le min et le max.
     * @param min_max
     *          un vecteur de deux éléments qui contiendra le minimum dans la premiére case (min_max[0]) et le maximum dans la deuxiéme case (min_max[1]).
     */
    public static void vectMinMax(int[] vecteur, int[] min_max){
        min_max[0]=vecteur[0];
        min_max[1]=vecteur[0];

        for(int i=0 ; i<vecteur.length ; i++){
            if (min_max[0] > vecteur[i]) min_max[0]=vecteur[i];
            if (min_max[1] < vecteur[i]) min_max[1]=vecteur[i];
        }
    }


}
