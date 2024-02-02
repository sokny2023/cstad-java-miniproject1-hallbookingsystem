//package temp;
//
//public class Temp1 {
//    private static void bookingA(String[][] hallA) {
//        System.out.println("# INSTRUCTION");
//        System.out.println("# Single: C-1");
//        System.out.println("# Multiple (Separate by comma): C-1, C-2");
//        String userBooking = validate("([a-zA-Z]-[1-9]|[1-2][0-9]|30)(,\\s*[a-zA-Z]-[1-9]|[1-2][0-9]|30)*", "booking");
//        String[] seats = userBooking.toUpperCase().split(",\\s*");
//
//        boolean allUnavailable = true;
//        boolean atLeastOneAvailable = false;
//        int count = 0;
//        for (String seat : seats) {
//            if (isSeatAvailable(hallA, seat)) {
//                System.out.print(seat + ", are available");
//                allUnavailable = false;
//                atLeastOneAvailable = true;
//                count = 1;
//            } else {
//                System.out.print(seat + ", are not avilable");
//                count = 2;
//            }
//        }
//
//        //if (count == 1) System.out.println(" is available.");
//        //else if (count == 2) System.out.println(" is not available.");
//
//        if (!allUnavailable) {
//            System.out.println("Do you want to book the available seats? [y/n]");
//            String yesNo = scanner.nextLine();
//            if (yesNo.equalsIgnoreCase("y")) {
//                System.out.print("Enter student Id: ");
//                int id = scanner.nextInt();
//                scanner.nextLine(); // Consume newline left-over
//                for (String seat : seats) {
//                    if (isSeatAvailable(hallA, seat)) {
//                        bookSeat(hallA, seat, id);
//                    }
//                }
//                System.out.println("Booking successful for available seats!");
//            }
//        } else {
//            System.out.println("No available seats to book.");
//        }
//    }
//
//    private static boolean isSeatAvailable(String[][] hallA, String seat) {
//        int row = seat.charAt(0) - 'A';
//        int col = Integer.parseInt(seat.substring(2)) - 1;
//        return row >= 0 && row < hallA.length && col >= 0 && col < hallA[row].length && hallA[row][col] == null;
//    }
//
//    private static void bookSeat(String[][] hallA, String seat, int id) {
//        int row = seat.charAt(0) - 'A';
//        int col = Integer.parseInt(seat.substring(2)) - 1;
//        if (row >= 0 && row < hallA.length && col >= 0 && col < hallA[row].length) {
//            hallA[row][col] = String.valueOf(id);
//            System.out.print(seat + ", ");
//        }
//    }
//
//}
