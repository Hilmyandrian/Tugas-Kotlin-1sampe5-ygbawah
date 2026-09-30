//Latihan 2 lanjutan yg bawah

enum class CourseStatus { ACTIVE, COMPLETED, DROPPED }

data class Course(val code: String, val name: String, val status: CourseStatus)

fun Course.displayInfo(): String = "$code - $name - $status"

fun describe(status: CourseStatus): String {
    return when (status) {
        CourseStatus.ACTIVE -> "Mata kuliah sedang aktif diambil"
        CourseStatus.COMPLETED -> "Mata kuliah telah selesai ditempuh"
        CourseStatus.DROPPED -> "Mata kuliah telah dibatalkan/dilepas"
    }
}

fun main() {
    val courses = mutableListOf(
        Course("SJK01", "Sistem Jaringan Komputer", CourseStatus.ACTIVE),
        Course("PABW02", "Pengembangan Aplikasi Berbasis Web", CourseStatus.COMPLETED),
        Course("UlilAlbab05", "Ulil Albab", CourseStatus.DROPPED)
    )

    for (course in courses) {
        println("${course.displayInfo()} | Deskripsi: ${describe(course.status)}")
    }
}
