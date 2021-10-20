package com.particeep.test.basic

 
class ComputeAvarage {
  
  
  /**
 * Compute the avarage of the list
 *
 * ex : [1, 10, 16] -> 9
 */
 // def average(l: List[Double]) = {
    
    
def getSumAverage(numbers:List[Double]) = {
  val sum = numbers.sum
  val average = (sum:Double) / numbers.length
  (average)
}

 
    
     def main(args: Array[String])
    {
      val numbers = List(1.0, 2.0, 30.0, 45.0, 13.0)
val average = getSumAverage(numbers)
println("Average is:" + average)
    }
    
  
  
  
  
  
  
}
