
public class ���ڿ� {

	public static void main(String[] args) {
		// Java���� ���ڿ��� ǥ���ϴ� ������Ÿ�� String(����� ���� Ÿ��)
		
		char c= 'A';
		String s = "A";
		String word = "Apple";  // ���ο��� char �迭�� �����Ǿ��ִ�.
		String msg = "�ȳ��ϼ���. ���ɽð��̿���. ����Ŀ�.";
		
		 char[] word_array = new char[5];
		 word_array[0] = 'A';
		 word_array[1] = 'p';
		 word_array[2] = 'p';
		 word_array[3] = 'l';
		 word_array[4] = 'e';
		
//		 String Ÿ���� ������ ���
		 
//		 1. ���ڿ����� Ư�� ��ġ�� �� ���ڸ� ������ �� ��� : charAt
		 char result = word.charAt(0);
		 System.out.println(result);
		 
//		 2. ���ڿ��� Ư�� ��ȣ�� �ɰ��� ���� �� ��� : split
		 String wordList = "�ٳ���,���,��,����";
		 String[] wordListSplit = wordList.split(",");
		 
		 System.out.println(wordListSplit[0]);
		 System.out.println(wordListSplit[1]);
		 System.out.println(wordListSplit[2]);
		 System.out.println(wordListSplit[3]);                                                                                                           
		 // 3. Ư�� ���ڰ� ���ڿ��� ���ԵǾ��ִ��� �˾ƺ��� ���  :contains
		 
		 boolean result2 = msg.contains("����");
		 
		 System.out.println(result2);
		 
		 
		 // 4. ���ڿ��� Ư�� ���ڸ� �ٸ� ���ڷ� ��ü�ϴ� ��� : replace
		 String result3 = msg.replace("����Ŀ�." ,  "�����");
		 System.out.println(result3);
		 
		 // 5. ���ڿ� �Ϻ� ������ �߶󳻴� ��� : substring
		 String result4 = msg.substring(0, 6);
		 System.out.println(result4);
		 
	

	}

}
