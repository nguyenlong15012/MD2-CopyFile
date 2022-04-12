import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<String> readFile(String filePath){
        List<String> str = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int count = 0;
            while ((line = br.readLine()) != null){
                str.add(line);
                for (int i =0; i<line.length(); i++){
                    count++;
                }
            }
            String displaycount = "Tổng ký tự: " +count;
            str.add(displaycount);
            br.close();
        }catch (Exception e){
            System.err.println("File không tồn tại or nội dung có lỗi! ");
        }
        return str;
    }

    public void writeFile(String filePath, List<String> str){
        try{
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (String i : str){
                bufferedWriter.write(i);
            }
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
