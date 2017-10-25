import static org.junit.Assert.*;

public class VectorHelperTest {
    @org.junit.Test
    public void somme() throws Exception {
        int[] vec1=new int[10];
        int[] vec2=new int[10];
        int[] vec3=new int[10];

        for (int i=0;i<vec1.length;i++){
            vec1[i]=i;
            vec2[i]=10-i;
        }
        vec3=VectorHelper.somme(vec1,vec2);

        boolean vrai=true;
        for (int i=0;i<vec1.length;i++){
            if (vec3[i]!=10) vrai=false;
        }

        assertTrue("somme incorecte",vrai);
    }

    @org.junit.Test
    public void fonction() throws Exception {
        int[] vec=new int[3];
        vec[0]=2;
        vec[1]=3;
        vec[2]=5;

        VectorHelper.fonction(vec,'*',2);
        assertTrue("produit ne fonctionne pas",(vec[0]==4)&&(vec[1]==6)&&(vec[2]==10));

        vec[0]=2;
        vec[1]=3;
        vec[2]=5;

        VectorHelper.fonction(vec,'+',2);
        assertTrue("somme ne fonctionne pas",(vec[0]==4)&&(vec[1]==5)&&(vec[2]==7));

        vec[0]=2;
        vec[1]=3;
        vec[2]=5;

        VectorHelper.fonction(vec,'-',2);
        assertTrue("soustraction ne fonctionne pas",(vec[0]==0)&&(vec[1]==1)&&(vec[2]==3));

    }

    @org.junit.Test
    public void trie() throws Exception {
        int[] vec=new int[20];
        for (int i=0;i<vec.length;i++){
            vec[i]=(int) Math.random()*100;
        }
        VectorHelper.trie(vec);
        for (int i=1;i<vec.length;i++){
            if (vec[i-1]>vec[i]) fail("tableau non trie");
        }


    }

    @org.junit.Test
    public void invers() throws Exception {
        int[] vec=new int[20];
        int[] vec_inv=new int[20];
        for(int i=0;i<vec.length;i++){
            vec[i]=vec_inv[vec.length-i-1]=(int)Math.random()*100;
        }
        VectorHelper.invers(vec);
        boolean vrai=true;
        for (int i=0;i<vec.length;i++){
            if (vec[i]!=vec_inv[i]) vrai=false;
        }

        assertTrue("tableau non inverse",vrai);

    }

    @org.junit.Test
    public void vectMinMax() throws Exception {
        int[] vec=new int[3];
        vec[0]=5;
        vec[1]=2;
        vec[2]=50;
        int max=0,min=0;
        VectorHelper.vectMinMax(vec,min,max);
        assertTrue("false maximum max="+max,max==0);
        assertTrue("false minimum",min==0);

    }

}