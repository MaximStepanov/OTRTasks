import org.junit.Assert;
import org.junit.Test;


import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Wish you enjoy this code.
 * <p/>
 * <p/>
 * Created by Step on 22.12.2016.
 */
public class Task2Test extends Assert {
    @Test
    public void testInput() {
        HashMap<String, List<String>> map1 =  new HashMap<String, List<String>>();

        map1 =  Task2.fillBook(map1);

        assertNotNull(map1);
      //  assertFalse(map1.isEmpty());
      //  assertTrue(map1.size() > 0);
    }

    @Test
    public void checkValues() {
        HashMap<String, List<String>> map1 =  new HashMap<String, List<String>>();

        map1 =  Task2.fillBook(map1);
        boolean allRight = false;
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,} [A-Z]\\.[A-Z]\\.$");

        for (String names :
        map1.keySet()) {
            if (pattern.matcher(names).matches())
                allRight = true;
            else
                allRight = false;
            if (!allRight)
                break;
        }
        assertFalse(!allRight);
        assertTrue(allRight);
    }
}
