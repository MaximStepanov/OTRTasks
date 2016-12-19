import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task2 {

    public static void main(String[] args) throws IOException {
        Map<String, List<String>> phoneBook =  new HashMap<String, List<String>>();
        /*
        Заполнение Базы номеров
         */
        phoneBook.put("Ivanov I.I.", Arrays.asList("+7(950)33-555-66", "+7(950)33-555-77"));
        phoneBook.put("Pankratov H.F.", Arrays.asList("+7(950)33-666-22"));
        phoneBook.put("Surikova E.V.", Arrays.asList("+7(950)44-666-00", "+7(950)44-666-11",
                "+7(950)44-666-22"));
        phoneBook.put("Sidorov N.D.", Arrays.asList("+7(950)55-555-22", "+7(950)55-555-33"));
        phoneBook.put("Putin B.B.", Arrays.asList("+7(950)33-666-22"));
        phoneBook.put("Arshavin A.P.", Arrays.asList("+7(950)33-777-66", "+7(950)33-777-77"));
        phoneBook.put("Stepanov M.D.", Arrays.asList("+7(950)33-666-22"));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Vvedite FIO:");
        String fio = reader.readLine();

        List<String> numbers = phoneBook.get(fio); // Возвращаем список номеров по ключу - введенному имени
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
