import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Insets;
import java.awt.Dimension;

public class AllCourse extends JPanel {



    public AllCourse(int x){
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));


        this.add(Box.createRigidArea(new Dimension(0,5)));
        Course course;
        for (int i = 0; i<x; i++){
           course = new Course();
           this.add(course);
        }















    }
}
