public class LinearSearch {

    public static int search(int[] products, int productId) {

        for(int i = 0; i < products.length; i++) {

            if(products[i] == productId) {
                return i;
            }
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
