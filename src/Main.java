class Main {
    // static is a method that belongs to a class rather than an instance of a class
    static int linearSearch(int array[], int length, int key) {
        for (int index = 0; index < length; index++) {
            if (array[index] == key)
                return index;
        }
        return -1;
    }

    // camel case naming convention is consistent with most in-built methods
    public static void main(String args[]) {
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int length = array.length;
        int key = 70;
        int position = linearSearch(array, length, key);

        if (position == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position: " + (position + 1));
    }
}
