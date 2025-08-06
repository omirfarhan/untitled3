fun main(){

      val arr: List<Int> = listOf(2,2,2,3,4)


    for( i in arr ){

        var freg: Int=0

        for(j in arr){
            if (i==j){
                freg++
            }
        }

        if (freg>arr.size/2){
            println(i)
            return
        }

    }

}