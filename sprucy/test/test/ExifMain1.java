package test;

import java.io.IOException;
import java.util.ArrayList;

import org.im4java.core.ETOperation;
import org.im4java.core.ExiftoolCmd;
import org.im4java.core.IM4JavaException;
import org.im4java.process.ArrayListOutputConsumer;

public class ExifMain1 {

    /**
     * <pre>
     * File Name                       : t.JPG
     * Camera Model Name               : Canon EOS 60D
     * Date/Time Original              : 2012:07:14 12:01:21
     * Shutter Speed                   : 1/50
     * Aperture                        : 8.0
     * Metering Mode                   : Center-weighted average
     * Exposure Compensation           : 0
     * ISO                             : 100
     * Lens                            : EF-S17-55mm f/2.8 IS USM
     * Focal Length                    : 17.0 mm
     * Image Size                      : 533x800
     * Flash                           : Off, Did not fire
     * White Balance                   : Manual
     * Color Space                     : sRGB
     * File Size                       : 89 kB
     * Owner Name                      : Wang Tietang
     * Serial Number                   : 1581014572
     * 
     * </pre>
     * 
     * @param args
     * @throws IOException
     * @throws InterruptedException
     * @throws IM4JavaException
     */
    public static void main(String[] args)
        throws IOException,
        InterruptedException,
        IM4JavaException {

        ETOperation op = new ETOperation();
        op.getTags(
            "Make",
            "Model",
            "FNumber",
            "ShutterSpeed",
            "iso",
            "Lens",
            "LensModel",
            "FocalLength",
            "ExposureTime");

        op.addImage();

        // setup command and execute it (capture output)
        ArrayListOutputConsumer output = new ArrayListOutputConsumer();
        ExiftoolCmd et = new ExiftoolCmd();
        et.setOutputConsumer(output);

        // et.run(op, "C:\\Users\\wtt\\Desktop\\3\\IMG_3407.JPG");
        // et.run(op, "C:\\Users\\wtt\\Desktop\\3\\");
        // et.run(op, "L:\\im4java-1.3.2\\images.src");
        et.run(op, "C:\\Users\\tietang\\Desktop\\3\\DPP_0180.JPG");

        // dump output
        ArrayList<String> cmdOutput = output.getOutput();
        for (String line : cmdOutput) {
            //System.out.println(line);
        }

    }

}
