import java.applet.*;;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.concurrent.TimeUnit;

public class uq1 extends JFrame implements ActionListener,MouseListener,MouseMotionListener,KeyListener
{
    JLabel l[]=new JLabel[64];
    JLabel l1,l2,l3,l4,l5,l6,lb,ls,ll,lla,lc,lf,lc1,lc2;
                    int cv=0;
    int xs=0;

    JButton b[]=new JButton[64];
    JButton b1,b2,b3,b4,b5,b6,b7;

    JMenuBar jmb;
    long starttime,elapsedtime;
    int ui=0;
    Font f;
    JMenu jm1,jm2,jm3;
    JMenuItem jmi1,jmi2,jmi3,jmi4,jmi5,jmi6,jmi7,jmi8,jmi9,jmi10,jmi11,jmi12;
    Timer t,t_t;
    int x=180;
    int y=15;
        
    int selected1=0;
    int selected2=0;
    
    int cop=0;
    int kj=0;
   
    int zc=0;
int xx=870;
int zz=182;
int dxq=870;

int counter=0;
int checker_xx;
Rectangle rec1,rec2;
int  ax=180;
    int bx=15;
    int k=1;
    int oi=0;
    int a[]=new int[64];
    @Override
    public void actionPerformed(ActionEvent ae) {

        /*if(settingv.setting_var==0)
        {
        */
         for(int nm=0;nm<64;nm++)
            {
                if(ae.getSource()==b[nm])
        
                {

          //       if(settingv.setting_var==0)
        //{
            if(xx%2==0)
        {
             rec1=b[nm].getBounds();
            b[nm].setBounds(870,10,78,78);
            kj=nm;
            selected1=Integer.parseInt(l[nm].getText());
            xx+=45;
            
                        b[nm].setEnabled(false);

        }
        else
         if(xx%2!=0)
         {
             rec2=b[nm].getBounds();
            zc=nm;
         selected2=Integer.parseInt(l[nm].getText());
         if(selected1==selected2)
         {
                 b[nm].setEnabled(false);
             cop+=2;
             xx=xx-45;
             b[kj].setBounds(xx,zz,40,40);
              b[kj].setEnabled(false);
      
             
                          counter+=2;
        if(cop%8!=0)//if(xx<1185)
        { 
           // b[kj].setEnabled(true);
            //b[zc].setEnabled(true);

            xx+=45; 
          checker_xx=xx;      
        b[nm].setBounds(xx,zz,40,40);

        }

         
         else
         {
            //b[kj].setEnabled(true);
            //b[zc].setEnabled(true);

            xx=870;
            zz+=45;
        b[nm].setBounds(checker_xx+(2*45),zz-45,40,40);
   
        }
        
        /*if(cop%8==0)
        b[nm].setBounds(checker_xx+45,zz-45,40,40);
 */
       /* else   
        b[nm].setBounds(xx,zz,40,40);
        */
        xx=870;
        selected1=0;
        selected2=0;
                     xx=870+((cop%8)*45);

        //String zs=l[nm].getText();
        //System.out.println(zs);
        
                     
                     if(counter==64)
                     {
      int q = JOptionPane.showConfirmDialog(this, "You won ! Click Yes to move to card selection menu and No to restart ...", "Ending Program...", JOptionPane.YES_NO_OPTION);

            if (q == JOptionPane.YES_OPTION)
            {
                    card_selection ooo=new card_selection();

                    this.dispose();
            }
            if (q == JOptionPane.NO_OPTION)
            {
                
                               t_t.stop();
                 
                      
     ui=0;
     x=180;
     y=15;
     ax=180;
     bx=15;
        int red=101;
        int green=255;
        int blue=255;
        Color c_=new Color(red,green,blue);

                
                
                
        cop=0;
  kj=0;
  zc=0;
 xx=870;
 zz=182;
 dxq=870;
     k=1;
     oi=0;
    selected1=0;            
       selected2=0;            
        //    qqqqqqqqqqqqqqqqqqqqq
                
       checker_xx=0;
       //rec1=0;
       starttime=System.currentTimeMillis();
                        
       lf.setBackground(Color.WHITE);
       lc.setBackground(c_);
       xs=0; 
       cv=0;
       
               lf.setBounds(35, 125, 110,0);

                  t_t.start();
                for(int h=0;h<64;h++)
                {
                  Rectangle az=  l[h].getBounds();
                  b[h].setBounds(az);
                  b[h].setEnabled(true);
                
                
                }                

                
                
            }
             
                         
                         
                         
                     }
                     
                     
                     
                     
                     
         }
         
         else
         {
                   //xx=xx-45;
            b[kj].setEnabled(true);
            b[zc].setEnabled(true);

             xx=870+((cop%8)*45);

            
                 ui=1;
               int temp_x=870;
               int temp_y=90;

                       b[zc].setBounds(temp_x,temp_y, 78,78);
                       b[zc].setEnabled(false);
                   
                 t = new Timer(1200,new ActionListener() {
             
  
 
                   public void actionPerformed(ActionEvent ae)
                   {
                        if(ui==1)
                       {
                         b[zc].setEnabled(true);
                         
                             b[zc].setBounds(rec2);
                               ui++;
                               
                       }
                       else
                           t.stop();
              //         b[]
                       
                   }
               });
         
            t.start();
               
               
               
             
             
             b[kj].setBounds(rec1);
           //  b[zc].setBounds(rec2);

         }
         
         }
    
    
    }
    }     
             
             
             
         
                   //xx=xx-45;
  //}
        //}
        /*
        else
        {
           System.out.println("Not allowed");
        
                int ccc=0;
        int cc1=0;
        int aq=0;
   
        int ol=aq+1;
        int o2=aq-1;
        int o3=aq+8;
        int o4=aq-8;

        
        int ttt=0;
        int aaq=0;
        }
        */
    if(ae.getSource()==jmi1)
    {
        
        
        System.out.println("the value is    of the"+settingv.setting_var);
        this.dispose();
        mmain ob=new mmain();
        
    }
    if(ae.getSource()==jmi3)
    {
        this.dispose();
        card_selection ob=new card_selection();
        
    }
    
    
                
    }
        @Override
    public void keyTyped(KeyEvent e) {

        
        if(e.getKeyCode()==KeyEvent.VK_DOWN)
            System.out.println("asasasasas");

      //  System.out.println("o");
    }

    @Override
    public void keyPressed(KeyEvent e) {
    

            int ccc=0;
        int cc1=0;
        int aq=0;
   
        int ol=aq+1;
        int o2=aq-1;
        int o3=aq+8;
        int o4=aq-8;

        
        int ttt=0;
        int aaq=0;
        for(int zx=0;zx<64;zx++)
        {
              if(b[zx].getBackground()==Color.WHITE)
              {
                  aq=zx;
                  
                  ccc++;
              
              }
                  }
        if(ccc<1)
        {
        if(e.getKeyCode()==KeyEvent.VK_RIGHT || e.getKeyCode()==KeyEvent.VK_UP ||e.getKeyCode()==KeyEvent.VK_DOWN ||e.getKeyCode()==KeyEvent.VK_LEFT)
        {
            b[0].setBackground(Color.WHITE);
            b[0].setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
            
       
        }
      }
        else
            if(ccc!=0)
            {
                
                System.out.println(aq);
                b[aq].setBackground(Color.BLACK);
            b[aq].setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
                
            
                /*if(e.getKeyCode()==KeyEvent.VK_RIGHT && aq%8==7)
                {
                    System.out.println("ccc");
                }*/
                /*if(e.getKeyCode()==KeyEvent.VK_LEFT && aq%8==0)
                {
                                        System.out.println("ccc");

                }*/
            //if((aq>=0 && aq<=7)|| (aq>=56 && aq<=63)) 
            //{ 
                if(e.getKeyCode()==KeyEvent.VK_UP && (aq>0 && aq<=7))
                {
                                        System.out.println();
                                        ttt++;
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN && (aq>=56 && aq<63))
                {
                                        System.out.println("donswewrdwwqaaaaq");
                                           ttt++; 
                                        
                }
                if((e.getKeyCode()==KeyEvent.VK_DOWN ||e.getKeyCode()==KeyEvent.VK_RIGHT)&& (aq==63))       
    
                {
                           System.out.println("ccc");
                           ttt++;
                }          
                if((e.getKeyCode()==KeyEvent.VK_UP||e.getKeyCode()==KeyEvent.VK_LEFT) && aq==0)
                    {
                        System.out.println("ccc");
                            ttt++;
                    }
            //}
        
        
                else
                  if(ttt==0)  
  //if(!((aq>=0 && aq<=7)&& (aq>=56 && aq<=63)))
            {if(e.getKeyCode()==KeyEvent.VK_RIGHT)
                    {
                        b[aq+1].setBackground(Color.white);
                        b[aq+1].setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
                    }

                    if(e.getKeyCode()==KeyEvent.VK_LEFT)
                    {
                        b[aq-1].setBackground(Color.white);
                        b[aq-1].setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
                    }
                   if(e.getKeyCode()==KeyEvent.VK_UP)// && !(aq>=0 && aq<=7))
                    {
                        b[aq-8].setBackground(Color.white);
                        b[aq-8].setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
                    }
                  if(e.getKeyCode()==KeyEvent.VK_DOWN)//&& !(aq>=56 && aq<=63))
                    {
                        b[aq+8].setBackground(Color.white);
                        b[aq+8].setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
                    }
                 
            }
                ttt=0;
                
                      if(e.getKeyCode()==KeyEvent.VK_ENTER)
                        {
                           Color wq= b[0].getBackground();
                           
                            System.out.println(wq);
                            
                   for(int zxx=0;zxx<64;zxx++)
        {
              if(b[zxx].getBackground()==Color.WHITE)
              {
                  aaq=zxx;
                  
                  cc1++;
              
              }
                  }
                                                    System.out.println("aq  "+aq);
                    
                                    System.out.println("aaq  "+aaq);
                                    if(ccc!=0)
                                    {
                                                if(xx%2==0)
        {
             rec1=b[aq].getBounds();
            b[aq].setBounds(870,10,78,78);
            kj=aq;
            selected1=Integer.parseInt(l[aq].getText());
            xx+=45;
            b[aq].setEnabled(false);
        }
        else
         if(xx%2!=0)
         {
             rec2=b[aq].getBounds();
            zc=aq;
         selected2=Integer.parseInt(l[aq].getText());
         if(selected1==selected2)
         {
             b[aq].setEnabled(false);
             cop+=2;
             xx=xx-45;
             b[kj].setBounds(xx,zz,40,40);
              b[kj].setEnabled(false);

             
        if(cop%8!=0)//if(xx<1185)
        { 
           // b[kj].setEnabled(true);
            //b[zc].setEnabled(true);

            xx+=45; 
          checker_xx=xx;      
        b[aq].setBounds(xx,zz,40,40);

        }
        else
        {
            //b[kj].setEnabled(true);
            //b[zc].setEnabled(true);

            xx=870;
            zz+=45;
        b[aq].setBounds(checker_xx+(2*45),zz-45,40,40);
   
        }
        
        /*if(cop%8==0)
        b[nm].setBounds(checker_xx+45,zz-45,40,40);
 */
       /* else   
        b[nm].setBounds(xx,zz,40,40);
        */
        xx=870;
        selected1=0;
        selected2=0;
                     xx=870+((cop%8)*45);

        //String zs=l[nm].getText();
        //System.out.println(zs);
        
         }
         
         else
         {
                   //xx=xx-45;
            b[kj].setEnabled(true);
            b[zc].setEnabled(true);

             xx=870+((cop%8)*45);

            
                 ui=1;
               int temp_x=870;
               int temp_y=90;

                       b[zc].setBounds(temp_x,temp_y, 78,78);
                       b[zc].setEnabled(false);
                   
                 t = new Timer(3000,new ActionListener() {
             
  
 
                   public void actionPerformed(ActionEvent ae)
                   {
                        if(ui==1)
                       {
                         b[zc].setEnabled(true);
                         
                             b[zc].setBounds(rec2);
                               ui++;
                               
                       }
                       else
                           t.stop();
              //         b[]
                       
                   }
               });
         
            t.start();
               
               
               
             
             
             b[kj].setBounds(rec1);
           //  b[zc].setBounds(rec2);

         }
         
         }
    
    
                                        
                                    }
                                        
                     
                        
                        }
                    
                    
                
            }
    
    
    
    
    }

    @Override
    public void keyReleased(KeyEvent e) {
    
        //System.out.println("z");

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
    //@SuppressWarnings("empty-statement")
    public void mouseEntered(MouseEvent e) 
    {
 
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    /////////////////////////////////////////////////////////////
    
    
        
    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    
    
    
    public uq1()
    {   
        setTitle("Memory skills");
        setSize(1250,725);
        ImageIcon i3=new ImageIcon("wallpaper1.jpg");
        Image im4=i3.getImage();
        
        this.setIconImage(im4);

        
        setResizable(false);
        setLocation(70,5);
        ls=new JLabel();
        ls.setOpaque(true);

        ls.setBackground(Color.BLACK);
        ls.setBounds(827,0,20,725);

        l1=new JLabel();
        l2=new JLabel();
        l3=new JLabel();
        l4=new JLabel();
        l5=new JLabel();
        l6=new JLabel();
        lc=new JLabel();
        lf=new JLabel();
        lc1=new JLabel();
        lc2=new JLabel();

        
        
        
        b1=new JButton();
        b2=new JButton();
        b3=new JButton();
        b4=new JButton();
        b5=new JButton();
        b6=new JButton();
        b7=new JButton();

        
        
        
        jmb=new JMenuBar();
        
        jm1=new JMenu("Game");
        jm2=new JMenu("");
        jm3=new JMenu("");
        
        jmi1=new JMenuItem("Home");
        jmi2=new JMenuItem("Settings");
        jmi3=new JMenuItem("Exit");
        jmi4=new JMenuItem();
        jmi5=new JMenuItem();
        jmi6=new JMenuItem();
        jmi7=new JMenuItem();
        jmi8=new JMenuItem();
        jmi9=new JMenuItem();
        jmi10=new JMenuItem();
        jmi11=new JMenuItem();
        jmi12=new JMenuItem();
        
        jm1.add(jmi1);
        //jm1.add(jmi2);
        jm1.add(jmi3);
        
        jmb.add(jm1);
        Container c=getContentPane();
        c.setLayout(null);

                //ll.setBounds(33,80, 110, 50);

        int red=101;
        int green=255;
        int blue=255;
        Color c_=new Color(red,green,blue);

        lc1.setOpaque(true);

        lc1.setBackground(Color.BLACK);
        lc2.setOpaque(true);

        lc2.setBackground(Color.BLACK);

        
        lc.setOpaque(true);

        lc.setBackground(c_);
        
        lf.setOpaque(true);

        lf.setBackground(Color.WHITE);
      
        //lc1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 7,true));
        //lc2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 7,true));

        
        lc1.setBounds(20, 105, 140,20);
        lc2.setBounds(20, 625, 140,20);

        lc.setBounds(35, 125, 110,500);
        lf.setBounds(35, 125, 110,0);
        
               c.add(lf);
 
        c.add(lc);
        c.add(lc1);
        c.add(lc2);
        
        
        
        
        //System.out.println(settingv.setting_var);

        for(int h=0;h<64;h++)
        {
            
                     
            if(h%8!=0 && h!=0)
            {
               // System.out.println(y);
                b[h]=new JButton();
                
                b[h].setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
            b[h].setBounds(ax,bx,78,78);
            ax=ax+81;
            }
            else
                            //if(i%8==7)

            {
                                b[h]=new JButton();
             
                 if(h==0)
                 {

                     bx=bx+0;
                 }else
//System.out.println(k+"     "+i);    
                bx=bx+81;
                ax=180;
         b[h].setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
            b[h].setBounds(ax,bx,78,78);
            ax=ax+81;
                
                
            }

            c.add(b[h]);
          
            k++;
            
        }
            
                          
                for(int hh=0;hh<64;hh++)
                {
    //                b[hh].setBackground(Color.BLACK);
                }


        
        
        
        c.add(ls);
        
        

        
        
        
        
        
           
        for(int i=0;i<64;i++)
        {

           
            if(i%8!=0 && i!=0)
            {
               // System.out.println(y);
                l[i]=new JLabel();
                l[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
            l[i].setBounds(x,y,78,78);
            x=x+81;
            }
            else
                            //if(i%8==7)

            {
                                l[i]=new JLabel();
             
                 if(i==0)
                 {

                     y=y+0;
                 }else
//System.out.println(k+"     "+i);    
                y=y+81;
                x=180;
                l[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
            l[i].setBounds(x,y,78,78);
            x=x+81;
                
                
            }

            c.add(l[i]);
            k++;
            
        }
        
        
        
        
        
            
        
        //Image iii=ii.getScaledInstance(150,155,Image.SCALE_SMOOTH);
        for(int oo=1;oo<=32;oo++)
        {        
            int aq[]=new int[32];
            String kk=""+oo;
            ImageIcon i=new ImageIcon(new ImageIcon(kk+".jpg").getImage().getScaledInstance(78, 78,Image.SCALE_SMOOTH));
         int r=(int)(Math.random()*(63-0+1)+0);
         int rr=(int)(Math.random()*(63-0+1)+0);
         while(r==rr)
         r=(int)(Math.random()*(63-0+1)+0);    
       //System.out.println(r);
         //     System.out.println(rr);
       if(oi!=0)
       {
             for(int k=0;k<=oi;k++)
             {
                 
                // while(a[k]==r ||a[k]==rr || r==rr)// ||aq[k]==r ||aq[k]==rr )//if(a[k]==r || a[k]==rr )
                 //{
  
                    /* while(a[0]==r ||a[0]==rr ||a[1]==r ||a[1]==rr ||
 a[2]==r ||a[2]==rr ||a[3]==r ||a[3]==rr ||a[4]==r ||a[4]==rr ||a[5]==r ||a[5]==rr ||a[6]==r ||a[6]==rr ||a[7]==r ||a[7]==rr ||                            
      a[8]==r ||a[8]==rr ||a[9]==r ||a[9]==rr ||a[10]==r ||a[10]==rr ||a[11]==r ||a[11]==rr ||a[12]==r ||a[12]==rr ||a[13]==r ||a[13]==rr ||
                             a[14]==r ||a[14]==rr ||a[15]==r ||a[15]==rr ||a[16]==r ||a[16]==rr ||a[17]==r ||a[17]==rr ||a[18]==r ||a[18]==rr ||
 a[19]==r ||a[19]==rr ||a[20]==r ||a[20]==rr ||a[21]==r ||a[21]==rr ||a[22]==r ||a[22]==rr ||a[23]==r ||a[23]==rr ||a[24]==r 
                             ||a[24]==rr ||a[25]==r ||a[25]==rr ||
                             a[26]==r ||a[26]==rr ||a[27]==r ||a[27]==rr ||a[28]==r ||a[28]==rr ||a[29]==r ||a[29]==rr ||a[30]==r ||a[30]==rr ||
                             a[31]==r ||a[31]==rr ||a[32]==r ||a[32]==rr ||a[33]==r ||a[33]==rr ||a[34]==r ||a[34]==rr ||a[35]==r ||a[35]==rr ||
                             a[36]==r ||a[36]==rr ||a[37]==r ||a[37]==rr ||a[38]==r ||a[38]==rr ||a[39]==r ||a[39]==rr ||
                             a[40]==r ||a[40]==rr ||a[41]==r ||a[41]==rr ||a[42]==r ||a[42]==rr ||a[43]==r ||a[43]==rr ||a[44]==r ||a[44]==rr 
                             ||a[45]==r ||a[45]==rr ||
                             a[46]==r ||a[46]==rr ||a[47]==r ||a[47]==rr ||a[48]==r ||a[48]==rr ||a[49]==r ||a[49]==rr ||a[50]==r ||a[50]==rr ||
                             a[51]==r ||a[51]==rr ||a[52]==r ||a[52]==rr ||a[53]==r ||a[53]==rr ||a[54]==r ||a[54]==rr ||a[55]==r ||a[55]==rr 
                             ||a[56]==r ||a[56]==rr ||
                             a[57]==r ||a[57]==rr ||a[58]==r ||a[58]==rr ||a[59]==r ||a[59]==rr ||a[60]==r ||a[60]==rr ||
                             a[61]==r ||a[61]==rr ||a[62]==r ||a[62]==rr ||a[63]==r ||a[63]==rr || r==rr 
                             )
                      */
              
                 if(a[k]==r ||a[k]==rr || r==rr)
                 {    
                     r=(int)(Math.random()*(63-0+1)+0);
                     rr=(int)(Math.random()*(63-0+1)+0);
                     k=0;
                 }             
                
                 }
                 
             //}
         
             
             //   System.out.println(rr);
              
             }
        a[oi]=r;
        a[oi+1]=rr;
         //System.out.println(a[oi]);
           //System.out.println(r +"     " +rr);
        oi+=2;
        
            l[r].setText(kk);
            l[rr].setText(kk);
            l[r].setIcon(i);
            l[rr].setIcon(i);//}
       
           
           
           /*
for(int qq=0;qq<64;qq++)
        {
             //   System.out.println(a[qq]+"  ");
        }
  */      
        }
        
               ImageIcon I=new ImageIcon(new ImageIcon("1.jpg").getImage().getScaledInstance(78, 78,Image.SCALE_SMOOTH));

        l[0].setIcon(I);

        l[0].setText("1");
        
        
        
  /*      
        for(int j=0;j<64;j++)
        {
            c.add(l[j]);
            
        }
    */    

        
        this.setJMenuBar(jmb);
        c.setBackground(Color.white);
    
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        for(int kn=0;kn<64;kn++)
        {
            for(int kj=kn+1;kj<64;kj++)
            {
                if(a[kn]>a[kj])
                {
                    int tr=a[kn];
                    a[kn]=a[kj];
                    a[kj]=tr;
                }
            }
            
        }
        
        
        ll=new JLabel("",JLabel.CENTER);
//        l1.setForeground(Color.WHITE);

        lla=new JLabel("Time left :",JLabel.CENTER);
  //         lla.setForeground(Color.WHITE);
                        f=new Font("Forte",Font.BOLD,40);

        Font fo=new Font("Forte",Font.BOLD,25);
        ll.setBounds(23,50, 140, 50);
       lla.setBounds(23,15, 140, 50);
        lla.setOpaque(true);

        
        ll.setOpaque(true);
        ll.setFont(f);
        lla.setFont(fo);

        c.add(ll);
             c.add(lla);

    
        
                 

                       starttime=System.currentTimeMillis();
        
        
                         t_t = new Timer(1000,new ActionListener() {
 
                   //@SuppressWarnings("empty-statement")
                   public void actionPerformed(ActionEvent ae)
                   {
                        elapsedtime=602000-(System.currentTimeMillis()-starttime);
                        //System.out.println(starttime);
                        //System.out.println(elapsedtime);
                         xs++;
                        
                        long m=TimeUnit.MILLISECONDS.toMinutes(elapsedtime)%60;
         //long h=TimeUnit.MILLISECONDS.toHours(elapsedtime)%24;
        
                        long s=TimeUnit.MILLISECONDS.toSeconds(elapsedtime)%60;
         //String hh=""+h;
         String mm=""+m;
         String ss=""+s;
        
         //if(Integer.parseInt(ss)%2==0)
         //{
         if(xs<=400)
         {
                       cv++;         
         }
         else
             if(xs>=400 && Integer.parseInt(ss)%2==0)
             cv=cv+1;
         else
                 if(cv==500)
             {
                 cv=500;
                 System.out.println();
             }
         
             lf.setBounds(35, 125, 110,cv );

             
             
         //}
       /* // if(Integer.parseInt(mm)<=1)
         //{
             //lc.setBackground(Color.red);
         }*/
            if(mm.equals("0") && ss.equals("0"))
            {
                JOptionPane.showMessageDialog(rootPane,"Time up.Game Over");             

                t_t.stop();
                 
                      
     ui=0;
     x=180;
     y=15;
     ax=180;
     bx=15;
                
                
                
  cop=0;
  kj=0;
  zc=0;
 xx=870;
 zz=182;
 dxq=870;
     k=1;
     oi=0;
    selected1=0;            
       selected2=0;            
        //    qqqqqqqqqqqqqqqqqqqqq
                
       checker_xx=0;
       //rec1=0;
       starttime=System.currentTimeMillis();
                        
       lf.setBackground(Color.WHITE);
       lc.setBackground(c_);
       xs=0; 
       cv=0;
       
               lf.setBounds(35, 125, 110,0);

                t_t.start();
                for(int h=0;h<64;h++)
                {
                  Rectangle az=  l[h].getBounds();
                  b[h].setBounds(az);
                  b[h].setEnabled(true);
                
                
                }                
            }
                            ll.setText(""+mm+":"+ss);

                
                
                
                
       
            
            
                   }
          
                         }
                         );
                         
                         t_t.start();
         

        
        

        

        
        
          lb=new JLabel();
         
        
  
        lb.setBounds(0, 0, 1250,725);
       // for(int ty=0;ty<a.length;ty++)
         //   System.out.println(a[ty]);
    
         
         c.add(lb);
                ImageIcon Ib=new ImageIcon(new ImageIcon("wallpaper5.jpg").getImage().getScaledInstance(1250,725,Image.SCALE_SMOOTH));
         lb.setIcon(Ib);

        //for(int ty=0;ty<a.length;ty++)
            //System.out.println(a[ty]);
        
        //if(settingv.setting_var==1)
       // {
        //this.addKeyListener(this);
        //this.setFocusable(true);
        //this.requestFocusInWindow();
         //for(int dxz=0;dxz<64;dxz++)
           //  b[dxz].removeActionListener(this);
        //}
         
            this.show();

          
            
   ///         if(settingv.setting_var==0)
      //    {
        for(int nv=0;nv<64;nv++)
    b[nv].addActionListener(this);
        //    }
   jmi1.addActionListener(this);
 jmi3.addActionListener(this);

    
    }
    public static void main(String args[])
    {
        uq1 ob=new uq1();
    }   




}