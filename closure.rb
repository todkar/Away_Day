from = "from Barcelona"

%w(Lionel Xavi Iniesta).each { |name| puts "Hello #{name} #{from}" }
# Hello Lionel from Barcelona
# Hello Xavi from Barcelona
# Hello Iniesta from Barcelona

puts %w(Lionel Xavi Iniesta).map(&:upcase)
# LIONEL
# XAVI
# INIESTA
