package lessn10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class IOstreams {
    //1.Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
    public static void aMethodThatReads(){
        File file1 = new File("files/file1.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))){
            String content = null;
            while ((content = reader.readLine()) != null){
                System.out.println(content);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
    //2.Написать метод, который записывает в файл строку, переданную параметром.
    public static void writesToAfile(String s){
        File file2 = new File("files/file2.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file2);
            fr.write(s);
        } catch (IOException e) {
            e.getMessage();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }
    //3.Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.
    public static void gluingFiles(){
        File file1 = new File("files/file1.txt");
        File file2 = new File("files/file2.txt");
        File file3 = new File("files/file3.txt");

        OutputStream os = null;
        InputStream is1 = null;
        InputStream is2 = null;
        String s = "\n";
        try{
            os = new FileOutputStream(file3);
            is1 = new FileInputStream(file1);
            is2 = new FileInputStream(file2);

            //Записываем первый файл...
            while(is1.available()>0){
                os.write(is1.read());
            }
            os.write(s.getBytes());//С новой строки...
//Записываем второй файл...
            while(is2.available()>0){
                os.write(is2.read());
            }

        } catch (IOException e) {
            e.getMessage();
        }finally {
            try{
                if(is1 != null && is2 != null){
                    is1.close();
                    is2.close();
                }
                if(os != null){
                    os.close();
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
    //4.Написать метод который заменяет в файле все не символьные знаки на знак ‘$’.
    public static void replacingCharacters(){
        File file3 = new File("files/file3.txt");
        File file4 = new File("files/file4.txt");
        String s0 = null;

        OutputStream os = null;
        InputStream is = null;

        try
        {
            os = new FileOutputStream(file4);
            is = new FileInputStream(file3);
            BufferedReader br = new BufferedReader(new FileReader(file4));
            BufferedWriter bw = new BufferedWriter(new FileWriter(file4));
            String ln;
            while(is.available()>0){
                os.write(is.read());
            }
            while((ln = br.readLine()) != null)
            {
                bw.write(ln
                        .replace(".", "$")
                        .replace("!", "$")
                        .replace(",", "$")
                        .replace(" ", "$")
                        .replace(":", "$")
                        .replace(";", "$")
                        .replace("\'", "$")
                        .replace("\"", "$")
                        .replace("\'", "$")
                );
                bw.newLine();
            }
            br.close();
            bw.close();
            Files.move(file4.toPath(), file4.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e)
        {
            e.getMessage();
        }finally{
            try{
                if(is != null){
                    is.close();
                }
                if(os != null){
                    os.close();
                }
            } catch (Exception e) {
                e.getMessage();}}}

    public static void main(String[] args)  {
        aMethodThatReads();
        writesToAfile("3.\tИспользуя решение 1 и 2, напишите метод, который склеивает два текстовый файла в один.");
        gluingFiles();
        replacingCharacters();
    }
}