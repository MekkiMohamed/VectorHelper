public class VectorHelper {

    private int n;

    void trie(int[] vecteur){
        for(int i=0;i<vecteur.length;i++){
            for(int j=i+1 ; j<vecteur.length ; i++){
                if(vecteur[i]>vecteur[j]) {
                    n=vecteur[i];
                    vecteur[i]=vecteur[j];
                    vecteur[j]=n;
                }
            }
        }
    }


}
