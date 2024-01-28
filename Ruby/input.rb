# puts "Enter Your Name: "
# name = gets
# puts ("Hello " + name + ", you are cool!") # 내가 이름을 입력하고 enter를 눌렀기 때문에 new line에서 ", you are cool!"이 출력된다
# # 실행 : 터미널에 .\input.rb 입력


puts "Enter Your Name: "
name = gets.chomp()
puts "Enter Your Age: "
age = gets.chomp()
puts ("Hello " + name + ", you are " + age) # .chomp() : 기존의 line에서 ", you are cool!"이 출력된다
# 실행 : 터미널에 .\input.rb 입력