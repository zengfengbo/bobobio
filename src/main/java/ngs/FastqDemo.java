package ngs;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;

import java.io.*;
import java.util.Date;

/**
 * Created by fb on 16/3/17.
 */
public class FastqDemo {
    public static void main(String[] args) {
        Date start = new Date();
        System.out.println(start);
        generateFastq(20000000, 65, "/Users/fb/src/bobobio/test/demo.fastq");
        Date end = new Date();
        System.out.println(end);
        long diff = end.getTime() - start.getTime();
        System.out.println(diff);
    }

    public static void generateFastq(int recordNumber, int length, String fileName) {
        BufferedWriter bw = null;
        try {
            File out = new File(fileName);
            if (out.exists()) {
                out.delete();
            }
            out.createNewFile();
            FileWriter fw = new FileWriter(out);
            bw = new BufferedWriter(fw);

            for(int i =0;i < recordNumber; i++){
                String seq = RandomStringUtils.random(length,"AGCT");
                FastqRecordDemo fr = new FastqRecordDemo(Integer.toString(i+1),seq,"", StringUtils.repeat("#",length));
                bw.append(fr.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readFile(File fastqFile) {

    }
}
