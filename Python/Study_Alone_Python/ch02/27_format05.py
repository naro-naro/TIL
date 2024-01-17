output_a = "{:f}".format(52.273) # 기본
output_b = "{:15f}".format(52.273) # 15칸 만들기
output_c = "{:+15f}".format(52.273) # 부호 추가하고 15칸 만들기
output_d = "{:+015f}".format(52.273) # 부호 추가하고 15칸 만들어서 0으로 채우기

print(output_a)
print(output_b)
print(output_c)
print(output_d)