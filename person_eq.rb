class Person
  attr_accessor :name, :city, :age
  def initialize(name, city, age)
    @name = name
    @city = city
    @age = age
  end

  def adult?
    @age >= 18
  end

  def ==(other)
    self.name == other.name && self.city == other.city && self.age == other.age
  end
end

messi = Person.new('Lionel', 'Barcelona', 24)
puts messi.adult?

messi2 = Person.new('Lionel', 'Barcelona', 24)
puts messi == messi2
puts messi.eql? messi2
puts messi.equal? messi2
