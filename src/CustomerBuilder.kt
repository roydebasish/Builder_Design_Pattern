class CustomerBuilder : CustomerBuilderInterface{

     private var firstName : String = ""
     private var middleName : String = ""
     private var lastName : String = ""
     private var primaryEmail : String = ""
     private var secondaryEmail : String = ""
     private var mobile : String = ""
     private var address : String = ""




    override fun firstName(firstname : String) = apply {
        this.firstName = firstname
        return this
    }


    override fun middleName(middleName : String) = apply{
        this.middleName = middleName
        return this
    }


    override fun lastName(lastName : String) = apply{
        this.lastName = lastName
        return this
    }

    override fun primaryEmail(primaryEmail : String) = apply{
        this.primaryEmail = primaryEmail
        return this
    }


    override fun secondaryEmail(secondaryEmail : String) = apply{
        this.secondaryEmail = secondaryEmail
        return this
    }


    override fun mobile(mobile : String) = apply{
        this.mobile = mobile
        return this
    }


    override fun address(address : String) = apply{
        this.address = address
        return this
    }

    fun build() : Customer{
        return Customer(this)
    }

    fun getFirstName() : String{
        return firstName
    }

    fun getMiddleName() : String{
        return middleName
    }

    fun getLastName() : String{
        return lastName
    }

    fun getPrimaryEmail() : String{
        return primaryEmail
    }

    fun getSecondaryEmail() : String{
        return secondaryEmail
    }

    fun getMobile() : String{
        return mobile
    }

    fun getAddress() : String{
        return address
    }

}
