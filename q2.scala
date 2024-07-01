object Main extends App{
    def stringList(s:List[String]) :List[String]={
        s.filter(_.length > 5)
    }
    val strings=List("hello","how","World","Morning","Nice Job")
    println(stringList(strings))
}