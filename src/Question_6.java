import java.util.Scanner;
enum OrderStatus {

    PENDING("Order is awaiting confirmation."),
    PROCESSING("Order is being prepared"), SHIPPED("Order has been dispatched."), DELIVERED("Order has been successfully delivered."),
    CANCELLED("Order has been canceled."),
    REFUNDED("Refund has been issued for the order.");

    private final String s;
    OrderStatus(String s) {
        this.s = s;
    }

    public String getStatus(){
        return this.s;
    }
}
public class Question_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(
                "Choose the status\n" +
                        "\tPENDING\n\tPROCESSING\n\t" +
                        "SHIPPED\n\tDELIVERED\n\tCANCELLED\n\tREFUNDED "
        );
        String orderStatus = input.nextLine();

        String message = switch(orderStatus){
            case "PENDING" -> OrderStatus.PENDING.getStatus();
            case "PROCESSING" -> OrderStatus.PROCESSING.getStatus();
            case "SHIPPED" -> OrderStatus.SHIPPED.getStatus();
            case "DELIVERED" -> OrderStatus.DELIVERED.getStatus();
            case "CANCELLED" -> OrderStatus.CANCELLED.getStatus();
            case "REFUNDED" -> OrderStatus.REFUNDED.getStatus();
            default -> {
                yield "Please enter correct status";
            }
        };
        System.out.println("Order Status: " + message);
    }

}
