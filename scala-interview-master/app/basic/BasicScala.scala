package com.particeep.test.basic

/**
 * This is basic language questions so don't use external library or build in function
 */
object BasicScala {

   
  /**
 * This is basic language questions so don't use external library or build in function
 */
object BasicScala {

  /**
   * Encode parameter in url format
   *
   * Example:
   *
   * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
   * output : "?sort_by=name&order_by=asc&user_id=12"
   *
   * input  : Map()
   * output : ""
   */
  def encodeParamsInUrl(params: ListMap[String, String]): String = {
    
       // Creating ListMap
       
        var listMap = ListMap("C"->"Csharp", "S"->"Scala", "J"->"Java")
         var s="?"
        // Iterating elements
        
            if(listMap.isEmpty) 
           { println("liste est vide")
              return "liste est vide" 
           }else{  
            listMap.foreach{case (key, value) => s+= key + " -> " + value+"&"}
return (s.dropRight(1))

}

}
  /**
   * Test if a String is an email
   */
  def isEmail(maybeEmail: String): Boolean = {
  

   if("""(?=[^\s]+)(?=(\w+)@([\w\.]+))""".r.findFirstIn(maybeEmail) == None)false else true

    
    
  }
  
  
  

  /**
   * Compute i ^ n
   *
   * Example:
   *
   * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
   * output : 8
   *
   * input : (i = 99, n = 38997)
   * output : 1723793299
   */
  //def power(i: Int, n: Int): Int = {

    
    def power(base: Int, exp: Int): BigInt = {
    def _power(result: BigInt, exp: Int): BigInt = exp match {
        case 0 => 1
        case 1 => result
        case _ => _power(result*base, exp-1)
    }
    _power(base, exp)
}
  //////////////////test  ///////////////////////////////////////////////////////////  

    
      def main(args: Array[String]){
     
       encodeParamsInUrl (ListMap("C"->"Csharp", "S"->"Scala", "J"->"Java"))
        
     var s="abderrahim@g.tn"
        print (isEmail(s))
        
        
        println(power(2,9))
   
   }

}
