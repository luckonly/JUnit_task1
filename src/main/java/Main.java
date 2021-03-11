import java.util.*;

public class Main {

    protected static int listSize;
    protected static int maxValue;
    protected static int newInt;
    protected static int filterValue;
    protected static List<Integer> list;

    public static void main(String[] args) throws SecurityException {

        Logger logger = Logger.getInstance();
        logger.log(logger.currentDate() + "Начинаем работу программы:");

        getListSize();
        getMaxValue();
        getRandomValueList();
        getFilterValue();
        getRandomValueListFilteredByValue();

        logger.log(logger.currentDate() + "Завершение работы программы");
        logger.showLog();

    }

    public static void getRandomValueListFilteredByValue() {

        Filter filter = new Filter(filterValue);
        filter.filterOut(list);

    }

    public static void getFilterValue() {

        Logger logger = Logger.getInstance();
        logger.log(logger.currentDate() + "Просим пользователя ввести значение для фильтрации элементов в списке");
        System.out.println("Введите значение для фильтрации списка:");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String inputLine = scanner.nextLine();
            try {
                filterValue = Integer.parseInt(inputLine);
                logger.log(logger.currentDate() + "Пользователь ввел значение фильтра: " + inputLine);
                break;
            } catch (NumberFormatException ex) {
                logger.log(logger.currentDate() + "Введенное значение фильтра не смогли преобразовать в число (" + inputLine + ")");
                System.out.println("Введено неверное значение фильтра. Повторите попытку");
            }
        }
    }

    public static void getRandomValueList() {

        Logger logger = Logger.getInstance();
        logger.log(logger.currentDate() + "Генерируем список элементов на основании веденных данных");

        list = new ArrayList<>();

        for (int i = 0; i < listSize; i++) {
            newInt = new Random().nextInt(maxValue);
            logger.log(logger.currentDate() + "В список элементов добавлено новое случайное число " + newInt);
            list.add(newInt);
        }

    }

    public static void getMaxValue() {

        Logger logger = Logger.getInstance();
        logger.log(logger.currentDate() + "Просим пользователя ввести верхнюю границу значений элементов в списке");

        System.out.println("Введите верхнюю границу значений элементов в списке:");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String inputLine = scanner.nextLine();
            try {
                maxValue = Integer.parseInt(inputLine);
                logger.log(logger.currentDate() + "Пользователь ввел верхнюю границу значений элементов в списке: " + inputLine);
                break;
            } catch (NumberFormatException ex) {
                logger.log(logger.currentDate() + "Введенное значение верхней границы значений элементов в списке не смогли преобразовать в число (" + inputLine + ")");
                System.out.println("Введено неверное значение. Повторите попытку");
            }
        }

    }

    public static void getListSize() {

        Logger logger = Logger.getInstance();
        logger.log(logger.currentDate() + "Просим пользователя ввести количество элементов в массиве");

        System.out.println("Введите размер списка:");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String inputLine = scanner.nextLine();
            try {
                listSize = Integer.parseInt(inputLine);
                logger.log(logger.currentDate() + "Пользователь ввел количество элементов равное: " + inputLine);
                break;
            } catch (NumberFormatException ex) {
                logger.log(logger.currentDate() + "Введенное значение размера списка не смогли преобразовать в число (" + inputLine + ")");
                System.out.println("Введено неверное значение. Повторите попытку");
            }
        }

    }
}
