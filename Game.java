package ntg;

public class Game {

	public GameInput inputSocket;
	public GameOutput outputSocket;
	public GameWorld world;
	
	public static void main(String[] args) {
		Game game = new Game();
		game.startUp();
		while (true){
			game.updateState();
		}

	}
	
	public void startUp(){
		this.inputSocket = new GameInput();
		this.outputSocket = new GameOutput();
		this.world = new GameWorld();
	}
	
	public void updateState(){
		this.world.update(this.inputSocket.getAction(this.world));
		this.outputSocket.show(this.world);
	}

}
