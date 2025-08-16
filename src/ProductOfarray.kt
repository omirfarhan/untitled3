import java.sql.Array

fun main(){

    var nums: ArrayList<Int> = arrayListOf(1,2,3,4)
    print(productarray(nums).joinToString())


}

fun productarray(arrayofnums: ArrayList<Int>): IntArray{

    var n=arrayofnums.size
    var number = MutableList(n){1}
    for(i in 0 until n){



        for(j in 0 until n){
          if (arrayofnums[i]!=arrayofnums[j]){
              number[i]=number[i] * arrayofnums[j]
          }


        }

    }
return number.toIntArray()
}