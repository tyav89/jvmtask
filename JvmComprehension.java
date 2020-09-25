public class JvmComprehension { // Выполняется подсистема загрузки классов, подгрузка класса в Metaspace

    public static void main(String[] args) { // Создание фрейма main в Stack Memory
        int i = 1;                      // 1 Создание примитива int i во фрейме main
        Object o = new Object();        // 2 Создание обьекта Object в heap и создание ссылки o из фрейма
                                        // main на Object в heap
        Integer ii = 2;                 // 3 Создание обьекта Integer в heap со значением 2 и создание ссылки ii
                                        // из фрейма main на Integer в heap
        printAll(o, i, ii);             // 4 Создание фрейма printAll в Stack Memory
        System.out.println("finished"); // 7 В фрейм передается строка "finished"
    }

    private static void printAll(Object o, int i, Integer ii) { // Иницилизация
        Integer uselessVar = 700;                   // 5 Создание обьекта Integer в heap со значением 700 и создание
                                                    // ссылки uselessVar из фрейма printAll на Integer в heap
        System.out.println(o.toString() + i + ii);  // 6 Создание фрейма в Stack Memory и в него  передаются ссылки
                                                    // на результат выполнение метода toString обьекта o примитив i
                                                    // и обьект ii
    }
}