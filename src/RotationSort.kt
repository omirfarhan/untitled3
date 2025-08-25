fun main(){

    val arr=arrayOf(4,5,6,7,0,1,2)
    val target=3

    println(rotadedarray(arr,target))
}

fun rotadedarray(arr: Array<Int>, target: Int ): Int{

    var start=0
    var end=arr.size-1

    while (start<=end){

        var mid=start+(end-start)/2

        if (arr[mid]==target){
            return mid
        }else if (arr[start]<=arr[mid]){

            if (arr[start]<=target && target <= arr[mid]){
                start=mid +1

            }else{
                end= mid-1
            }

        }else if (arr[mid] <= arr[end]){

            if (arr[mid]<=target && target<=arr[end]){
                start=mid +1
            }else{
                end=mid-1
            }

        }

    }


    return -1
}