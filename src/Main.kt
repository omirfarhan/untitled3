

fun main() {

    val arr=arrayOf(2,7,11,15)
    val array: ArrayList<Int> = ArrayList();

    for (i in 0 until arr.size ){

        var target: Int =9

        for(j in i+1 until arr.size){

            if (arr[i]+arr[j]==target){
                array.add(i)
                array.add(j)

            }


        }

    }

    println("Pair sum Index: "+array);

}