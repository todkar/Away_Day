def do_it(meth_or_proc)
  meth_or_proc.call
end

do_it lambda { puts "Hello World!" } # Proc as parameter - Hello World!

def say_hello
  puts "Hello World!"
end

do_it(method(:say_hello)) # Method as parameter - Hello World!

def best_footballer_in_the_world
  yield "Lionel"
end

best_footballer_in_the_world { |name| puts name } # Lionel
