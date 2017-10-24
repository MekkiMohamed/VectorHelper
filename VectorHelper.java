import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/**
 * Created by Bureau on 19/10/2017.
 */
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

}