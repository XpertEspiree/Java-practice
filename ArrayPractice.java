class ArrayPractice {
    public static void main(String[] args) {

        // Step 1: declare and create an array of 4 integers
        int[] numbers = new int[4];

        // Step 2: fill each position manually
        numbers[0] = 20;
        numbers[1] = 21;
        numbers[2] = 19;
        numbers[3] = 22;

        // Step 3: loop through and print each one with its index
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
		}
	}
}
