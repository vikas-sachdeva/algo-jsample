package jsample;

public class PrimeFinder {

    public int[] findUpTo(int n) {
        boolean[] array = new boolean[n + 1];
        int[] temp = new int[n];
        int primeCount = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!array[i]) {
                temp[primeCount] = i;
                primeCount++;
                for (int j = i * i; j <= n; j = j + i) {
                    array[j] = true;
                }
            }
        }
        for (int i = (int) Math.sqrt(n) + 1; i <= n; i++) {
            if (!array[i]) {
                temp[primeCount] = i;
                primeCount++;
            }
        }
        int[] primeNo = new int[primeCount];
        System.arraycopy(temp, 0, primeNo, 0, primeCount);
        return primeNo;
    }
}