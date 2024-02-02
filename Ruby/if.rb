ismale = false
istall = true

# if  condition
if ismale
    puts "You are male." # not printed
else
    puts "You are not male."
end


if ismale and istall
    puts "You are a tall male"
else
    puts "You are either not male or not tall or both"
end


if ismale and istall
    puts "You are a tall male"
elsif !ismale and istall
    puts "You are not male but are tall "
elsif ismale and !istall
    puts "You are a short male"
else
    puts "You are not male and not tall"
end