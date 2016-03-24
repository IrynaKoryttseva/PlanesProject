import java.io._
import java.util.zip._

import au.com.bytecode.opencsv.CSVReader


class WorkFile {
  def main(filenames: Array[String]): Unit = {
    val fileName = "./src/main/resources/planes_log.csv.gz"
    readCsv(fileName)

  }
    def readCsv(fileName:String) {
      val in: InputStream = new GZIPInputStream(new FileInputStream(fileName))
      val reader = new CSVReader(new InputStreamReader(in))
      val data = reader.readAll().toArray




//      for (line <- data.getLines) {
//        val Array(year,quarter,month,dayOfMonth,dayOfWeek,flDate,origin,dest) = line.split(",").map(_.trim)
//        println(s"$year $quarter $month $dayOfMonth $dayOfWeek $flDate $origin $dest")


//      val header = true
//      scala.Double.NaN
//
//      if (header) {
//        reader.readNext()
//      }
//
//      val row = reader.readNext()
//      def readRows(reader: CSVReader) {
//        reader.readNext() match {
//          case null =>
//            output.flush
//            return
//
//          case columns =>
//            output.write(
//              (
//                columns(0) + " is " + formatter.format(
//                  columns(1).toDouble * columns(2).toDouble
//                ) + "\n"
//                ).getBytes
//            )
//
//            readRows(reader)



    }
}
