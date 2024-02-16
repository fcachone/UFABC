import java.util.Scanner;

public class MatrizEscada {
	public static void main(String[] args) {
		int j, n, m, m2, c;
		boolean flag;
		byte ans = 'S';

		n = STDIN_SCANNER.nextInt();
		m = STDIN_SCANNER.nextInt();
		for(int lastc = -1, i = 0; i < n; i++) {
			for(flag = true, c = 0, j = 0; j < m; j++) {
				m2 = STDIN_SCANNER.nextInt();
				if(m2 == 0 && flag) {
					c++;
				} else {
					flag = false;
				}
			}
			if(c <= lastc && c < m) {
				ans = 'N';
				break;
			}
			lastc = c;
		}

		System.out.println((char)Byte.toUnsignedInt(ans));
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}