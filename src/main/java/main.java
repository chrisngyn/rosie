import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InterruptedIOException;

public class main {
    public static void main(String[] args) throws Exception {

        String fileName = "tokens.txt";
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String token = bufferedReader.readLine(); // grab token from tokens.txt file
        JDA build = new JDABuilder(token).build();
        bufferedReader.close();

        build.addEventListener(new featureHelp());
        build.addEventListener(new featureArithmetic());
        build.addEventListener(new featureRNG());
        build.addEventListener(new featureReminder());
    }
}