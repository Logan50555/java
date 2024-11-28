public class AgeCalculator {
    public static void main(String[] args) {
        
        int age = 20; 
        switch (age) {
            // Cases for minors (ages 0-17)
            case 0: case 1: case 2: case 3: case 4:
            case 5: case 6: case 7: case 8: case 9:
            case 10: case 11: case 12: case 13: case 14:
            case 15: case 16: case 17:
                System.out.println("You are a minor.");
                break;

            // Cases for young adults (ages 18-24)
            case 18: case 19: case 20: case 21: case 22: case 23: case 24:
                System.out.println("You are a young adult.");
                break;

            // Default case for adults (ages 25 and above)
            default:
                System.out.println("You are an adult.");
                break;
        }
    }
}
