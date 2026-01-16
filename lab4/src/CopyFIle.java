import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyFIle {
        public static void main(String[] args) {
            File source = new File("old_file");
            File copy = new File("new_file");
            try{
                source.delete();
                Files.copy(source.toPath(), copy.toPath());
            } catch (IOException e) {
                System.out.println("Copy error");
            }
        }
    }