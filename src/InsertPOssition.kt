fun main(){

    val arr=arrayOf(1,3,5,6)
    val target=7

    println(search(arr,target))

}

fun search(arr: Array<Int>,target: Int): Int{

    var left=0
    var right=arr.size-1

    while (left<=right){
        var mid=left + (right-left)/2

        if (arr[mid]==target){
            return mid
        }else if (arr[mid]<target){
            left=mid+1
        }else{
            right=mid-1
        }

    }
    return left
}