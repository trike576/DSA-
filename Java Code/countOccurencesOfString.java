class countOccurencesOfString{
    public static void main(String[] args) {

        int runs = 1000;

        String str1 = "hellohellohellohello";
        String sub1 = "lo";

        String str2 = "aaaaaaaaaaaaaaaaaaaa";
        String sub2 = "aa";

        String str3 = "abcabcabcabcabcabc";
        String sub3 = "abc";

        long start, end;
        long totalIter1 = 0, totalRec1 = 0;
        long totalIter2 = 0, totalRec2 = 0;
        long totalIter3 = 0, totalRec3 = 0;

        for (int i = 0; i < runs; i++) {
            start = System.nanoTime();
            countOccurrencesIterative(str1, sub1);
            end = System.nanoTime();
            totalIter1 += (end - start);

            start = System.nanoTime();
            countOccurrencesRecursive(str1, sub1);
            end = System.nanoTime();
            totalRec1 += (end - start);
        }

        for (int i = 0; i < runs; i++) {
            start = System.nanoTime();
            countOccurrencesIterative(str2, sub2);
            end = System.nanoTime();
            totalIter2 += (end - start);

            start = System.nanoTime();
            countOccurrencesRecursive(str2, sub2);
            end = System.nanoTime();
            totalRec2 += (end - start);
        }

        for (int i = 0; i < runs; i++) {
            start = System.nanoTime();
            countOccurrencesIterative(str3, sub3);
            end = System.nanoTime();
            totalIter3 += (end - start);

            start = System.nanoTime();
            countOccurrencesRecursive(str3, sub3);
            end = System.nanoTime();
            totalRec3 += (end - start);
        }

        System.out.println("String 1 Iterative Avg Time: " + (totalIter1 / runs) + " ns");
        System.out.println("String 1 Recursive Avg Time: " + (totalRec1 / runs) + " ns");

        System.out.println("String 2 Iterative Avg Time: " + (totalIter2 / runs) + " ns");
        System.out.println("String 2 Recursive Avg Time: " + (totalRec2 / runs) + " ns");

        System.out.println("String 3 Iterative Avg Time: " + (totalIter3 / runs) + " ns");
        System.out.println("String 3 Recursive Avg Time: " + (totalRec3 / runs) + " ns");
    }
    public static int countOccurrencesIterative(String str, String sub) {
        if (str == null || sub == null || sub.length() == 0 || str.length() < sub.length())
            return 0;

        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }
        return count;
    }

    public static int countOccurrencesRecursive(String str, String sub) {
        if (str == null || sub == null || sub.length() == 0 || str.length() < sub.length())
            return 0;

        if (str.startsWith(sub))
            return 1 + countOccurrencesRecursive(str.substring(1), sub);

        return countOccurrencesRecursive(str.substring(1), sub);
    }
}
