public interface CustomerBuilderInterface {
    CustomerBuilderInterface firstName(String firstname);
    CustomerBuilderInterface middleName(String middleName);
    CustomerBuilderInterface lastName(String lastName);
    CustomerBuilderInterface primaryEmail(String primaryEmail);
    CustomerBuilderInterface secondaryEmail(String secondaryEmail);
    CustomerBuilderInterface mobile(String mobile);
    CustomerBuilderInterface address(String address);
}
