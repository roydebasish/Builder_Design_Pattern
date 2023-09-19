public class Main {
    public static void main(String[] args) {
        Customer customer = new CustomerBuilder()
                .firstName("Rabbani")
                .lastName("Islam")
                .primaryEmail("example@gmail.com")
                .mobile("01258596258")
                .build();

        System.out.println(customer.toString());
    }
}