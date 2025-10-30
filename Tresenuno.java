import java.util.Scanner;

public class ThreeInOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            try {
                System.out.println("\n=== THREE-IN-ONE PROGRAM ===");
                System.out.println("1. Average of two numbers");
                System.out.println("2. Calculate area and perimeter of shapes");
                System.out.println("3. Interactive Story");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();

                if (choice == 4) {
                    System.out.println("\nExiting program...\n");
                    running = false;
                    break;
                }

                switch (choice) {
                    case 1:
                        System.out.println("\n- SELECTED - Average of two numbers -\n");
                        System.out.print("Enter the first number: ");
                        int num1 = scanner.nextInt();
                        System.out.print("Enter the second number: ");
                        int num2 = scanner.nextInt();
                        int average = (num1 + num2) / 2;
                        System.out.println("\nThe average of the two numbers is: " + average + "\n");
                        break;

                    case 2:
                        System.out.println("\n- SELECTED - Area and Perimeter -\n");
                        System.out.print("Calculate Area[1] or Perimeter[2]: ");
                        int areaOrPerimeter = scanner.nextInt();

                        if (areaOrPerimeter == 1) {
                            System.out.println("\n- SELECTED - Area -\n");
                            System.out.println("Choose shape: Square[1] / Rectangle[2] / Triangle[3] / Circle[4]");
                            int shape = scanner.nextInt();

                            switch (shape) {
                                case 1:
                                    System.out.print("Enter side length (m): ");
                                    int side = scanner.nextInt();
                                    int squareArea = side * side;
                                    System.out.println("\nSquare area: " + squareArea + " m²\n");
                                    break;
                                case 2:
                                    System.out.print("Enter base (m): ");
                                    int baseR = scanner.nextInt();
                                    System.out.print("Enter height (m): ");
                                    int heightR = scanner.nextInt();
                                    int rectArea = baseR * heightR;
                                    System.out.println("\nRectangle area: " + rectArea + " m²\n");
                                    break;
                                case 3:
                                    System.out.print("Enter base (m): ");
                                    int baseT = scanner.nextInt();
                                    System.out.print("Enter height (m): ");
                                    int heightT = scanner.nextInt();
                                    int triArea = (baseT * heightT) / 2;
                                    System.out.println("\nTriangle area: " + triArea + " m²\n");
                                    break;
                                case 4:
                                    System.out.print("Enter radius (m): ");
                                    float radiusA = scanner.nextFloat();
                                    float pi = 3.14159f;
                                    float circleArea = pi * radiusA * radiusA;
                                    System.out.println("\nCircle area: " + circleArea + " m²\n");
                                    break;
                                default:
                                    System.out.println("\nInvalid number [1-4]\n");
                            }

                        } else if (areaOrPerimeter == 2) {
                            System.out.println("\n- SELECTED - Perimeter -\n");
                            System.out.println("Choose shape: Square[1] / Rectangle[2] / Triangle[3] / Circle[4]");
                            int shape = scanner.nextInt();

                            switch (shape) {
                                case 1:
                                    System.out.print("Enter side length (m): ");
                                    int side = scanner.nextInt();
                                    int squarePer = side * 4;
                                    System.out.println("\nSquare perimeter: " + squarePer + " m\n");
                                    break;
                                case 2:
                                    System.out.print("Enter base (m): ");
                                    int baseR = scanner.nextInt();
                                    System.out.print("Enter height (m): ");
                                    int heightR = scanner.nextInt();
                                    int rectPer = 2 * (baseR + heightR);
                                    System.out.println("\nRectangle perimeter: " + rectPer + " m\n");
                                    break;
                                case 3:
                                    System.out.print("Enter side a (m): ");
                                    int a = scanner.nextInt();
                                    System.out.print("Enter side b (m): ");
                                    int b = scanner.nextInt();
                                    System.out.print("Enter side c (m): ");
                                    int c = scanner.nextInt();
                                    int triPer = a + b + c;
                                    System.out.println("\nTriangle perimeter: " + triPer + " m\n");
                                    break;
                                case 4:
                                    System.out.print("Enter radius (m): ");
                                    float radiusP = scanner.nextFloat();
                                    float pi = 3.14159f;
                                    float circlePer = 2 * pi * radiusP;
                                    System.out.println("\nCircle perimeter: " + circlePer + " m\n");
                                    break;
                                default:
                                    System.out.println("\nInvalid number [1-4]\n");
                            }

                        } else {
                            System.out.println("\nInvalid number [1-2]\n");
                        }
                        break;

                    case 3:
                        System.out.println("\n- SELECTED - Interactive Story -\n");
                        scanner.nextLine();
                        System.out.print("Enter your name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter your pronouns: [1] She/Her / [2] He/Him: ");
                        int pronouns = scanner.nextInt();
                        System.out.print("Enter your age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter your city: ");
                        String city = scanner.nextLine();
                        System.out.print("Enter your favorite hobby: ");
                        String hobby = scanner.nextLine();

                        System.out.println("\nThe story begins...");
                        System.out.println("--------------------------------------------------------------------");
                        System.out.println("In the quiet city of " + city + ", lived " + name + ", a " + age + "-year-old.");
                        System.out.println("One day, while " + (pronouns == 1 ? "she" : "he") + " practiced " + hobby + ",");
                        System.out.println("a strong wind swept " + (pronouns == 1 ? "her" : "him") + " into a colorful unknown land full of strange creatures.");
                        System.out.println(name + " met a brainless scarecrow, a cowardly lion, and a heartless tin man.");
                        System.out.println("Together, they followed the yellow brick road to see the Great Wizard,");
                        System.out.println("who promised to help them return home and find what they were seeking.");
                        System.out.println("After a short but intense adventure, " + name + " realized the true power was inside " + (pronouns == 1 ? "her" : "him") + ".");
                        System.out.println("Closing their eyes, " + name + " woke up in " + city + ", smiling and remembering the magical story.");
                        System.out.println("--------------------------------------------------------------------");
                        System.out.println("The end. Thank you for participating, " + name + "!\n");
                        break;

                    default:
                        System.out.println("\nChoose a valid number [1-4].\n");
                        break;
                }

            } catch (Exception err) {
                System.out.println("\nInvalid input. Try again.\n");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
