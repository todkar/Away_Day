class Person
  def initialize(name, city, age)
    @name = name
    @city = city
    @age = age
  end

  def adult?
    @age >= 18
  end
end

messi = Person.new('Lionel', 'Barcelona', 24)
puts messi.adult? # true
