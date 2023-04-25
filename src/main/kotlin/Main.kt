

fun main() {
   var customer=CurrentAccount("237564324648","Maureen Ougo",67587.50)
    println(customer.deposit(457.50))
    println(customer.withdraw(4689.0))
    println(customer.detail())
    var customer2=SavingsAccount(("237564324648","Maureen Ougo",67587.50,3)
    customer2.savingsAccountWithdrawals(1)
}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit


//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
fun inputPassword(password:Any){
//  if(password.length < 8){
//      return
//  }else if()

}

//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiple() {
    for (i in 1..100) {
        if (i % 6 == 0 && i % 8 == 0) {
            println("Bingo")
        } else if (i % 6 == 0) {
            println(i)
        } else if (i % 8 == 0) {
            println(i)
        }
    }
//
//
//}
//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

    open class CurrentAccount(var accountnumber: String, var accountname: String, var balance: Double) {
        open fun deposit(amount: Double): Double {
            var balanceAmount = amount + balance
            return balanceAmount
        }

        open fun withdraw(amount: Double): Double {
            var decreament = balance - amount
            return decreament

        }

        open fun detail() {
            var x = accountnumber
            var y = balance
            var z = accountname
            println("Account number ${x} with balance ${y} is operated by {$z}")
        }
    }


    //5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
    class SavingsAccount(accountnumber: String, accountname: String, balance: Double, var withdrawals: Int) :
        CurrentAccount(accountname, accountnumber, balance) {
        override fun deposit(amount: Double): Double {
            var balanceAmount = amount + balance
            return balanceAmount
        }

        override fun withdraw(amount: Double): Double {
            var decreament = balance - amount
            return decreament

        }

        override fun detail() {
            var x = accountnumber
            var y = balance
            var z = accountname
            println("Account number ${x} with balance ${y} is operated by {$z}")
        }

        fun savingsAccountWithdrawals(number: Int) {
            if (number <= 4) {
                var increament = withdrawals + number
                increament++
                println("Witdrawals today  ${increament}")

            } else {
                print("Maximum withdrawal")
            }
        }
    }
}