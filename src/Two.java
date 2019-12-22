import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*Программа, вычисляющая число слов в произвольном текстовом файле, каждое из которых содержит не менее трех символов 'r'.*/

public class Two {
    int all = 0;
    int allR = 0;
    String name = "E:\\Other\\Two_number.txt";
    Path file = Paths.get(name);        // Создаю объект Path
    byte[] str = Files.readAllBytes(file);  // Чтения файла
    String text = new String(str);      // Преобразую в текст

    public Two() throws IOException {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'r') {
                allR++;
            } else if (text.charAt(i) == ' ') {
                if (allR >= 3) {
                    all++;
                    allR = 0;
                } else {
                    allR = 0;
                }
            }
        } if (all != 0) {
            System.out.println("количество слов в файле содержащих не менее трёх символов 'r': " + all);
        } else {
            System.out.println("В файле нет слов в которых не менее трёх символов 'r'");
        }
    }
}