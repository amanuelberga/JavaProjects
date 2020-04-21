public class TowerOfHanoi {
	
	public static void moveDisks(int n, char from, char using, char to) {
		if (n == 1) {
			System.out.printf("move disk from peg %s to peg %s\n", from, to);
		}
		else {
			moveDisks(n-1, from, to, using);
			moveDisks(1, from, using, to);
			moveDisks(n-1, using, from, to);
		}
	}

	public static void main(String[] args) {
		moveDisks(4, 'A', 'B', 'C');
	}
}