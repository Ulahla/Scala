class bla {
  
  def main (args: Array[String]) {
    val a = new Complex(3,4)
		val b = new Complex(2,5)
		println(a + b)
  }
  
  case class Rat(zähler : Int, nenner : Int) {
  require (nenner != 0, "Nenner darf nicht 0 sein!")
  def this (x : Int) = this (x,1)
  
//  private ggT(a : Int, b : Int){
//  }
//  private val g = ggT(zähler, nenner)
//  def numer = zähler/g
//  def denorm = nenner / g
//  override def toString = zähler + "/" + nenner
//  overrife def toString = numer + "/" + denorm
  }

  case class Complex(re : Double, im : Double) {
    override def toString = re + "+ i *" + im
    def + (that:Complex) = Complex(re + that.re, im + that.im)
    def - (that:Complex) = Complex(re - that.re, im - that.im)
    def * (that:Complex) = Complex(re * that.re - im * that.im,  re * that.im + that.re * im)
    def / (that:Complex) = Complex((re * that.re + im * that.im) / (that.re * that.re) + (that.im * that.im), (im * that.re - re * that.im) / (that.re * that.re) + (that.im * that.im)) 
    def inverse = {
      val denominator = re * re
      Complex(re/denominator, im/denominator)
      }
    def unery_- = Complex(-re,-im)
  }
}