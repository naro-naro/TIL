# Mean_RT
# response time

mean(ldt$Length)  
median(ldt$Length) 

myt = table(ldt$Length)
myt

names(myt)[myt == max(myt)]
