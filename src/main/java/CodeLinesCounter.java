import java.io.BufferedReader;
import java.io.FileReader;

public class CodeLinesCounter {
    public static void main(String[] args) throws Exception {
        String file = "src/main/java/Code.java";
        BufferedReader reder =
                new BufferedReader(new FileReader(file));

        String line;
        int codeLines = 0;
        boolean comment = false;
        while ((line = reder.readLine()) != null ) {
            if (comment && line.indexOf("*/") >= 0){
                comment = false;
            }

            if (comment)
                continue;

            if (!line.matches(" [ ]*//.*")) {
                codeLines++;
            } else if (line.matches("/\\*[ ]*[^*/ ]+.*")){
                codeLines++;
            } else if(line.indexOf("/*") == -1) {
                codeLines++;
            } else {
                comment = true;
            }
        }
        System.out.println(codeLines);
    }
}
