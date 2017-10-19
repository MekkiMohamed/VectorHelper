public class VectorHelper {



    public void trie(int[] vecteur){
        int n;
        for(int i=0 ; i<vecteur.length ; i++){
            for(int j=i+1 ; j<vecteur.length ; i++){
                if(vecteur[i]>vecteur[j]) {
                    n=vecteur[i];
                    vecteur[i]=vecteur[j];
                    vecteur[j]=n;
                }
            }
        }
    }

    public void invers(int[] vecteur){
        int n;
        for(int i=0 ; i<vecteur.length/2 ; i++){
            n=vecteur[i];
            vecteur[i]=vecteur[vecteur.length-1-i];
            vecteur[vecteur.length-1-i]=n;
        }
    }



}
