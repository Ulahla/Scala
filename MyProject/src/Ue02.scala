object Ue02 {
//  Variablen
	val falle : List[Int] = List ()
  val li_unsort : List[Int] = List (4, 2, 5, 1, 3)
  val li: List[Int] = List (8, 6, 2, 4, 5, 3, 1)
  val li_andersrum: List[Int] = List (1, 3, 5, 4, 6, 8)
  val li_unsort_test : List[Int] = List (1, 2, 3)
  
  val euro = List(1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000)
  val us_dollar = List(1, 5, 10, 25, 50, 100, 200, 500, 1000, 2000, 5000)
  val gulden = List(5, 10, 25, 100, 200, 250, 500, 1000, 2500, 5000)
//  val nz_dollar = List(5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000)
  
  
//  Main
  def main (args: Array[String]) {
	  println("Quicksort:")
//	  println("Ausgangsliste = " + falle)
//	  println("Nach quicksort " + quicksort(falle))
//	  println("Ausgangsliste = " + li_unsort)
//    println("Nach quicksort " + quicksort(li_unsort))
//    println("Ausgangsliste = " + li)
//    println("Nach quicksort " + quicksort(li))
//    println("Ausgangsliste = " + li_andersrum)
//    println("Nach quicksort " + quicksort(li_andersrum))
//    println("blebtdrinTest " + test(li, (x => x >= 5))) 
    println("Ausgangsliste = " + li_unsort)
    println("Nach quicksort " + quicksortEinsPunktNull(li_unsort))
  }
	
// Quicksort I - Pivot suchen, Liste gemäß Pivot teilen, sortieren und wieder zusammensetzen
  def quicksort(l: List[Int]) : List[Int] = {
    
//    Sortiere eine Liste
    def sort(l: List[Int], i : Int) : List[Int] = {
      l match {
        case Nil => List(i)
        case h :: t => if(i < h) i :: l
                       else h :: sort(t, i)
      }
    }
    
//    Unterteile eine Liste gemäß eines Pivots
    def divide(l: List[Int], p : Int) : List[Int] = {
      println("List l ist = " + l)
      println("p  ist = " + p)
      if (l == Nil) List(p)
      else 
        if(l.head < p) sort(divide(l.tail,p), l.head)
        else sort(divide(l.tail,p), l.head)
    }
    
    if ( l == Nil) Nil
    else divide(l.tail, l.head)
  }
  
  // Quicksort II
  	def quicksortEinsPunktNull (l: List[Int]): List[Int] = {
//  	  die aus einer Liste eine gefilterte Liste derjenigen Elemente erstellt, die das Prädikat bleibtdrin erfüllen
  	  def filter (l: List[Int], bleibtdrin: Int ⇒ Boolean): List[Int] = {
//  	    println("in filter " + l)
  	    if (l == Nil) Nil
  	    else 
  	      if (bleibtdrin(l.head)) l.head :: filter(l.tail, bleibtdrin)
  	      else filter(l.tail, bleibtdrin)
//  	    List(4,12,1988)  
  	  }
  	  
//    die eine Liste aufteilt in zwei Listen, deren Elemente kleiner oder kleinergleich bzw. größergleich oder größer als x sind 
  	  def split (l: List[Int], x: Int): (List[Int], List[Int]) = {
  	    println("in split l = " + l)
  	    println("in split x = " + x)
//  	    val l1 : List(List[Int], List[Int])
  			 if (l == Nil) (List(), List())
  			 else
//  			   if (x <= l.head) (List(l.head)  split(l.tail, x))
//  			   else split(l.tail, x)
  			   (List(1,2,3,4), List(5,6,7,8))
  	  }
  	  
//    die zwei sortierte Listen zu einer sortierten Liste mit allen Elementen beider Listen zusammenfügt
  	  def merge (l1: List[Int], l2: List[Int]): List[Int] = {
  	    l1 ++ l2
  	  }
  	  println("kleiner(gleich) als das erste Element sind: " + filter(l.tail, (x => x <= l.head)))
//  	  println("split " + split(l, l.head))
//  	  split(l, l.head)
//  	  List(4,12,1988)
  	  merge(List(2,3,4), List (5,6,7))
  	}
  	
//  	Testfunktion, to try out how to "map" a parameter to a function( an int to a boolean x>=5)
  	def test(l : List[Int], bleibtdrin: Int ⇒ Boolean): List[Int] = {
//		  println(l)
  	  if(l == Nil) Nil
  	  else if(l.tail == Nil)l
  	  else
    	  if (bleibtdrin(l.head))l.head::test(l.tail, bleibtdrin);
    	  else test(l.tail, bleibtdrin)
  	}

//und/oder eine Hilfsfunktion
//
//     
//
//und ggf. eine Hilfsfunktion
//
//     


  
//  Money
  def münzStückl (werte: List[Int], betrag: Int): Int = {
    4
  }
}