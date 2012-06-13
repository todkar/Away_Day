class Person
  attr_accessor :manager, :name
  def initialize(name, city, age, manager)
    @name = name
    @city = city
    @manager = manager
    @age = age
  end

  def adult?
    @age >= 18
  end
end

pep = Person.new('Pep', 'Barcelona', 50, nil)
messi = Person.new('Lionel', 'Barcelona', 24, pep)
cl = messi.clone
pep.name = "Guardiola"
puts cl.manager.name # Guardiola, because it makes a shallow copy
