def kth_smallest_sort(A, k): # A 배열에서 k번째로 작은 수 찾는 함수
    A.sort() # A배열을 오름차순 정렬
    return A[k-1] # 해당하는 인덱스에 위치한 값 리턴


  
def quick_select(A, left, right, k): # 퀵정렬로 A 배열에서 가장 왼쪽 인덱스값, 가장 오른쪽값을 이용해 k번째로 작은 수 찾는 함수
    pos = partition(A, left, right) 	

    if (pos+1 == left+k):				
        return A[pos] 
    elif (pos+1 > left+k):				 
        return quick_select(A, left, pos-1, k) 
    else : 							
        return quick_select(A, pos+1, right, k-(pos+1-left)) 

 
def partition(A, left, right) :
	low = left + 1				
	high = right					
	pivot = A[left] 				
	while (low <= high) :			
	    while low <= right and A[low] < pivot : low += 1
	    while high >= left and A[high]> pivot : high-= 1

	    if low < high :			
	        A[low], A[high] = A[high], A[low]

	A[left], A[high] = A[high], A[left]	 
	return high					

#------------------------------------------------------------------------
array = [12, 3, 5, 7, 4, 19, 26, 23, 15] 
print("입력 리스트 =", array) 
print("[정렬기법] 3번째 작은 수: ", kth_smallest_sort(array, 3)) 
print("[정렬기법] 6번째 작은 수: ", kth_smallest_sort(array, 6)) 
n = len(array) 
print("[축소정복] 3번째 작은 수: ", quick_select(array, 0, n-1, 3)) 
print("[축소정복] 6번째 작은 수: ", quick_select(array, 0, n-1, 6))