fun main() {
    val soDuBanDau: Int = 5_000_000
    var soDuHienTai: Int = soDuBanDau

    // val dùng vì số dư ban đầu không thay đổi
    // var dùng vì số dư hiện tại thay đổi sau mỗi giao dịch

    soDuHienTai += 2_000_000
    println("Sau khi gửi 2.000.000: $soDuHienTai VNĐ")

    soDuHienTai -= 1_500_000
    println("Sau khi rút 1.500.000: $soDuHienTai VNĐ")
}