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
			System.exit(0);
		}

	}
	
	public void startUp(){
		this.inputSocket = new GameInput();
		this.outputSocket = new GameOutput();
		this.world = new GameWorld();
		this.outputSocket.show("Hej du har skapat en värld!");
		this.outputSocket.show(this.world.toString());
	}
	
	public void updateState(){
		this.outputSocket.show(this.world.update());
		
	}

}
