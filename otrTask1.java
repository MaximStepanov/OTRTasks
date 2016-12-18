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
    public static void main(String [] args){
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

        String [] arr1 = new String[4];
        arr1 = destructurize(address1);


        String [] arr2 = new String[4];
        arr2 = destructurize(address2);

        int n = Integer.parseInt(arr1[3]);
        int m = Integer.parseInt(arr2[3]);

        

        for (int i = n+1; i<m; i++)
            System.out.println(address1.substring(0, address1.lastIndexOf(".")) + "." + i);

    }
    /*
    В этом методе вы разбиваем введеный IP на числа между точками и возвращаем массив этих чисел
     */
    private static String[] destructurize(StringBuffer address) {
        String[] arr = new String[4];
        int m = 0;
        int n;
        for (int i=0; i<4; i++){
            n = address.indexOf(".", m);
            if (n != -1)
                arr[i] = address.substring(m, n);
            else
                arr[i] = address.substring(m, address.length());
            m = n+1;
            System.out.println(arr[i]);
        }
        return arr;
    }

}
