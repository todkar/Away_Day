def do_it(meth_or_proc)
  meth_or_proc.call
end

name = "Lionel"

def say_hello
  puts "Hello #{name}"
end

do_it lambda { puts "Hello #{name}" } # closure - because it closes over free variables

do_it(method(:say_hello)) # undefined local variable or method `name',
                          # because Method is supposed to be self-contained

def say_hello_to_lionel
  puts "Hello Lionel"
end

do_it(method(:say_hello_to_lionel)) # Hello Lionel
