dict = {
    "name":"7D 건조 망고",
    "type":"당절임",
    "ingredient":["망고", "설탕", "메타중아황산나트륨", "치자황색소"],
    "origin":"필리핀"
}

print("name :",dict["name"])
print("type :",dict["type"])
print("ingredient :",dict["ingredient"])
print("origin :",dict["origin"])

dict["name"] = "8D 건조 망고"
print("name :", dict["name"])

print(dict["ingredient"][0])