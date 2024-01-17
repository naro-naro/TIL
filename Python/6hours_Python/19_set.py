# 집합
# 집합은 중복이 안되고, 순서가 없음

my_set = {1,2,3,3,3}
print(my_set)

mudo = {'유재석','하하','박명수','정형돈'}
rman = set(['유재석','하하','김종국','개리']) # 집합을 정의하는 또다른 방법

# 교집합
print(mudo & rman)
print(mudo.intersection(rman))

# 합집합
print(mudo | rman)
print(mudo.union(rman))

# 차집합
print(mudo-rman)
print(mudo.difference(rman))
print(rman-mudo)
print(rman.difference(mudo))

# 무도 멤버가 늘어남
mudo.add('황광희')
print(mudo)

# 런닝맨 하차
rman.remove('개리')
print(rman)