package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
	
		Robot cat = new Robot();
		for(int i=0; i<360;i++) {
		cat.penDown();
		cat.setSpeed(50000);
		cat.move(1);
		cat.turn(1);
	}
	}
}
