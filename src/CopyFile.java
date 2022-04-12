import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> text = readAndWriteFile.readFile("file.txt");
        readAndWriteFile.writeFile("result.txt", text);
    }
}
