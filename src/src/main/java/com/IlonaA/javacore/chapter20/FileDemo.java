package src.main.java.com.IlonaA.javacore.chapter20;

import java.io.File;
import java.io.IOException;

//продемонитрировать применение некоторых методов из класса File
public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\java\\home\\avvakumova\\dev\\education\\src\\src\\main\\java\\com\\IlonaA\\javacore\\COPYRIGHT");
        File f2 = new File("D:\\java\\home\\avvakumova\\dev\\education\\src\\src\\main\\java\\com\\IlonaA\\javacore\\B");
        p("Создать файл COPYRIGHT " + f1.createNewFile() );
     //   p("Создать каталог " + f2.mkdir() );
        p("Имя файла: " + f1.getName());
        p("Путь: " + f1.getPath());
        p("Абсолютный путь: " + f1.getAbsolutePath());
        p("Родительский каталог: " + f1.getParent());
        p( f1.exists() ? "существует" : "не существует");
        p( f1.canWrite() ? "доступен для записи" : "не доступен для записи");
        p( f1.canRead() ? "доступен для чтения" : "не доступен для чтения");
        p( f1.isDirectory() ? "является каталогом" : "не является каталогом");
        p( f1.isFile() ? "является обычным файлом" : "может быть именнованным каналом");
        p( f1.isAbsolute() ? "является абсолютным" : "не является абсолютным");
        p("Последнее изменение в файле:  " + f1.lastModified());
        p("Размер: " + f1.length() + " байт");
//f2.delete();


    }
}
