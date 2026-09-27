fun main{
    val canNang: Double = 61.0
val chieuCao: Double = 1.63

val bmi: Double = canNang / (chieuCao * chieuCao)

var phanLoai: String = ""

if (bmi < 18.5) {
    phanLoai = "Gầy"
} else if (bmi < 25) {
    phanLoai = "Bình thường"
} else if (bmi < 30) {
    phanLoai = "Thừa cân"
} else {
    phanLoai = "Béo phì"
}

println("BMI: $bmi")
println("Phân loại: $phanLoai")
}