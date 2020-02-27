package autonstudio.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OpModeCreator {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        file.createNewFile();

        FileWriter fw = new FileWriter(file);
        fw.write("package org.firstinspires.ftc.teamcode;\n");
        fw.write("import com.qualcomm.robotcore.eventloop.opmode.Autonomous;\n");
        fw.write("@Autonomous\npublic class AutonClassName extends PositionBasedAuton {\n");
        fw.write("}");
        fw.close();
    }

}
