public class JvmComprehension {
    // Система ClassLoader-ов подгружает класс JvmComprehension
    // Информация о классе JvmComprehension хранится в MetaSpace

    public static void main(String[] args) {
        // 0 - В Стеке (Stack Memory) создается фрейм main()
        // 1 - В Стеке (Stack Memory) в фрейме main() создается переменная i примитивного типа int
        // и переменной i присваивается значение 1
        int i = 1;

        // 2 - в Куче (Heap) создается объект Object, в стеке создается ссылка "o" на объект в куче
        Object o = new Object();

        // 3 - в Куче (Heap) создается объект Integer со значением 2,
        // в стеке в фрейме main() создается ссылка "ii" на объект в куче
        Integer ii = 2;

        // 4 - В Стеке (Stack Memory) создается фрейм printAll(), в который передается ссылка "o" на объект Object в куче,
        // передается переменная i, передается ссылка "ii" на объект Integer в куче (heap)
        printAll(o, i, ii);

        // 7 - В Стеке (Stack Memory) в фрейм println() передается ссылка на объект типа String со значением "finished",
        // созданный в Куче (Heap)
        System.out.println("finished");

        // Отрабатывает сборщик мусора Garbage Collector, по ходу выполнения программы.
    }

    private static void printAll(Object o, int i, Integer ii) {
        // 5 - В Куче (Heap) создается объект Integer со значением 700,
        // в Стеке (Stack Memory) во фрейме printAll() создается ссылка "uselessVar" на объект в куче
        Integer uselessVar = 700;
        // 6 - В Стеке (Stack Memory) создается фрейм println(),
        // куда передаются ссылки "o" на Object в Куче (Heap), "i" на int во фрейме main() в Стеке (Stack Memory),
        // "ii" на Integer в Куче (Heap)
        // В Стеке (Stack Memory) создается фрейм toString()
        System.out.println(o.toString() + i + ii);
    }
}

