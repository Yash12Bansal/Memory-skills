import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class settingv extends JFrame implements ActionListener,MouseListener
{
    
    public static int setting_var=0;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JButton b1,b2,b3,b4,b5,b6,b7;
    Font f1,f2,f3;

    JFrame jj;
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            jj.dispose();
            setting_var=0;
            mmain ob=new mmain();
            
        }
        if(ae.getSource()==b2)
        {
            jj.dispose();
            setting_var=1;
            mmain ob=new mmain();

        }
        
        
    }
      @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    ///////////////////////////////////////////////////////////////////
    
    
  
    public settingv()
    {
        
        jj=new JFrame();
        jj.setSize(300,200);
        jj.setLocation(420,170);
        f1=new Font("Forte",Font.BOLD,20);
        l1=new JLabel("Choose a mode to play :");
        l2=new JLabel("");
        l1.setForeground(Color.WHITE);
        l1.setFont(f1);
        l3=new JLabel();
        l4=new JLabel();
        l5=new JLabel();
        l6=new JLabel();
        l7=new JLabel();
        
        b1=new JButton("Mouse");
        b2=new JButton("Keyboard");
        b3=new JButton("Quit");
        b4=new JButton();
        b5=new JButton();
        b6=new JButton();
        b7=new JButton();
        
        
        b1.setBounds(65,55,120, 35);
        b2.setBounds(65,100,120, 35);
        //b3.setBounds(130,250,120, 35);

        //Container c=getContentPane();
        jj.setLayout(null);
        jj.add(b1);
        jj.add(b2);
        //jj.add(b3);
              
        jj.add(l1);

        //l1.add(l2);
        jj.add(l2);

        
        l1.setBounds(20,5 ,290, 40);
        
        l2.setBounds(0, 0, 300, 200);
        ImageIcon I=new ImageIcon(new ImageIcon("wallpaper5.jpg").getImage().getScaledInstance(300,200,Image.SCALE_SMOOTH));
         l2.setIcon(I);
        
        jj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jj.show();
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        
    }
    
    public static void main(String args[])
    {
        settingv ob=new settingv();
    }
    
}  