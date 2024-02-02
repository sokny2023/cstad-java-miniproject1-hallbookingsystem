//package test1;
//
//import java.util.Objects;
//import java.util.Scanner;
//
//public class MyClass {
//    private static Scanner scanner = new Scanner(System.in);
//    private static String[][] hallA = new String[26][30]; // Assuming 26 rows (A-Z) and 30 seats (1-30) per row
//
//    public static void main(String[] args) {
//        initializeHall();
//
//        System.out.println("# INSTRUCTION");
//        System.out.println("# Single: C-1");
//        System.out.println("# Multiple (Separate by comma): C-1, C-2");
//        String userBooking = validate("([a-zA-Z]-[1-9]|[1-2][0-9]|30)(,\\s*[a-zA-Z]-[1-9]|[1-2][0-9]|30)*", "booking");
//        String[] seats = userBooking.toUpperCase().split(",\\s*");
//
//        System.out.println("Checking availability for: " + String.join(", ", seats));
//        boolean allAvailable = true;
//        for (String seat : seats) {
//            if (!isSeatAvailable(seat)) {
//                System.out.println(seat + " is not available.");
//                allAvailable = false;
//            }
//        }
//
//        if (allAvailable) {
//            System.out.println("All seats are available. Do you want to book? [y/n]");
//            String yesNo = scanner.nextLine();
//            if (yesNo.equalsIgnoreCase("y")) {
//                System.out.print("Enter student ID: ");
//                String studentId = scanner.nextLine();
//                for (String seat : seats) {
//                    bookSeat(seat, studentId);
//                }
//                System.out.println("Booked seats " + String.join(", ", seats) + " for student ID " + studentId);
//            }
//        }
//    }
//
//    private static void initializeHall() {
//        for (int i = 0; i < hallA.length; i++) {
//            for (int j = 0; j < hallA[i].length; j++) {
//                hallA[i][j] = "available";
//            }
//        }
//    }
//
//    private static boolean isSeatAvailable(String seat) {
//        int row = seat.charAt(0) - 'A';
//        int col = Integer.parseInt(seat.substring(2)) - 1;
//        return hallA[row][col].equals("available");
//    }
//
//    private static void bookSeat(String seat, String studentId) {
//        int row = seat.charAt(0) - 'A';
//        int col = Integer.parseInt(seat.substring(2)) - 1;
//        hallA[row][col] = studentId;
//    }
//
//    public static String validate(String regex, String op) {
//        while (true) {
//            if (Objects.equals(op, "booking")) {
//                System.out.print("Enter your booking(s): ");
//            }
//            String userInput = scanner.nextLine();
//            if (userInput.matches(regex)) {
//                return userInput;
//            } else {
//                System.out.println("Invalid input format, please try again.");
//            }
//        }
//    }
//}
