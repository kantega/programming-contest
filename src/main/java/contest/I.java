package contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class I {
    private static BufferedReader stdin = new BufferedReader(
            new InputStreamReader(System.in));
    private static StringTokenizer st = new StringTokenizer("");

    // Read next input-token as string.
    private static String readString() throws Exception {
        while (!st.hasMoreTokens()) {
            st = new StringTokenizer(stdin.readLine());
        }
        return st.nextToken();
    }

    // Read next input-token as integer.
    private static int readInt() throws Exception {
        return Integer.parseInt(readString());
    }

    // Read next input-token as double.
    static double readDouble() throws Exception {
        return Double.parseDouble(readString());
    }

    public static void main(String[] args) throws Exception {
        int T = readInt();
        while (T-- > 0) {
        }
    }
}