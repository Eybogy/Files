import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*Программа, которая вычисляет количество символов 'r' в произвольном текстовом файле.*/

public class One {
    int all = 0;
    String name = "E:\\Other\\One_number.txt";
    Path file = Paths.get(name);        // Создаю объект Path
    byte[] str = Files.readAllBytes(file);  // Чтения файла
    String text = new String(str);      // Преобразую в текст

    public One() throws IOException {
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'r') {
                all++;
            } }
        if (all != 0) {
            System.out.println("Количество символов 'r' в файле:" + all);
        } else {
            System.out.println("В файле нет символа 'r'");
        }
    }
}
