interface CustomerBuilderInterface {
    fun firstName(firstname : String): CustomerBuilder
    fun middleName(middleName : String): CustomerBuilder
    fun lastName(lastName : String): CustomerBuilder
    fun primaryEmail(primaryEmail : String): CustomerBuilder
    fun secondaryEmail(secondaryEmail : String): CustomerBuilder
    fun mobile(mobile : String): CustomerBuilder
    fun address(address : String): CustomerBuilder
}
