public class Main {
    public static void main(String[] args) {
        Utility[] utilities = new Utility[3];

        utilities[0] = new Utility("Electricity", 110.5);
        utilities[1] = new Utility("Heating", 89.3);
        utilities[2] = new Utility("Water", 45.0);

        double sum = 0.0;
        Utility mostExpensive = utilities[0];

        for (int i = 0; i < utilities.length; i++) {
            sum += utilities[i].getPrice();
            if (utilities[i].getPrice() > mostExpensive.getPrice()) {
                mostExpensive = utilities[i];
            }
        }
        double avg = sum / utilities.length;
        System.out.println("Total utility cost: " + sum);
        System.out.println(mostExpensive.getName() + " with a price of " + mostExpensive.getPrice() + " is the most expensive utility");
        System.out.println("The average utility price is: " + avg);
    }
}