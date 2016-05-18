import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by dubo on 16/5/17.
 */
public class ButtonFrame extends JFrame implements KeyListener {
    private  JButton plainJButton_null;
    private  JButton plainJButton;
    private  JButton plainJButton_1;
    private  JButton plainJButton_2;
    private  JButton plainJButton_3;
    private  JButton plainJButton_4;
    private  JButton plainJButton_5;
    private  JButton plainJButton_6;
    private  JButton plainJButton_7;
    private  JButton plainJButton_8;
    private  JButton plainJButton_9;
    private  JButton plainJButton_0;
    private  JButton plainJButton_jian;
    private  JButton plainJButton_jia;
    private  JButton plainJButton_delete;
    private JTextField textarea;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    public ButtonFrame(){
        super("Typing Application");
        textarea=new JTextField();
        textarea.setPreferredSize(new Dimension(650,200));
        label1=new JLabel("Type some text using your keyboard. The keys you press will be highlighred and text will be displayed.");
        label2=new JLabel("Note:Clicking the buttons with your mouse wil not perform any action");
        label3=new JLabel("");
     //   label3.setVisible(false);
        plainJButton_null=new JButton("");
        plainJButton=new JButton("~");

        plainJButton.addKeyListener(this);
        plainJButton_1=new JButton("1");
        plainJButton_2=new JButton("2");
        plainJButton_3=new JButton("3");
        plainJButton_4=new JButton("4");
        plainJButton_5=new JButton("5");
        plainJButton_6=new JButton("6");
        plainJButton_7=new JButton("7");
        plainJButton_8=new JButton("8");
        plainJButton_9=new JButton("9");
        plainJButton_0=new JButton("0");
        plainJButton_jian=new JButton("-");
        plainJButton_jia=new JButton("+");
        plainJButton_delete=new JButton("Backspace");
        plainJButton.setPreferredSize(new Dimension(40,39));

        label3.setPreferredSize(new Dimension(70,39));
        plainJButton_1.setPreferredSize(new Dimension(40,39));
        plainJButton_2.setPreferredSize(new Dimension(40,39));
        plainJButton_3.setPreferredSize(new Dimension(40,39));
        plainJButton_4.setPreferredSize(new Dimension(40,39));
        plainJButton_5.setPreferredSize(new Dimension(40,39));
        plainJButton_6.setPreferredSize(new Dimension(40,39));
        plainJButton_7.setPreferredSize(new Dimension(40,39));
        plainJButton_8.setPreferredSize(new Dimension(40,39));
        plainJButton_9.setPreferredSize(new Dimension(40,39));
        plainJButton_0.setPreferredSize(new Dimension(40,39));
        plainJButton_jian.setPreferredSize(new Dimension(40,39));
        plainJButton_jia.setPreferredSize(new Dimension(40,39));
        plainJButton_delete.setPreferredSize(new Dimension(100,39));



        setLayout(new FlowLayout(FlowLayout.LEFT));
        //FlowLayout.LEFT
        add(label1);
        add(label2);

        add(textarea);

        add(plainJButton);
        add(plainJButton_1);
        add(plainJButton_2);
        add(plainJButton_3);
        add(plainJButton_4);
        add(plainJButton_5);
        add(plainJButton_6);
        add(plainJButton_7);
        add(plainJButton_8);
        add(plainJButton_9);
        add(plainJButton_0);
        add(plainJButton_jian);
        add(plainJButton_jia);
        add(plainJButton_delete);

        add(label3);
        add(plainJButton_2);
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyChar()=='`'){
            plainJButton.setBackground(new Color(250, 70, 70));

        }

    }
    public void keyReleased(KeyEvent e) {

    }
    public void keyTyped(KeyEvent e) {
    }
}
