
package notepad;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author RIYA CHUGH
 */
public class About extends JFrame implements ActionListener
{
    JButton b;
    About()
    {
     setBounds(600,200,700,600);
     setLayout(null);
     ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/windows.png"));
     Image img = i.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
     ImageIcon i2 = new ImageIcon(img);
     JLabel jl = new JLabel(i2);
     jl.setBounds(150,40,400,80);
     add(jl);
     
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
     Image img1 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(img1);
     JLabel jl1 = new JLabel(i3);
     jl1.setBounds(50,180,70,70);
     add(jl1);
     
     JLabel label = new JLabel("<html>Riya Chugh <br>Version 2021 <br>Riya Chugh | All rights reserved <br>Windows Notepad is a simple text editor for Microsoft Windows and a basic text-editing program text enables computer users to create documents. It was first released as a mouse-based MS-DOS program in 1983, and has been included in all versions of Microsoft Windows since Windows 1.0 in 1985</html>");
     label.setBounds(150,130,500,300);
     label.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
     add(label);
     b=new JButton("Ok");
     b.setBounds(580,500,80,25);
     b.addActionListener(this);
     add(b);
     
    }
    public void actionPerformed(ActionEvent ae)
    {
     this.setVisible(false) ;  
    }
    public static void main(String[] args) {
        new About().setVisible(true);
    }
}
