import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.charset.Charset;
import java.util.Collections;

public class Kadai03 {
    public static void main(String[] args) {
        Path path = Paths.get(".","scores.csv");
        try {
            List<String> lines = Files.readAllLines(path, Charset.forName("UTF-8"));
            Collections.sort(lines, Collections.reverseOrder());
            for(int i = 0; i < lines.size(); i++){
                String[] data = lines.get(i).split(",");
                

                if(data.length > 3) {
                    System.out.print(data[0] + ",");
                    System.out.print(data[1] + ",");
                    System.out.print(data[2] + ",");
                    System.out.println(data[3]);
                }
                
                
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

        