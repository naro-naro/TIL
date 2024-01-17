import math

def MergeSort(array):
    if len(array)!=1:
        k = math.floor((1 + len(array)) / 2)
        second_array=[]
        second_array.append(array[k:])
        del array[k:]
        first_array = array
        
    else: array

    result = []
    first_index = 0
    second_index = 0
    while len(first_array)!=0 and len(second_array) !=0:
        if first_array[first_index] < second_array[second_index]:
            result.append(first_array[first_index])
            first_index += 1
        else:
            result.append(second_array[second_index])
            second_index +=1
    return result


array_ex = [37, 10, 22, 30, 35, 13, 25, 24]
MergeSort(array_ex)