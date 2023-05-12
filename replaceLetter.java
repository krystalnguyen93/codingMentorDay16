package day16;

public class replaceLetter {
	public static void main(String[] args) {
		String s = "bbaaabbaabbba";
		int move = moveCount(s);
		System.out.println(move);
	}

	public static int moveCount(String s) {
		int move = 0;
		int consecutiveLetter = 1; // count of identical consecutive letters
		int i;
		for (i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				consecutiveLetter++;
			} else {
				move += consecutiveLetter / 3;
				consecutiveLetter = 1;
			}
		}
		move += consecutiveLetter / 3;
		return move;
	}
}
