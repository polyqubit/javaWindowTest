import java.util.ArrayList;
import javax.swing.*;
import java.util.Random;
public class starter {

	public static void main(String args[]) {
		Random rand = new Random();
		JFrame[] frameSet = new JFrame[300];
		for(int i=0;i<frameSet.length;i++) {
			frameSet[i] = new JFrame("git prankt");
			frameSet[i].setSize(400,400);
			frameSet[i].setLocation(rand.nextInt(3800)-30,rand.nextInt(1000)-30);
			frameSet[i].setResizable(false);
			frameSet[i].add(new JLabel(new ImageIcon("C:/Users/polyu/OneDrive/Desktop/UniTest/HOO.png")));
			frameSet[i].setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			frameSet[i].setAlwaysOnTop(true);
			frameSet[i].setVisible(true);
		}
		while(true) {
			for(JFrame frame : frameSet){
				frame.setSize(rand.nextInt(50)+275,rand.nextInt(50)+275);
			}
			try {
			Thread.sleep(25);
			} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
			}
		}
	}
	
}
