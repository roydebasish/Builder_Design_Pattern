public class Customer {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String primaryEmail;
    private final String secondaryEmail;
    private final String mobile;
    private final String address;

    public Customer(CustomerBuilder customerBuilder) {
        this.firstName = customerBuilder.getFirstName();
        this.middleName = customerBuilder.getMiddleName();
        this.lastName = customerBuilder.getLastName();
        this.primaryEmail = customerBuilder.getPrimaryEmail();
        this.secondaryEmail = customerBuilder.getSecondaryEmail();
        this.mobile = customerBuilder.getMobile();
        this.address = customerBuilder.getAddress();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +"\n"+
                ", middleName='" + middleName + '\'' +"\n"+
                ", lastName='" + lastName + '\'' +"\n"+
                ", primaryEmail='" + primaryEmail + '\'' +"\n"+
                ", secondaryEmail='" + secondaryEmail + '\'' +"\n"+
                ", mobile='" + mobile + '\'' +"\n"+
                ", address='" + address + '\'' +"\n"+
                '}';
    }
}
