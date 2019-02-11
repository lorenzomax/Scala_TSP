object Main {

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) + "ns")
    result
  }

  def main(args: Array[String]): Unit = {
    val generateData = new GenerateData(1,10)
    val tsp = new TSP()
    time(tsp.main())
  }
}
