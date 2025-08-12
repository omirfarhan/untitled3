import kotlin.math.max
import kotlin.math.min

fun main(){
    val price: Array<Int> =arrayOf(7,1,5,3,6,4)

    print("Maximum profit is: "+stock(price))
}

fun stock(price: Array<Int>) : Int{

    var bestprice=price[0]
    var maximumprice=0

    for(i in 0 until price.size){

        if (price[i]>bestprice){
            maximumprice= max(maximumprice,price[i]-bestprice)
        }

        bestprice= min(bestprice,price[i])
    }

    return maximumprice
}