import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class box extends JFrame
{
    /**
     *
     */

    private static final Jlabel JLABEL = new Jlabel();
    JPanel jp = new JPanel(true);
    JLabel jl = JLABEL;
    JTextField jt = new JTextField(30);


    public box()
    {
        setTitle("quiz");
        setVisible(true);
        // SetSize(1000,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jp.add(jt);
       
        { 
            {
                String input = jt.getText();
                jl.setText(input);
            }
        }
        jp.add(jl);
        add(jp);
    }

}