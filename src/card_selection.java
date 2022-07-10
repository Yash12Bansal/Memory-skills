import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class card_selection extends JFrame implements ActionListener,MouseListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JButton b1,b2,b3,b4,b5,b6,b7;
    Font f1,f2,f3;
    JFrame jj;

        public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getSource()==b2)
        {
            jj.dispose();
            uq1 ob=new uq1();
        
        }
        if(ae.getSource()==b1)
        { 
            jj.dispose();
            mmain ob=new mmain();
            
        
        
        }
        if(ae.getSource()==b3)
        {   
            //uq1 ob1=new uq1();
            
            jj.dispose();
        
            uq2 ob=new uq2();
        
        }
        if(ae.getSource()==b4)
        {    
                    jj.dispose();

                    uq3 ob=new uq3();
        
        }
        if(ae.getSource()==b5)
        {                jj.dispose();
                            uq4 ob=new uq4();

        
        }
        

            if(ae.getSource()==b6)
        {                jj.dispose();
        
                            uq5 ob=new uq5();

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

    
    public card_selection()
    {
        
        jj=new JFrame();
                       jj.setTitle("Memory skills");
        ImageIcon i3=new ImageIcon("wallpaper1.jpg");
        Image im4=i3.getImage();
        
       jj.setIconImage(im4);

        jj.setSize(800,550);
           jj.setLocation(220,60);

        jj.setResizable(false);
        f1=new Font("Forte",Font.BOLD,35);
        l1=new JLabel("");
        l2=new JLabel("");
        l2.setForeground(Color.WHITE);
        l2.setFont(f1);
        l3=new JLabel("");
        l4=new JLabel("");
        l5=new JLabel("Find the similar birds");
        l6=new JLabel("Find the similar  animals");
        l7=new JLabel("Find the correct mates");
        f2=new Font("Arial",Font.BOLD,15);
        l5.setFont(f2);
        l6.setFont(f2);
        l7.setFont(f2);

        l8=new JLabel("Find founders of famous companies");
        l8.setFont(f2);
        l9=new JLabel("Find the flags of different countries");
        l9.setFont(f2);
        
        l10=new JLabel();
        l11=new JLabel();
        l12=new JLabel();
        l13=new JLabel();
        
        b1=new JButton("Back");
        b2=new JButton("");
        b3=new JButton();
        b4=new JButton();
        b5=new JButton();
        b6=new JButton("");
        b7=new JButton();
        

        jj.setLayout(null);
        jj.add(b1);

        jj.add(b2);
        jj.add(b3);
        jj.add(b4);
        jj.add(b5);
        jj.add(b6);
        
        jj.add(l5);
        jj.add(l6);
        jj.add(l7);
        jj.add(l8);
        jj.add(l9);
        
        
        
        
        
        
        
        
        
        
        jj.add(l1);
        
        l1.setBounds(0, 0, 800, 550);
        b2.setBounds(30, 30, 230,160);
        b3.setBounds(280, 30, 230,160);
        b4.setBounds(530, 30, 230,160);
        b5.setBounds(155, 235, 230,160);
        b6.setBounds(410, 235, 230,160);

        b1.setBounds(30, 485,80, 30);
        
        l5.setBounds(70, 190, 180,30);
        l6.setBounds(320, 190, 180,30);
        l7.setBounds(570, 190, 180,30);
        l8.setBounds(142, 400, 270,30);
        l9.setBounds(407, 400, 270,30);

        
        
        ImageIcon I=new ImageIcon(new ImageIcon("wallpaper5.jpg").getImage().getScaledInstance(800,550,Image.SCALE_SMOOTH));
         l1.setIcon(I);

                 ImageIcon I1=new ImageIcon(new ImageIcon("cs1.jpg").getImage().getScaledInstance(230,160,Image.SCALE_SMOOTH));
         b2.setIcon(I1);
        ImageIcon I2=new ImageIcon(new ImageIcon("cs4.jpg").getImage().getScaledInstance(230,160,Image.SCALE_SMOOTH));
         b3.setIcon(I2);
        ImageIcon I3=new ImageIcon(new ImageIcon("cs26.jpg").getImage().getScaledInstance(230,160,Image.SCALE_SMOOTH));
         b4.setIcon(I3);
        ImageIcon I4=new ImageIcon(new ImageIcon("cs11.jpg").getImage().getScaledInstance(230,160,Image.SCALE_SMOOTH));
         b5.setIcon(I4);
        ImageIcon I5=new ImageIcon(new ImageIcon("cs27.jpg").getImage().getScaledInstance(230,160,Image.SCALE_SMOOTH));
         b6.setIcon(I5);

         
         
        jj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jj.show();
        

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        
        
        
    }
    public static void main(String args[])
    {
        card_selection ob=new card_selection();
    }
}