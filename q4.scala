object Main extends App{
    def sumOfEven(n:List[Int]):Int={
        n.filter(_%2==0).sum
    }
    println(sumOfEven(List(3,5,1,8)))
}