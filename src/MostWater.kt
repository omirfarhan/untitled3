import kotlin.math.max
import kotlin.math.min

//Container with Most Water Problem
fun main(){

    val list: List<Int> =listOf(1,8,6,2,5,4,8,3,7)

    println(mostwater(list))

}


fun mostwater(value: List<Int>): Int{

    var maximumwater=0
    var left=0
    var right=value.size-1


    while (left < right){

        var length=right-left

        var answer= min(value[left],value[right])
        var height=length*answer
        maximumwater= max(maximumwater,height)

        if (value[left]<value[right]){
            left++
        }else {
            right--
        }

    }






    return maximumwater

}