package scelsx


object Scelsx {
  // params to main like this
  // ./my_file.xlsx merge 1 1 1 2 2 2 2 3
  def main (args: Array[String]){
    val xlsx = new org.apache.poi.xssf.usermodel.XSSFWorkbook(new java.io.FileInputStream(args(0)))
    args(1) match {
      case "merge" => apply_merge(xlsx.getSheetAt(0), args.drop(2).map(_.toInt))
    }
    xlsx.write(new java.io.FileOutputStream(args(0)))
    println("DONE")
  }

  private def apply_merge(sheet: org.apache.poi.xssf.usermodel.XSSFSheet, args: Array[Int]): Int = {
    args.splitAt(4) match {
      case (Array(a, b, c, d), rest) =>
        sheet.addMergedRegion(new org.apache.poi.ss.util.CellRangeAddress(a, b, c, d))
        apply_merge(sheet, rest)
      case (Array(), Array()) =>
        0
    }
  }

}