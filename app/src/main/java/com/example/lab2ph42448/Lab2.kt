package com.example.lab2ph42448

fun main(){
    // khai báo và sử dụng kĩ thuật null safety
  do {
      println("Nhập mssv:")
      val mssv : String? = readLine()

      val tenSV = getTenSV(mssv!!)
      println("Tên SV với mã $mssv là : $tenSV")
      print("Tiếp k?(c/k):")
      val s = readLine()
      if (s == "k")
          break;
  }while (true)
  println("Kết thúc")
}

val danhsachSV : Map<String, String> = mutableMapOf("PH42448" to "Cao Văn Hoàng", "PH12536" to "Lê THế Anh",
    "Ph14233" to "Trần Phương Thảo")

fun getTenSV (mssv: String): String? {
    val tenSV = danhsachSV.get(mssv)
    if(tenSV == null){
        return "K tìm thấy mã sv"
    }
    return tenSV
}