package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot cat = new Robot();
	
	void go() {
		for(int i=0; i<4; i++) {
		drawSquare();
		cat.turn(90);
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	
			// 8. Turn the robot 90 degrees to the right
		}
	}


	void drawSquare() {
		for(int i=0; i<4; i++) {
			cat.setRandomPenColor();
			cat.penDown();
			cat.setSpeed(999999999);
			cat.move(100);
			cat.turn(270);
		}
		}
		
	

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



