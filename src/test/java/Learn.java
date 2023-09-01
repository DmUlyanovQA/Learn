public class Learn {
        public static boolean isSorted(int[] a)
        {
            // базовый вариант
//            if (a == null || a.length <= 1) {
//                return true;
//            }

            for (int i = 0; i < a.length - 1; i++)
            {
                if (a[i] < a[i + 1]) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args)
        {
            int[] a = { 3, 2, 1 };
            System.out.println(isSorted(a));        // true
        }
}
