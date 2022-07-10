import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mmain extends JFrame implements ActionListener,MouseListener
{
    

    JLabel l1,l2,l3,l4,l5,l6,l7;
    JButton b1,b2,b3,b4,b5,b6,b7;
    Font f1,f2,f3;

    JFrame jj;
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            jj.dispose();
            card_selection ob=new card_selection();
        }
        
        if(ae.getSource()==b2)
        {
            jj.dispose();
            settingv ob=new settingv();

            
        }
        if(ae.getSource()==b3)
        {
            int q = JOptionPane.showConfirmDialog(this, "Are you sure that you want to quit the game ?", "Ending Program...", JOptionPane.YES_NO_OPTION);
                                                                                                                            
            if (q == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
            if (q == JOptionPane.NO_OPTION)
            {
                            
            }
            
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
    
    
  
    public mmain()
    {

        jj=new JFrame();
                jj.setTitle("Memory skills");

        jj.setSize(400,400);
        jj.setLocation(370,100);
        jj.setResizable(false);
        f1=new Font("Forte",Font.BOLD,35);
        l1=new JLabel("");
        l2=new JLabel("Memory Skills");
        l2.setForeground(Color.WHITE);
        l2.setFont(f1);
        l3=new JLabel();
        l4=new JLabel();
        l5=new JLabel();
        l6=new JLabel();
        l7=new JLabel();
        
        b1=new JButton("Play");
        b2=new JButton("Settings");
        b3=new JButton("Quit");
        b4=new JButton();
        b5=new JButton();
        b6=new JButton();
        b7=new JButton();
        
        
        
        b1.setBounds(130,150,120, 35);
        b3.setBounds(130,200,120, 35);
        //b3.setBounds(130,250,120, 35);

        //Container c=getContentPane();
        jj.setLayout(null);
        jj.add(b1);
        //jj.add(b2);
        jj.add(b3);
              
        jj.add(l2);

        //l1.add(l2);
        jj.add(l1);

        
        l2.setBounds(60,10 ,390, 70);
        ImageIcon i3=new ImageIcon("wallpaper1.jpg");
        Image im4=i3.getImage();
        
        jj.setIconImage(im4);
        
        l1.setBounds(0, 0, 400, 400);
        ImageIcon I=new ImageIcon(new ImageIcon("wallpaper1.jpg").getImage().getScaledInstance(400,400,Image.SCALE_SMOOTH));
         l1.setIcon(I);
        
        jj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jj.show();
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        
        
    }
    
    public static void main(String args[])
    {
        mmain ob=new mmain();
    }
    
}  