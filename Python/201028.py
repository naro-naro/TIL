# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean

def rsum_list(lst):
    if  lst==[]:
        return 0 
    else:
        return sum(lst)
	
lst = []
print(rsum_list(lst))

lst = [10, 20]
print(rsum_list(lst))

lst = [10, 20, 30, 40, 50]
print(rsum_list(lst))
