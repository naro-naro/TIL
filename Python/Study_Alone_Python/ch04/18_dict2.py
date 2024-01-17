dict = {}

print("요소 추가 전 :", dict)

dict["name"] ="thomas"
dict["job"] = "train"
dict["character"] = "nice"

print("요소 추가 후 :",dict)

del dict["name"]
del dict["job"]
del dict["character"]
print(dict)