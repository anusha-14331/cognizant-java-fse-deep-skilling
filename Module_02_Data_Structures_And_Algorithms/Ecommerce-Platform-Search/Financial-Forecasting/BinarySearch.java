public class BinarySearch {

    public static int search(int[] products, int productId) {

        int low = 0;
        int high = products.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(products[mid] == productId)
                return mid;

            else if(products[mid] < productId)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] products = {101,102,103,104,105};

        int productId = 104;

        int result = search(products, productId);

        if(result != -1)
            System.out.println("Product found at index " + result);
        else
            System.out.println("Product not found");
    }
}