object Main extends App {
    def str(s:String):String={
        
            if (s.isEmpty) ""
            else str(s.tail) + s.head
        }
         println(str("Hello World"))
}



