dict = {
    1:1,
    2:1
}
def fibo(n):
    if n in dict:
        return dict[n]
    else: 
        dict[n] = fibo(n-1)+fibo(n-2)
        return dict[n]

print(fibo(10))
print(fibo(20))
print(fibo(30))
print(fibo(40))
print(fibo(50))