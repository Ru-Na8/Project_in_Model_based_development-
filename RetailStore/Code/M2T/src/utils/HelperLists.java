package utils;

import java.util.Collections;
import java.util.List;

public class HelperLists {

    public static <T> List<T> reverseListInJava(List<T> list) {
        Collections.reverse(list);
        return list;
    }
}
