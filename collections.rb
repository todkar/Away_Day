contents = File.open("generic_parallel_collection_framework.txt", "rb").read
words = contents.split
chewedup_words = words.map do |word|
  count = word.length
  result = ""
  (1..count*3).each {|_| result += Math.sqrt(count * rand(4524018763722859986).abs).to_s + word }
  result
end
puts chewedup_words.count
