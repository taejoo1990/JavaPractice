package pk04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;

		int studentNum = 0;
		int[] scores = null;// int[] scores = new int[5];
		// �л����� �󸶳� ������ �𸣱⿡ null������
		int sum = 0;
		double avg = 0.0;
		int max = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.���� ");
			System.out.println("------------------------------------------");
			System.out.print("����> ");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			}
			if (selectNo == 2) {
				System.out.println("�����Է�> ");
				scores = new int[studentNum];
				for (int i = 0; i < studentNum; i++) {
					System.out.println((i+1)+"��° �����Է� : ");
					scores[i] = scanner.nextInt();
					sum += scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}
				}

			}
			avg = (double) sum / studentNum;
			if (selectNo == 3) {
				System.out.println("��������Ʈ> ");
				for (int i = 0; i < studentNum; i++) {
					System.out.println((i+1) + "��° ������ :(" + scores[i] + ")");
				}

			}
			if (selectNo == 4) {
				System.out.println("�м�> ");
				System.out.println("������ : " + sum);
				System.out.println("����� : " + avg);
				System.out.println("�ְ� �����ڴ� : " + max);

			}
			if (selectNo == 5) {
				System.out.print("�ý����� �����մϴ�. ");
				break;

			}
		}

	}

}
