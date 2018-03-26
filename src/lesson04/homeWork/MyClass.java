package lesson04.homeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyClass {
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<String>();
        strs.add("abc");
        strs.add("dwe");
        strs.add("cde");
        strs.add("bla");
        strs.add("efg");
        strs.add("fgh");

        if (strs.contains("cde")) {
            strs.remove("cde");
            System.out.println("Not needed string 'cde' was removed from the list : " + strs);
        } else {
            System.out.println("There is not found 'cde' string, nothing to remove." + strs);
        }

        System.out.println("New list of strings is : ");
        Iterator<String> iter = strs.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Collections.sort(strs);
        System.out.println("Sorted list of strings is : ");
        for (String str : strs) {
            System.out.println(str);
        }

    }
}

/*
Работа с коллекциями.
1. Создать программу, в которой:
1.1. Формируется коллекция из строк типа ArrayList (5-6 строк)
1.2. Из коллекции удаляется одно из значений
1.3. Выполняется проверка, что коллекция больше не содержит удаленный объект (результат проверки выводится в консоль)
1.4. Выполняется сортировка объектов коллекции (Collections class в помощь)
1.5. Выполняется поочередный вывод строк в консоль до сортировки и после (Iterator class в помощь)
2. Закоммитить изменения и добавить их в репозиторий на GitHub.
3. Прислать ссылку на репозиторий.
 */