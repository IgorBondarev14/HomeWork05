import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

public class HomeWork05{
    public static void main(String[] args) {
        //Создать словарь HashMap. Обобщение <Integer, String>.
        HashMap<Integer, String> hm = new HashMap<>();
       
        //Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
        hm.put(1, "green");
        hm.put(2, "yellow");
        hm.put(3, "red");
        System.out.println(hm);
        System.out.println();

        // Изменить значения дописав восклицательные знаки.
        hm.put(1, "green!");
        hm.put(2, "yellow!");
        hm.put(3, "red!");
        System.out.println(hm);
        System.out.println();
        
        //*Создать TreeMap, заполнить аналогично.
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "green");
        tm.put(2, "yellow");
        tm.put(3, "red");
        System.out.println(tm);
        System.out.println();
        
        tm.put(1, "green!");
        tm.put(2, "yellow!");
        tm.put(3, "red!");
        System.out.println(tm);
        System.out.println();
        
        //*Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
        Random random = new Random();
        long startTM = System.nanoTime();
        for (int i = 0; i < 1001; i++) {
            tm.put(random.nextInt(0, 10000), "Общая строка");
        }
        long finishTM = System.nanoTime();
        long startHM = System.nanoTime();
        for (int i = 0; i < 1001; i++) {
            hm.put(random.nextInt(0, 10000), "Общая строка");
        }
        long finishHM = System.nanoTime();
        System.out.println(tm);
        System.out.println();
        
        //**Сравнить время прямого и случайного перебора тысячи элементов словарей.     
        long workTimeTM = finishTM - startTM;
        long workTimeHM = finishHM - startHM;
        System.out.println("Время заполнения TreeMap 1000 элементов составило " + workTimeTM/1000 + " милисекунд");
        System.out.println("Время заполнения HashMap 1000 элементов составило " + workTimeHM/1000 + " милисекунд");
    }
}
