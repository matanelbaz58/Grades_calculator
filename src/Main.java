import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        AllCourse allCourse = new AllCourse(8);


        allCourse.setSize(new Dimension(300,300));
        frame.add(allCourse);

        frame.setVisible(true);
    }
}
