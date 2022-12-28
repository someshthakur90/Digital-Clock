import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class myWindow extends JFrame {

    private JLabel heading;
    private JLabel clockLable;
    private Font font = new Font("",Font.BOLD,35);
    myWindow() {
        setTitle("My Clock");
        setSize(500,200);
        setLocation(300,50);
        this.createGUI();
        this.clock();
        setVisible(true);
    }
    public void createGUI() {
        heading = new JLabel("My Clock");
        clockLable = new JLabel("Clock");
        heading.setFont(font);
        clockLable.setFont(font);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLable);
    }
    public void clock() {
        Timer timer = new Timer(1000,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
 //               String dateTime = new Date().toString();
 //                 String dateTime = new Date().toLocaleString();
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("d/M/Y || hh : mm : ss a");
                String dateTime = sdf.format(d);
                clockLable.setText(dateTime);

            }
        });
        timer.start();
        
    }
    
}
