
    fun main() {
        val customer =  CustomerBuilder()
                .firstName("Suvo")
                .lastName("Roy")
                .primaryEmail("example@gmail.com")
                .mobile("01258596258")
                .build()

        println(customer.toString())
    }
