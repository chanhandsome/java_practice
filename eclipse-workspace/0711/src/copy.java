
 import java.awt.event.*; 

 import javax.swing.*; 

 import java.awt.event.ActionListener; 

 public class copy extends JFrame implements ActionListener{ 

   public static byte[] bytecounter; 

   private static final long serialVersionUID = 1L; 

   JFrame jFrame = new JFrame("�޸���"); 

   JMenuBar menuBar = new JMenuBar(); 

   JTextArea txtArea = new JTextArea(); 

   JMenu fileMenu = new JMenu("����"); 

   JMenu editMenu = new JMenu("����"); 

   JMenuItem[] menuItem = new JMenuItem[7]; 

   String[] menuString = { "�� ����", "����", "������", "�߶󳻱�", "�����ϱ�", "�ٿ��ֱ�", "����" }; 

   JFileChooser jfc = new JFileChooser(); 

 

   public copy() 

   { 


     for(int i = 0; i < 7; i++) { 

       menuItem[i] = new JMenuItem(menuString[i]); 

       menuItem[i].addActionListener(this); 

       if(i < 3) fileMenu.add(menuItem[i]); 

       else editMenu.add(menuItem[i]); 

    } 

    menuBar.add(fileMenu); 

   menuBar.add(editMenu); 

    //jFrame.add(new JTextArea()); 

    jFrame.add(txtArea); 

    jFrame.setJMenuBar(menuBar); 

    jFrame.setSize(500, 400); 

    jFrame.setVisible(true); 

 jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 


 } 
 public void actionPerformed(ActionEvent e) { 

   String itemPressed = e.getActionCommand(); 

   if(itemPressed.equals("�� ����")){ 

     txtArea.setText(""); 

  } 

  if(itemPressed.equals("����")){ 

    jfc.showSaveDialog(this); 

 } 

 if(itemPressed.equals("������")){ 

   System.exit(0); 

 } 

 if(itemPressed.equals("�߶󳻱�")){ 

   System.out.println(txtArea.getText()); 

   txtArea.cut(); 

 } 

 if(itemPressed.equals("�����ϱ�")){ 

   //System.out.println(1); 

   txtArea.copy(); 

 } 

 if(itemPressed.equals("�ٿ��ֱ�")){ 

   txtArea.paste(); 

 } 
 if(itemPressed.equals("����")){ 
   txtArea.replaceSelection(""); 

 } 

 } 

 public static void main(String[] args) 

 { 

   new copy(); 

 } 

 } 

