character = {
    "name":"기사",
    "level":12,
    "items":{
        "sword":"불꽃의 검",
        "armor":"풀플레이트"
    },
    "skill":["베기", "세게 베기", "아주 세게 베기"]
}

for key in character:
    
    if type(character[key]) is dict:
        for keykey in character[key]:
            print(keykey,":",character[key][keykey])
            
    elif type(character[key]) is list:
        for keylist in character[key]:
            print(key,":",keylist)
            
    else:
        print(key,":",character[key])
