package P3_FindInMatrix;

public class test {
    public static void main(String args[])
    {
        FindInMatrix2 test=new FindInMatrix2();
        int[][] testarray=new int[1][1];
        testarray[0][0] = (Integer) null;
//        testarray[0][0]=1;
//        testarray[0][1]=2;
//        testarray[0][2]=8;
//        testarray[0][3]=9;
//        testarray[1][0]=2;
//        testarray[1][1]=4;
//        testarray[1][2]=9;
//        testarray[1][3]=12;
//        testarray[2][0]=4;
//        testarray[2][1]=7;
//        testarray[2][2]=10;
//        testarray[2][3]=13;
//        testarray[3][0]=6;
//        testarray[3][1]=8;
//        testarray[3][2]=11;
//        testarray[3][3]=15;
        System.out.println(test.find(testarray,16));
    }
}
