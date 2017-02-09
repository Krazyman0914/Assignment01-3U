/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import becker.robots.City;

/**
 *
 * @author bisef5371
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City wien = new City();
        Wall wall = new Wall(wien, 1, 1, Direction.NORTH);
        Wall wall1 = new Wall(wien, 1, 2, Direction.NORTH);
        Wall wall2 = new Wall(wien, 1, 2, Direction.EAST);
        Wall wall3 = new Wall(wien, 2, 2, Direction.EAST);
        Wall wall4 = new Wall(wien, 2, 2, Direction.SOUTH);
        Wall wall5 = new Wall(wien, 2, 1, Direction.SOUTH);
        Wall wall6 = new Wall(wien, 2, 1, Direction.WEST);
        Wall wall7 = new Wall(wien, 1, 1, Direction.WEST);

        
    //creating a robot
    Robot krazy = new Robot(wien, 0, 0, Direction.SOUTH);
    krazy.move();
    krazy.move();
    krazy.move();
    krazy.turnLeft();
    krazy.move();
    krazy.move();
    krazy.move();
    krazy.turnLeft();
    krazy.move();
    krazy.move();
    krazy.move();
    krazy.turnLeft();
    krazy.move();
    krazy.move();
    krazy.move();
    krazy.turnLeft();
    }

   
}
