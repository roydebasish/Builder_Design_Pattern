import java.lang.reflect.Constructor

data class Customer(val customerBuilder: CustomerBuilder) {

    private var firstName: String = ""
    private var middleName: String = ""
    private var lastName: String = ""
    private var primaryEmail: String = ""
    private var secondaryEmail: String = ""
    private var mobile: String = ""
    private var address: String = ""

    init {
        this.firstName = customerBuilder.getFirstName()
        this.middleName = customerBuilder.getMiddleName()
        this.lastName = customerBuilder.getLastName()
        this.primaryEmail = customerBuilder.getPrimaryEmail()
        this.secondaryEmail = customerBuilder.getSecondaryEmail()
        this.mobile = customerBuilder.getMobile()
        this.address = customerBuilder.getAddress()
    }

    override fun toString(): String {
        return "Customer{" +
                "firstName='" + firstName + '\'' +"\n"+
                ", middleName='" + middleName + '\'' +"\n"+
                ", lastName='" + lastName + '\'' +"\n"+
                ", primaryEmail='" + primaryEmail + '\'' +"\n"+
                ", secondaryEmail='" + secondaryEmail + '\'' +"\n"+
                ", mobile='" + mobile + '\'' +"\n"+
                ", address='" + address + '\'' +"\n"+
                '}'
    }
}
