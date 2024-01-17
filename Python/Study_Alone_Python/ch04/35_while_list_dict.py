key_list = ["name","hp","mp","level"]
value_list = ["기사",200,30,13]
character = {}

# while len(key_list) >0:
#     i=0
#     character[key_list[i]] = value_list[i]
#     del key_list[i]
#     del value_list[i]
#     i+=1

for i in range(0,len(key_list)):
    character[key_list[i]]=value_list[i]

print(character)

