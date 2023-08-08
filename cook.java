
import java.util.*;

public class Main {
    public static class GameScreen {
    
    	private int width, height;
    	private char[][] screenMatrix;
    
    	public GameScreen(int width, int height) {
    		this.width = width;
    		this.height = height;
    		this.screenMatrix = new char[this.height][this.width];
    	}
    
    	// Fill array with dots
    	public void InitScreen() {
    		for (int i = 0; i < this.height; i++) {
    			for (int j = 0; j < this.width; j++) {
    				this.screenMatrix[i][j] = '.';
    			}
    		}
    	}
    
    	// Print the screen to console
    	public void PrintScreen() {
    		for (int i = 0; i < this.height; i++) {
    			for (int j = 0; j < this.width; j++) {
    				System.out.print(this.screenMatrix[i][j]);
    			}
    			System.out.println();
    		}
    	}
    
    	//Screen clear location
    	public void ClearScreenLocation(int x, int y) {
    		this.screenMatrix[y][x] = '.';
    	}
    
    	// Getters
    	public int getScreenWidth() {
    		return this.width;
    	}
    
    	public int getScreenHeight() {
    		return this.height;
    	}
    
    	public char getObjectOnLocation(int x, int y) {
    		return this.screenMatrix[y][x];
    	}
    
    	// Setters
    	public void setObjectOnLocation(GameObject object, int x, int y) {
    		this.screenMatrix[y][x] = object.getSymbol();
    	}
    }
    public static class GameObject {
    	
    	private int x, y;
    	private char symbol;
    	
    	// Getters
    	public int getX() {
    		return this.x;
    	}
    
    	public int getY() {
    		return this.y;
    	}
    
    	public char getSymbol() {
    		return symbol;
    	}
    
    	// Setters
    	public void setX(int newLocation) {
    		this.x = newLocation;
    	}
    	
    	public void setY(int newLocation) {
    		this.y = newLocation;
    	}
    	
    	public void setSymbol(char newSymbol) {
    		this.symbol = newSymbol;
    	}
    }
    public static class Food extends GameObject {

	public Food(char symbol) {
		setSymbol(symbol);
	}

	// Add food to random location inside the matrix limits
	public void addRandomFood(GameScreen screen, Food food) {
		screen.setObjectOnLocation(food, (int) (Math.random() * (screen.getScreenWidth() - 1)),
				(int) (Math.random() * (screen.getScreenHeight() - 1)));
	}
}
    public static class Snake extends GameObject {
    
    	public Snake(char symbol, int xStartingLocation, int yStartingLocation) {
    		setSymbol(symbol);
    		setX(xStartingLocation);
    		setY(yStartingLocation);
    	}
    	
    	public void moveLeft(GameScreen screen, Snake snake) {
    		snake.setX(getX() - 1);
    		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
    		screen.ClearScreenLocation(snake.getX() + 1, snake.getY());
    	}
    	
    	public void moveRight(GameScreen screen, Snake snake) {
    		snake.setX(getX() + 1);
    		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
    		screen.ClearScreenLocation(snake.getX() - 1, snake.getY());
    	}
    	
    	public void moveUp(GameScreen screen, Snake snake) {
    		snake.setY(getY() - 1);
    		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
    		screen.ClearScreenLocation(snake.getX(), snake.getY() + 1);
    	}
    	
    	public void moveDown(GameScreen screen, Snake snake) {
    		snake.setY(getY() + 1);
    		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
    		screen.ClearScreenLocation(snake.getX(), snake.getY() - 1);
    	}
    }
    public static class Wall extends GameObject {
    
    	public Wall() {
    		setSymbol('#');
    	}
    
    	public Wall(char symbol) {
    		setSymbol(symbol);
    	}
    
    	// Add horizontal line of walls
    	public void addWallsRow(GameScreen screen, Wall wall, int rowNumber) {
    		for (int i = 0; i < screen.getScreenWidth(); i++) {
    			screen.setObjectOnLocation(wall, i, rowNumber);
    		}
    	}
    
    	// Add vertical line of walls
    	public void addWallsColumn(GameScreen screen, Wall wall, int columnNumber) {
    		for (int i = 0; i < screen.getScreenHeight(); i++) {
    			screen.setObjectOnLocation(wall, columnNumber, i);
    		}
    	}
    }
    
	public static void main(String[] args) {

		// Constants
		final int SCREEN_WIDTH = 20; // Columns
		final int SCREEN_HEIGHT = 10; // Rows
		final int SNAKE_STARTING_X = SCREEN_WIDTH / 2;
		final int SNAKE_STARTING_Y = SCREEN_HEIGHT / 2;

		// Init screen
		GameScreen screen = new GameScreen(SCREEN_WIDTH, SCREEN_HEIGHT);
		screen.InitScreen();

		// Init walls
		Wall wall = new Wall('#');
		wall.addWallsRow(screen, wall, 0); // First row
		wall.addWallsRow(screen, wall, screen.getScreenHeight() - 1); // Last
																		// row
		wall.addWallsColumn(screen, wall, 0); // First column
		wall.addWallsColumn(screen, wall, screen.getScreenWidth() - 1); // Last
																		// column

		// Init player
		Snake snake = new Snake('@', SNAKE_STARTING_X, SNAKE_STARTING_Y);
		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());

		// Init food
		Food food = new Food('*');
		food.addRandomFood(screen, food);
		
		// Input from player
		Scanner scanner = new Scanner(System.in);

		// The game logic starts here
		boolean isRunning = true;

		while (isRunning) {
			screen.PrintScreen();
			// Get input from player and do something
			switch (scanner.nextLine().charAt(0)) {
			case 'a':
				snake.moveLeft(screen, snake);
				break;
			case 'd':
				snake.moveRight(screen, snake);
				break;
			case 'w':
				snake.moveUp(screen, snake);
				break;
			case 's':
				snake.moveDown(screen, snake);
				break;
			}
		}
	}

}
