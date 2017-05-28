import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

class DigitalClockGUI {
	private JFrame frame;

	public DigitalClockGUI() {
		frame = new JFrame("Digital Clock");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(new MyLabel());
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}

class MyLabel extends JLabel implements Runnable {
	private boolean paused = true;
	private Thread timerThread = null;

	public MyLabel() {
		setText(makeClockText());
		setFont(new Font("Consolas", Font.ITALIC, 50));
		setHorizontalAlignment(JLabel.CENTER);
		timerThread = new Thread(MyLabel.this);
		timerThread.start();
	}

	public String makeClockText() {
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		String clockText = Integer.toString(hour);
		clockText = clockText.concat(":");
		clockText = clockText.concat(Integer.toString(minute));
		clockText = clockText.concat(":");
		clockText = clockText.concat(Integer.toString(second));
		
		return clockText;
	}

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			setText(makeClockText());
			System.out.println("tick");
		}
	}
}

public class DigitalClock {
	public static void main(String[] args) {
		new DigitalClockGUI();
	}
}
