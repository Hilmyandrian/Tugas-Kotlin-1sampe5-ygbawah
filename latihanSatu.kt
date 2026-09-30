// Latihan 1 yg di bawah

enum class CourseStatus { ACTIVE, COMPLETED }

data class Course(val code: String, val name: String, val status: CourseStatus)

fun Course.displayInfo(): String = "$code - $name - $status"

fun main() {
    val matkul = mutableListOf("SJK", "PemDes", "PABW", "Inggris", "Pengembangan Gim")
    matkul.add("Ulil Albab")
    matkul.remove("SJK")
    
    println("Total Matkul yg diambil sekarang: ")
    for (matkuls in matkul) {
        println("- ${matkuls}")
    }
    
    val courses = mutableListOf(
    	Course("SJK01", "Sistem Jaringan Komputer", CourseStatus.ACTIVE),
        Course("PABW02", "Pengembangan Aplikasi Berbasis Web", CourseStatus.COMPLETED),
        Course("UlilAlbab05", "Ulil Albab", CourseStatus.COMPLETED)
    )
    
    println()
    
    for (Course in courses) {
        println(Course.displayInfo())
    }
}
