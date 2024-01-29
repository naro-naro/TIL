can_store_anything = Array[10, "hello", false]
print can_store_anything
puts

friends = Array["Kevin", "Karen", "Oscar"]
#                  0         1        2
#                 -3        -2       -1
puts friends

puts friends[0] # Kevin
puts friends[-2] # 뒤에서부터 2번째 : Karen
puts friends[0, 2] # 0 ~ (2-1) : Kevin ~ Karen

friends[0] = "Tom"
puts friends

animal = Array.new
animal[0] = "rabbit"
animal[1] = "elephant"
animal[2] = "tiger"
animal[5] = "cat"
puts animal # rabbit elephant tiger (blank) (blank) cat
puts animal.length()
puts animal.include? "giraffe"
puts animal.include? "cat"
puts animal.reverse()

arr = Array["C", 1, "A", true] # can't compare -> can't sort
# puts arr.sort()

arr2 = Array["B", "D", "A", "C"] # sametype -> can sort
puts arr2.sort()