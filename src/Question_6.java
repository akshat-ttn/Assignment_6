import java.util.Scanner;
enum OrderStatus {

    PENDING("Order is awaiting confirmation."),
    PROCESSING("Order is being prepared"),
    SHIPPED("Order has been dispatched."),
    DELIVERED("Order has been successfully delivered."),
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
    static String processOrderStatus(OrderStatus  orderStatus) {
        return switch(orderStatus){
            case PENDING -> OrderStatus.PENDING.getStatus();
            case PROCESSING -> OrderStatus.PROCESSING.getStatus();
            case SHIPPED -> OrderStatus.SHIPPED.getStatus();
            case DELIVERED -> OrderStatus.DELIVERED.getStatus();
            case CANCELLED -> OrderStatus.CANCELLED.getStatus();
            case REFUNDED -> OrderStatus.REFUNDED.getStatus();
        };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "Choose the status\n" +
                        "\tPENDING\n\tPROCESSING\n\t" +
                        "SHIPPED\n\tDELIVERED\n\tCANCELLED\n\tREFUNDED "
        );
        OrderStatus orderStatus = OrderStatus.valueOf(input.nextLine());

        System.out.println(processOrderStatus(orderStatus));

        }


}
