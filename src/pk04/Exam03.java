package pk04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;

		int studentNum = 0;
		int[] scores = null;// int[] scores = new int[5];
		// 학생수를 얼마나 적을지 모르기에 null을적음
		int sum = 0;
		double avg = 0.0;
		int max = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			}
			if (selectNo == 2) {
				System.out.println("점수입력> ");
				scores = new int[studentNum];
				for (int i = 0; i < studentNum; i++) {
					System.out.println((i+1)+"번째 점수입력 : ");
					scores[i] = scanner.nextInt();
					sum += scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}
				}

			}
			avg = (double) sum / studentNum;
			if (selectNo == 3) {
				System.out.println("점수리스트> ");
				for (int i = 0; i < studentNum; i++) {
					System.out.println((i+1) + "번째 점수는 :(" + scores[i] + ")");
				}

			}
			if (selectNo == 4) {
				System.out.println("분석> ");
				System.out.println("총합은 : " + sum);
				System.out.println("평균은 : " + avg);
				System.out.println("최고 득점자는 : " + max);

			}
			if (selectNo == 5) {
				System.out.print("시스템을 종료합니다. ");
				break;

			}
		}

	}

}
