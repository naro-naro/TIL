puts "\"Giraffe\" is tall"
puts "Giraffe\n is tall"


phrase = "GIRAFFE is tall"
puts phrase.upcase()
puts phrase.downcase()
puts phrase.length()


phrase = "     Giraffe is tall     "
puts phrase.strip()
puts phrase.length()


phrase = "Giraffe is tall"
puts phrase.include? "G"
puts phrase.include? "tall"
puts phrase.include? "Elephant"


phrase = "Giraffe is tall"
puts phrase[0] # G
puts phrase[3] # a
puts phrase[0,3] # Gir

puts phrase.index("G") # 0
puts phrase.index("f") # 4
puts phrase.index("aff") # 3
puts phrase.index("A") # 