package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];

		// 2. create an array of 5 robots.

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < 5; i++) {
			robots[i] = new Robot();

		}

		robots[0].setX(0);
		robots[0].setY(575);

		robots[1].setX(100);
		robots[1].setY(575);

		robots[2].setX(200);
		robots[2].setY(575);

		robots[3].setX(300);
		robots[3].setY(575);

		robots[4].setX(400);
		robots[4].setY(575);

		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.

		Boolean t = true;
		while (t == true) {
			for (int z = 0; z < 5; z++) {
				Random random = new Random();
				robots[z].setSpeed(1000);
				robots[z].move(random.nextInt(100));
				if (robots[z].getY() <= 0) {
					t = false;
					JOptionPane.showMessageDialog(null, "Robot " + z + " is the winner");
					JOptionPane.showMessageDialog(null, "CONGRATULATIONS!!!");
				}
			}
		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
