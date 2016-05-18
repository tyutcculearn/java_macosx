import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by dubo on 16/5/17.
 */
public class ButtonFrame2 extends JFrame implements KeyListener {
    private  JButton plainJButton_null;
    private  JButton plainJButton;

    private JTextField textarea;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    public ButtonFrame2(){
        super("Typing Application");
        textarea=new JTextField();
        textarea.setPreferredSize(new Dimension(650,200));
        label1=new JLabel("Type some text using your keyboard. The keys you press will be highlighred and text will be displayed.");
        label2=new JLabel("Note:Clicking the buttons with your mouse wil not perform any action");
        label3=new JLabel("");
        //   label3.setVisible(false);
        plainJButton_null=new JButton("");
        plainJButton=new JButton("~");

      // plainJButton.addKeyListener(this);

        plainJButton.setPreferredSize(new Dimension(40,39));
        plainJButton.setBackground(new Color(250, 70, 70));




        setLayout(new FlowLayout(FlowLayout.LEFT));
        //FlowLayout.LEFT
        add(label1);
        add(label2);

        add(textarea);

        add(plainJButton);

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyChar()=='`'){
            plainJButton.setBackground(Color.red);
            plainJButton.setOpaque(true);
            plainJButton.setBorderPainted(false);
        }

    }
    public void keyReleased(KeyEvent e) {

    }
    public void keyTyped(KeyEvent e) {
    }
}
