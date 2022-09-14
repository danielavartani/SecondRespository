import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MethodPractice extends JPanel{
	
	// Practice calling methods with parameters
	// by drawing the required shapes/patterns from the document
	public void paint(Graphics g) {
		//g.fillOval(200, 200, 200, 200);
		//g.fillRect(0, 0, 50, 50);
	
		//g.setColor(new Color (255, 0, 0 ));
		
		//Draw Smiley Face
			g.setColor(new Color (255, 105, 180));
			g.drawOval(600,600, 200, 200);
			g.drawOval(650, 650, 40, 40);
			g.drawOval(710, 650, 40, 40);
			g.drawArc(660, 680, 80, 80, 180, 180);
			g.drawArc(660, 680, 80, 80, 800, 800);
			g.fillOval(650, 650, 40, 40);
			g.fillOval(710, 650, 40, 40);
				
				
		// DRAW CUBE
			g.setColor(new Color (45, 60, 150));
	
		
		//Methods!!!
		/*
		 * name (parameters)
		 * parameters - data for the methods
		 */
		
		//Draw Sphere
		//think in terms of the the imaginary rectangles
		g.drawOval (0, 0, 200, 200);
		
		//the smaller oval moves to the right
		//its width is gonna decrease proportionally
		//2x the "shift" to the right
		g.drawOval(25, 0, 200-50, 200);
		g.drawOval(50, 0, 200-100, 200);
		g.drawOval(75, 0, 200-150, 200);
		//g.drawOval(100, 0, 200-200, 200);
		
		//the smaller moves down
		g.drawOval(0, 25, 200, 200-50);
		g.drawOval(0, 50, 200, 200-100);
		g.drawOval(0, 75, 200, 200-150);
		//g.drawOval(0, 100, 200, 200-200);
		
		//Draw cube
		int firstLeft = 300;
		int size = 250; 
		int width = size/5;
		int secondLeft = 250;
		
		//first square
		g.drawRect(firstLeft, firstLeft, size, size);
		//back square
		g.drawRect(secondLeft, secondLeft, size, size);
		
		//top left connect 
		g.drawLine(secondLeft, secondLeft, width + secondLeft, width + secondLeft);
		//top right connect
		g.drawLine(secondLeft+size, secondLeft, secondLeft + width + size, secondLeft + width);
		//bottom left
		g.drawLine(secondLeft, secondLeft + size, width + secondLeft, width + secondLeft + size);
		//bottom right
		g.drawLine(secondLeft + size, secondLeft + size, firstLeft + size, firstLeft + size);
	
		//Draw Inscribed/Circumscribed Triangle 
		g.drawLine(180, 300, 425, 375);
		g.drawLine(180, 450, 425, 375);
		
		g.drawLine(180, 300, 180, 450);
		g.drawOval(154, 246, 270, 260);
		g.drawOval(180, 320, 110, 110);
		
		//Draw AP CS
		g.drawRect(600, 300, 75, 20);
		g.drawRect(600, 300, 20, 100);
		g.drawRect(660, 300, 20, 100);
		g.drawRect(600, 350, 75, 20);
		
		g.fillRect(600, 300, 75, 20);
		g.fillRect(600, 300, 20, 100);
		g.fillRect(660, 300, 20, 100);
		g.fillRect(600, 350, 75, 20);
		
		g.drawRect(700, 300, 20, 100);
		g.drawRect(700, 300, 75, 20);
		g.drawRect(770, 300, 20, 60);
		g.drawRect(700, 350, 90, 20);
		
		g.fillRect(700, 300, 20, 100);
		g.fillRect(700, 300, 75, 20);
		g.fillRect(770, 300, 20, 60);
		g.fillRect(700, 350, 90, 20);
		
		g.drawRect(800, 300, 75, 20); 
		g.drawRect(800, 300, 20, 100);
		g.drawRect(800, 380, 75, 20); 
		
		g.fillRect(800, 300, 75, 20); 
		g.fillRect(800, 300, 20, 100);
		g.fillRect(800, 380, 75, 20);
		
		g.drawRect(900,300,75,20);
		g.drawRect(900, 300, 20, 50);
		g.drawRect(900, 350,75,20);
		g.drawRect(950, 350, 25, 50);
		g.drawRect(900, 390,75,20);
		
		g.fillRect(900,300,75,20);
		g.fillRect(900, 300, 20, 50);
		g.fillRect(900, 350,75,20);
		g.fillRect(950, 350, 25, 50);
		g.fillRect(900, 390,75,20);
		
		
	}

	
	
	public static void main(String[] arg) {
		 MethodPractice m = new MethodPractice();
		int x = -7;
		//Math class is used for some of the less basic math functions
		x = Math.abs(x);
		//Find the square root of 44
		System.out.println(Math.sqrt(44));
		
		//power function
		//Math.pos(base, exp); base^expo
		System.out.println(Math.pow(2, 8));
		
		Math.random(); // returns a decimal # between [0, 1) not including 1.0
		System.out.println(Math.random());
		
		//Random # generation
		// (type) -> placed in front of a variable will cast to that type
		// 
		System.out.println((int) (Math.random() *10)); //[0, 9] -> [0, 10]
		
		//alter the code to return a random value between 0 and 5 inclusive [0, 5]
		System.out.println((int) (Math.random() *6));
		//5.9999 is highest and rounds down to 5 
		//casting down omits the decimal
		
		//what about 1 and 6 inclusive? (no longer 0 on the lower end)
		System.out.println((int) (Math.random() *6) +1);
		
		//(int)(Math.random() * (range + 1) ) + min;
		//where range is max-min
		//range value between 3 and 7 inclusive
		//int val = (int)(Math.random () * (7-3 +1) +3); //(int)(Math.random() * (5) ) +3;
 		//range value between 50 and 100 inclusive
		//val = (int)(Math.random () * (50 +1)) +50;
	}
	
	public MethodPractice() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000,1000);
		f.add(this);
		f.setVisible(true);
		
	}
}
