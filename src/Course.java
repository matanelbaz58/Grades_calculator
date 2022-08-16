import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Course extends JPanel implements ActionListener {

    private static double sum_average = 0;
    private static double size_all = 0;
    private double grade;
    private double size;
    private static JTextField sum = new JTextField(14);
    private static JTextField average_field = new JTextField(14);
    private JButton add = new JButton("add");
    private JButton clear = new JButton("clear");
    private JButton exit = new JButton("exit");

    private JTextField name_text = new JTextField(14);
    private JTextField grade_text = new JTextField(14);
    private JTextField size_text = new JTextField(14);
    private JTextField average_text = new JTextField(14);
    private JLabel name_label = new JLabel("name course:  ");
    private JLabel grade_label = new JLabel("grade:       ");
    private JLabel size_label = new JLabel("size:        ");
    private JLabel average_label = new JLabel("average grade:");
    //private BoxLayout boxLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
    //private BorderLayout borderLayout = new BorderLayout();
    FlowLayout layout = new FlowLayout(FlowLayout.RIGHT, 20, 20);

    public Course() {
        add.addActionListener(this);
        exit.addActionListener(this);
        clear.addActionListener(this);
        init();
    }

    public void init() {
        this.setLayout(layout);
        this.add(name_label);
        this.add(name_text);
        this.add(grade_label);
        this.add(grade_text);
        this.add(size_label);
        this.add(size_text);
        this.add(average_label);
        this.add(average_text);
        this.add(add);
        this.add(clear);
        this.add(exit);
        this.add(sum);
        this.add(average_field);
    }


    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            sum_average -= grade * size;
            size_all -= size;
            grade = Double.parseDouble(grade_text.getText());
            size = Double.parseDouble(size_text.getText());
            size_all += size;
            average_text.setText((grade * size) + "");
            sum_average += grade * size;
            sum.setText(sum_average + "");
        }
        if (e.getSource() == clear) {
            sum_average -= grade * size;
            size_all -= size;
            grade = 0;
            size = 0;
            name_text.setText("");
            grade_text.setText("");
            size_text.setText("");
            average_text.setText("");
            sum.setText(sum_average + "");

        }
        if (e.getSource() == exit) {
            System.exit(0);
        }
        average_field.setText(sum_average / size_all + "");
    }
}

