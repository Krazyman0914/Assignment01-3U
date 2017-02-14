/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author bisef5371
 */
public class A1Q4 {
    private static String Krazy;
    private static String Hansi;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    City wien = new City(); 
    
    Wall wall = new Wall(wien, 0, 1, Direction.WEST);
    Wall wall2 = new Wall(wien, 1, 1, Direction.WEST);
    Wall wall3 = new Wall(wien, 1, 1, Direction.SOUTH);
    
    Robot krazy = new Robot(wien, 0, 0, Direction.SOUTH);
    krazy.setLabel("Krazy");
    Robot hansi = new Robot(wien, 0, 1, Direction.SOUTH);
    hansi.setLabel("Hansi");
    hansi.setColor(Color.BLUE);
    hansi.move();
    krazy.move();
    hansi.turnLeft();
    krazy.move();
    hansi.move();
    hansi.turnLeft();
    hansi.turnLeft();
    hansi.turnLeft();
    hansi.move();
    krazy.turnLeft();
    hansi.turnLeft();
    hansi.turnLeft();
    hansi.turnLeft();
    krazy.move();
    hansi.move();
    
    }
}
