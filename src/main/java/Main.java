public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        //System.out.println(m.secondArr(new int[]{1, 5, 1, 4, 4, 1, 4, 4}));
        System.out.println(m.secondArr(new int[]{1,5}));
    }

    public int[] firstArr(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                index = i + 1;
            }
        }
        if (index == -1) {
            throw new RuntimeException();
        } else {
            int[] newArr = new int[arr.length - index];
            for (int i = index, j = 0; i < arr.length; i++, j++) {
                newArr[j] = arr[i];
            }
            return newArr;
        }
    }

    public boolean secondArr(int[] arr) {
        boolean a = false;
        boolean b = false;
        for (int i : arr) {
            if (i != 1 && i != 4){
                return false;
            }
            if (i == 1) {
                a = true;
            }
            if (i == 4)
                b = true;
        }
        return a & b;
    }
}