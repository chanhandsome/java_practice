
 import java.awt.event.*; 

 import javax.swing.*; 

 import java.awt.event.ActionListener; 

 public class copy extends JFrame implements ActionListener{ 

   public static byte[] bytecounter; 

   private static final long serialVersionUID = 1L; 

   JFrame jFrame = new JFrame("메모장"); 

   JMenuBar menuBar = new JMenuBar(); 

   JTextArea txtArea = new JTextArea(); 

   JMenu fileMenu = new JMenu("파일"); 

   JMenu editMenu = new JMenu("편집"); 

   JMenuItem[] menuItem = new JMenuItem[7]; 

   String[] menuString = { "새 파일", "저장", "끝내기", "잘라내기", "복사하기", "붙여넣기", "삭제" }; 

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

   if(itemPressed.equals("새 파일")){ 

     txtArea.setText(""); 

  } 

  if(itemPressed.equals("저장")){ 

    jfc.showSaveDialog(this); 

 } 

 if(itemPressed.equals("끝내기")){ 

   System.exit(0); 

 } 

 if(itemPressed.equals("잘라내기")){ 

   System.out.println(txtArea.getText()); 

   txtArea.cut(); 

 } 

 if(itemPressed.equals("복사하기")){ 

   //System.out.println(1); 

   txtArea.copy(); 

 } 

 if(itemPressed.equals("붙여넣기")){ 

   txtArea.paste(); 

 } 
 if(itemPressed.equals("삭제")){ 
   txtArea.replaceSelection(""); 

 } 

 } 

 public static void main(String[] args) 

 { 

   new copy(); 

 } 

 } 

