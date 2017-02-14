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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    City wien = new City(); 
    
    Thing thing = new Thing(wien, 3, 1);
    
    Wall wall = new Wall(wien, 3, 2, Direction.WEST);
    Wall wall2 = new Wall(wien, 3, 2, Direction.NORTH);
    Wall wall3 = new Wall(wien, 2, 3, Direction.WEST);
    Wall wall4 = new Wall(wien, 1, 3, Direction.WEST);
    Wall wall5 = new Wall(wien, 1, 3, Direction.NORTH);
    Wall wall6 = new Wall(wien, 1, 3, Direction.EAST);
    Wall wall7 = new Wall(wien, 2, 4, Direction.NORTH);
    Wall wall8 = new Wall(wien, 2, 4, Direction.EAST);
    Wall wall9 = new Wall(wien, 3, 4, Direction.EAST);
    
    
    Robot krazy = new Robot(wien, 3, 0, Direction.EAST);
    krazy.move();
    krazy.pickThing();
    krazy.turnLeft();
    krazy.move();
    krazy.turnLeft();
    krazy.turnLeft();
    krazy.turnLeft();
    krazy.move();
    krazy.turnLeft();
    krazy.move();
    krazy.move();
    krazy.turnLeft();
    krazy.turnLeft();
    krazy.turnLeft();
    krazy.move();
    krazy.putThing();
    krazy.move();
    krazy.turnLeft();
    krazy.turnLeft();
    krazy.turnLeft();
    krazy.move();
    krazy.turnLeft();
    krazy.move();
    krazy.turnLeft();
    krazy.turnLeft();
    krazy.turnLeft();
    krazy.move();
    krazy.move();
    krazy.turnLeft();
    
    }
}
