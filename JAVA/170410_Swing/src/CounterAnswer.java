
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CounterAnswer extends JFrame {
   private boolean stop = false;
   private JTextField tfCount;
   private int count = 1;
  
   public CounterAnswer() {
      Container cp = getContentPane();
      cp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
      cp.add(new JLabel("Counter"));
      tfCount = new JTextField(count + "", 10);
      tfCount.setEditable(false);
      cp.add(tfCount);
 
      JButton btnStart = new JButton("카운터 시작");
      cp.add(btnStart);
      btnStart.addActionListener(new ActionListener() {
       
         public void actionPerformed(ActionEvent evt) {
            stop = false;
            Thread t = new Thread() {
               public void run() {  
                  for (int i = 0; i < 100000; i++) {
                     if (stop) break;
                     tfCount.setText(count + "");
                     count++;
                    try {
                        sleep(10);  // milliseconds
                     } catch (InterruptedException ex) {}
                  }
               }
            };
            t.start();  // call back run()
         }
      });
 
      JButton btnStop = new JButton("카운터 중지");
      cp.add(btnStop);
      btnStop.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            stop = true;
         }
      });
 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("카운터 예제");
      setSize(300, 120);
      setVisible(true);
   }
  
   public static void main(String[] args) {
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new CounterAnswer();  // Let the constructor do the job
         }
      });
   }
}