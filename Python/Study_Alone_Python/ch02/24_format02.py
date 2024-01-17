# 정수 출력의 다양한 형태

output_a = "{:d}".format(52)

output_b = "{:5d}".format(52) # 5칸에 출력
output_c = "{:10d}".format(52) # 10칸에 출력

output_d = "{:05d}".format(52) # 5칸에 출력하고 빈칸을 0으로 채우기
output_e = "{:010d}".format(52) #10칸에 출력하고 빈칸을 0으로 채우기



print(output_a)

print(output_b)
print(output_c)

print(output_d)
print(output_e)