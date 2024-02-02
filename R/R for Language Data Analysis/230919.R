.m = 2237

h = .m %/% 60
m <- .m %% 60

print(h)
print(m)

# -------------------

myfunc = function(x){
  circumf = pi*2*x
  print("The circumference is: ")
  print(circumf)
}
myfunc(10)

# --------------

myfunc2 = function(x, y){
  print(x*y)
}
myfunc2(10,2)

# ---------------

C2F = function(c){
  f= (c*9/5)+32
  print(f)
}

C2F(10)

# ------------------

pi
LETTERS
letters
month.name
month.abb

# -------------------

lev = c("novice", "intermediate", "advanced")
lev_f = factor(lev, order=T, levels = c("advanced", "intermediate", "novice"))
lev_f

# --------------------

m= matrix(
  c(6,3,8,5,0,9),
  nrow=3,
  ncol=2,
  byrow = TRUE)

m
m[3,2]
m[,2]
m[1,]

# ---------------
m= matrix(
  c(6,3,8,5,0,9),
  nrow=3,
  ncol=2,
  byrow = FALSE)
m
m[3,2]
m[,2]
m[1,]

# --------------------

m= matrix(
  c(6,3,8,5,0,9),
  nrow=3,
  ncol=2,
  byrow = FALSE)
# dimnames(m) = list(c("r1","r2","r3"),c("c1","c2"))
rownames(m) = c("R1","R2","R3")
colnames(m) = c("C1", "C2")
m

mean(m[,"C2"])

#______________________
phy = matrix(
  c(18,170,62,20,182,68,36,178,79,44,165,63),
  nrow = 4,
  ncol = 3,
  byrow = T
)
rownames(phy) = c("kim", "lee","lim","jo")
colnames(phy) = c("age", "height", "weight")
phy

mean(phy[,"age"])
mean(phy[,"height"])
mean(phy[,"weight"])

#_________________________

list1 = list(c(1,2,3), c("good", "bad"), list(c(4,5,6)), c("a","b"), pi)
list1

#________________________

array1 = array(1:24, c(2,2,6))
array1
#_______________________-

id = c(1,2,3,4)
name = c("kim", "lee","kwon","choi")
age = c(20, 21, 22, 23)
d4 = data.frame(id, name, age)
d4

#________________________

d4
add= c(5,"park", 24)
d5 = rbind(d4, add)
d5

#--------------------



add2 = c("M","F","F","M")
d6 = cbind(d4, gender=add2)
d6