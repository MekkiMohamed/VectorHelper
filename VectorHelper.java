
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;


public class VectorHelper {

    public static int[]  somme(int[] vec1,int[] vec2)throws Exception{
        if (vec1.length!=vec2.length)  throw new VectorException();
        int[] tab=new int[vec1.length];
        for(int i=0;i<tab.length;i++){
            tab[i]=vec1[i]+vec2[i];
        }
        return tab;
    }


    public static void fonction(int[] vec, char op,int val){
        if (op == '+'){
            for (int i=0;i<vec.length;i++) vec[i]+=val;
        }else if (op == '-'){
            for (int i=0;i<vec.length;i++) vec[i]-=val;

        }else if (op == '*'){
            for (int i=0;i<vec.length;i++) vec[i]*=val;
        }else if (op == '/'){
            for (int i=0;i<vec.length;i++) vec[i]/=val;
        }
    }


    public static void trie(int[] vecteur){
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

    public static void invers(int[] vecteur){
        int n;
        for(int i=0 ; i<vecteur.length/2 ; i++){
            n=vecteur[i];
            vecteur[i]=vecteur[vecteur.length-1-i];
            vecteur[vecteur.length-1-i]=n;
        }
    }

    public static void vectMinMax(int[] vecteur, int min, int max){
        min=vecteur[0];
        max=vecteur[0];

        for(int i=0 ; i<vecteur.length ; i++){
            if (min > vecteur[i]) min=vecteur[i];
            if (max < vecteur[i]) max=vecteur[i];
        }
    }


}
