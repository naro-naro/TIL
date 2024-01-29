# define method
def sayhi
    puts "Hi User!"
end

# execute method
sayhi



# method whit parameter
def sayhello(name, age=20) # age : default 20
    puts ("Hello " + name + ", you are " + age.to_s)
end

sayhello("Siyeon")