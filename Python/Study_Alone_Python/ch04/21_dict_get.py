dict = {
    "name":"joy",
    "sex":"girl",
    "job":"CEO",
    "age":31
}
while True:
    value = input("Tell me what you know about her> ")
    if value in dict:
        print(dict.get(value))
    else:
        print(dict.get(value))
