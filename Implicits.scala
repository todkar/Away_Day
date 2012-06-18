// Money library
// -------------
case class Money(val amount: Float, val currency: String)

val ten_usd = new Money(10, "USD")
println(ten_usd.toRupees) // compile error: value toRupees is not a member of this.Money

// Money client
// ------------
class MoneyExchange(val money: Money) {
  def toRupees = new Money(money.amount * 50, "INR")
}

implicit def moneyToMoneyExchange(money: Money) = new MoneyExchange(money)

val ten_usd = new Money(10, "USD")
println(ten_usd.toRupees) // Money(500.0,INR)
