package com.particeep.test.basic
  import scala.collection.mutable.ListMap
/**
 * What is the complexity of the function ?
 * the complexity of this function is O(n)
 *i will use recursivity 
 * Refactor it to be a better function
 */
object Refactoring {

  case class File(
    name:     String,
    category: String
  )

  def getCategories(files: List[File]): List[String] = {
    val categories: List[String] = List()

    if(files != null) {
      for(file <- files) {
        if(file.category != null && !categories.contains(file.category)) {
          categories :+ file.category
        }
      }
    }

    return categories
  }
  
  
  ////////////answer //////////////////////////
  


object Refactoring {
     case class File(
    name:     String,
    category: String
  )
  

 

def getCategories(files: List[File]): List[String] = {
    val categories: List[String] = List()

    
        
        
        
         if(files.isEmpty){
    return null
  }else{
      if(!files.head.category.isEmpty && !categories.contains(files.head.category)) {
          categories :+ files.head.category
          return categories
        }
        
         return  getCategories(files.tail)
      }
        
    }

      
     def main(args: Array[String])
    {
        var file=File("abderrahim","person")
        var files:List[File]=List(file)
       var l:  List[String] = List()
      l= getCategories(files)
       println(l)
    

}
}
}
