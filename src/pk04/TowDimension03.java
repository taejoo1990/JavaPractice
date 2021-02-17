package pk04;

import javax.swing.JOptionPane;

public class TowDimension03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] PythonScore = new int[2][3];
		int n1 = 0;

		for (int i = 0; i < PythonScore.length; i++) {
			for (int k = 0; k < PythonScore[i].length; k++) {
				n1 = Integer.parseInt(JOptionPane.showInputDialog("PythonScore"));
				PythonScore[i][k] = n1;
				System.out.println("PythonScore[" + i + "][" + k + "]=" + PythonScore[i][k]);
			}
			System.out.println("--------Çà¹Ù²ñ-------");
		}
		System.out.println("===================");
		int[][] javaScores = new int[2][];
		javaScores[0] = new int[2];
		javaScores[1] = new int[3];
		int n2 = 0;

		for (int i = 0; i < javaScores.length; i++) {
			for (int k = 0; k < javaScores[i].length; k++) {
				n2 = Integer.parseInt(JOptionPane.showInputDialog("javaScores"));
				javaScores[i][k] = n2;
				System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);
			}
			System.out.println("-------Çà¹Ù²ñ-------");
		}
		System.out.println();
		System.out.println("===================");

		int[][] Rscores = { { 95, 87 }, { 77, 88, 99 } };
		for (int i = 0; i < Rscores.length; i++) {
			for (int k = 0; k < Rscores[i].length; k++) {
				System.out.println("Rscores[" + i + "][" + k + "]=" + Rscores[i][k]);
			}
			System.out.println("-------Çà¹Ù²ñ-------");
		}

	}

}
