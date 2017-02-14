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
import java.awt.Color;

/**
 *
 * @author bisef5371
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    City wien = new City(); 
    
    Thing thing = new Thing(wien, 0, 0);
    thing.setColor(Color.yellow);
    
    Thing thing2 = new Thing(wien, 1, 0);
    thing2.setColor(Color.red);
    
    Thing thing3 = new Thing(wien, 1, 1);
    thing3.setColor(Color.black);
    
    Thing thing4 = new Thing(wien, 1, 2);
    thing4.setColor(Color.cyan);
    
    Thing thing5 = new Thing(wien, 2, 2);
    thing5.setColor(Color.green);
    
    Wall wall = new Wall(wien, 2, 3, Direction.WEST);
    Wall wall2 = new Wall(wien, 2, 3, Direction.NORTH);
    Wall wall3 = new Wall(wien, 2, 3, Direction.EAST);
    Wall wall4 = new Wall(wien, 3, 3, Direction.EAST);
    Wall wall5 = new Wall(wien, 3, 3, Direction.SOUTH);
    
    Robot krazy = new Robot(wien, 3, 3, Direction.EAST);
    krazy.setLabel("K");
    Robot hansi = new Robot(wien, 0, 1, Direction.WEST);
    hansi.setLabel("M");
    hansi.setColor(Color.blue);
    
    krazy.turnLeft();
    krazy.turnLeft();
    krazy.move();
    krazy.turnLeft();
    krazy.turnLeft();
    krazy.turnLeft();
    hansi.move();
    hansi.pickThing();
    krazy.move();
    krazy.pickThing();
    hansi.turnLeft();
    hansi.move();
    hansi.pickThing();
    krazy.move();
    krazy.pickThing();
    hansi.turnLeft();
    krazy.turnLeft();
    hansi.move();
    hansi.pickThing();
    
    }
}
