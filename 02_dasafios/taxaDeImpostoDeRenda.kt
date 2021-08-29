fun main(args: Array<String>) {
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val s = readLine()!!.toFloat()
    val i: Float


    if(s > 0.0 && s <= 2000.00){
        println("Isento")
    }else if (s >= 2000.01 && s <= 3000.00){
        i = (s - 2000) * 0.08.toFloat()
        println("R$ ${i.format(2)}")
    }else if(s >= 3000.01 && s <= 4500.00){
        i = (s - 3000) * 0.18.toFloat() + 1000.00.toFloat() * 0.08.toFloat()
        println("R$ ${i.format(2)}")
    }else if( s > 4500){
        i = ((s - 4500.00) * 0.28.toFloat() + 1500.00.toFloat() * 0.18.toFloat() + 1000.00.toFloat() * 0.08.toFloat()).toFloat()
        println("R$ ${i.format(2)}")
    }
}