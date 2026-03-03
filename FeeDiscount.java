// Program to calculate discount and final fee

class FeeDiscount {
    public static void main(String[] args) {

        // Variables
        double fee = 125000;
        double discountPercent = 10;

        // Discount calculation
        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;

        // Display result
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}