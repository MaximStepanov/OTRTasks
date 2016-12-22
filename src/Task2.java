import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task2 { 

    public static void main(String[] args) throws IOException {
        HashMap<String, List<String>> phoneBook =  new HashMap<String, List<String>>();
        /*
        Заполнение Базы номеров
         */
        fillBook(phoneBook);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Vvedite FIO:");
        String fio = reader.readLine();

        showNumbers(fio, phoneBook);
    }

    public static HashMap<String, List<String>> fillBook (HashMap<String, List<String>> map) {

       map.put("Ivanov I.I.", Arrays.asList("+7(950)33-555-66", "+7(950)33-555-77"));
       map.put("Pankratov H.F.", Arrays.asList("+7(950)33-666-22"));
       map.put("Surikova E.V.", Arrays.asList("+7(950)44-666-00", "+7(950)44-666-11", "+7(950)44-666-22"));
       map.put("Sidorov N.D.", Arrays.asList("+7(950)55-555-22", "+7(950)55-555-33"));
       map.put("Putin V.V.", Arrays.asList("+7(950)33-666-22"));
       map.put("Arshavin A.P.", Arrays.asList("+7(950)33-777-66", "+7(950)33-777-77"));
       map.put("Stepanov M.D.", Arrays.asList("+7(950)33-666-22"));
        return map;
    }

    public static void showNumbers (String name, HashMap<String, List<String>> map) {
        List<String> numbers = map.get(name); // Возвращаем список номеров по ключу - введенному имени
        if (numbers == null)
            System.out.println("There's no such person in DB");
        else {
            int i=1;
            for (String str :
                    numbers) {
                System.out.println(i++ + ". " + str);
            }
        }
    }
}
