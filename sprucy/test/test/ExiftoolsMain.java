package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.im4java.core.ETOperation;
import org.im4java.core.ExiftoolCmd;
import org.im4java.core.IM4JavaException;
import org.im4java.process.ArrayListOutputConsumer;

public class ExiftoolsMain {

    /**
     * <pre>
     * 
     * Make                            : Canon
     * Camera Model Name               : Canon EOS 60D
     * F Number                        : 4.5
     * Shutter Speed                   : 1/60
     * ISO                             : 320
     * Lens                            : EF-S17-55mm f/2.8 IS USM
     * Focal Length                    : 55.0 mm
     * </pre>
     * 
     * @param args
     * @throws SecurityException
     * @throws IllegalArgumentException
     * @throws IOException
     * @throws InterruptedException
     * @throws IM4JavaException
     */
    public static void main(String[] args) throws Exception {

        ETOperation op = new ETOperation();

        op.overwrite_original_in_place();
        op.setTags("exif:Make=New", "exif:Model=New XX 44D", "exif:FNumber=1.2");

        op.addImage();

        // setup command and execute it (capture output)
        ArrayListOutputConsumer output = new ArrayListOutputConsumer();
        ExiftoolCmd et = new ExiftoolCmd();

        et.setOutputConsumer(output);
        et.run(op, "C:\\Users\\wtt\\Desktop\\3\\3.JPG");

        // et.run(op, "C:\\Users\\wtt\\Desktop\\3\\");
        // et.run(op, "L:\\im4java-1.3.2\\images.src");
        // et.run(
        // op,
        // "C:\\Users\\wtt\\Documents\\GitHub\\spruce\\sprucy\\upload\\2A8\\74\\17F\\");

        // dump output
        ArrayList<String> cmdOutput = output.getOutput();
        for (String line : cmdOutput) {
            System.out.println(line);
        }

    }

}
