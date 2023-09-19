public class CustomerBuilder implements CustomerBuilderInterface{

    private String firstName;
    private String middleName;
    private String lastName;
    private String primaryEmail;
    private String secondaryEmail;
    private String mobile;
    private String address;



    @Override
    public CustomerBuilder firstName(String firstname) {
        this.firstName = firstname;
        return this;
    }

    @Override
    public CustomerBuilder middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    @Override
    public CustomerBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public CustomerBuilder primaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
        return this;
    }

    @Override
    public CustomerBuilder secondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
        return this;
    }

    @Override
    public CustomerBuilder mobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    @Override
    public CustomerBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Customer build(){
        return new Customer(this);
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

}
