package ��������;

import java.util.Scanner;

public class ��������Ǯ��6�� {

	public static void main(String[] args) {
		String[] fruits = {"���", "Ű��", "����", "�ڸ�", "��󸸽�", "������"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ã�� ���� ���� : ");
		String input = sc.next();
		
		int findIndex = -1;
		
		for(int i = 0; i<fruits.length ; i++) {
			if(input.equals(fruits[i])) {
				findIndex = i;
				break;
			}
			
		}
		
		if(findIndex == -1) {
			System.out.println("ã�� ������ �����ϴ�.");
		}
		else {
			System.out.println(input + "�� ��ġ�� " + findIndex + "��° �Դϴ�.");
		}

	}

}
