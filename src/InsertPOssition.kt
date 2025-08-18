fun main(){

    val arr=arrayOf(1,3,5,7)
    val target=7
    for(i in 0 until arr.size){

        if (arr[i]==target){

        }
    }

    println(search(arr,target))

}

fun search(arr: Array<Int>,target: Int): Int{

    var index=0

    for(i in 0 until arr.size){
        if (arr[i]==target){
           return i
        }
    }

    return -1
}