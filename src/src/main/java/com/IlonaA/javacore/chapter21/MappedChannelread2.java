package src.main.java.com.IlonaA.javacore.chapter21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedChannelread2 {
    public static void main(String[] args) {
        FileInputStream fIn = null;
        FileChannel fChan = null;
        long fSize;
        MappedByteBuffer mBuf;
        try {
            //сначала открыть файл для ввода
           fIn = new FileInputStream("test.txt") ;
           //затем получить канал к этому файлу
           fChan = fIn.getChannel();
           //получить размер файла
           fSize = fChan.size();
           //а теперь сопоставить файл с буфером
           mBuf = fChan.map(FileChannel.MapMode.READ_ONLY,0,fSize);
           //читать байты из буфера и выводить их на экран
            for (int i = 0; i < fSize; i++) {
                System.out.print((char) mBuf.get());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fChan != null) fChan.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fIn != null) fIn.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}}
