class Array {
    // camel case naming convention is consistent with most in-built methods
    public static void main(String args[]) {
        Array array = new Array();
        int list[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int length = list.length;
        int key = 70;
        int position = array.linearSearch(list, length, key);
        displayPosition(position);
        position = array.binarySearch(list, key);
        displayPosition(position);
    }

    // static is a method that belongs to a class rather than an instance of a class
    static void displayPosition(int position) {
        if (position == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position: " + (position + 1));
    }

    int linearSearch(int list[], int length, int key) {
        for (int index = 0; index < length; index++) {
            if (list[index] == key)
                return index;
        }
        return -1;
    }

    int binarySearch(int list[], int key) {
        int left = 0;
        int right = list.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (list[middle] == key)
                return middle;

            if (list[middle] < key)
                left = middle + 1;
            else
                right = middle - 1;
        }
        return -1;
    }
}
