package objectorientedfallingsand;

import java.awt.*;
import java.util.*;
import java.awt.Color;

public class SandLab {

    //do not add any more fields
    private Particle[][] grid;
    private SandDisplay display;
    public static final int ROWS = 120;
    public static final int COLUMNS = 80;

    public static void main(String[] args) {
        SandLab lab = new SandLab(ROWS, COLUMNS);
        lab.run();
    }

    public SandLab(int numRows, int numCols) {
        Particle[] particles = new Particle[4];
        grid = new Particle[numRows][numCols];

        //create particle objects
        Particle empty = new Particle();
        Particle metal = new Particle();
        Particle sand = new Particle();
        Particle water = new Particle();

        //Store names and color in each object
        Color emptyColor = new Color(0, 0, 0);
        Color sandColor = new Color(244, 164, 96);

        empty.setName("empty");
        empty.setColor(emptyColor);
        metal.setName("metal");
        metal.setColor(Color.DARK_GRAY);
        sand.setName("sand");
        sand.setColor(sandColor);
        water.setName("water");
        water.setColor(Color.CYAN);

        //Add Particle objects to array
        particles[0] = empty;
        particles[1] = metal;
        particles[2] = sand;
        particles[3] = water;

        display = new SandDisplay("Falling Sand", numRows, numCols, particles);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = empty;
            }
        }

        Movement left = new Movement(0, -1);
        Movement down = new Movement(1, 0);
        Movement right = new Movement(0, 1);

        sand.addMovement(down);
        water.addMovement(left);
        water.addMovement(right);
        water.addMovement(down);
    }

    //called when the user clicks on a location using the given tool
    private void locationClicked(int row, int col, Particle tool) {
        Particle cloneParticle = tool.clone();
        grid[row][col] = cloneParticle;
    }

    //copies each element of grid into the display
    public void updateDisplay() {
        Particle particle;

        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                particle = grid[row][column];
                display.setColor(row, column, particle.getColor());
            }
        }
    }

    //called repeatedly.
    //causes one random particle to maybe do something.
    public void step() {
        int row = (int) (Math.random() * ROWS);
        int col = (int) (Math.random() * COLUMNS);

        Particle particle = grid[row][col];

        if (particle.isMoveable()) {
            Movement movement = particle.getRandomMovement();

            int newRow = row + movement.getRowChange();
            int newCol = col + movement.getColumnChange();

            if ((newRow >= 0 && newRow < ROWS - 1 ) && (newCol >= 0 && newCol < COLUMNS - 1)) {

                Particle newParticle = grid[newRow][newCol];
                grid[newRow][newCol] = particle;
                grid[row][col] = newParticle;
            }

        }
    }

    //do not modify
    public void run() {
        while (true) {
            for (int i = 0; i < display.getSpeed(); i++) {
                step();
            }

            updateDisplay();
            display.repaint();
            display.pause(1);  //wait for redrawing and for mouse
            int[] mouseLoc = display.getMouseLocation();

            if (mouseLoc != null) //test if mouse clicked
            {
                locationClicked(mouseLoc[0], mouseLoc[1], display.getTool());
            }
        }
    }
}
