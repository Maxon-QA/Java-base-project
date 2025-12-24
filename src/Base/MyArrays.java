package Base;

public class MyArrays {
    public static void main(String[] args) {

        //1
        int[] arr1 = {11, 22, 33, 44, 55, 66, 77};

        int[] arr2 = {1, 2, 3, 4, 2, 2, 5};
        int[] arr3 = {-1, 2, 3, 4, 2, 2, -5};
        int[] arr4 = {0, 1, 2, -3, 4, 0, -2, 2, -5, 0};
        int[] arr222 = new int[5];

        int x = 0;
        //System.out.println(findFirst(arr, 2));
        //System.out.println(findFirst(arr, 2));
        //System.out.println(findLast(arr, 20));
        //System.out.println(maxAbs(arr5));
        //System.out.println(Arrays.toString(arr5));
        //int x = Math.abs(-3);

        //System.out.println(Arrays.toString(arr2));
        //System.out.println(countPositive(arr));
        //reverse(arr1);
        //System.out.println(Arrays.toString(reverseBack(arr1)));
        //System.out.println(Arrays.toString(concat(arr1, arr2)));
        //System.out.println(Arrays.toString(findAll(arr1, x)));
        //System.out.println(Arrays.toString(deleteNegative(arr1)));
/*        System.out.println(Arrays.toString(add(arr1, 999, 0)));
        System.out.println(Arrays.toString(add(arr1, 999, 5)));
        System.out.println(Arrays.toString(add(arr1, 999, 6)));
        System.out.println(Arrays.toString(add(arr1, 999, 7)));
        System.out.println(Arrays.toString(add(arr1, 999, 8)));
        System.out.println(Arrays.toString(add(arr1, 999, 9)));
        System.out.println(Arrays.toString(add(arr1, 999, 10)));

        int[] arr = {};
        int[] ins = {77, 88, 99};
        System.out.println(Arrays.toString(add(arr, ins, 0)));
        System.out.println(Arrays.toString(add(arr, ins, 3)));
        System.out.println(Arrays.toString(add(arr, ins, 4)));
        System.out.println(Arrays.toString(add(arr, ins, 5)));
        System.out.println(Arrays.toString(add(arr, ins, 6)));
        System.out.println(Arrays.toString(add(arr, ins, 7)));
        System.out.println(Arrays.toString(add(arr, ins, 8)));
        System.out.println(Arrays.toString(add(arr, ins, 9)));
        System.out.println(Arrays.toString(add(arr, ins, 10)));
        System.out.println(Arrays.toString(add(arr, ins, 11)));
        System.out.println(Arrays.toString(add(arr, ins, 20)));

        */
        int c = 5;
        System.out.println(--c);
        System.out.println(c);


    }




    //-----------------------------------------
    public static int[] add22(int[] arr, int x, int pos) {
        int resultLen;
        boolean checkLenPos = false;

        if (arr.length > pos) {
            resultLen = arr.length + 1;
            checkLenPos = true;
        } else {
            resultLen = pos + 1;
        }

        int[] resultMass = new int[resultLen];

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i == pos) {
                resultMass[j] = x;
                j++;
            }
            resultMass[j] = arr[i];
        }

        if (!checkLenPos) {
            resultMass[pos] = x;
        }
        return resultMass;
    }


    //1
    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    //2
    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    //3
    public static int maxAbs(int[] arr) {

        int[] arrAbs = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arrAbs[i] = arr[i] * -1;
            } else {
                arrAbs[i] = arr[i];
            }
        }
        int maxAbs = arrAbs[0];
        int resultIndex = 0;
        for (int i = 1; i < arrAbs.length; i++) {
            if (arrAbs[i] > maxAbs) {
                maxAbs = arrAbs[i];
                resultIndex = i;
            }
        }
        return arr[resultIndex];

    }

    //4
    public static int countPositive(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result++;
            }
        }
        return result;
    }

    //5 Преподаватель
    public static boolean palindrom5(int[] arr) {
        int length = arr.length;
        int halfOfLength = length / 2;
        for (int i = 0; i < halfOfLength; i++) {
            if (arr[i] != arr[length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    //5
    public static boolean palindrom(int[] arr) {
        for (int i = 0, j = arr.length - 1; i <= arr.length / 2; i++, j--) {
            if (arr[i] != arr[j]) return false;
        }
        return true;
    }

    //6 Преподаватель
    public static void reverse6(int[] arr) {
        int length = arr.length;
        int halfOfLength = length / 2;
        for (int i = 0; i < halfOfLength; i++) {
            int temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }
    }

    //6
    public static void reverse(int[] arr) {
        int temp;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    //7 Преподаватель
    public static int[] reverseBack7(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        return reversedArr;
    }

    //7
    public static int[] reverseBack(int[] arr) {
        int[] reverse = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            reverse[i] = arr[j];
        }
        return reverse;
    }

    //8
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] contMass = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            contMass[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            contMass[arr1.length + i] = arr2[i];
        }
        return contMass;
    }

    //9
    public static int[] findAll(int[] arr, int x) {
        int[] indexMass = new int[arr.length];
        int countIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indexMass[countIndex] = i;
                countIndex++;
            }
        }

        int[] resultMass = new int[countIndex];
        for (int i = 0; i < resultMass.length; i++) {
            resultMass[i] = indexMass[i];
        }
        return resultMass;
    }

    //10
    public static int[] deleteNegative(int[] arr) {
        int[] indexMass = new int[arr.length];
        int countIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                indexMass[countIndex] = arr[i];
                countIndex++;
            }
        }

        int[] resultMass = new int[countIndex];
        for (int i = 0; i < resultMass.length; i++) {
            resultMass[i] = indexMass[i];
        }
        return resultMass;
    }

    //11 Преподаватель
    public static int[] add11(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }

    //11
    public static int[] add(int[] arr, int x, int pos) {
        int resultLen;
        boolean checkLenPos = false;

        if (arr.length - 1 >= pos) {
            resultLen = arr.length + 1;
            checkLenPos = true;
        } else {
            resultLen = pos + 1;
        }

        int[] resultMass = new int[resultLen];

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i == pos) {
                resultMass[j] = x;
                j++;
            }
            resultMass[j] = arr[i];
        }

        if (!checkLenPos) {
            resultMass[pos] = x;
        }
        return resultMass;
    }

    //12
    public static int[] add(int[] arr, int[] ins, int pos) {
        int resultLen;
        boolean checkResultLenIn = false;

        if (arr.length - 1 >= pos) {
            resultLen = arr.length + ins.length;
            checkResultLenIn = true;
        } else {
            resultLen = pos + ins.length;
        }

        int[] resultMass = new int[resultLen];

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i == pos) {
                for (int k = 0; k < ins.length; k++) {
                    resultMass[j] = ins[k];
                    j++;
                }
            }
            resultMass[j] = arr[i];
        }

        if (!checkResultLenIn) {
            for (int i = 0, j = pos; i < ins.length; i++, j++) {
                resultMass[j] = ins[i];
            }
        }
        return resultMass;



    }

}

