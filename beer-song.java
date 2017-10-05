public class BeerSong {
	public static void main(String args[]) {
		int bottlesRemaining = 99;
		String firstLine = " bottles of beer on the wall, ";
		String secondLine = " bottles of beer. You take one down, you pass it around: ";
		String lastLine = " bottles of beer on the wall. ";
	
	while (bottlesRemaining > 1) {
		System.out.print(bottlesRemaining + firstLine + bottlesRemaining + secondLine + bottlesRemaining + lastLine + "\n");
		bottlesRemaining --;
	}
System.out.println("There's only " + bottlesRemaining + " bottle of beer on the wall, there's only " + bottlesRemaining + " bottle of beer. You take it down and pass it around..." + "\n" + "...There's no more beer now so it's best you went home. Bye!");
	}
}
