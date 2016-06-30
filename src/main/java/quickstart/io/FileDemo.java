package quickstart.io;

import java.io.File;

/**
 * Created by fb on 16/3/19.
 */
public class FileDemo {
    public static void main(String[] args){
        System.out.println(getCwd());
    }

    public static File getCwd() {
        File cwd1 = new File(System.getProperty("user.dir"));

        File cwd2 = new File("").getAbsoluteFile();

        return cwd1;
    }
}
