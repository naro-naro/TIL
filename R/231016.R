#else-------------------------
x=5
if(x>0){
  print("Positive number")
}


#else--------------------------
x=-5
if(x>0){
  print("positive number")
} else{
  print("negative")
}


#else if-----------------------
x <-0
if(x<0){
  print("negative number")
} else if(x>0){
  print("positive number")
} else{
  print("zero")
}


#for--------------------------
x = c(1,2,3,4,5)
count = 0
for (val in x){
  if(val%%2==0){
    count=count+1
  }
}
print(count)


#while------------------------
i = 1
while(i<6){
  print(i)
  i=i+1
}


#for) 1 to 1000--------------------------------
nums = c(1:1000)
sum = 0
for(i in nums){
  sum = sum+i
}
print(sum)


#while) 1 to 1000------------------------------
i=1
sum=0
while(i<=1000){
  sum =sum+i
  i = i+1
}
print(sum)


#repeat & break--------------------------------
x=1
repeat{
  print(x)
  x=x+1
  if(x==6){
    break
  }
}


#next---------------------------------------
x=c(1:5)
for(val in x){
  if(val==3){
    next
  }
  print(val)
}


#cat----------------------------------
#연결과 인쇄
month = 10
cat(month,"월 입니다.")
cat(month,'월 입니다.',sep="")


#paste-------------------------------
#문자 변환 후 벡터 연결
print(paste(month,'월 입니다.'))


#sprintf----------------------
#문자열포맷
a=1
b=2.54
c="inch"
d="centimeter"
sprintf("%d %s = %f %s",a,c,b,d)
sprintf("%d %s = %.2f %s",a,c,b,d)
