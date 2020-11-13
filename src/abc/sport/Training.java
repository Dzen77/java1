package abc.sport;

import com.sun.jdi.IntegerValue;

public class Training {
    public static void main(String[] args) {
        //Тема Классы-обертки
        Integer q = 897;// Создан Класс-обертка со значением 897 формата int (Применена - Автоупаковка)
        /* Так, через Автоупаковку(Integer q = 897) мы можем создать Класс-обертку только для чисел соответствующего типа */
        /* (byte, short, int, long, float и double) */

        Integer q1 = Integer.valueOf(897);//А с помощью статического Метода (valueOf) можно создать Класс-обертку как для числа (тут тип int)
        Integer q2 = Integer.valueOf("584");// так и для числа в виде строки (тип String), если вместо 584 поставить любое слово будет Ошибка
        System.out.println(q1 + " - это число, а " + q2 + " это тоже число, но в формате строки (тип String)");

        /*          СТАТИЧЕСКИЕ ФУНКЦИИ ДЛЯ КОНВЕРТАЦИИ (ОНИ ОТОБРАЖАЮТСЯ НАКЛОННЫМ ШРИФТОМ            */
        String str = "1457";
        int n = Integer.parseInt(str); // Переведем текстовый формат числа 1457 в формат int (в виде Примитивной переменной)
        Integer n1 = Integer.valueOf(str);//Переведем текстовый формат числа 1457 в формат int (в виде Класса-обертки)
        System.out.println(n);// Теперь выведем на консоль значение переменной n типа int
        System.out.println(n1);//Выведем на консоль значение Класса-оберки Integer n1
        /* Значения Класса-обертки (Integer n1) и переменной (int n) выведенные на консоль одинаковые */

        String str1 = Integer.toString(924);// Переведем число 924 в текстовый формат (в виде строковой переменной типа String)
        System.out.println(str1);// Вывели на консоль число str1=924, в текстовом формате
        String str2 = n1.toString();// Переведем число n1=1457 (из Класса-обертки Integer n1), в текстовый формат (в виде строковой переменной типа String)
        System.out.println(str2);// Вывели на консоль число str2=1457, в текстовом формате
    }
}