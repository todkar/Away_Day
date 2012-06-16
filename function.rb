def function(another_func)
  another_func.call
end

def another_func
  puts "Hello World!"
end

function(method(:another_func)) # prints "Hello World!"

def function(&block)
  block.call
end

function { puts "Hello World!" }

def iter(hproc)
  [1, 2, 3].each { |i| hproc.call(i) }
end

iter lambda { |i| puts "Hello #{i}" }
