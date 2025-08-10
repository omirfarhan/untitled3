fun main(){

    //Buy and stock problem example: Implememt pow (x,n), which calculate x raise power n
    //example: input: x=2 and n=7 final answer 128

   print("The currently base is: "+myPow(2,7))

}
//main target baseX= 2 and powerN=7 then answer is: 128

fun myPow(baseX: Int, powerN: Int): Int{


    var binaryform=powerN
    var ans=1
    var currentbase=baseX

    if (powerN==0) return 1
    if (baseX==0) return 0
    if (baseX==1) return 1
    if (currentbase==-1 && powerN % 2==0) return 1

    if (binaryform<0){
        currentbase=1/currentbase
        binaryform=-binaryform
    }

    while (binaryform>0){

        if (binaryform % 2 == 1){
            ans= (ans*currentbase)
        }
        currentbase=currentbase*currentbase

        binaryform=binaryform/2
    }
    return ans

}