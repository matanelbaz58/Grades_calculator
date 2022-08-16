import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        AllCourse allCourse = new AllCourse(8);

        //JFrame frame = new JFrame();
        //Course mat = new Course();
        //frame.add(mat);
        allCourse.setSize(new Dimension(300,300));
        frame.add(allCourse);
        //allCourse.setResizable(false);
        frame.setVisible(true);
    }
}
