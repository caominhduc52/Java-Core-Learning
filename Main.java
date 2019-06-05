import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void Input(int a[][], int n) throws NumberFormatException, IOException {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = Integer.parseInt(reader.readLine());
			}
		}
	}
	
	public static void Output(int a[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
				if (j == n - 1) {
					System.out.print("\n");
				}
			}
		}
	}
	
	public static int countInversion(int a[][]) {
		int inversions = 0;
		int currentInversions = 0;
		ArrayList<Integer> list = new ArrayList<Integer>(9);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				list.add(a[i][j]);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			int tempValue = list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				if (j > 0 && j < tempValue) {
					currentInversions++;
				}
			}
			inversions += currentInversions;
		}
		return inversions;
	}
	
	public static boolean isReachable(int inversions) {
		return (inversions % 2 == 0) ? true : false;
	}
	/*
	 * Use number 0 to input blank in 8 puzzle.
	 * Algorithm to solve this question is using inversions.
	 * Source : 
	 *  - http://www.8puzzle.com/8_puzzle_algorithm.html?
	 *  - https://www.geeksforgeeks.org/check-instance-8-puzzle-solvable/
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		int state[][] = new int[3][3];
		int goal[][] = new int[3][3];
		System.out.println("Input initial state : ");
		Input(state, 3);
		System.out.println("Input goal state");
		Input(goal, 3);
		System.out.println();
		System.out.println();
		System.out.println("Init State");
		Output(state, 3);
		System.out.println();
		System.out.println("Goal State");
		Output(goal, 3);
		
		int inversions = countInversion(state);
		boolean isReachable = isReachable(inversions);
		if (isReachable) {
			System.out.println("\nTrue");
		} else {
			System.out.println("\nFalse");
		}
	}
}
