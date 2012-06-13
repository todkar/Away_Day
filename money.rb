# Money library
# ------------
class Money
  def initialize(amount, currency)
    @amount = amount
    @currency = currency
  end

  def to_s
    "#{@amount} #{@currency}"
  end
end

ten_usd = Money.new(10, "USD")
puts ten_usd.to_rupees # undefined method `to_rupees' for 10 USD:Money (NoMethodError)

# Money client
# ------------
class Money
  def to_rupees
    Money.new(@amount * 50, 'INR')
  end
end

ten_usd = Money.new(10, "USD")
puts ten_usd.to_rupees # 500 INR
