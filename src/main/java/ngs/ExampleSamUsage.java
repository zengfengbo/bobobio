package ngs;

import htsjdk.samtools.*;

import java.io.File;
import java.io.IOException;

/**
 * Created by fb on 16/3/24.
 */
public class ExampleSamUsage {

    public static void main(String[] args)
    {
        System.out.println("hey man.");
        try {
            convertReadNameToUpperCase(
                    new File("/Users/fb/bio/data/test/chrY_1000.bam"),
                    new File("/Users/fb/bio/data/test/out.bam"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("I'am finished.");
    }

    public static void convertReadNameToUpperCase(final File inputSamOrBamFile, final File outputSamOrBamFile)
            throws IOException
    {
        final SamReader reader = SamReaderFactory.makeDefault().open(inputSamOrBamFile);
        final SAMFileWriter outputSteam = new SAMFileWriterFactory().
                makeSAMOrBAMWriter(reader.getFileHeader(), true, outputSamOrBamFile);

        for(final SAMRecord samRecord : reader){
            samRecord.setReadName(samRecord.getReadName().toUpperCase());
            System.out.println(samRecord.getAttribute("NM"));
            if ((int) samRecord.getAttribute("NM") == 1)
                outputSteam.addAlignment(samRecord);
        }

        outputSteam.close();
        reader.close();
    }
}
