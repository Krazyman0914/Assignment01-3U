/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;


/**
 *
 * @author bisef5371
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating new city
    City wien = new City();
    //creating a "thing"
        Thing thing = new Thing(wien, 2, 2);
        //building walls
        Wall wall = new Wall(wien, 1, 2, Direction.SOUTH);
        Wall wall1 = new Wall(wien, 1, 2, Direction.NORTH);
        Wall wall2 = new Wall(wien, 1, 2, Direction.EAST);
        Wall wall3 = new Wall(wien, 1, 1, Direction.NORTH);
        Wall wall4 = new Wall(wien, 1, 1, Direction.WEST);
        Wall wall5 = new Wall(wien, 2, 1, Direction.SOUTH);
        Wall wall6 = new Wall(wien, 2, 1, Direction.WEST);
        
        
        Robot krazy = new Robot(wien, 1, 2, Direction.SOUTH);
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.move();
        krazy.turnLeft();
        krazy.move();
        krazy.turnLeft();
        krazy.move();
        krazy.pickThing();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.move();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.move();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.move();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.turnLeft();
    }
}
