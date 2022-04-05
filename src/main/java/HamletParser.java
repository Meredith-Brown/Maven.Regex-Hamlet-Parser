import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }

    // TODO - add piece that writes this back to file
    public String changeHamletToLeon(String hamletText) {
        if (findHamlet(hamletText) > 0) {
            Pattern pattern = Pattern.compile("Hamlet");
            Matcher matcher = pattern.matcher(hamletText);
            String updatedHamletText0 = matcher.replaceAll("Leon");
            Pattern pattern2 = Pattern.compile("HAMLET");
            Matcher matcher2 = pattern2.matcher(updatedHamletText0);
            String updatedHamletText = matcher2.replaceAll("LEON");
            return updatedHamletText;
        }
        return null;
    }

    public String changeHoratioToTariq(String hamletText) {
        if (findHoratio(hamletText) > 0) {
            Pattern pattern = Pattern.compile("Horatio");
            Matcher matcher = pattern.matcher(hamletText);
            String updatedHamletText0 = matcher.replaceAll("Tariq");
            Pattern pattern2 = Pattern.compile("HORATIO");
            Matcher matcher2 = pattern2.matcher(updatedHamletText0);
            String updatedHamletText = matcher2.replaceAll("TARIQ");
            return updatedHamletText;
        }
        return null;
    }

    public int findHamlet(String hamletText) { // returns count
        int count = 0;
        Pattern pattern = Pattern.compile("Hamlet");
        Matcher matcher = pattern.matcher(hamletText);
        while (matcher.find()) {
            count++;
        }
        Pattern pattern2 = Pattern.compile("HAMLET");
        Matcher matcher2 = pattern2.matcher(hamletText);
        while (matcher2.find()) {
            count++;
        }
        return count;
    }

    public int findHoratio(String hamletText) { // returns count
        int count = 0;
        Pattern pattern = Pattern.compile("Horatio");
        Matcher matcher = pattern.matcher(hamletText);
        while (matcher.find()) {
            count++;
        }
        Pattern pattern2 = Pattern.compile("HORATIO");
        Matcher matcher2 = pattern2.matcher(hamletText);
        while (matcher2.find()) {
            count++;
        }
        return count;
    }

    public int findLeon(String hamletText) { // returns count
        int count = 0;
        Pattern pattern = Pattern.compile("Leon");
        Matcher matcher = pattern.matcher(hamletText);
        while (matcher.find()) {
            count++;
        }
        Pattern pattern2 = Pattern.compile("LEON");
        Matcher matcher2 = pattern2.matcher(hamletText);
        while (matcher2.find()) {
            count++;
        }
        return count;
    }

    public int findTariq(String hamletText) { // returns count
        int count = 0;
        Pattern pattern = Pattern.compile("Tariq");
        Matcher matcher = pattern.matcher(hamletText);
        while (matcher.find()) {
            count++;
        }
        Pattern pattern2 = Pattern.compile("TARIQ");
        Matcher matcher2 = pattern2.matcher(hamletText);
        while (matcher2.find()) {
            count++;
        }
        return count;
    }
}


