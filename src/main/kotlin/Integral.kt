
class Integral(val integrand: (Double) -> Double) {
    fun integrate(
        from: Double,
        to: Double,
        differential: Double,
    ): Double {
                var x = from
                var integral = 0.0
        if(x<=to){

        }
                while(x <= to) {
                    integral += (integrand(x) + integrand(x + differential))*differential/2
                    x += differential
                }
                return integral
    }



}