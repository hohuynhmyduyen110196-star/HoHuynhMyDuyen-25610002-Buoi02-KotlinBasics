fun main() {
    print("Nhập số lượng: ")
    val soLuong: Int = readln().toInt()

    print("Nhập đơn giá: ")
    val donGia: Double = readln().toDouble()

    val tienHang = soLuong.toDouble() * donGia
    val thue = tienHang * 0.08
    val tongTien = tienHang + thue

    println("Tiền hàng: $tienHang VNĐ")
    println("Thuế 8%: $thue VNĐ")
    println("Tổng tiền phải trả: $tongTien VNĐ")
}