/**
 * Created by Bureau on 19/10/2017.
 */
public class main {
    public static void main(String args[]){
        int[] vec1= new int[10];
        int[] vec2=new int[10];
        int[] vec3=new int[10];
        for (int i=0;i<10;i++){
            vec1[i]=i;
            vec2[i]=10-vec1[i];
        }
        VectorHelper.fonction(vec1,'*',2);
        try {
            vec3=VectorHelper.somme(vec1,vec2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i=0;i<10;i++){
            System.out.print(vec3[i]+" ");
        }
    }
}
