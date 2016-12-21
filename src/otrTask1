import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Wish you enjoy this code.
 * <p/>
 * <p/>
 * Created by Step on 18.12.2016.
 */
public class otrTask1 extends Exception {
    public static void main(String [] args) throws InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer address1 = new StringBuffer(15);
        try {
            System.out.println("Write first IP address:");
            address1.append(reader.readLine());
           
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuffer address2 = new StringBuffer(15);
        try {
            System.out.println("Write second IP address:");
            address2.append(reader.readLine());
           
        } catch (IOException e) {
            e.printStackTrace();
        }

        int [] arr1 = new int[4];
        arr1 = destructurize(address1);


        int [] arr2 = new int[4];
        arr2 = destructurize(address2);

        long begin = arr1[0]*256*256*256 + arr1[1]*256*256 + arr1[2]*256 + arr1[3] + 1;  // небольшой костыль
        long end = arr2[0]*256*256*256 + arr2[1]*256*256 + arr2[2]*256 + arr2[3];


        /*
        ------===== Main output loop =====------
               convert 10 -> 256 algorithm  
               print   created IP address 
        _________________________________________
         */
        while (begin!=end){

            begin++;
            long a = begin;
            short p;
            StringBuffer strBuf = new StringBuffer(15);
            while (a != 0) {
                p = (short) (a % 256);
                if (p<=0) p+=255;
                a = a/256;
                if (a != 0)
                    strBuf.insert(0,p).insert(0, '.');
                else
                    strBuf.insert(0,p);
            }
            System.out.println(strBuf);
        }

    }
    /*
    В этом методе вы разбиваем введеный IP на числа между точками и возвращаем массив этих чисел
     */
    private static int[] destructurize(StringBuffer address) {
        String[] arr = new String[4];
        int m = 0;
        int n;
        int [] num = new int[4];
        for (int i=0; i<4; i++){
            n = address.indexOf(".", m);
            if (n != -1)
                arr[i] = address.substring(m, n);
            else
                arr[i] = address.substring(m, address.length());
            m = n+1;
            num[i] =  Integer.parseInt(arr[i]);
        }
        return num;
    }

}
